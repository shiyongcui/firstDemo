package com.example.demo.api;


import com.example.demo.bo.JsonData;
import com.example.demo.bo.KmsField;
import com.example.demo.bo.QueryPFBean;
import com.example.demo.bo.RequestVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name ="aa", contextId = "exp" ,url = "http://127.0.0.1:8083/renren-fast/hsm")
//@FeignClient(name ="syc", contextId = "exp" ,url = "http://60.171.247.233:18181/xyj/xyj_jk/search")


@FeignClient(name ="syc", contextId = "exp" ,url = "http://60.171.247.233:18181/xyj/xyj_jk/search")
//授权接口http://60.171.247.233:18181/xyj/xyj_jk/search/sq.action
//http://60.171.247.233:18181/xyj/xyj_jk/search/pfpjAndFwYhForApp.action

//http://192.168.11.83:8080/pay/micropay_request
//@FeignClient(name ="syc", contextId = "exp" ,url = "http://192.168.11.83:8080/pay")
public interface HsmApi {

    /**
     * 交通部互联互通-密管系统接口-国际
     */
    @RequestMapping(value = "/moc_api",method = RequestMethod.POST)
    public KmsField hsm_api(@RequestBody RequestVo requestVo);

    @RequestMapping(value = "/pfpjAndFwYhForApp.action",method = RequestMethod.POST)
    public String hsm_api(@RequestBody QueryPFBean qpfBean);

    @RequestMapping(value = "/pfpjAndFwYhForApp.action",method = RequestMethod.POST,consumes = "application/json")
    public String hsm_api(@RequestParam("json") String json);

    @RequestMapping(value = "/sq.action",method = RequestMethod.POST,consumes = "application/json")
    public String authorization(@RequestParam("json") String json);

    //public String hsm_api(@RequestBody QueryPFBean qpfBean);

//    @RequestMapping(value = "/micropay_request",method = RequestMethod.POST)
//    public String hsm_api(@RequestBody JsonData jsonData);
}
