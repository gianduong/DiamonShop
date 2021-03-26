package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dto.ProductsDto;
@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductsDao productsDao = new ProductsDao();
	
	public ProductsDto getProductByID(long id) {
		List<ProductsDto> list = productsDao.getProductByID(id);
		return list.get(0);
	}

	public List<ProductsDto> getProductByIDCategory(int id) {
		
		return productsDao.GetAllProductsByID(id);
	}

}
