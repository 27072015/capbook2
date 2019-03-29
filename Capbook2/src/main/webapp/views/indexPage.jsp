<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>>
<html>
	
	<title>Capbook.com</title>
	<style>
	body{
	
	height:750px;
	
}
.fb-header-base{
	width:100%;
	height:90px;
	position:absolute;
	top:0;
	left:0;
	color:red;
	z-index:7;
	font-family:verdana;
	-webkit-box-shadow: 0 3px 8px rgba(0, 0, 0, .25);
}
.fb-header{
	width:100%;
	height:90px;
	position:absolute;
	background:#FF5B33;
	top:0;
	left:0;
	color:white;
	z-index:7;
	font-family:verdana;
	
}
#img1{
	left:100px;
	height:5px;
	width:10px;
	top:10px;
}
#form1{
	left:750px;
	height:60px;
	width:180px;
	top:20px;
	font-family:verdana;
	font-size:12px;
}
#form2{
	left:940px;
	height:60px;
	width:250px;
	top:20px;
	font-family:verdana;
	font-size:12px;
}
.submit1{
	left:1130px;
	top:35px;
	background:#5b7bc0;
	color:white;
	position:fixed;
	z-index:20;
	height:22px;
	width:50px;
	cursor:pointer;
	

	
}
.fb-body{
	position:absolute;
	left:0px;
	top:90px;
	width:100%;
	height:645px;
	

}
#intro1{
	left:178px;
	top:20px;
	font-family:verdana;
	font-size:20px;
	color:#142170;
	height:75px;
	width:550px;
}
#intro2{
	left:750px;
	top:20px;
	font-family:verdana;
	font-size:30px;
	color:#000;
	font-weight:bold;
	height:75px;
	width:500px;
}
#img2{
	top:130px;
	left:178px;
	width:450px;
	height:200px;
}
#intro3{
	left:750px;
	top:70px;
	font-family:verdana;
	font-size:18px;
	color:#000;
	height:50px;
	width:300px;
}
#form3{
	top:120px;
	left:750px;
	font-family:verdana;
	font-size:20px;
	color:#142170;
	width:450px;
	height:495px;
	
}
#namebox{
	width:200px;
	height:40px;
	border-radius:5px 5px 5px 5px;
	background:white;
	padding:10px;
	font-size:18px;
	margin-top:8px;
	border-width: 1px;
	border-style:solid;
	border-color: gray;
}
#mailbox{
	width:408px;
	height:40px;
	border-radius:5px 5px 5px 5px;
	background:white;
	padding:10px;
	font-size:18px;
	margin-top:8px;
	border-width: 1px;
	border-style:solid;
	border-color: gray;
}
#r-b{
	font-size:12px;
	height:15px;
	width:15px;
}
.button2{
	width:250px;
	height:40px;
	left:750px;
	top:625px;
	background:green;
	font-family:verdana;
	font-size:18px;
	color:white;
	border-radius:5px 5px 5px 5px;
	border-width: 1px;
	border-style:solid;
	border-color: gray;
	cursor:pointer;
	outline:none;
	
}
#intro4{
	font-family:verdana;
	font-size:12px;
	color:gray;
	
}
#intro5{
	font-family:verdana;
	font-size:14px;
	color:gray;
	
}
.fb-body-footer{
	width:100%;
	position:absolute;
	left:0px;
	height:80px;
	background:white;
	top:700px;
	
}
#fb-body-footer-base{
	width:900px;
	top:15px;
	left:200px;
	color:blue;
	height:60px;
}
	</style>
	<body>
		<div class="fb-header-base">
		<div class="fb-header">
		<form:form action="loginuser" method="post" modelAttribute="user">
			<div id="img1" class="fb-header"><img src="cblogo.jpg" /></div>
			<div id="form1" class="fb-header">Email or Phone<br>
			<input placeholder="Email" type="email" name="email" /><br>			
			<input type="checkbox" />keep me logged in</div>
			<div id="form2" class="fb-header">Password<br>
			<input placeholder="Password" type="password" name="password" /><br>
			<a href="forgetpassword">Forgotten your password?</a>
			</div>
			<input type="submit" class="submit1" value="login" />
			</form:form>
			</div>
		</div>
		<div class="fb-body">
			<div id="intro1" class="fb-body">Capbook helps you connect and share with the <br>
			people in your life.</div>
			<div id="intro2" class="fb-body">Create an account</div>
			<div id="img2" class="fb-body"><img src="background.jpg" /></div>
			<div id="intro3" class="fb-body">It's free and always will be.</div>
			<div id="form3" class="fb-body">
	<form:form action="registration" method="post" modelAttribute="user">
				<input placeholder="First Name" type="text" id="namebox" name="firstName" />
				<input placeholder="Last Name" type="text" id="namebox"  name="lastName"/> <br>
				<input placeholder="Email" type="email" id="mailbox" name="email"/><br>
				<input placeholder="Enter Password" type="password" id="mailbox" name="password" /><br>
				<input placeholder="ReEnter Password" type="password" id="mailbox"  /><br>
				<input type="date" id="namebox" name="dOB"><br><br>
				<select name="securityquestion" id="namebox">
				<option value="nickname">What is your nickname?</option>
                 <option value="school">Where is your first school?</option>
                  <option value="pet">What is your first pet?</option>
                   <option value="car">Which is your first car?</option>
				</select>
				<input placeholder="Security answer" type="text" id="namebox" name="securityanswer"/><br>
				<input type="radio" id="r-b"  value="male" name="gender"/>Male
				<input type="radio" id="r-b"   value="female" name="gender" />Female<br><br>
							<p id="intro4">By clicking Create an account, you agree to our Terms and that 
				you have read our Data Policy, including our Cookie Use.</p>
				<input type="submit" value="SignUp">
				<br><hr>
			</form:form>
				</div>
				</div>
				<div class="fb-body-footer">
				<div id="fb-body-footer-base" class="fb-body-footer">English<br><hr>
				 </div>
			</div>
	</body>
	
</html>