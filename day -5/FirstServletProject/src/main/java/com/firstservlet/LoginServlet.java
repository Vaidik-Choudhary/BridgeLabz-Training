package com.firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(
        urlPatterns="/login", initParams= { @WebInitParam(name="user",value="Vaidik"),
                                            @WebInitParam(name="password",value="Vaidik1@")
        }
)

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

	    String user = request.getParameter("user");
	    String pwd = request.getParameter("pwd");

	    // UC3 Username Validation
	    if (!user.matches("[A-Z][a-zA-Z]{2,}")) {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        out.println("<h3 style='color:red'>Username is Invalid!</h3>");
	        out.println("<p>Username must start with a capital letter and contain at least 3 letters.</p>");

	        RequestDispatcher rd = request.getRequestDispatcher("login.html");
	        rd.include(request, response);
	        return;
	    }

	    // UC4 Password Validation
	    String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=(?:.*[^a-zA-Z0-9]){1}$).{8,}$";

	    if (!pwd.matches(passwordRegex)) {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        out.println("<h3 style='color:red'>Password is Invalid!</h3>");
	        out.println("<p>Password must:</p>");
	        out.println("<ul>");
	        out.println("<li>Minimum 8 characters</li>");
	        out.println("<li>At least one uppercase letter</li>");
	        out.println("<li>At least one number</li>");
	        out.println("<li>Exactly one special character</li>");
	        out.println("</ul>");

	        RequestDispatcher rd = request.getRequestDispatcher("login.html");
	        rd.include(request, response);
	        return;
	    }

	    // Check predefined credentials
	    String validUser = getServletConfig().getInitParameter("user");
	    String validPwd = getServletConfig().getInitParameter("password");

	    if (user.equals(validUser) && pwd.equals(validPwd)) {
	        request.setAttribute("user", user);
	        RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");
	        rd.forward(request, response);

	    } else {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<h3 style='color:red'>Invalid Username or Password</h3>");
	        RequestDispatcher rd = request.getRequestDispatcher("login.html");
	        rd.include(request, response);
	    }
	}
}