package mc.kurunegala.bop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mc.kurunegala.bop.model.Assessment;
import mc.kurunegala.bop.model.AssessmentSearcher;
import mc.kurunegala.bop.model.Street;
import mc.kurunegala.bop.model.Ward;
import mc.kurunegala.bop.service.AssessmentService;
import mc.kurunegala.bop.service.StreetService;
import mc.kurunegala.bop.service.WardService;

@Controller
public class BopController extends AbstractController {

	@Autowired
	AssessmentService assessmentService;
	@Autowired
	WardService wardService;
	@Autowired
	StreetService streetService;

	@RequestMapping(value = "/bop-application", method = RequestMethod.GET)
	public ModelAndView showApplication(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("bop/application");
		// mv.addObject("user", new UserAccount());
		return mv;
	}

	@RequestMapping(value = "/bop-assessment", method = RequestMethod.GET)
	public ModelAndView showAssessment(HttpServletRequest request, HttpServletResponse response) {
		List<Assessment> assessments = assessmentService.viewAllActive(1);
		List<Street> streets = streetService.viewAll();
		List<Ward> wards = wardService.viewAll();
		ModelAndView mv = new ModelAndView("bop/assessment-check");
		mv.addObject("assessments", assessments);
		mv.addObject("wards", wards);
		mv.addObject("streets", streets);
		mv.addObject("searcher", new AssessmentSearcher());
		return mv;
	}

	@RequestMapping(value = "/bop-approve", method = RequestMethod.GET)
	public ModelAndView showApprove(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("bop/list");
		// mv.addObject("user", new UserAccount());
		return mv;
	}

	@RequestMapping(value = "/bop-ready", method = RequestMethod.GET)
	public ModelAndView showReady(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("bop/list");
		// mv.addObject("user", new UserAccount());
		return mv;
	}

	@RequestMapping(value = "/bop-pending", method = RequestMethod.GET)
	public ModelAndView showPnding(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("bop/list");
		// mv.addObject("user", new UserAccount());
		return mv;
	}

	@RequestMapping(value = "/bop-reject", method = RequestMethod.GET)
	public ModelAndView showReject(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("bop/list");
		// mv.addObject("user", new UserAccount());
		return mv;
	}

	@RequestMapping(value = "/bop-complete", method = RequestMethod.GET)
	public ModelAndView showComplete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("bop/list");
		// mv.addObject("user", new UserAccount());
		return mv;
	}

	@RequestMapping(value = "/assessment-search", method = RequestMethod.POST)
	public ModelAndView processAssessmentSerach(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute AssessmentSearcher searcher) {
		List<Assessment> assessments = assessmentService.serachAssessment(searcher);
		ModelAndView mv = new ModelAndView("bop/assessment-check");

		List<Street> streets = streetService.viewAll();
		List<Ward> wards = wardService.viewAll();
		mv.addObject("assessments", assessments);
		mv.addObject("wards", wards);
		mv.addObject("streets", streets);
		mv.addObject("searcher", searcher);
		return mv;

	}

}
