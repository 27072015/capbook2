<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
</head>
<body>
<form action="changepass" method="post">
Enter emailid:-<input placeholder="Emailid" type="text" name="email"/><br>
Old Password:-<input placeholder="Old Password" type="password" name="oldpassword"/><br>
New Password<input placeholder="New password" type="password" name="newpassword"/><br>
<input type="submit" value="Submit">
</form>
</body>
</html>