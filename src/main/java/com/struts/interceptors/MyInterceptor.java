package com.struts.interceptors;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionProxy;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.TextParseUtil;
import com.opensymphony.xwork2.Action;
public class MyInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5839312193506692027L;

	
    protected Set<String> excludeMethods = Collections.emptySet();
    
    protected Set<String> includeMethods = Collections.emptySet();
    
    public void setExcludeMethods(String excludeMethods) {
        this.excludeMethods = TextParseUtil.commaDelimitedStringToSet(excludeMethods);
    }
    
    public Set<String> getExcludeMethodsSet() {
        return excludeMethods;
    }

    public void setIncludeMethods(String includeMethods) {
        this.includeMethods = TextParseUtil.commaDelimitedStringToSet(includeMethods);
    }
    
    public Set<String> getIncludeMethodsSet() {
        return includeMethods;
    }



	public void destroy() {
		System.out.println("destory()");
	}

	public void init() {
		System.out.println("init()");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		// 取得请求相关的ActionContext实例
		ActionContext ctx = invocation.getInvocationContext();
		Map session = ctx.getSession();
		String user = (String) session.get("user");
		ActionProxy proxy = invocation.getProxy(); 
        String methodName = proxy.getMethod(); 
        getExcludeMethodsSet();
        if(excludeMethods.contains(methodName)){
        	System.out.println("我在做判断！！！！");
        }
        return invocation.invoke();
      /*  String actionName = proxy.getActionName(); 
		if (user != null && user.equals("yuewei")) {
			System.out.println("test");
			return invocation.invoke();
		}
		ctx.put("tip", "你还没有登录");
		return Action.LOGIN;*/
	}

}
