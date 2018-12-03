<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<div class="row">
	<div class="col-md-10">




		<div class="row">

			<div class="col-md-6">
				<form:form modelAttribute="assessment" action="bop.html"
					method="POST">
					<div class="form-group">
					 	<form:label path="assessmentNo">BOP No : ${assessment.assessmentNo}</form:label> 
					</div>
					<div class="form-group">
						<form:input path="idassessment" type="hidden" />
						<form:input path="customer.idcustomer" type="hidden" />

						<form:input path="customer.cusNic" type="text"
							cssClass="form-control" id="custNic" placeholder="NIC" />
						<form:errors path="customer.cusNic" cssClass="error" />
					</div>
					<div class="form-group">
						<form:input path="customer.cusName" type="text"
							cssClass="form-control" id="custName" placeholder="Customer Name" />
						<form:errors path="customer.cusName" cssClass="error" />
					</div>
					<div class="form-group">
						<form:input path="customer.cusAddressL1" type="text"
							cssClass="form-control" id="cusAddressL1"
							placeholder="AddressLine 1" />
						<form:errors path="customer.cusAddressL1" cssClass="error" />
					</div>
					<div class="form-group">
						<form:input path="customer.cusAddressL2" type="text"
							cssClass="form-control" id="cusAddressL2"
							placeholder="AddressLine 2" />
						<form:errors path="customer.cusAddressL2" cssClass="error" />
					</div>
					<div class="form-group">
						<form:input path="customer.cusAddressL3" type="text"
							cssClass="form-control" id="cusAddressL3"
							placeholder="AddressLine 3" />
						<form:errors path="customer.cusAddressL3" cssClass="error" />
					</div>

					<div class="form-group">
						<form:input path="customer.cusMobile" type="text"
							cssClass="form-control" id="cusMobile" placeholder="Mobile Phone" />
						<form:errors path="customer.cusMobile" cssClass="error" />
					</div>
					<%-- <div class="form-group">
						<form:input path="customer.cusRegDate" type="text"
							cssClass="form-control" id="cusRegDate" placeholder="Date" />
						<form:errors path="customer.cusRegDate" cssClass="error" />
					</div> --%>
					<button type="submit" class="btn btn-success">Save Main
						Data</button>
				</form:form>
			</div>


		</div>


	</div>
	<div class="col-md-2">
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">#</th>
					<th scope="col">First Name</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>

				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Jacob</td>

				</tr>
				<tr>
					<th scope="row">3</th>
					<td>Larry</td>

				</tr>
			</tbody>
		</table>
	</div>
</div>