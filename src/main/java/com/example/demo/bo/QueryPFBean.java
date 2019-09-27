package com.example.demo.bo;

import com.alibaba.fastjson.annotation.JSONField;
//import com.baomidou.mybatisplus.annotation.TableField;
//import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class QueryPFBean {

    private String oid;
    @JSONField(ordinal = 1)
    //对象类别:0-法人  1-自然人
//    @TableField(value = "dxlb",exist = true)
    private String dxlb;

    @JSONField(ordinal = 2)
    //查询类型:0-自查  1-服务查询
//    @TableField(value = "cxlx",exist = true)
    private String cxlx;
    //服务机构名称
    @JSONField(ordinal = 3)
//    @TableField(value = "fwDeptJgmc",exist = true)
    private String fwDeptJgmc;

    //服务统一社会信用代码
    @JSONField(ordinal = 4)
//    @TableField(value = "fwDeptTyshxydm",exist = true)
    private String fwDeptTyshxydm;

    //秘钥
    @JSONField(ordinal = 5)
//    @TableField(value = "my",exist = true)
    private String my;
    //法人-机构名称
    @JSONField(ordinal = 6)
//    @TableField(value = "cxJgqc",exist = true)
    private String cxJgqc;

    //法人-统一社会信用代码
    @JSONField(ordinal = 7)
//    @TableField(value = "cxTyshxydm",exist = true)
    private String cxTyshxydm;

    //法人-工商注册号
    @JSONField(ordinal = 8)
//    @TableField(value = "cxGszch",exist = true)
    private String cxGszch;

    //法人-组织机构代码
    @JSONField(ordinal = 9)
//    @TableField(value = "cxZzjgdm",exist = true)
    private String cxZzjgdm;

    //自然人-姓名
    @JSONField(ordinal = 10)
//    @TableField(value = "cxXm",exist = true)
    private String cxXm;

    //自然人-身份证号
    @JSONField(ordinal = 11)
//    @TableField(value = "cxSfzh",exist = true)
    private String cxSfzh;


}
