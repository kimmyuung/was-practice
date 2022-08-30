package org.example;

import org.example.calculator.domain.Calculator;
import org.example.calculator.domain.PositiveNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet implements Servlet {
    private static final Logger log = LoggerFactory.getLogger(CalculatorServlet.class);
    @Override
    public void init(ServletConfig config) throws ServletException {
        // 서블릿 생성 후 초기화 작업 위해
        log.info("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        log.info("getServletConfig");
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        log.info("service");
        int operand1 = Integer.parseInt(req.getParameter("operand1"));
        String operator2 = req.getParameter("operator");
        int operand2 =  Integer.parseInt(req.getParameter("operand2"));
        int result = Calculator.calculate(new PositiveNumber(operand1), operator2, new PositiveNumber(operand2));
        PrintWriter writer = res.getWriter();
        writer.println(result);
    }

    @Override
    public String getServletInfo() {
        log.info("getServletInfo");
        return null;
    }

    @Override
    public void destroy() {
        log.info("destroy");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("service");
        int operand1 = Integer.parseInt(req.getParameter("operand1"));
        String operator2 = req.getParameter("operator");
        int operand2 =  Integer.parseInt(req.getParameter("operand2"));
        int result = Calculator.calculate(new PositiveNumber(operand1), operator2, new PositiveNumber(operand2));
        PrintWriter writer = resp.getWriter();
        writer.println(result);
        // url 인코딩 상 특수문자 + 사용 불가능 -> 인코딩 필요
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected long getLastModified(HttpServletRequest req) {
        return 0;
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
