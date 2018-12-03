<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script>
	if (typeof jQuery == 'undefined') {
		document
				.write("<script type='text/javascript' src='<c:url value='/resources/js/jquery-3.1.1.min.js'/>'><\/script>");
	}
</script>

<!-- <script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
	integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
	crossorigin="anonymous"></script>
	
	<script>
	/* $('#messageId').keypress(function(event) {
		var keycode = (event.keyCode ? event.keyCode : event.which);
		if (keycode === 13) {
			event.preventDefault();
			$("#postModal").modal('show');

		}
	}); */
	
	$('#textId').keypress(function(event) {
		
		var keycode = (event.keyCode ? event.keyCode : event.which);
		if (keycode === 13) {
			event.preventDefault();
			 $("#confirm").toggle();

		}
	});
	
	/* $(document).ready(function () {
	    $("#btn").click(function () {
	        $("#confirm").toggle();
	    });
	}); */
	function userSelect(userId,userName,userImage) {
		
		$('#user_id').val(userId);
		document.getElementById('messageId').placeholder = userName +"のスゴイところを「＃」でみんなに教えよう！";
		 document.getElementById('profileName').value = userName ; 
		
		if(userImage === ""){
			document.getElementById('userImg').src="resources/images/noprofile.jpg";
			
		}
		else{
			
			document.getElementById('userImg').src="data:image/png;base64,"+userImage; 
		}
		
		} 
	
	 function selectUser(userId,userName,userImage) {
		
		$('#user_id').val(userId);
		
		
		if(userImage === ""){
			document.getElementById('userImg').src="resources/images/noprofile.jpg";
			
		}
		else{
			
			document.getElementById('userImg').src="data:image/png;base64,"+userImage; 
		}
		
		} 
	 
	 function selectValue(userId) {
			
			$('#user_id').val(userId);
	} 
	
	 function setRecommendedUser(userId,userName,userImage) {
			$('#user_id').val(userId);
			$('#user_name').text(userName);
			
			 if(userImage === ""){
				document.getElementById('userImg').src="resources/images/noprofile.jpg";
			}
			else{
				document.getElementById('userImg').src="data:image/png;base64,"+userImage; 
			} 
			 document.getElementById("saveRecommendation").disabled = false;
			}
	</script>
	
	<script type="text/javascript">
		function showModal() {
			$("#myModal").modal('show');
		}
		
		function enableCallout() {
			$("#messageId").removeAttr("disabled");
		}
		
		function selectUser(userId,userName,userImage) {
			$("#userModal").modal('show');
			document.getElementById('userName').value = userName ; 
			document.getElementById('user_id').value = userId ; 
			if(userImage === ""){
				document.getElementById('userImg').src="resources/images/noprofile.jpg";
				
			}
			else{
				
				document.getElementById('userImg').src="data:image/png;base64,"+userImage; 
			}
		}
	
	</script>
	
	
</body>
</html>

<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
	<script type="text/javascript"
		src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<div class="container">
	<footer class="footer">
		<small> Value YOU by value you,inc </small>
		<nav>
			<ul class="list-inline">
				<li><a href="about">About</a></li>
				<li><a href="contact">Contact</a></li>
				<li><a href="https://www.yahoo.co.jp/">News</a></li>
			</ul>
		</nav>
	</footer>
</div>
</body>
</html> -->