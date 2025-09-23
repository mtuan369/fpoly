package com.poly.sevlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user/index")
public class UserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
        req.setAttribute("message", "Welcome to FPT Polytechnic!");
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Linh Duong dau bo");
        map.put("gender", "Male");
        map.put("country", "Viet Nam");
        req.setAttribute("user", map);
        req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
    }
}
