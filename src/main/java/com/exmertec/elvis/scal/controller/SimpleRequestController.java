package com.exmertec.elvis.scal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleRequestController {

    @RequestMapping("hello")
    public String loadHelloPage() {
        return "hello";
    }
}

