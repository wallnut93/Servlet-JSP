package jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Main extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
	System.out.println("+++\nServlet is Working by eclipse!!\n+++");
	
	response.setContentType("text/html;charset=UTF-8");
	
	PrintWriter pw = response.getWriter();
	pw.println("This is Servlet Main Page made by eclipse<br>");
	pw.println("Servlet Main Page~<br>");
	pw.println("Servlet Main Page~<br>");
	pw.println("서블릿 메인 페이지<br>");
	pw.println("서블릿 메인 페이지<br>");
    }
}