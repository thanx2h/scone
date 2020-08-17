package com.an.scone.controller;

import com.an.scone.network.crawling.NaverCrawling;
import com.an.scone.service.KeywordService;
import com.an.scone.vo.IngiItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class CrawlingController {

    KeywordService keywordService;

    @Autowired
    CrawlingController(
            KeywordService keywordService
    ) {
        this.keywordService = keywordService;
    }

    @RequestMapping(value = "/")
    public String getNews(Model model) {
//        System.out.println("getNews");
        ArrayList<IngiItem> ingiItemList = NaverCrawling.request();

        for (IngiItem ingiItem :ingiItemList) {

            String defaultKeyword = "Enter the Keywords(double click)";
            // isCompany의 결과가 int값(0이면 false, 1이면 true)으로 반환
            System.out.println(ingiItem.toString());
            if(keywordService.isCompany(ingiItem.getCompany()) == 0){
                keywordService.setCompany(ingiItem.getCompany(), defaultKeyword);
            } else if (keywordService.isCompany(ingiItem.getCompany()) == 1){
                ingiItem.setKeyword(keywordService.getKeywordInfoByCompany(ingiItem.getCompany()));
            }
        }

        model.addAttribute("ingiItemList", ingiItemList);

        return "index";
    }

    @RequestMapping(value="/keyword", method = RequestMethod.POST)
    public String postSaveKeyword(String company, String keyword){
        keywordService.updateKeywordInfo(company, keyword);
        return "200";
    }
}
