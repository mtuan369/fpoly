package com.poly.sevlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/poly/hello.php")
public class foly extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException{
	resp.getWriter().println("<h1>hello</h1>");
}
}
