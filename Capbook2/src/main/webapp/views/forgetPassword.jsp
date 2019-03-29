<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ForgetPassword</title>
</head>
<body>
<form action="forgetpass" method="post">
Enter emailid:-<input placeholder="Emailid" type="text" name="email"/><br>
Enter Security Question:-<select name="securityquestion" id="namebox">
				<option value="nickname">What is your nickname?</option>
                 <option value="school">Where is your first school?</option>
                  <option value="pet">What is your first pet?</option>
                   <option value="car">Which is your first car?</option>
				</select><br>
Enter Security Answer:-<input placeholder="Security Answer" type="text" name="securityanswer"/><br>
Enter New Password:-<input placeholder="New Password" type="password"name="newpassword"/><br>
<input type="submit" value="Submit">
</form>
</body>
</html>