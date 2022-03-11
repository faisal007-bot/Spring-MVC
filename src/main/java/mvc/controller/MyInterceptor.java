package mvc.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class MyInterceptor implements HandlerInterceptor{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Integer id = Integer.valueOf(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		if(id<0||name.length()<2||email.length()<5||password.length()<5) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h1>User credentials are wrong</h1>");
			out.print("<h1>"+id+"</h1>");
			out.print("<h1>"+name+"</h1>");
			out.print("<h1>"+email+"</h1>");
			out.print("<h1>"+password+"</h1>");
			return false;
		}
		return true;
	}
}
