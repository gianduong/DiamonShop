package DiamonShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.SlideDao;
import DiamonShop.Entity.Slides;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private SlideDao slideDao;
	public List<Slides> GetDataSlide() {
		
		return slideDao.GetDataSlide();
	}

}
