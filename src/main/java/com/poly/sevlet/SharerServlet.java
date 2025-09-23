package com.poly.sevlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("")
public class SharerServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        req.setAttribute("message", "Welcome to FPT Polytechnic!");
        req.setAttribute("now", new java.util.Date());
        req.getRequestDispatcher("/views/page.jsp").forward(req, resp);
    }
}
