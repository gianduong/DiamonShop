package DiamonShop.Dao;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Users;
@Repository
public class UsersDao extends BaseDao{
	public int AddAcc(Users user) {
		
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO ");
		sql.append("users( ");
		sql.append("user, ");
		sql.append(" password, ");
		sql.append(" display_name, ");
		sql.append(" address ");
		sql.append(") VALUES ( ");
		sql.append(" '" + user.getUser() + "', ");
		sql.append(" '" + user.getPassword() + "', ");
		sql.append(" '" + user.getDisplay_name() + "', ");
		sql.append(" '" + user.getAddress() + "' ");
		sql.append(")");
		
		int inserts = _jdbcTemplate.update(sql.toString());
		
		return inserts;
	}

}
