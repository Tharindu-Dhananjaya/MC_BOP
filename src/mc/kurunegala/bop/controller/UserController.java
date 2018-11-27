package mc.kurunegala.bop.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController extends AbstractController {

	private String seachText;

	/*@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, "standardUser.dateOfBirth", new CustomDateEditor(sdf, false));
	}*/

	
	

	@RequestMapping(value = "/userProfile", method = RequestMethod.GET)
	public ModelAndView showUserProfile(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("tempId") String userId) {

//		Employee sessionUser = getSessionUser(request);

		return new ModelAndView();

	}

	
/*		@RequestMapping(value = "/seacher", method = RequestMethod.POST)
	public ModelAndView processSearcher(HttpServletRequest request, HttpServletResponse response,
			@RequestParam String searchText) {

		if (searchText.equals("")) {
			ModelAndView mv = new ModelAndView("friends");
			mv.addObject("searcherMessage", "No Result !");
			return mv;
		}

//		List<User> users = .getForSearcher(searchText);

		ModelAndView mv = new ModelAndView("friends");
//		if (users.size() < 1) {
//			mv.addObject("searcherMessage", "No Result !");
//		} else {
//			mv.addObject("users", users);
//		}

		return mv;

	}

	@RequestMapping(value = "/search-user", method = RequestMethod.GET)
	public ModelAndView showUserSeacher(HttpServletRequest request, HttpServletResponse httpServletResponse) {

		
		
		
		ModelAndView mv = new ModelAndView("user-searcher");
//		mv.addObject("userSeacher", new UserSearcher());
		return mv;
	}

	@RequestMapping(value = "/search-user", method = RequestMethod.POST)
	public ModelAndView processSearcher(HttpServletRequest request, HttpServletResponse httpServletResponse,
			@ModelAttribute UserSearcher searcher) {

//		List<User> usrs = userService.getBySearcher(searcher);
		ModelAndView mv = new ModelAndView("user-searcher");
//		mv.addObject("users", usrs);
		mv.addObject("userSeacher", searcher);
		return mv;
	}

	@RequestMapping(value = "/search-user-for-offer", method = RequestMethod.POST)
	public ModelAndView processSearcherForOffer(HttpServletRequest request, HttpServletResponse httpServletResponse,
			@ModelAttribute UserSearcher searcher) {

//		List<User> usrs = userService.getBySearcher(searcher);
		ModelAndView mv = new ModelAndView("offer/recommend-user");
//		mv.addObject("users", usrs);
		mv.addObject("userSeacher", searcher);
		mv.addObject("offerId", searcher.getExtra());
		return mv;
	}*/

	public String getSeachText() {
		return seachText;
	}

	public void setSeachText(String seachText) {
		this.seachText = seachText;
	}
	

}
