<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>


<%@ include file="/WEB-INF/content/common/header.jsp"%>

<%-- 
	<div class="outer">
		<div class="content content-center login-wrapper" style="width: 350px">
			<div class="">
				<h4>Sign In ${AuthenticationChecker.mainURL} or ${URL}</h4>
				<div class="social">
					<fb:login-button scope="public_profile,email"
						onlogin="checkLoginState();" data-button-type="continue_with"
						data-size="large">
					</fb:login-button>
					<a class="face_login" href="#"> <span class="face_icon">
										<img src="<c:url value="/resources/images/facebook.png" />"
										alt="fb">
								</span> <span class="text">Sign in with Facebook</span>
								</a>
					<div
						style="width: 100%; height: 13px; border-bottom: 1px solid #00000026; text-align: center;  margin: 20px 0px 20px 0px;">
						<span
							style="background-color: #FFF; padding: 0 10px;">
							OR </span>
					</div>
				</div>
				<form action="login" method="post">
					<input class="form-control m-1" type="email" name="userName"
						placeholder="Email"> <input class="form-control m-1"
						type="password" name="userPassword" placeholder="Password">
					<br />

					<c:if test="${not empty authMsg}">
						<div class="alert alert-danger alert-dismissible fade show"
							role="alert">
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							${authMsg}
						</div>
					</c:if>

					<c:if test="${not empty signUpSuccessMessage}">
						<div class="alert alert-success alert-dismissible fade show"
							role="alert">
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							${signUpSuccessMessage}
						</div>
					</c:if>
					<c:if test="${not empty hunterrMessage}">
						<div class="alert alert-success alert-dismissible fade show"
							role="alert">
							<button type="button" class="close" data-dismiss="alert"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							${hunterrMessage}
						</div>
					</c:if>

					<div class="action">
						<input type="submit" class="form-control btn btn-primary "
							value="Login" style="color: white;" /> <a
							href="resetpassword.html">forgot Password</a><br>
					</div>


					<!-- <input type="submit" name="commit" value="Log in"
										class="btn btn-primary" data-disable-with="Log in" /> -->

				</form>
			</div>

			<div class="already">

				<p>Don't have an account yet?</p>
				<a href="signup">Sign Up</a>
			</div>
		</div>
	</div>
 --%>
</body>


<%@ include file="/WEB-INF/content/common/footer.jsp"%>

</html>