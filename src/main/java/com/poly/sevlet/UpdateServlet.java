package com.poly.sevlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.poly.sevlet.model.Users;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/user/poly")
public class UpdateServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Nguyễn Văn Tèo");
        map.put("gender", true);
        map.put("country", "VN");
        request.setAttribute("user", map);

        Users bean = new Users();
        bean.setFullname("Nguyễn Văn Tèo");
        bean.setGender(true);
        bean.setCountry("VN");
        request.setAttribute("userBean", bean);

        request.getRequestDispatcher("/views/from_update.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/views/from_update.jsp").forward(request, response);
    }
}
