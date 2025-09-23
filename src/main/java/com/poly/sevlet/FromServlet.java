package com.poly.sevlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class FromServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		Map<String, Object> map = new HashMap<>();
		map.put("fullname", "Nguyễn Văn Tèo");
		map.put("gender", true);
		map.put("country", "VN");
		req.setAttribute("user", map);
		req.setAttribute("editabled", true);
		req.getRequestDispatcher("views/form_update.jsp").forward(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        request.setAttribute("fullname", fullname);
        request.setAttribute("gender", gender);
        request.setAttribute("country", country);
        request.getRequestDispatcher("/views/form.jsp").forward(request, response);
    }
}
