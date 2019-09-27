package com.example.demo.bo;

import lombok.Data;

import java.util.List;

@Data
public class RequestVo {

    private String iccPAN;
    private String recordNo;
    private String discreteData;

    private String signData01;

    private String signData02;

    //数据验证代码 发卡行分配
    private String dataVerificationCode01;
    private String dataVerificationCode02;

    private String iccExpires01;
    private String iccExpires02;
    //密钥索引与分散因子
    private List<KeyInfoVo> keyInfoVoList;
    //保护密钥索引
    private String protectKeyIndex;


}
