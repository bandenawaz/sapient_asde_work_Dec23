<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>servlet-example</title>
</head>
<body>
<h1>Login Page</h1>
<p>Please enter your credentials to login</p>
<br />
<hr />
<form action="<%=request.getContextPath()%>/login" method="POST">
<h3>Login Form</h3>
<label>Username</label>
<input type="text" name="username" placeholder="Enter your username"> <br />
<br />
 <label>Password</label>
 <input type="text" name="password" placeholder="Enter your password"> <br />
 <br />
<button type="submit">Login</button>
</form>



</body>
</html>
