package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBillsDetail implements RowMapper<BillsDetail>{
	public BillsDetail mapRow(ResultSet rs, int rowNum) throws SQLException {
		BillsDetail billsDetail = new BillsDetail();
		billsDetail.setId_bills(rs.getLong("id_bills"));
		billsDetail.setId_product(rs.getLong("id_product"));
		billsDetail.setQuanty(rs.getInt("quanty"));
		billsDetail.setTotal(rs.getDouble("total"));
		return billsDetail;
	}
	
	
}
