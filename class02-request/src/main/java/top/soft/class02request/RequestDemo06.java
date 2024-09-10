package top.soft.class02request;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requestDemo06")
public class RequestDemo06 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  SecurityException, IOException {
        System.out.println("requestDemo06 被请求");
        resp.getWriter().write("requestDemo06");
        req.setAttribute("msg", "hello");

        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("info", "hello");
    }

}
