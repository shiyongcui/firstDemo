package com.example.demo.bo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Authorization {

    @JSONField(ordinal = 1)
    private String sfSq;

    @JSONField(ordinal = 2)
    private String dxlb;

    @JSONField(ordinal = 3)
    private String my;

    @JSONField(ordinal = 4)
    private String cxJgqc;

    @JSONField(ordinal = 5)
    private String cxTyshxydm;

    @JSONField(ordinal = 6)
    private String cxXm;

    @JSONField(ordinal = 7)
    private String cxSfzh;


}
