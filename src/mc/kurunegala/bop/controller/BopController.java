package mc.kurunegala.bop.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.NestedTransactionNotSupportedException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import mc.kurunegala.bop.model.ApplicationCatagory;
import mc.kurunegala.bop.model.Assessment;
import mc.kurunegala.bop.model.AssessmentSearcher;
import mc.kurunegala.bop.model.AssessmentWrapper;
import mc.kurunegala.bop.model.BOP;
import mc.kurunegala.bop.model.BOPWithBLOBs;
import mc.kurunegala.bop.model.BopHasAssessment;
import mc.kurunegala.bop.model.Customer;
import mc.kurunegala.bop.model.NeedDoc;
import mc.kurunegala.bop.model.Street;
import mc.kurunegala.bop.model.UploadWrapper;
import mc.kurunegala.bop.model.Uploads;
import mc.kurunegala.bop.model.Ward;
import mc.kurunegala.bop.service.ApplicationCategoryService;
import mc.kurunegala.bop.service.AssessmentService;
import mc.kurunegala.bop.service.BopHasAssessmentService;
import mc.kurunegala.bop.service.BopService;
import mc.kurunegala.bop.service.CustomerService;
import mc.kurunegala.bop.service.NeedDocService;
import mc.kurunegala.bop.service.StreetService;
import mc.kurunegala.bop.service.UploadSearvice;
import mc.kurunegala.bop.service.WardService;

@Controller
public class BopController extends AbstractController {

	@Autowired
	WardService wardService;
	@Autowired
	StreetService streetService;
	@Autowired
	AssessmentService assessmentService;
	@Autowired
	ApplicationCategoryService applicationCategoryService;
	@Autowired
	BopHasAssessmentService bopHasAssessmentService;
	@Autowired
	CustomerService customerService;
	@Autowired
	NeedDocService needDocService;
	@Autowired
	UploadSearvice uploadService;

	private static String UPLOADED_FOLDER = "F:\\bopUploads\\";

	private String appCategory;

	@RequestMapping(value = "/bop-application", method = RequestMethod.GET)
	public ModelAndView showApplication(HttpServletRequest request, HttpServletResponse response) {

		List<BopHasAssessment> bopHasAssessment = bopHasAssessmentService.viewAllByState(1);
		List<NeedDoc> needDocs = needDocService.viewAll();

		ModelAndView mv = new ModelAndView("bop/application");

		Assessment ass = new Assessment();
		ass.setAssessmentNo(generateBOPNmber());

		mv.addObject("assessment", ass);
		mv.addObject("uploadWrapper", new UploadWrapper());
		mv.addObject("needDocs", needDocs);

		return mv;
	}

	@RequestMapping(value = "/bop-assessment", method = RequestMethod.GET)
	public ModelAndView showAssessment(HttpServletRequest request, HttpServletResponse response) {
		List<Assessment> assessments = assessmentService.viewAllActive(1);
		List<Street> streets = streetService.viewAll();
		List<Ward> wards = wardService.viewAll();
		List<ApplicationCatagory> applicationCategories = applicationCategoryService.viewAllActive(1);
		ModelAndView mv = new ModelAndView("bop/assessment-check");
		mv.addObject("assessments", assessments);
		mv.addObject("wards", wards);
		mv.addObject("streets", streets);
		mv.addObject("applicationCategories", applicationCategories);
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
		ModelAndView mv = new ModelAndView("bop/assessment-searcher");

		List<Street> streets = streetService.viewAll();
		List<Ward> wards = wardService.viewAll();
		mv.addObject("assessments", assessments);
		mv.addObject("wards", wards);
		mv.addObject("streets", streets);
		mv.addObject("searcher", searcher);
		return mv;

	}

	@RequestMapping(value = "/select-assessment", method = RequestMethod.GET)
	public ModelAndView showSelectedAssessment(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("tempId") int assessmentId) {
		ModelAndView mv = new ModelAndView("bop/selected-assessment-table");
		List<Assessment> assessments = null;
		Assessment assessment = assessmentService.get(assessmentId);
		AssessmentWrapper wrapper = getSessionAssessment(request.getSession());
		if (wrapper == null) {
			wrapper = new AssessmentWrapper();
			assessments = new ArrayList<>();
			assessments.add(assessment);
			wrapper.setAssessments(assessments);
			addSessionAssessmentWrapper(wrapper, request.getSession());
		} else {
			if (!wrapper.getAssessments().contains(assessment)) {
				wrapper.getAssessments().add(assessment);
			}

		}
		return mv;
	}

	@RequestMapping(value = "/select-assessment-remove", method = RequestMethod.GET)
	public ModelAndView removeSelectedAssessment(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("tempId") int assessmentId) {
		ModelAndView mv = new ModelAndView("bop/selected-assessment-table");
		Assessment assessment = assessmentService.get(assessmentId);
		AssessmentWrapper wrapper = getSessionAssessment(request.getSession());
		if (wrapper.getAssessments().contains(assessment)) {
			wrapper.getAssessments().remove(assessment);
			addSessionAssessmentWrapper(wrapper, request.getSession());
		}
		return mv;
	}

	@RequestMapping(value = "/customer-data", method = RequestMethod.GET)
	public ModelAndView showApplicationmainFormt(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("tempId") int assessmentId) {
		ModelAndView mv = new ModelAndView("bop/application-main-form");
		Assessment assessment = assessmentService.get(assessmentId);
		mv.addObject("assessment", assessment);
		return mv;
	}

	@RequestMapping(value = "/bop", method = RequestMethod.POST)
	public ModelAndView processBop(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute Assessment assessment) {
		Customer customer = assessment.getCustomer();
		if (customer.getIdcustomer() != null) {
			customerService.update(customer);
		} else {
			customer.setIdcustomer(generatePrimaryKey());
			customer.setCusStatus(1);
			customerService.add(customer);

			Assessment ass = assessmentService.get(assessment.getIdassessment());
			ass.setCustomerIdcustomer(customer.getIdcustomer());
			assessmentService.update(ass);
		}
		BOPWithBLOBs bop = new BOPWithBLOBs();
		bop.setIdbop(generatePrimaryKey());
		bop.setCustomerIdcustomer(customer.getIdcustomer());
		bopservice.add(bop);

		BopHasAssessment bopAss = new BopHasAssessment();
		bopAss.setIdbopHasAssessmentcol(generatePrimaryKey());
		bopAss.setBopIdbop(bop.getIdbop());
		bopAss.setAssessmentIdassessment(assessment.getIdassessment());
		bopAss.setBopHasAssessmentStatus(1);
		bopHasAssessmentService.add(bopAss);

		// customer has application to be continued

		ModelAndView mv = new ModelAndView("redirect:bop-application");
		return mv;
	}

	@RequestMapping(value = "/applicton-file-upload", method = RequestMethod.POST)
	public ModelAndView processApplicationFileUpload(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute UploadWrapper uploadWrapper) {

		String filePath = null;
		try {
			MultipartFile file = uploadWrapper.getFileData();
			byte[] bytes = file.getBytes();
			filePath = UPLOADED_FOLDER + file.getOriginalFilename();
			Path path = Paths.get(filePath);
			System.out.println(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

		} catch (Exception e) {
			e.printStackTrace();
		}

		NeedDoc doc = needDocService.viewById(uploadWrapper.getNeedDoc().getIdneeddoc());
		Uploads upload = new Uploads();
		upload.setIdapplication(1);
		upload.setIduploads(generatePrimaryKey());
		upload.setApplicationCatagoryIdapplicationCatagory(doc.getApplicationCatagoryIdapplicationCatagory());
		upload.setUploadsPath(filePath);
		upload.setDoccatIddoccat(doc.getDoccatIddoccat());
		uploadService.add(upload);

		ModelAndView mv = new ModelAndView("bop/selected-assessment-table");

		return mv;
	}

	@RequestMapping(value = "/bop-assessment-basic-view", method = RequestMethod.GET)
	public ModelAndView showAssessmentView(HttpServletRequest request, HttpServletResponse response) {

		List<BopHasAssessment> bopHasAssessment = bopHasAssessmentService.viewAllByState(1);
		List<NeedDoc> needDocs = needDocService.viewAll();

		List<Assessment> assessments = assessmentService.viewAllActive(1);

		ModelAndView mv = new ModelAndView("bop/assessment-basic-view");
		mv.addObject("assessments", assessments);
		mv.addObject("uploadWrapper", new UploadWrapper());
		mv.addObject("needDocs", needDocs);

		return mv;
	}

	public String getAppCategory() {
		return appCategory;
	}

	public void setAppCategory(String appCategory) {
		this.appCategory = appCategory;
	}

}
