package com.gyan;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/params"},initParams = {
        @WebInitParam(name ="title",value = "ServletConfigDemoAnnotation"),
        @WebInitParam(name ="configStyle",value = "XML")
})
public class InitParamsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("title :"+getServletConfig().getInitParameter("title"));
        out.println("<br>");
        out.println("config style :"+getInitParameter("configStyle"));
        out.println("</body></html>");
    }
}
