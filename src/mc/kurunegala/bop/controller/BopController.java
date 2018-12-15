package mc.kurunegala.bop.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import mc.kurunegala.bop.model.ApplicationCatagory;
import mc.kurunegala.bop.model.Area;
import mc.kurunegala.bop.model.Assessment;
import mc.kurunegala.bop.model.AssessmentSearcher;
import mc.kurunegala.bop.model.AssessmentWrapper;
import mc.kurunegala.bop.model.BOP;
import mc.kurunegala.bop.model.BOPWithBLOBs;
import mc.kurunegala.bop.model.BOPWrapper;
import mc.kurunegala.bop.model.BopHasAssessment;
import mc.kurunegala.bop.model.Customer;
import mc.kurunegala.bop.model.NeedDoc;
import mc.kurunegala.bop.model.Street;
import mc.kurunegala.bop.model.UploadWrapper;
import mc.kurunegala.bop.model.Uploads;
import mc.kurunegala.bop.model.Ward;
import mc.kurunegala.bop.service.ApplicationCategoryService;
import mc.kurunegala.bop.service.AreaService;
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
	@Autowired
	AreaService areaService;
	@Autowired
	BopService bopService;

	private static String UPLOADED_FOLDER = "F:\\bopUploads\\";

	private String appCategory;

	@RequestMapping(value = "/bop-application", method = RequestMethod.GET)
	public ModelAndView showApplication(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("tempId") String bopNo) {

		// List<BopHasAssessment> bopHasAssessment =
		// bopHasAssessmentService.viewAllByState(1);
		List<Uploads> uploads = null;
		List<NeedDoc> needDocs = needDocService.viewAll();

		ModelAndView mv = new ModelAndView("bop/application");

//		Assessment ass = new Assessment();
		BopHasAssessment bopHasAss = getsessionBop(request);

		BOPWrapper wrapper = new BOPWrapper();
		if ((bopHasAss != null) && (bopNo != null && !bopNo.equals("") && !bopNo.equals("null"))) {
			wrapper.getBop().setBopNo(bopNo);
			uploads = uploadService.viewByBopId(bopHasAss.getBopIdbop());
		} else {
			wrapper.getBop().setBopNo(generateBOPNmber());
		}

		mv.addObject("uploads", uploads);
		mv.addObject("assessment", new Assessment());
		mv.addObject("uploadWrapper", new UploadWrapper());
		mv.addObject("needDocs", needDocs);
		mv.addObject("bopWrapper", wrapper);

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
			@RequestParam("tempId") int assessmentId, @RequestParam("bopNo") String bopNo) {
		ModelAndView mv = new ModelAndView("bop/application-main-form");
		Assessment assessment = assessmentService.get(assessmentId);
		BOPWithBLOBs bop = new BOPWithBLOBs();
		bop.setBopNo(bopNo);
		BOPWrapper wrapper = new BOPWrapper();
		wrapper.setAssessment(assessment);
		wrapper.setBop(bop);
		mv.addObject("bopWrapper", wrapper);

		return mv;
	}

	@RequestMapping(value = "/customer-data-for-view", method = RequestMethod.GET)
	public ModelAndView showCustomerForAssessmentView(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("tempId") int assessmentId) {
		ModelAndView mv = new ModelAndView("bop/customer-basic-view");
		Assessment assessment = assessmentService.get(assessmentId);
		mv.addObject("assessment", assessment);
		return mv;
	}

	@RequestMapping(value = "/bop", method = RequestMethod.POST)
	public ModelAndView processBop(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute BOPWrapper bopWrapper) {
		Customer customer = bopWrapper.getAssessment().getCustomer();
		if (customer.getIdcustomer() != null) {
			customerService.update(customer);
		} else {
			customer.setIdcustomer(generatePrimaryKey());
			customer.setCusStatus(1);
			customerService.add(customer);

			Assessment ass = assessmentService.get(bopWrapper.getAssessment().getIdassessment());
			ass.setCustomerIdcustomer(customer.getIdcustomer());
			assessmentService.update(ass);
		}
		BOPWithBLOBs bop = new BOPWithBLOBs();
		bop.setIdbop(generatePrimaryKey());
		bop.setBopNo(bopWrapper.getBop().getBopNo());
		bop.setCustomerIdcustomer(customer.getIdcustomer());
		bopservice.add(bop);

//		bop=bopservice.viewByBopNo(bop.getBopNo());

		BopHasAssessment bopAss = new BopHasAssessment();
		// bopAss.setIdbopHasAssessmentcol(generatePrimaryKey());
		bopAss.setBopIdbop(bop.getIdbop());
		bopAss.setAssessmentIdassessment(bopWrapper.getAssessment().getIdassessment());
		bopAss.setBopHasAssessmentStatus(1);
		bopHasAssessmentService.add(bopAss);

		// customer has application to be continued

		addSessionBop(bopAss, request.getSession());

		ModelAndView mv = new ModelAndView("redirect:bop-application", "tempId", bopWrapper.getBop().getBopNo());
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

		BopHasAssessment bopHasAss = getsessionBop(request);
		NeedDoc doc = needDocService.viewById(uploadWrapper.getNeedDoc().getIdneeddoc());
		Uploads upload = new Uploads();
		upload.setIdapplication(1);
		upload.setIduploads(generatePrimaryKey());
		upload.setApplicationCatagoryIdapplicationCatagory(doc.getApplicationCatagoryIdapplicationCatagory());
		upload.setUploadsPath(filePath);
		upload.setDoccatIddoccat(doc.getDoccatIddoccat());
		upload.setIdapplication(bopHasAss.getBopIdbop());
		uploadService.add(upload);

		System.out.println(uploadWrapper.getBopNo());
		ModelAndView mv = new ModelAndView("redirect:bop-application", "tempId", uploadWrapper.getBopNo());

		return mv;
	}

	@RequestMapping(value = "/bop-assessment-basic-view", method = RequestMethod.GET)
	public ModelAndView showAssessmentView(HttpServletRequest request, HttpServletResponse response) {

		// List<BopHasAssessment> bopHasAssessment =
		// bopHasAssessmentService.viewAllByState(1);
		List<NeedDoc> needDocs = needDocService.viewAll();

		List<Assessment> assessments = assessmentService.viewAllActive(1);
		List<BOPWithBLOBs> bops = bopservice.viewByState(0);
		ModelAndView mv = new ModelAndView("bop/assessment-basic-view");
		mv.addObject("bops", bops);
		mv.addObject("assessments", assessments);
		mv.addObject("uploadWrapper", new UploadWrapper());
		mv.addObject("needDocs", needDocs);

		return mv;
	}

	@RequestMapping(value = "/bop-form", method = RequestMethod.POST)
	public ModelAndView processBopForm(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute BOPWrapper bopWrapper) {
		BopHasAssessment bopHasAss = getsessionBop(request);
		BOPWithBLOBs bop = null;

		if (bopHasAss != null)
			bop = bopservice.get(bopHasAss.getBopIdbop());

		if (bop != null) {
			bop.setBopApplayDate(new Date());
			bop.setBopIsMarkonground(bopWrapper.getLandMarkComleted());
			bop.setBopDiscription(bopWrapper.getLandType());
			bop.setBopCompleteStatus(0);
			bopservice.update(bop);

			String data[] = bopWrapper.getPerch().split(",");
			for (String s : data) {
				Area area = new Area();
				area.setBopIdbop(bop.getIdbop());
				area.setAreaPerchers(Double.parseDouble(s));
				areaService.add(area);
			}
		}
		removeSessionAssessmentWrapper(request.getSession());
		// removeSessionBopNumber(request.getSession());
		removeSessionBop(request.getSession());

		ModelAndView mv = new ModelAndView("bop/list");
		// mv.addObject("user", new UserAccount());
		return mv;
	}

	@RequestMapping(value = "/bop-list", method = RequestMethod.GET)
	public ModelAndView showBopList(HttpServletRequest request, HttpServletResponse response) {

		List<BOPWithBLOBs> bops = bopservice.viewByState(0);
		ModelAndView mv = new ModelAndView("bop/list");
		mv.addObject("bops", bops);
		return mv;
	}
	@RequestMapping(value = "/bop-view", method = RequestMethod.GET)
	public ModelAndView showBopView(HttpServletRequest request, HttpServletResponse response,@RequestParam("tempId")String bopId) {

		BOPWithBLOBs bop = bopservice.viewByBopId(Integer.parseInt(bopId));
		ModelAndView mv = new ModelAndView("bop/view");
		mv.addObject("bop", bop);
		return mv;
	}

	public String getAppCategory() {
		return appCategory;
	}

	public void setAppCategory(String appCategory) {
		this.appCategory = appCategory;
	}

}
