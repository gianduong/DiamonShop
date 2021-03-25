package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.ProductsDao;
import DiamonShop.Dto.ProductsDto;
@Service
public class CategoryServiceImpl implements ICategoryService{
	@Autowired
	private ProductsDao productsDao;

	public List<ProductsDto> getDataProductsPaginate(int id,int start, int totalPage) {
		return productsDao.GetDataProductsPaginate(id,start,totalPage);
	}

	public List<ProductsDto> getAllProductsByID(int id) {
		return productsDao.GetAllProductsByID(id);
	}

}
