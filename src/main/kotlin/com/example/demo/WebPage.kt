package com.example.demo

import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Service
@RequestMapping("")
class WebPage {

    @GetMapping("")
    @ResponseBody
    fun home(): String{
        return "Hello World!"
    }
}
