package com.tuling.handler;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Created by smlz on 2019/11/22.
 */
public class TulingRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        //设置请求头令牌
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        template.header("Token",request.getHeader("Token"));
    }
}
