package DiamonShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamonShop.Dto.PaginatesDto;
import DiamonShop.Service.User.CategoryServiceImpl;
import DiamonShop.Service.User.PaginateServiceImpl;
@Controller
public class CategoryController extends BaseController{
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Autowired
	private PaginateServiceImpl PaginateService;
	
	@RequestMapping(value = {"/san-pham/{id}"})
	//path la duong dan, o day la id, variable la bien cua cai duong dan, o day la san-pham
	public ModelAndView Product(@PathVariable String id) {
		
		int totalProductsPage = 9;
		_mvShare.setViewName("user/products/category");
		
		int totalData = categoryService.getAllProductsByID(Integer.parseInt(id)).size();
		PaginatesDto paginatesInfo = PaginateService.GetInfoPaginates(totalData, totalProductsPage, 1);
		_mvShare.addObject("idCategory", id);
		_mvShare.addObject("paginateInfo", paginatesInfo);		
		_mvShare.addObject("productsPaginate", categoryService.getDataProductsPaginate(paginatesInfo.getStart(), paginatesInfo.getEnd()));
		return _mvShare;
	}
}
