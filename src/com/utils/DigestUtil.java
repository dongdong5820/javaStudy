package com.utils;

import java.security.MessageDigest;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author: Ranlay.su
 * @date: 2021-09-28 10:35
 * @description: 加解密
 * @version: 1.0.0
 */
public class DigestUtil {
    private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    /**
     * md5加密字符串
     * @param origin
     * @return
     */
    public static String encryptMD5(String origin) {
        String resultString = null;
        try {
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            resultString = byteArrayToHexString(md.digest(resultString
                    .getBytes("utf-8")));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return resultString;
    }

    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    /**
     * 生成api调用的sign
     * @param maps
     * @return
     */
    public static String generateSign(Map<String, String> maps) {
        List<String> rawList = new LinkedList<>();
        for (Map.Entry<String, String> entry :maps.entrySet()) {
            rawList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        String apiSign = ListUtil.implode(rawList, '&');
        return DigestUtil.encryptMD5(apiSign);
    }
}