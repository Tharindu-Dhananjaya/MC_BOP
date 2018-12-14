<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>



<div class="col-md-12 p-2">
	<div>BOP No : ${assessment.assessmentNo}</div>
</div>
<div class="col-md-2  p-2">
	<div>NIC : ${assessment.customer.cusNic}</div>
</div>
<div class="col-md-6  p-2">
	<div>Name : ${assessment.customer.cusName}</div>
</div>
<div class="col-md-4  p-2">
	<div>Mobile : ${assessment.customer.cusMobile}</div>
</div>
<div class="col-md-6  p-2">
	<div>Address Line 1 : ${assessment.customer.cusAddressL1}</div>
	<div>Address Line 2 : ${assessment.customer.cusAddressL2}</div>
	<div>Address Line 3 : ${assessment.customer.cusAddressL3}</div>
</div>
<div class="col-md-6  p-2">
	<c:if test="${not empty bop.uploads}">
		<c:forEach items="${bop.uploads}" var="upload">


			<img src="${upload.uploadsPath}" class="rounded-circle " id="pimg"
				width="70px" height="70px">
		</c:forEach>
	</c:if>
</div>
