package com.example.linkshortener;

import org.springframework.web.bind.annotation.RequestMapping;

public class WebController {
    @RequestMapping("/")
    String indexHtml() {
        return "index.html";
    }

}
