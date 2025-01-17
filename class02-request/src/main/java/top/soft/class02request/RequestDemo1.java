package top.soft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/requsetDemo1")
public class RequestDemo1 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取请求方式
        String method = req.getMethod();
        System.out.println("请求方式"+method);
        //2.获取Servlet路径
        String servletPath = req.getServletPath();
        System.out.println("获取Servlet路径"+servletPath);
        //3.获取Get 请求参数
        String queryString = req.getQueryString();
        System.out.println("Get请求参数"+queryString);
        //4.获取请求URI 和URL
        String requestURI=req.getRequestURI();
        System.out.println("请求URI"+requestURI);
        StringBuffer requestURL=req.getRequestURL();
        System.out.println("请求URL"+requestURL);
        //5.
        String  protocol = req.getProtocol();
        System.out.println("版本协议"+protocol);

        //获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println("虚拟目录"+contextPath);
    }
}
