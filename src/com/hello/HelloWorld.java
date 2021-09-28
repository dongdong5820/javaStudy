package com.hello;

import com.utils.DigestUtil;

import java.util.LinkedHashMap;
import java.util.Map;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!!!");

        Map<String, String> headers = new LinkedHashMap<>();
//        headers.put("nonce", String.valueOf(RandomUtil.mtRand(1000, 9999)));
//        headers.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        headers.put("nonce", "7585");
        headers.put("timestamp", "1632793988");
        headers.put("apiSecret", "ir9Uy5mfoheokXvT");
        String sign = DigestUtil.generateSign(headers);
        System.out.println("headers: " + headers);
        System.out.println(sign);
    }
}
