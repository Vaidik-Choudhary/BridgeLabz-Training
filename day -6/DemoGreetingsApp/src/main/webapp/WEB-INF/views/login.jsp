<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Login</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>

<body>

<div class="container">

    <h2>Login</h2>

    <% if (request.getAttribute("error") != null) { %>
        <p class="error">
            <%= request.getAttribute("error") %>
        </p>
    <% } %>

    <form action="${pageContext.request.contextPath}/login" method="post">

        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" required>
        </div>

        <div class="form-group">
            <label>Password</label>
            <input type="password" name="password" required>
        </div>

        <button type="submit">Login</button>

    </form>

    <div class="links">
        <a href="${pageContext.request.contextPath}/register">
            Create an account
        </a>
    </div>

</div>

</body>
</html>