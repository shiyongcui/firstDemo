package com.example.demo.bo;

import lombok.Data;

@Data
public class KeyResInfoVo {
    private String keyIndex;
    //密钥密文与校验值
    private String keyValMc;
}
