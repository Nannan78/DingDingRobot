package com.nan;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import com.nan.conn.Connection;
import com.nan.pojo.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestdingApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("test");

    }

    @Test
    void testTextJSonStringtoJavaBean() {
        String jsonString="{\n" +
                "    \"msgtype\": \"text\", \n" +
                "    \"text\": {\n" +
                "        \"content\": \"我就是我, 是不一样的烟火@156xxxx8827\"\n" +
                "    }, \n" +
                "    \"at\": {\n" +
                "        \"atMobiles\": [\n" +
                "            \"156xxxx8827\", \n" +
                "            \"189xxxx8325\"\n" +
                "        ], \n" +
                "        \"isAtAll\": false\n" +
                "    }\n" +
                "}";
        JSONObject jsonObject = JSON.parseObject(jsonString);
        System.out.println(jsonObject);
        TextMessage textMessage = jsonObject.toJavaObject(TextMessage.class);
        new Connection().keyword(JSON.toJSONString(textMessage));

    }

    @Test
    void testLinkJSonStringtoJavaBean() {
        String jsonString="{\n" +
                "    \"msgtype\": \"link\", \n" +
                "    \"link\": {\n" +
                "        \"text\": \"这个即将发布的新版本，创始人xx称它为红树林。而在此之前，每当面临重大升级，产品经理们都会取一个应景的代号，这一次，为什么是红树林\", \n" +
                "        \"title\": \"时代的火车向前开\", \n" +
                "        \"picUrl\": \"\", \n" +
                "        \"messageUrl\": \"https://www.dingtalk.com/s?__biz=MzA4NjMwMTA2Ng==&mid=2650316842&idx=1&sn=60da3ea2b29f1dcc43a7c8e4a7c97a16&scene=2&srcid=09189AnRJEdIiWVaKltFzNTw&from=timeline&isappinstalled=0&key=&ascene=2&uin=&devicetype=android-23&version=26031933&nettype=WIFI\"\n" +
                "    }\n" +
                "}";
        JSONObject jsonObject = JSON.parseObject(jsonString);
        System.out.println(jsonObject);
        LinkMessage linkMessage = jsonObject.toJavaObject(LinkMessage.class);
        System.out.println(linkMessage);

    }

    @Test
    void testMKJSonStringtoJavaBean() {
        String jsonString="{\n" +
                "     \"msgtype\": \"markdown\",\n" +
                "     \"markdown\": {\n" +
                "         \"title\":\"杭州天气\",\n" +
                "         \"text\": \"#### 杭州天气 @150XXXXXXXX \\n> 9度，西北风1级，空气良89，相对温度73%\\n> ![screenshot](https://img.alicdn.com/tfs/TB1NwmBEL9TBuNjy1zbXXXpepXa-2400-1218.png)\\n> ###### 10点20分发布 [天气](https://www.dingtalk.com) \\n\"\n" +
                "     },\n" +
                "      \"at\": {\n" +
                "          \"atMobiles\": [\n" +
                "              \"150XXXXXXXX\"\n" +
                "          ],\n" +
                "          \"isAtAll\": false\n" +
                "      }\n" +
                " }";
        JSONObject jsonObject = JSON.parseObject(jsonString);
        System.out.println(jsonObject);
        MarkdownMessage markdownMessage = jsonObject.toJavaObject(MarkdownMessage.class);
        System.out.println(markdownMessage);

    }

    @Test
    void testACMJSonStringtoJavaBean() {
        String jsonString="{\n" +
                "    \"actionCard\": {\n" +
                "        \"title\": \"乔布斯 20 年前想打造一间苹果咖啡厅，而它正是 Apple Store 的前身\", \n" +
                "        \"text\": \"![screenshot](https://gw.alicdn.com/tfs/TB1ut3xxbsrBKNjSZFpXXcXhFXa-846-786.png)  ### 乔布斯 20 年前想打造的苹果咖啡厅  /n Apple Store 的设计正从原来满满的科技感走向生活化，而其生活化的走向其实可以追溯到 20 年前苹果一个建立咖啡馆的计划\", \n" +
                "        \"btnOrientation\": \"0\", \n" +
 /*               "          \"singleTitle\" : \"阅读全文\",\n" +
                "        \"singleURL\" : \"https://www.dingtalk.com/\",\n" +*/
                "       \"btns\": [\n" +
                "            {\n" +
                "                \"title\": \"内容不错\", \n" +
                "                \"actionURL\": \"https://www.dingtalk.com/\"\n" +
                "            }, \n" +
                "            {\n" +
                "                \"title\": \"不感兴趣\", \n" +
                "                \"actionURL\": \"https://www.dingtalk.com/\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }, \n" +
                "    \"msgtype\": \"actionCard\"\n" +
                "}";
        JSONObject jsonObject = JSON.parseObject(jsonString);
        System.out.println(jsonObject);
        ActionCardMessage acm = jsonObject.toJavaObject(ActionCardMessage.class);
        new Connection().keyword(JSON.toJSONString(acm));

    }

    @Test
    void testFCMJSonStringtoJavaBean() {
        String jsonString="{\n" +
                "    \"feedCard\": {\n" +
                "        \"links\": [\n" +
                "            {\n" +
                "                \"title\": \"1时代的火车向前开\", \n" +
                "                \"messageURL\": \"https://www.dingtalk.com/s?__biz=MzA4NjMwMTA2Ng==&mid=2650316842&idx=1&sn=60da3ea2b29f1dcc43a7c8e4a7c97a16&scene=2&srcid=09189AnRJEdIiWVaKltFzNTw&from=timeline&isappinstalled=0&key=&ascene=2&uin=&devicetype=android-23&version=26031933&nettype=WIFI\", \n" +
                "                \"picURL\": \"https://gw.alicdn.com/tfs/TB1ayl9mpYqK1RjSZLeXXbXppXa-170-62.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"title\": \"时代的火车向前开2\", \n" +
                "                \"messageURL\": \"https://www.dingtalk.com/s?__biz=MzA4NjMwMTA2Ng==&mid=2650316842&idx=1&sn=60da3ea2b29f1dcc43a7c8e4a7c97a16&scene=2&srcid=09189AnRJEdIiWVaKltFzNTw&from=timeline&isappinstalled=0&key=&ascene=2&uin=&devicetype=android-23&version=26031933&nettype=WIFI\", \n" +
                "                \"picURL\": \"https://gw.alicdn.com/tfs/TB1ayl9mpYqK1RjSZLeXXbXppXa-170-62.png\"\n" +
                "            }\n" +
                "        ]\n" +
                "    }, \n" +
                "    \"msgtype\": \"feedCard\"\n" +
                "}";
        JSONObject jsonObject = JSON.parseObject(jsonString);
        System.out.println(jsonObject);
        FeedCardMessage msg = jsonObject.toJavaObject(FeedCardMessage.class);
        new Connection().keyword(JSON.toJSONString(msg));;

    }

}
