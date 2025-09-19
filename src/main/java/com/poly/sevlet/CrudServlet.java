package com.poly.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/crud/create", "/crud/update", "/crud/delete", "/crud/edit/2024"})
public class CrudServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Đặt loại nội dung và mã hóa
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        // Lấy đường dẫn Servlet
        String path = request.getServletPath();
        // Xuất thông tin dựa trên đường dẫn
        out.println("<h2>Thông tin CRUD</h2>");
        switch (path) {
            case "/crud/create":
                out.println("<p>Bạn đang ở trang create</p>");
                break;
            case "/crud/update":
                out.println("<p>Bạn đang ở trang update</p>");
                break;
            case "/crud/delete":
                out.println("<p>Bạn đang ở trang delete</p>");
                break;
            case "/crud/edit/2024":
                out.println("<p>Bạn đang ở trang edit năm 2024</p>");
                break;
            default:
                out.println("<p>Đường dẫn không hợp lệ</p>");
        }
    }
}
