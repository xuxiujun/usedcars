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
		if (user == null || !user.getUserPassword().equals(model.getUserPassword())) {
			return new ModelAndView("redirect:/index.jsp");
		} else {
			session.setAttribute("user", user);
		
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			return mav;
		}
	}
	@RequestMapping(value = "/logout.action")
	public ModelAndView outLogin(HttpSession session){
        //通过session.invalidata()方法来注销当前的session
        session.invalidate();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/index.jsp");
		return mav;
    }
}

