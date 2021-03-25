package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategorysDao;
import DiamonShop.Dao.MenusDao;
import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dao.SlideDao;
import DiamonShop.Dto.ProductsDto;
import DiamonShop.Entity.Categorys;
import DiamonShop.Entity.Menus;
import DiamonShop.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlideDao slideDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;
	public List<Slides> GetDataSlide() {		
		return slideDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		return categorysDao.getDataCategorys();
	}

	public List<Menus> getDataMenus() {
		return menusDao.getDataMenus();
	}

	public List<ProductsDto> getDataProducts() {
		List<ProductsDto> productsDtos = productsDao.getDataProducts();
		return productsDtos;
	}

	public List<ProductsDto> getDataProductsNew() {
		List<ProductsDto> productsDtos = productsDao.getDataProductsNew();
		return productsDtos;
	}

	public List<ProductsDto> getDataProductsHinglight() {
		List<ProductsDto> productsDtos = productsDao.getDataProductsHighlight();
		return productsDtos;
	}


}
