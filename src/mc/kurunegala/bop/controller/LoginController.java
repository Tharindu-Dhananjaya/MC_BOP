package mc.kurunegala.bop.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jdk.nashorn.internal.runtime.UserAccessorProperty;
import mc.kurunegala.bop.model.User;
import mc.kurunegala.bop.model.UserLogin;
import mc.kurunegala.bop.service.UserLoginService;
import mc.kurunegala.bop.service.UserService;

@Controller
public class LoginController extends AbstractController {

	@Autowired
	UserLoginService userLoginService;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println(AuthenticationChecker.mainURL);
		ModelAndView mv = new ModelAndView("login/login");
		mv.addObject("user", new User());
//		mv.addObject("URL", AuthenticationChecker.mainURL);
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLoginView(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("redirect:/");
		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView processLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session,
			@Valid @ModelAttribute User userAccount, BindingResult result) {

		try {
			if (result.hasErrors() || (userAccount.getUserUsername().equals(""))
					|| userAccount.getUserPassword().equals("")) {

				ModelAndView mv = new ModelAndView("login/login");
				mv.addObject("user", userAccount);
				mv.addObject("authMsg", "Username or password cannot be empty!");
				return mv;
			}

			User user = userService.viewByUserNameAndPassword(userAccount.getUserUsername(),
					userAccount.getUserPassword());

			if (user == null) {
				ModelAndView mv = new ModelAndView("login/login");
				mv.addObject("user", userAccount);
				mv.addObject("authMsg", "Username or password incorrect !");
				return mv;
			}

			UserLogin log = new UserLogin();
			log.setUserIduser(user.getIduser());
			log.setUserLoginIn(new java.util.Date());
			log.setUserLoginSyn(1);
			userLoginService.add(log);
			addSessionUser(user, request.getSession());
			ModelAndView mv = new ModelAndView("bop/home");
			return mv;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView showlogOut(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		UserLogin log = new UserLogin();
		log.setUserIduser(getSessionUserId(request));
		log.setUserLoginOut(new java.util.Date());
		userLoginService.update(log);

		removeSessionUser(session);
		removeSessionAssessment(session);
		removeSessionBop(session);
		removeSessionAssessmentWrapper(session);
		ModelAndView mv = new ModelAndView("login/login");
		mv.addObject("user", new User());
		return mv;

	}
//
//	@RequestMapping(value = "/resetpassword", method = RequestMethod.GET)
//	public ModelAndView showResetPassword(HttpServletRequest request, HttpServletResponse response) {
//		ModelAndView mv = new ModelAndView("login/change-password");
//		mv.addObject("user", new Employee());
//		mv.addObject("STATE", "EMAIL");
//		return mv;
//	}
//
//	@RequestMapping(value = "/resetpassword", method = RequestMethod.POST)
//	public ModelAndView processResetPassword(HttpServletRequest request, HttpServletResponse response,
//
//			@ModelAttribute UserAccount user, @RequestParam String email) {
//		System.out.println(email);
//		UserAccount acc = userAccountService.get(email);
//		acc.setPassword(user.getPassword());
//		addUpdateSettings(acc, request);
//		userAccountService.update(acc);
//
//		ModelAndView mv = new ModelAndView("login/login");
//		mv.addObject("user", new Employee());
//		return mv;
//	}
//
//	@RequestMapping(value = "/find-account", method = RequestMethod.POST)
//	public ModelAndView processFindAccount(HttpServletRequest request, HttpServletResponse response,
//			@RequestParam String email) {
//
//		UserAccount userAcc = userAccountService.findByUsername(email);
//
//		if (userAcc == null) {
//			ModelAndView mv = new ModelAndView("login/change-password");
//			mv.addObject("user", userAcc);
//			mv.addObject("STATE", "EMAIL");
//			mv.addObject("CpMsg", "Invalid Email !");
//			return mv;
//		}
//
//		ModelAndView mv = new ModelAndView("login/change-password");
//		mv.addObject("user", userAcc);
//		return mv;
//	}

}
