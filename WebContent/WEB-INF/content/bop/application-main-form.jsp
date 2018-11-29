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