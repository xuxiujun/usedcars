package xin.xuxiujun.web;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import xin.xuxiujun.dao.UserRegisterDao;
import xin.xuxiujun.domain.User;

@Controller
@RequestMapping(value = "/user")
public class UserRegisterController {
	//UUID
	public static String getNewId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
}
	@Autowired
	private UserRegisterDao userregisterdao;

	@RequestMapping(value = "/register.action", method = RequestMethod.POST)
	public String userRegister(User register) {
		
		
//		System.out.println(register.getUserNetworkName());//测试前端输入的数据
//		System.out.println(register.getUserPassword());
//		System.out.println(register.getUserEmail());
//		System.out.println(register.getUserMobileNumber());
	    userregisterdao.saveUserInformation(register);	
	    System.out.println("这是生成的ID"+getNewId());
		return "redirect:/registersuccessful.jsp";//重定向到注册成功界面
		
	}	

}