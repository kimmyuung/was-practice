package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
        System.out.println("Aa");
    }
}
// CGI : 웹서버와 애플리케이션 사이에 데이터를 주고받는 규약
// Servlet : 자바에서 웹 애플리케이션을 만드는 기준
// 서블릿 컨테이너 : WAS는 서블릿 컨테이너를 포함하는 개념
// WAS는 매 요청마다 스레드 풀에서 기존 스레드 사용
// 대표적인 WAS는 톰캣이 있음