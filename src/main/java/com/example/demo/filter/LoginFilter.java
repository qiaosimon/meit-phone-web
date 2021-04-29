package com.example.demo.filter;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@Order(1)
@Component
@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    System.out.println("init ");
  }

  @Override
  public void doFilter(
      ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
      throws IOException, ServletException {
    System.out.println(" start doFilter");
    filterChain.doFilter(servletRequest, servletResponse);
    System.out.println("end deFilter");
  }

    @Override
    public void destroy() {

    }
}
