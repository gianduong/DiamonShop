package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Entity.Users;
import DiamonShop.Service.User.AccountServiceImpl;

@Controller
public class UserController extends BaseController{

	@Autowired
	AccountServiceImpl accountService = new AccountServiceImpl();
	
	@RequestMapping(value = {"/dang-ky"}, method = RequestMethod.GET )
	public ModelAndView Register() {
		_mvShare.setViewName("user/account/register");
		_mvShare.addObject("user", new Users());
		return _mvShare;
	}
	
	@RequestMapping(value = {"/dang-ky"}, method = RequestMethod.POST )
	public ModelAndView CreatAcc(@ModelAttribute("user") Users user) {
		int count = accountService.AddAccount(user);
		if(count > 0) {
			_mvShare.addObject("status","Đăng ký tài khoản thành công!");			
		}else {
			_mvShare.addObject("status","Đăng ký tài khoản thất bại!");
		}
		_mvShare.setViewName("user/account/register");
		return _mvShare;
	}
	
}
