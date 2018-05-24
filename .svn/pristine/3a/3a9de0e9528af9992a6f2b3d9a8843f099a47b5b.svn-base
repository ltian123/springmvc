package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CheckLoginInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception e)
			throws Exception {
		
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView mav) throws Exception {
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
		System.out.println("CheckLoginInterceptor.preHandle()");
		//获得Session中的用户
		String user=(String) request.getSession().getAttribute("user");
		//如果用户为null
		if(user==null){
			//去登录页面
			response.sendRedirect(request.getContextPath()+"/showLogin");
			//流程中断
			return false;
		}
		//执行下一个组件
		return true;
	}

}
