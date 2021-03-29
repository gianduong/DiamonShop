package DiamonShop.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.BillsDao;
import DiamonShop.Dto.CartDto;
import DiamonShop.Entity.Bills;
import DiamonShop.Entity.BillsDetail;

@Service
public class BillsServiceImpl implements IbillsService {

	@Autowired
	private BillsDao billsDao;

	public int AddVBills(Bills bill) {
		return billsDao.addBills(bill);
	}

	public void AddBillsDetail(HashMap<Long, CartDto> carts) {
		long idBills = billsDao.getIDlastBills();
		
		for (Map.Entry<Long, CartDto> item : carts.entrySet()) {
			BillsDetail billsDetail = new BillsDetail();
			billsDetail.setId_bills(idBills);
			billsDetail.setId_product(item.getValue().getProduct().getId_product());
			billsDetail.setQuanty(item.getValue().getQuanty());
			billsDetail.setTotal(item.getValue().getTotalPrice());
			billsDao.addBillsDetail(billsDetail);
		}

	}

}
