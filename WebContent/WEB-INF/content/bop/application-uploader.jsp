<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


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











<div id="file_container">
	<span class="file-wrapper"><input type="file" name="files[]"><span
		class="file-button">Choose File</span></span><br>
	<div id="file_tools">
		<img src="http://i59.tinypic.com/5niuxd.png" id="add_file"
			title="Add Another File"> <img
			src="http://i60.tinypic.com/102ktmq.png" id="del_file"
			title="Remove Last File">
	</div>
</div>

<style>
.file-wrapper {
	font-size: 11px;
	cursor: pointer;
	display: inline-block;
	overflow: hidden;
	position: relative;
}

.file-wrapper .file-button {
	width: auto;
	display: inline-block;
	font-size: 14px;
	font-weight: bold;
	background: #1468b3;
	color: #fff;
	cursor: pointer;
	padding: 8px 20px;
	text-transform: uppercase;
	border: 1px solid #fff;
	-webkit-border-radius: 5px;
	-moz-border-radius: 5px;
	border-radius: 5px;
}

.file-wrapper input {
	font-size: 100px;
	cursor: pointer;
	height: 100%;
	position: absolute;
	right: 0;
	top: 0;
	filter: alpha(opacity = 1);
	-moz-opacity: 0.01;
	opacity: 0.01;
}
</style>

<script>
	var CUSTOMUPLOAD = CUSTOMUPLOAD || {};

	CUSTOMUPLOAD.fileInputs = function() {
		var $this = $(this), $val = $this.val(), valArray = $val.split('\\'), newVal = valArray[valArray.length - 1], $button = $this
				.siblings('.file-button'), $fakeFile = $this
				.siblings('.file-holder');
		if (newVal !== '') {
			$button.text('File Chosen');
			if ($fakeFile.length === 0) {
				$button
						.after('&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class=file-holder> '
								+ newVal + '</span>');
			} else {
				$fakeFile.text(newVal);
			}
		}
	};

	$(document)
			.ready(
					function() {
						$('#file_container').on('change click',
								'.file-wrapper input[type=file]',
								CUSTOMUPLOAD.fileInputs);
						var counter = 2;
						$('#del_file').hide();
						$('#file_container')
								.on(
										'click',
										'img#add_file',
										function() {
											$('#file_tools')
													.before(
															'<p><span class="file-wrapper" id="f'+counter+'"><input type="file" name="files[]"/><span class="file-button">Choose File</span></span></p>');
											$('#del_file').fadeIn(0);
											counter++;
										});

						$('#file_container').on('click', 'img#del_file',
								function() {
									if (counter == 3) {
										$('#del_file').hide();
									}
									counter--;

									$('#f' + counter).remove();
								});
					});
</script>