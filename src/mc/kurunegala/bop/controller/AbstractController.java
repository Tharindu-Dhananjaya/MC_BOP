package mc.kurunegala.bop.controller;

import java.util.Calendar;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;

import mc.kurunegala.bop.dao.AssessmentMapper;
import mc.kurunegala.bop.model.AssessmentWrapper;
import mc.kurunegala.bop.model.BopHasAssessment;
import mc.kurunegala.bop.model.User;
import mc.kurunegala.bop.service.AssessmentService;
import mc.kurunegala.bop.service.BopService;

public class AbstractController {

	@Autowired
	BopService bopservice;

	private HttpSession session;

	private Random random = new Random(1000);

	public int generatePrimaryKey() {
		return (int) (Calendar.getInstance().getTimeInMillis() + random.nextInt());
	}

	public String generateBOPNmber() {
		String newAssNo = null;
		String assNo = bopservice.getMaxAssessmentNumber();
		if (assNo != null) {
			String data[] = assNo.split("BOP/KU/");
			int currentAss = Integer.parseInt(data[1]);
			int newAss = ++currentAss;
			newAssNo = "BOP/KU/00" + newAss;
		} else {
			newAssNo = "BOP/KU/001";
		}
		return newAssNo;
	}

	public void addSessionUser(User user, HttpSession session) {
		session.setAttribute("User", user);
	}

	public void addSessionAssessmentWrapper(AssessmentWrapper wrapper, HttpSession session) {
		session.setAttribute("AssWrapper", wrapper);
	}

	public void addSessionBop(BopHasAssessment bop, HttpSession session) {
		session.setAttribute("BOPASS", bop);
	}

	public void addSessionBopNumber(String bopNo, HttpSession session) {
		session.setAttribute("BOPNO", bopNo);
	}

	public AssessmentWrapper getSessionAssessment(HttpSession session) {
		return (AssessmentWrapper) session.getAttribute("AssWrapper");
	}

	public void removeSessionUser(HttpSession session) {
		session.removeAttribute("User");
	}

	public Integer getSessionUserId(HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("User");
		if (user == null) {
			return null;
		}
		return user.getIduser();
	}

	public HttpSession getSession() {
		return session;
	}

	public void setSession(HttpSession session) {
		this.session = session;
	}

}
