package top.soft.class02request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/requestDemo03")
public class RequestDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest req ,HttpServletResponse resp) throws ServletException,
            IOException{
        //获取请求体数据
        // 1.获取字符流
                BufferedReader reader = req.getReader();
                //2.读取数据
                String line ;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

}
