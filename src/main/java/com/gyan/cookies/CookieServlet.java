package com.gyan.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/coockie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter respWriter = resp.getWriter();
        Cookie cookie1 = new Cookie("user","Gyandeep");
        resp.addCookie(cookie1);
        respWriter.println("<html><body>");
        respWriter.println("Hello from cookie");
        respWriter.println("</body></html>");
    }
}
