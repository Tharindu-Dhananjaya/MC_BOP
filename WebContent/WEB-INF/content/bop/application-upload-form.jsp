<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<div class="row">
	<div class="col-md-4">

		<form>
			<div class="form-group">
				Area 1 <input type="text" class="form-control" id="inputAddress"
					placeholder="Area 1">
			</div>
		</form>

	</div>
	<div class="col-md-8">
		<form:form action="applicton-file-upload" method="POST"
			modelAttribute="uploadWrapper" enctype="multipart/form-data">

			<!--  <div class="form-group"> -->

			<!-- </div> -->

			<div class="form-group">

				<form:select path="needDoc.idneeddoc" cssClass="form-control"
					id="docSelector">
					<form:option value="-1">-Select Ward-</form:option>
					<form:options items="${needDocs}" itemValue="idneeddoc"
						itemLabel="docCat.doccatName" />
				</form:select>

				<img class="profile-pic" src="image.png" class="rounded-circle "
					id="pimg" width="70px" height="70px"> <i
					class="fa fa-camera upload-button"></i>
				<!-- <input type='file' class="file-upload" /> -->
				<form:input cssClass="file-upload" type="file" accept="image/*"
					path="fileData" />
				<%-- src="data:image/png;base64,${userWrapper.user.image}" --%>
				<div id="anotherFileInput"></div>
			</div>
			<!-- <a class="btn btn-success" onclick="addNewFileInput()">new Upload</a> -->
			<button type="submit" class="btn btn-success">Upload</button>
		</form:form>
	</div>
</div>