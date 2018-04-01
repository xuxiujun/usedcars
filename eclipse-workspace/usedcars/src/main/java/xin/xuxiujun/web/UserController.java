package xin.xuxiujun.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import xin.xuxiujun.dao.UserDao;
import xin.xuxiujun.domain.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	private UserDao userDao;

	@RequestMapping("/view")
	public String view() {
		return "main/login";
	}

	@RequestMapping("/indexview")
	public String index() {
		return "main/index";
	}

	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public ModelAndView login(User model, HttpSession session) {
		User user = userDao.findByUsername(model.getUserNetworkName());
		
		//System.out.println(model.getUserNetworkName());//测试前端接收数据
		//System.out.println(model.getUserPassword());
		
		if (user == null || !user.getUserPassword().equals(model.getUserPassword())) {
			return new ModelAndView("redirect:/login.jsp");
		} else {
			session.setAttribute("user", user);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("jsp/index");
			return mav;
		}
	}
}
