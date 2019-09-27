package com.example.demo;

import com.example.demo.api.HsmApi;
import com.example.demo.bo.KeyInfoVo;
import com.example.demo.bo.KmsField;
import com.example.demo.bo.RequestVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Import({FeignAutoConfiguration.class, HttpMessageConvertersAutoConfiguration.class})
@EnableFeignClients
public class FeignClientTest {
    @Autowired
    public HsmApi hsmApi = null;
    @Test
    public void queryEmployeeByDeptId() {

        RequestVo requestVo=new RequestVo();

        requestVo.setIccPAN("3105120200000063201F");
        requestVo.setDataVerificationCode01("3105");
        requestVo.setDataVerificationCode02("3105");
        requestVo.setIccExpires01("1240");
        requestVo.setIccExpires02("1240");

        requestVo.setRecordNo("000173");

        requestVo.setSignData01("5A0A3105120200000063201F5F24033112315F25031611235F3401019F0702FF008E0C000000000000000002031F005F280201569F0D05D86004A8009F0E0500109800009F0F05D86804F8009F4A01828C1B9F02069F03069F1A0295055F2A029A039C019F37049F21039F4E148D1A8A029F02069F03069F1A0295055F2A029A039F21039C019F37047C00");
        requestVo.setSignData02("5A0A3105120200000063201F5F24033112315F25031611235F3401019F0702FF008E0A00000000000000001F005F280201569F0D05D8603CA8009F0E0500108000009F0F05D8683CF8009F4A01828C1B9F02069F03069F1A0295055F2A029A039C019F37049F21039F4E148D1A8A029F02069F03069F1A0295055F2A029A039F21039C019F37047C00");
        requestVo.setProtectKeyIndex("K01F");
        requestVo.setDiscreteData("2020000006320101");


        //请求交通部电子钱包密钥
        List<KeyInfoVo> keyInfoVoList=new ArrayList<KeyInfoVo>();
        KeyInfoVo keyInfoVo=new KeyInfoVo();

        keyInfoVo.setKeyName("消费密钥");
        keyInfoVo.setKeyIndex("K023");
        keyInfoVo.setDisperData("2020000006320101");

        keyInfoVoList.add(keyInfoVo);

        requestVo.setKeyInfoVoList(keyInfoVoList);
        KmsField kmsFiled=hsmApi.hsm_api(requestVo);

        System.out.println(kmsFiled.toString());



    }
}
