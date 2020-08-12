package com.nan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nan.conn.Connection;
import com.nan.pojo.*;
import com.nan.util.Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ConnectController {


    @RequestMapping("/bykeyword")
    @ResponseBody
    public static String keyword(@RequestBody String msg){

        JSONObject jsonObject = JSON.parseObject(msg);
        System.out.println(jsonObject.toString());
        String msgtype = jsonObject.getString("msgtype");
        switch (msgtype){
            case "text":
                TextMessage textMessage = JSON.toJavaObject(jsonObject, TextMessage.class);
                System.out.println(textMessage.toString());
                System.out.println("2"+Util.javaBeanToJson(textMessage));
                System.out.println("1"+msg);
                return new Connection().keyword(Util.javaBeanToJson(textMessage));

            case "link":
                LinkMessage linkMessage = JSON.toJavaObject(jsonObject, LinkMessage.class);
                return new Connection().keyword(Util.javaBeanToJson(linkMessage));

            case "markdown":
                MarkdownMessage markdownMessage = JSON.toJavaObject(jsonObject, MarkdownMessage.class);
                return new Connection().keyword(Util.javaBeanToJson(markdownMessage));

            case "actionCard":
                ActionCardMessage actionCardMessage = JSON.toJavaObject(jsonObject, ActionCardMessage.class);
                return new Connection().keyword(Util.javaBeanToJson(actionCardMessage));

            case "feedCard":
                FeedCardMessage feedCardMessage = JSON.toJavaObject(jsonObject, FeedCardMessage.class);
                return new Connection().keyword(Util.javaBeanToJson(feedCardMessage));

        }
        return null;
    }


    @RequestMapping("/bycode")
    @ResponseBody
    public static String code(@RequestBody String msg){
        //all类型消息处理
        JSONObject jsonObject = JSON.parseObject(msg);
        String msgtype = jsonObject.getString("msgtype");
        switch (msgtype){
            case "text":
                TextMessage textMessage = JSON.toJavaObject(jsonObject, TextMessage.class);
                return new Connection().code(Util.javaBeanToJson(textMessage));

            case "link":
                LinkMessage linkMessage = JSON.toJavaObject(jsonObject, LinkMessage.class);
                return new Connection().code(Util.javaBeanToJson(linkMessage));

            case "markdown":
                MarkdownMessage markdownMessage = JSON.toJavaObject(jsonObject, MarkdownMessage.class);
                return new Connection().code(Util.javaBeanToJson(markdownMessage));

            case "actionCard":
                ActionCardMessage actionCardMessage = JSON.toJavaObject(jsonObject, ActionCardMessage.class);
                return new Connection().code(Util.javaBeanToJson(actionCardMessage));

            case "feedCard":
                FeedCardMessage feedCardMessage = JSON.toJavaObject(jsonObject, FeedCardMessage.class);
                return new Connection().code(Util.javaBeanToJson(feedCardMessage));

        }
        return null;
    }


    @RequestMapping("/byIP")
    @ResponseBody
    public static String IP(@RequestBody String msg){
        //all类型消息处理
        JSONObject jsonObject = JSON.parseObject(msg);
        String msgtype = jsonObject.getString("msgtype");
        switch (msgtype){
            case "text":
                TextMessage textMessage = JSON.toJavaObject(jsonObject, TextMessage.class);
                return new Connection().IP(Util.javaBeanToJson(textMessage));

            case "link":
                LinkMessage linkMessage = JSON.toJavaObject(jsonObject, LinkMessage.class);
                return new Connection().IP(Util.javaBeanToJson(linkMessage));

            case "markdown":
                MarkdownMessage markdownMessage = JSON.toJavaObject(jsonObject, MarkdownMessage.class);
                return new Connection().IP(Util.javaBeanToJson(markdownMessage));

            case "actionCard":
                ActionCardMessage actionCardMessage = JSON.toJavaObject(jsonObject, ActionCardMessage.class);
                return new Connection().IP(Util.javaBeanToJson(actionCardMessage));

            case "feedCard":
                FeedCardMessage feedCardMessage = JSON.toJavaObject(jsonObject, FeedCardMessage.class);
                return new Connection().IP(Util.javaBeanToJson(feedCardMessage));

        }
        return null;
    }



    @RequestMapping("/byIPrange")
    @ResponseBody
    public static String IPrange(@RequestBody String msg){
        //markdown类型消息处理
        JSONObject jsonObject = JSON.parseObject(msg);
        String msgtype = jsonObject.getString("msgtype");
        switch (msgtype){
            case "text":
                TextMessage textMessage = JSON.toJavaObject(jsonObject, TextMessage.class);
                return new Connection().IPRange(Util.javaBeanToJson(textMessage));

            case "link":
                LinkMessage linkMessage = JSON.toJavaObject(jsonObject, LinkMessage.class);
                return new Connection().IPRange(Util.javaBeanToJson(linkMessage));

            case "markdown":
                MarkdownMessage markdownMessage = JSON.toJavaObject(jsonObject, MarkdownMessage.class);
                return new Connection().IPRange(Util.javaBeanToJson(markdownMessage));

            case "actionCard":
                ActionCardMessage actionCardMessage = JSON.toJavaObject(jsonObject, ActionCardMessage.class);
                return new Connection().IPRange(Util.javaBeanToJson(actionCardMessage));

            case "feedCard":
                FeedCardMessage feedCardMessage = JSON.toJavaObject(jsonObject, FeedCardMessage.class);
                return new Connection().IPRange(Util.javaBeanToJson(feedCardMessage));

        }
        return null;
    }

    @RequestMapping("/byall")
    @ResponseBody
    public static String allWays(@RequestBody String msg){
        //markdown类型消息处理
        JSONObject jsonObject = JSON.parseObject(msg);
        String msgtype = jsonObject.getString("msgtype");
        switch (msgtype){
            case "text":
                TextMessage textMessage = JSON.toJavaObject(jsonObject, TextMessage.class);
                return new Connection().allWays(Util.javaBeanToJson(textMessage));

            case "link":
                LinkMessage linkMessage = JSON.toJavaObject(jsonObject, LinkMessage.class);
                return new Connection().allWays(Util.javaBeanToJson(linkMessage));

            case "markdown":
                MarkdownMessage markdownMessage = JSON.toJavaObject(jsonObject, MarkdownMessage.class);
                return new Connection().allWays(Util.javaBeanToJson(markdownMessage));

            case "actionCard":
                ActionCardMessage actionCardMessage = JSON.toJavaObject(jsonObject, ActionCardMessage.class);
                return new Connection().allWays(Util.javaBeanToJson(actionCardMessage));

            case "feedCard":
                FeedCardMessage feedCardMessage = JSON.toJavaObject(jsonObject, FeedCardMessage.class);
                return new Connection().allWays(Util.javaBeanToJson(feedCardMessage));

        }
        return null;
    }


}
