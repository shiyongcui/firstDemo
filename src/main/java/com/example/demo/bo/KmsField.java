package com.example.demo.bo;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class KmsField {

    //发卡机构证书内容
    private String tag_90;
    //认证中心公钥索引（RSA）
    private String tag_8F;
    //发卡行公钥指数
    private String tag_9F32;
    //发卡行公钥余项
    private String tag_92;
    //签名静态应用数据  DGI-0203
    private String tag_93_01;
    //签名静态应用数据  DGI-0705
    private String tag_93_02;
    //IC卡公钥证书 DGI-0204
    private String tag_9F46_01;
    //IC卡公钥证书 DGI-0703
    private String tag_9F46_02;
    //IC卡公钥证书2部分RSA算法-IC卡公钥指数
    private String tag_9F47;
    //IC卡公钥证书2部分RSA算法-IC卡公钥余项
    private String tag_9F48;
    //IC卡公钥证书2部分RSA算法-动态数据认证对象列表DDOL
    private String tag_9F49;
    //卡片风险管理数据对象列表(CDOL1)
    private String tag_8C;
    //卡片风险管理数据对象列表(CDOL1)
    private String tag_8D;
    //私钥分量 DGI-8205
    private String tag_EF12;
    //私钥分量 DGI-8204
    private String tag_EF13;
    //私钥分量 DGI-8203
    private String tag_EF14;
    //私钥分量 DGI-8202
    private String tag_EF15;

    //私钥分量 DGI-8202
    private String tag_EF16;

    private List<KeyResInfoVo> keyResInfoVoList;

    public List<KeyResInfoVo> getKeyResInfoVoList() {
        return keyResInfoVoList;
    }

    public void setKeyResInfoVoList(List<KeyResInfoVo> keyResInfoVoList) {
        this.keyResInfoVoList = keyResInfoVoList;
    }

    public String getTag_90() {
        return tag_90;
    }

    public void setTag_90(String tag_90) {
        this.tag_90 = tag_90;
    }

    public String getTag_8F() {
        return tag_8F;
    }

    public void setTag_8F(String tag_8F) {
        this.tag_8F = tag_8F;
    }

    public String getTag_9F32() {
        return tag_9F32;
    }

    public void setTag_9F32(String tag_9F32) {
        this.tag_9F32 = tag_9F32;
    }

    public String getTag_92() {
        return tag_92;
    }

    public void setTag_92(String tag_92) {
        this.tag_92 = tag_92;
    }

    public String getTag_93_01() {
        return tag_93_01;
    }

    public void setTag_93_01(String tag_93_01) {
        this.tag_93_01 = tag_93_01;
    }

    public String getTag_93_02() {
        return tag_93_02;
    }

    public void setTag_93_02(String tag_93_02) {
        this.tag_93_02 = tag_93_02;
    }

    public String getTag_9F46_01() {
        return tag_9F46_01;
    }

    public void setTag_9F46_01(String tag_9F46_01) {
        this.tag_9F46_01 = tag_9F46_01;
    }

    public String getTag_9F46_02() {
        return tag_9F46_02;
    }

    public void setTag_9F46_02(String tag_9F46_02) {
        this.tag_9F46_02 = tag_9F46_02;
    }

    public String getTag_9F47() {
        return tag_9F47;
    }

    public void setTag_9F47(String tag_9F47) {
        this.tag_9F47 = tag_9F47;
    }

    public String getTag_9F48() {
        return tag_9F48;
    }

    public void setTag_9F48(String tag_9F48) {
        this.tag_9F48 = tag_9F48;
    }

    public String getTag_9F49() {
        return tag_9F49;
    }

    public void setTag_9F49(String tag_9F49) {
        this.tag_9F49 = tag_9F49;
    }

    public String getTag_8C() {
        return tag_8C;
    }

    public void setTag_8C(String tag_8C) {
        this.tag_8C = tag_8C;
    }

    public String getTag_8D() {
        return tag_8D;
    }

    public void setTag_8D(String tag_8D) {
        this.tag_8D = tag_8D;
    }

    public String getTag_EF12() {
        return tag_EF12;
    }

    public void setTag_EF12(String tag_EF12) {
        this.tag_EF12 = tag_EF12;
    }

    public String getTag_EF13() {
        return tag_EF13;
    }

    public void setTag_EF13(String tag_EF13) {
        this.tag_EF13 = tag_EF13;
    }

    public String getTag_EF14() {
        return tag_EF14;
    }

    public void setTag_EF14(String tag_EF14) {
        this.tag_EF14 = tag_EF14;
    }

    public String getTag_EF15() {
        return tag_EF15;
    }

    public void setTag_EF15(String tag_EF15) {
        this.tag_EF15 = tag_EF15;
    }

    public String getTag_EF16() {
        return tag_EF16;
    }

    public void setTag_EF16(String tag_EF16) {
        this.tag_EF16 = tag_EF16;
    }

    @Override
    public String toString() {
        return "KmsField{" +
                "tag_90='" + tag_90 + '\'' +
                ", tag_8F='" + tag_8F + '\'' +
                ", tag_9F32='" + tag_9F32 + '\'' +
                ", tag_92='" + tag_92 + '\'' +
                ", tag_93_01='" + tag_93_01 + '\'' +
                ", tag_93_02='" + tag_93_02 + '\'' +
                ", tag_9F46_01='" + tag_9F46_01 + '\'' +
                ", tag_9F46_02='" + tag_9F46_02 + '\'' +
                ", tag_9F47='" + tag_9F47 + '\'' +
                ", tag_9F48='" + tag_9F48 + '\'' +
                ", tag_9F49='" + tag_9F49 + '\'' +
                ", tag_8C='" + tag_8C + '\'' +
                ", tag_8D='" + tag_8D + '\'' +
                ", tag_EF12='" + tag_EF12 + '\'' +
                ", tag_EF13='" + tag_EF13 + '\'' +
                ", tag_EF14='" + tag_EF14 + '\'' +
                ", tag_EF15='" + tag_EF15 + '\'' +
                ", tag_EF16='" + tag_EF16 + '\'' +
                ", keyResInfoVoList=" + keyResInfoVoList +
                '}';
    }
}
