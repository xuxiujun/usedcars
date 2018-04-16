package xin.xuxiujun.web;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import xin.xuxiujun.dao.UserDao;
import xin.xuxiujun.domain.User;
import xin.xuxiujun.domain.UserCollections;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	 private static final String Cars_Picture_Path ="E:\\GraduationThesis\\CarsPicture\\";
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

	// 用户登录
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
	// 通过session.invalidata()方法来注销当前的session
	@RequestMapping(value = "/logout.action")
	public ModelAndView outLogin(HttpSession session) {
		session.invalidate();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/index.jsp");
		return mav;
	}
	// 修改用户信息
	@RequestMapping(value = "/update.action", method = RequestMethod.POST)
	public ModelAndView userUpdate(User user,HttpSession session) {
		System.out.println(user.getUserAddress()+user.getUserBirthday()+
				user.getUserEmail()+user.getUserIdNo()+user.getUserSex()+user.getUserTrueName()+user.getUserId());	
		userDao.updateUserbaseinformation(user);
		User user1 = userDao.findByUserid(user.getUserId());
		session.setAttribute("user", user1);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("personalpage");
		return mav;
	}
	// UUID
	public static String getNewId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	// 用户注册
	@RequestMapping(value = "/register.action", method = RequestMethod.POST)
	public String userRegister(User register) {
		String useruuid=getNewId();
		System.out.println("这是生成的ID" + useruuid);
		register.setUserId(useruuid);	
		userDao.saveUserInformation(register);

		return "redirect:/registersuccessful.jsp";// 重定向到注册成功界面
	}
	//上传头像图片	
	@RequestMapping(value="/doUpload.action", method=RequestMethod.POST)  
    public ModelAndView doUploadFile(@RequestParam("file") MultipartFile file,User user,HttpSession session){  		
        if(!file.isEmpty()){  
            try {   
            	System.out.println(System.currentTimeMillis());//格林威治时间
            	System.out.println(file.getOriginalFilename());//获取的文件名          	
                //这里将上传得到的文件保存至E:\\GraduationThesis\\CarsPicture\\目录    
            	FileUtils.copyInputStreamToFile(file.getInputStream(), new File(Cars_Picture_Path,System.currentTimeMillis()+ file.getOriginalFilename()));        
            	//将用户图片的位置上传到数据库存起来
            	user.setUserAvator(Cars_Picture_Path+System.currentTimeMillis()+file.getOriginalFilename());
                userDao.uploadUserAvator(user);            
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
		session.setAttribute("user", user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("uploadpicture");
		return mav;	
	}
	//用户添加收藏
	@RequestMapping(value="/collection.action")
	public ModelAndView addCollection(@RequestParam("userid")String userid,@RequestParam("carid") String carid) {
		userDao.myColllection(userid,carid);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("mycollection");
		return modelAndView;
	}
	//用户查看自己的收藏
	@RequestMapping(value="/findmycollections.action")
	public ModelAndView findColllection(HttpSession session,UserCollections userCollections){	
		List<UserCollections> getuserCollections=userDao.findMyCollectionByUserId(userCollections);
		for (int i=0;i<getuserCollections.size();i++) {
			System.out.println(getuserCollections.get(i).toString());
		}
		session.setAttribute("getuserCollections", getuserCollections);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("");
		return modelAndView;
	}
}
