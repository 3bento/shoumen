package br.com.kennycode.shoumen.controller.auth;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller)
			throws IOException {

		String uri = request.getRequestURI();
		if (uri.endsWith("/") ||uri.endsWith("signin") || uri.endsWith("signup") || uri.contains("resources"))
			return true;

		if (request.getSession().getAttribute("account") != null) {
			return true;
		} else {
			response.sendRedirect("auth/signin");
			return false;
		}
	}

}
