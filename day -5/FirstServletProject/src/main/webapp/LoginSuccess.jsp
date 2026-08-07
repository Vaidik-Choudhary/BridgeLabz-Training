<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>

<body>

<h2>
Welcome
<%= request.getAttribute("user") %>
</h2>

<a href="login.html">Back to Login</a>

</body>

</html>