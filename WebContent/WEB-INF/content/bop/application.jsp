<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%@include file="/WEB-INF/content/common/header.jsp"%>


<div class="container mt-1">
	<div class="row">
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Assessment No</th>
					<th scope="col">Customer Name</th>
					<th scope="col">NIC</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${bopHasAssessment}" var="data">
					<tr>
						<th scope="row">1</th>
						<td>${data.assessment.idassessment}</td>
						<td>${data.assessment.customer.cusName }</td>
						<td>${data.assessment.customer.cusNic }</td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="row">
		<div class="col-md-10">

			<div class="row">

				<div class="col-md-6">


					<div class="form-group">
						<select id="inputState" class="form-control">
							<option selected>Choose...</option>
							<option>...</option>
						</select>
					</div>
					<div class="form-group">
						<select id="inputState" class="form-control">
							<option selected>Choose...</option>
							<option>...</option>
						</select>
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="inputAddress"
							placeholder="1234 Main St">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="inputAddress2"
							placeholder="Apartment, studio, or floor">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="inputAddress2"
							placeholder="Apartment, studio, or floor">
					</div>


				</div>

				<div class="col-md-6">
					<div class="form-group">
						<input type="text" class="form-control" id="inputAddress"
							placeholder="1234 Main St">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="inputAddress2"
							placeholder="Apartment, studio, or floor">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="inputAddress2"
							placeholder="Apartment, studio, or floor">
					</div>
				</div>

				<button type="submit" class="btn btn-primary">Sign in</button>


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
	<div class="row">
		<div class="col-md-4">

			<form>

				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>

					<input type="text" class="form-control" id="inputAddress"
						placeholder="1234 Main St">
				</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 col-form-label">Email</label>

					<input type="text" class="form-control" id="inputAddress"
						placeholder="1234 Main St">
				</div>
				<button type="submit" class="btn btn-primary">Sign in</button>

				<label class="custom-control custom-radio"> <input
					id="radio1" name="radio" type="radio" class="custom-control-input">
					<span class="custom-control-indicator"></span> <span
					class="custom-control-description">Toggle this custom radio</span>
				</label> <label class="custom-control custom-radio"> <input
					id="radio2" name="radio" type="radio" class="custom-control-input">
					<span class="custom-control-indicator"></span> <span
					class="custom-control-description">Or toggle this other
						custom radio</span>
				</label>
				<div class="form-group">

					<input type="text" class="form-control" id="inputAddress"
						placeholder="1234 Main St">
				</div>
			</form>

		</div>
		<div class="col-md-8">
			<div class="form-group">

				<input type="file" class="form-control" id="inputAddress"
					placeholder="1234 Main St">
			</div>
			<div class="form-group">

				<input type="text" class="form-control" id="inputAddress"
					placeholder="1234 Main St">
			</div>
			</table>
		</div>
	</div>

	<div class="float-right">
		<button type="submit" class="btn btn-success">Sign in</button>

	</div>
</div>