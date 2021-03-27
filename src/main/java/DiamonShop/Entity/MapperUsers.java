package DiamonShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUsers implements RowMapper<Users>{

	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users usersEntity = new Users();
		usersEntity.setId(rs.getLong("id"));
		usersEntity.setAddress(rs.getString("address"));
		usersEntity.setDisplay_name(rs.getString("display_name"));
		usersEntity.setPassword(rs.getString("password"));
		usersEntity.setUser(rs.getString("user"));
		return usersEntity;
	}

}
