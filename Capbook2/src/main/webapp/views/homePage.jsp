<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body{
    width: available;
    height: available;
}

.container{
    width: available;
    height: available;
}

.leftpane{
    width: 25%;
    min-width: 350px;
    height: available;
    min-height: 10000px;
    float: left;
    background-color: #FAFAD2;
    border-collapse: collapse;
}

.middlepane{
   width: 50%;
   min-width: 800px;
   height: available;
   min-height: 10000px;
   float: left;
   background-color: #FFFFE0;
   border-collapse: collapse;
}

.rightpane{
    width: available;
    height: available;
    position: relative;
    margin-left: 75%;
    background-color: yellow;
    border-collapse: collapse;
}

.toppane{
    width: available;
    height: 100px;
    border-collapse: collapse;
    background-color:#DEB887;
}
</style>
</head>
<body>

<div class="container">
            <div class="toppane"><h1>CapBook</h1> <hr> <hr>Welcome
            ${user.firstName}</div>
            <div class="leftpane"><h5>Options</h5></div>
            <div class="middlepane">
            <h2>News Feed</h2></div>
            <a href="index">||HOME||</a>
            <a href="changepassword">ChangePassword</a><br>
            <a href="saveImage">||Upload Display Picture||</a>
            <div class="rightpane"><h5>Activities</h5></div>
            <a href="logout">Logout</a>
</div>
</body>
</html>