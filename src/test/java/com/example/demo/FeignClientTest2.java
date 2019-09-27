package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.api.HsmApi;
import com.example.demo.bo.Authorization;
import com.example.demo.bo.QueryPFBean;
import com.example.demo.bo.JsonData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Import({FeignAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class})
@EnableFeignClients
public class FeignClientTest2 {
    @Autowired
    public HsmApi hsmApi = null;
   // @Test
    public void QueryPingFen() {
        QueryPFBean qpfBean = new QueryPFBean();
        qpfBean.setDxlb("1");
        qpfBean.setCxlx("1");
        qpfBean.setFwDeptJgmc("宿州市公共交通有限公司");
        qpfBean.setFwDeptTyshxydm("91341300784905405E");
        qpfBean.setMy("BYVXZ-6FAKK-NSE47-GYJ8Z-S3UCC");
        qpfBean.setCxJgqc("");
        qpfBean.setCxTyshxydm("");
        qpfBean.setCxGszch("");
        qpfBean.setCxZzjgdm("");
        qpfBean.setCxXm("王桂夫");
        qpfBean.setCxSfzh("342224196505021835");
        String json = JSON.toJSONString(qpfBean);
        System.out.println(json);
        String returnMsg = hsmApi.hsm_api(json);
        System.out.println(returnMsg);
        if (!returnMsg.equals("") || returnMsg != null) {
            System.out.println(returnMsg);
        }
    }

    @Test
    public void Authorization(){
        Authorization authorization = new Authorization();
        authorization.setSfSq("0");
        authorization.setDxlb("1");
        authorization.setMy("BYVXZ-6FAKK-NSE47-GYJ8Z-S3UCC");
        authorization.setCxJgqc("");
        authorization.setCxTyshxydm("");
        authorization.setCxXm("王桂夫");
        authorization.setCxSfzh("342224196505021835");

        String json = JSON.toJSONString(authorization);
        System.out.println(json);
        String returnMsg = hsmApi.authorization(json);

        System.out.println(returnMsg);
        if (!returnMsg.equals("") || returnMsg != null) {
            System.out.println(returnMsg);
        }

    }
    //authorization

    //@Test
    public void QueryPingFen2(){

        JsonData jsonData = new JsonData();
        jsonData.setTradePayNo("12344");
        jsonData.setPayType("WECHAT_PAY");
        jsonData.setTradeType("NATIVE");
        jsonData.setSubject("聊城公交公司");
        jsonData.setDetail("IC卡充值");
        jsonData.setExtra("test");
        jsonData.setMerchantId("1501165411");
        jsonData.setPayAmount(1);
        jsonData.setNotifyUrl("123456");
        jsonData.setAuthCode("135063022356683982");

//        String json="{\"tradePayNo\":\"1234567890\",\"payType\":\"WECHAT_PAY\",\"tradeType\":\"NATIVE\",\"subject\":\"聊城公交公司\",\"detail\":\"IC卡充值\",\"extra\":\"test\",\"merchantId\":\"1501165411\",\"payAmount\":1,\"notifyUrl\":\"123456\",\"authCode\":12312312312312312}";
//        System.out.println(json);
//        String returnMsg = hsmApi.hsm_api(jsonData);
//        System.out.println(returnMsg);
//        if (!returnMsg.equals("") || returnMsg != null) {
//            System.out.println(returnMsg);
//        }
    }
}
