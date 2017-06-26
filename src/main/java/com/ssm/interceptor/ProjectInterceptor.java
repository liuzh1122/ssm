package com.ssm.interceptor;


import javax.servlet.http.*;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by liuzh on 2017/5/6
 */
public class ProjectInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
//      return false;
    	
    	// 允许跨域请求头设置
    	response.addHeader("Access-Control-Allow-Origin", "*");
    	response.addHeader("Access-Control-Allow-Methods", "POST,GET");
        String url = request.getRequestURI();
        System.out.println("-------  " + url + "  -------");

        
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}

