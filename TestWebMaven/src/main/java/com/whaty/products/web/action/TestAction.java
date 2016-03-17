package com.whaty.products.web.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.whaty.products.web.bean.User;
import com.whaty.products.web.bean.UserScore;
import com.whaty.products.web.service.IUserService;

/**
 * @Scope(BeanDefinition.SCOPE_PROTOTYPE)  表示每次都是个新实例，@Scope("singleton")表示单例，@Scope是作用范围
 * @author Administrator
 *
 */
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Controller
@SuppressWarnings({ "unchecked", "serial" })
public class TestAction extends ActionSupport{

	@Resource
	private IUserService iUserService;
	
	public String execute() {
		
		try {
			//SimpleDateFormat sf = new SimpleDateFormat();
			
			UserScore userScore = new UserScore();
			userScore.setScore(20);
			userScore.setDateTime(new Date());
			//userScore = (UserScore) iUserService.save(userScore);
			
			User user = new User();
			user.setName("刘振龙");
			user.setAddress("北京市海淀区中关村软件园5号楼汉王大厦2D");
			user.setDateTime(new Date());
			//user = (User) iUserService.save(user);
			iUserService.saveUser(userScore, user);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "success";
	}

	public IUserService getiUserService() {
		return iUserService;
	}

	public void setiUserService(IUserService iUserService) {
		this.iUserService = iUserService;
	}


}
