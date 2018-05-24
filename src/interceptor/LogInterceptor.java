package interceptor;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler) throws Exception {
//		System.out.println(handler.getClass());
//		HandlerMethod handlerMethod=(HandlerMethod) handler;
//		System.out.println(handlerMethod.getBean());
//		System.out.println(handlerMethod.getBeanType());
//		System.out.println(handlerMethod.getMethod().getName());
//		System.out.println(handlerMethod.getMethodAnnotation(RequestMapping.class));
//		System.out.println(Arrays.toString(handlerMethod.getMethodParameters()));
//		System.out.println(handlerMethod.getReturnType().getParameterType());
		System.out.println(request.getRemoteAddr()+"访问了"+handler);
		return true;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView mav) throws Exception {
		System.out.println(handler+"执行结束");
	}
	
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception e)
			throws Exception {
		System.out.println("即将生成响应给客户端");
	}




}
