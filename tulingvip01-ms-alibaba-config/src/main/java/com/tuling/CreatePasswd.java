package com.tuling;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * 生成密码
 */
public class CreatePasswd {
    public static void main(String[] args) {
        String nacos = new BCryptPasswordEncoder().encode("nacos");
        System.out.println(nacos);
    }
}
