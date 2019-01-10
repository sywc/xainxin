package com.ruoyi.project.xianxin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user/")
public class ClientController {

    @RequestMapping("/hello")
    private String listviel1(){
        return "addHtml/user_details";
    }

    @RequestMapping("/list1")
    private String listviel(){
        return "addHtml/list";
    }



//    /**
//     * 客户反馈
//     * @return
//     */
//    @RequestMapping("/user_feedback_list")
//    private String clientFeedback(){
//        return "addHtml/client/user_feedback_list";
//    }

}
