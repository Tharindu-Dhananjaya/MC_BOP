<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<div class="row">
	<div class="col-md-2">
		<ul class="list-group">

			<li class="list-group-item pl-1"><a href="bop-assessment.html"
				class="btn btn-secondary btn-lg">Assessment Data</a></li>
			<li class="list-group-item pl-1"><a
				href="bop-application?tempId=null" class="btn btn-secondary btn-lg">BOP
					Applications</a></li>
			<li class="list-group-item pl-1"><a
				href="bop-assessment-basic-view" class="btn btn-secondary btn-lg">
					BOP Approve<span class="badge badge-pill badge-danger">4</span>
			</a></li>
			<li class="list-group-item pl-1"><a href="bop-reject"
				class="btn btn-secondary btn-lg"> BOP reject<span
					class="badge badge-pill badge-danger">4</span>
			</a></li>
			<li class="list-group-item pl-1"><a href="bop-pending"
				class="btn btn-secondary btn-lg"> BOP Pending<span
					class="badge badge-pill badge-danger">4</span>
			</a></li>
			<li class="list-group-item pl-1"><a href="bop-ready"
				class="btn btn-secondary btn-lg"> BOP Ready<span
					class="badge badge-pill badge-danger">4</span>
			</a></li>
			<li class="list-group-item pl-1"><a href="bop-complete"
				class="btn btn-secondary btn-lg"> BOP Complete<span
					class="badge badge-pill badge-danger">4</span>
			</a></li>
		</ul>
	</div>