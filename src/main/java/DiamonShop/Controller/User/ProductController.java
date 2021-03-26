//package DiamonShop.Controller.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import DiamonShop.Service.User.ProductServiceImpl;
//
//@Controller
//public class ProductController extends BaseController{
//	
//	@Autowired
//	private ProductServiceImpl _productService;
//	
//	@RequestMapping(value = {"chi-tiet-san-pham/{id}"})
//	public ModelAndView Product(@PathVariable long id) {
//		ModelAndView mv = new ModelAndView("user/products/product");
//		_mvShare.addObject("product",_productService.getProductByID(id));
//		return mv;
//	}
//}
package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Service.User.IProductService;

@Controller
public class ProductController extends BaseController{
	
	@Autowired
	private IProductService _productService;
	
	@RequestMapping(value = { "chi-tiet-san-pham/{id}" })
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("product", _productService.getProductByID(id));
		int idCategory = _productService.getProductByID(id).getId_category();
		_mvShare.addObject("productByIDCategory", _productService.getProductByIDCategory(idCategory));
		return _mvShare;
	}
}
