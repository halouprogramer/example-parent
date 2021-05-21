package com.lvlvstart.spring.demo.web;

import com.lvlvstart.spring.demo.common.req.RunBussniessReq;
import com.lvlvstart.spring.demo.common.resp.RunBussniessResp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author halouworld
 * @description 业务处理层
 * @create 2021/5/7 18:14
 */
@RequestMapping
@RestController
public class BussinessLogicWeb {


    @RequestMapping("runBussniess")
    public RunBussniessResp runBussniess( RunBussniessReq runBussniessReq) {


        RunBussniessResp runBussniessResp = new RunBussniessResp();
        runBussniessResp.setResult("what");
        return runBussniessResp;

    }


}
