package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperBills implements RowMapper<Bills>{

	public Bills mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bills bill = new Bills();
		bill.setAddress(rs.getString("address"));
		bill.setDisplay_name(rs.getString("display_name"));
		bill.setNote(rs.getString("note"));
		bill.setPhone(rs.getString("phone"));
		bill.setQuanty(rs.getInt("quanty"));
		bill.setTotal(rs.getDouble("total"));
		bill.setUser(rs.getString("user"));
		return bill;
	}

}
