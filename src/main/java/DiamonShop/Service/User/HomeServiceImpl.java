package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CategorysDao;
import DiamonShop.Dao.MenusDao;
import DiamonShop.Dao.SlideDao;
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
	
	public List<Slides> GetDataSlide() {		
		return slideDao.GetDataSlide();
	}

	public List<Categorys> GetDataCategorys() {
		return categorysDao.getDataCategorys();
	}

	public List<Menus> GetDataMenus() {
		return menusDao.getDataMenus();
	}

}
