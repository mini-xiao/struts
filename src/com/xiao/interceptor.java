package com.xiao;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class interceptor implements Interceptor {
    @Override
    public void destroy() {
        System.out.println("拦截器销毁destroy");
    }

    @Override
    public void init() {
        System.out.println("拦截器初始化init");
    }

    @Override
    public String intercept(ActionInvocation act) throws Exception {
        System.out.println("拦截器");
        try {
            return act.invoke();
        }catch (Exception e){
            System.out.println("异常");
        }
        return "error";
    }
}
