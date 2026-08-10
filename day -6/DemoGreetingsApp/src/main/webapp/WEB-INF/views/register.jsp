<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Register</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

<div class="container">

    <h2>Create Account</h2>

    <form action="${pageContext.request.contextPath}/register" method="post">

        <div class="form-group">
            <label>Name</label>
            <input type="text" name="name" required>
        </div>

        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" required>
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" name="password" required>
        </div>

        <button type="submit">Register</button>

    </form>

    <div class="links">
        <a href="${pageContext.request.contextPath}/login">
            Already have an account?
        </a>
    </div>

</div>

</body>
</html>