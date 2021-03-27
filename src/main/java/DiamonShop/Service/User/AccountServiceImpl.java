package DiamonShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.UsersDao;
import DiamonShop.Entity.Users;

@Service
public class AccountServiceImpl implements IAccountService{
	
	@Autowired
	UsersDao usersDao = new UsersDao();
	
	public int AddAccount(Users user) {
		//mang bam bang cach ma hoa 
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)) );		
		return usersDao.AddAcc(user);
	}

}
