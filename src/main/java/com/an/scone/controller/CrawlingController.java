package com.an.scone.controller;

import com.an.scone.network.crawling.NaverCrawling;
import com.an.scone.vo.IngiItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class CrawlingController {
    @RequestMapping(value = "/")
    public String getNews(Model model) {
//        System.out.println("getNews");
        ArrayList<IngiItem> ingiItemList = NaverCrawling.request();
        model.addAttribute("ingiItemList", ingiItemList);

        return "index";
    }
}
