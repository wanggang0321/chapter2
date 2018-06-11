package com.ppdtbb.chapter2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 删除用户
 */
@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet {

    /**
     * 处理 删除用户 请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
