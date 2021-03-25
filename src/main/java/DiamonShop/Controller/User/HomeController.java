package DiamonShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/","/trang-chu"})
	public ModelAndView Index() {
//		ModelAndView mv = new ModelAndView("user/index");
		_mvShare.setViewName("user/index");
		_mvShare.addObject("menus",_homeService.getDataMenus());
		_mvShare.addObject("slides",_homeService.GetDataSlide());
		_mvShare.addObject("products",_homeService.getDataProducts());
		_mvShare.addObject("productsNew",_homeService.getDataProductsNew());
		_mvShare.addObject("productsHighlight",_homeService.getDataProductsHinglight());
		_mvShare.addObject("categorys",_homeService.GetDataCategorys());
		return _mvShare;
	}
	
	@RequestMapping(value = {"/product"})
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
