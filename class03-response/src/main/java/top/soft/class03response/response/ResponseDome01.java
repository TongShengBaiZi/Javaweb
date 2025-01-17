package top.soft.class03response.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @
 * */
@WebServlet("/responseDome2")
public class ResponseDome extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IOException {
        //1.设置响应码
        resp.setStatus(200);
        //2.设置响应头：location
        resp.setHeader("location", "/responseDemo02");
        //3.设置编码
        resp.setContentType("text/html;charset=utf-8");
        //4.设置响应结果
        resp.getWriter().write("你好ResponseDemo01");
    }
}
