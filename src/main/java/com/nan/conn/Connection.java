package com.nan.conn;


import com.nan.util.HttpUtil;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.net.URLEncoder;



public class Connection {

    public String keyword(String param)  {

        String result = null;
        try {
            result = HttpUtil.post("https://oapi.dingtalk.com/robot/send","","application/json",param,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }


    public String code(String param) {

        Long timestamp = System.currentTimeMillis();
        String secret = "";
        String result = null;
        try {
            String stringToSign = timestamp + "\n" + secret;
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8");

             result = HttpUtil.post("https://oapi.dingtalk.com/robot/send", "", "application/json", timestamp.toString(), sign, param, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;


    }

    public String IP(String param) {

        String result = null;
        try {
            result = HttpUtil.post("https://oapi.dingtalk.com/robot/send","","application/json",param,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public String IPRange(String param) {

        String result = null;
        try {
            result = HttpUtil.post("https://oapi.dingtalk.com/robot/send","","application/json",param,"UTF-8");
            System.out.println(result);   } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public String allWays(String param) {

        String result = null;
        try {
            Long timestamp = System.currentTimeMillis();
            String secret = "";

            String stringToSign = timestamp + "\n" + secret;
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(secret.getBytes("UTF-8"), "HmacSHA256"));
            byte[] signData = mac.doFinal(stringToSign.getBytes("UTF-8"));
            String sign = URLEncoder.encode(new String(Base64.encodeBase64(signData)), "UTF-8");

            result = HttpUtil.post("https://oapi.dingtalk.com/robot/send", "", "application/json", timestamp.toString(), sign, param, "UTF-8");
            System.out.println(result); } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
