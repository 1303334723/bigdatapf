package com.behavioranalysis.config.intercepors;

import com.behavioranalysis.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    /**
     * 这个方法是在访问接口之前执行的
     * 我们只需要在这里写验证登陆状态的业务逻辑
     * 就可以在用户调用指定接口之前验证登陆状态
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("loginUser");
        if (user == null) {
            return false;
        }
        return true;
    }

    //执行完handler之后执行，但还没返回(ModelAndView)
    //应用场景： 拦截handler之后，要根据业务逻辑来修改ModelAndView时
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    //执行完handler之后执行，但是要完全返回ModelAndView，执行的时机比postHandler方法稍微迟一点
    //应用场景：记录日志
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
