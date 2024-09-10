package top.soft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
* @author ycshang
* @description:请求转发
* @data 2024-09-10
* */

@WebServlet("/requestDemo05")
public class RequestDemo05 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("访问 requestDemo05");
        req.getRequestDispatcher("/requestDemo06").forward(req,resp);
    }
}
