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

import mc.kurunegala.bop.model.AssessmentWrapper;
import mc.kurunegala.bop.model.User;


public class AbstractController  {

	private HttpSession session;
	private int notificationCount;

	private Random random = new Random(1000);

	public String generatePrimaryKey() {
		return String.valueOf(Calendar.getInstance().getTimeInMillis() + random.nextInt());
	}

	public void addSessionUser(User user, HttpSession session) {
		session.setAttribute("User", user);
	}
	
	public void addSessionAssessmentWrapper(AssessmentWrapper wrapper,HttpSession session) {
		session.setAttribute("AssWrapper", wrapper);
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
