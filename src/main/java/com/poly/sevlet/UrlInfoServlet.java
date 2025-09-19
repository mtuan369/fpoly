package com.poly.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/urlinfo")
public class UrlInfoServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        // Đặt loại nội dung và mã hóa
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        // Xuất các thông tin theo yêu cầu
        out.println("<h2>Thông tin URL</h2>");
        out.println("<ol>");
        out.println("<li>URL: " + req.getRequestURL() + "</li>");
        out.println("<li>URI: " + req.getRequestURI() + "</li>");
        out.println("<li>QueryString: " + (req.getQueryString() != null ? req.getQueryString() : "Không có") + "</li>");
        out.println("<li>ServletPath: " + req.getServletPath() + "</li>");
        out.println("<li>ContextPath: " + req.getContextPath() + "</li>");
        out.println("<li>PathInfo: " + (req.getPathInfo() != null ? req.getPathInfo() : "Không có") + "</li>");
        out.println("<li>Method: " + req.getMethod() + "</li>");
        out.println("</ol>");
    }
}
