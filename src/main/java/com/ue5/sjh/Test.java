package com.ue5.sjh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Test {
    @RequestMapping(value = {"/", "", "hello"})
    public String index(){
        return "hello";
    }
}
