package DiamonShop.Dao;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Bills;
import DiamonShop.Entity.BillsDetail;

@Repository
public class BillsDao extends BaseDao {

	public int addBills(Bills bill) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO bills(user, phone, display_name, address, total, quanty, note) ");
		sql.append(" VALUES ( ");
		sql.append(" '" + bill.getUser() + "', ");
		sql.append(" '" + bill.getPhone() + "', ");
		sql.append(" '" + bill.getDisplay_name() + "', ");
		sql.append(" '" + bill.getAddress() + "', ");
		sql.append(" " + bill.getTotal() + ", ");
		sql.append(" " + bill.getQuanty() + ", ");
		sql.append(" '" + bill.getNote() + "' ");
		sql.append(");");

		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}

	public long getIDlastBills() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM bills;");
		long id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, long.class);
		return id;
	}

	public int addBillsDetail(BillsDetail bill) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO billsdetail(id_product, id_bill, quanty, total) VALUES ( ");
		sql.append(" " + bill.getId_product() + ", ");
		sql.append(" " + bill.getId_bills() + ", ");
		sql.append(" " + bill.getQuanty() + ", ");
		sql.append(" " + bill.getTotal() + " ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
}
