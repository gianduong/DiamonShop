package DiamonShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.CartDto;
import DiamonShop.Entity.Bills;

@Service
public interface IbillsService {
	public int AddVBills(Bills bill);
	
	public void AddBillsDetail(HashMap<Long, CartDto> carts);
}
