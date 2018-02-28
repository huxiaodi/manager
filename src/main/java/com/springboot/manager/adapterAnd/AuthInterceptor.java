package com.springboot.manager.adapterAnd;

import com.springboot.manager.model.protocols.AuthUser;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:31 2018/2/28
 */
@Slf4j
public class AuthInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        AuthUser authUser = AuthToken.praseJWTToken(token);
        log.info("{} {}[{}]",request.getRequestURI(),authUser.getUserName(),authUser.getToken());
        AuthToken.theadUser.set(authUser);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        AuthToken.theadUser.remove();
    }
}