package com.an.scone.controller;

import com.an.scone.network.crawling.NaverCrawling;
import com.an.scone.vo.IngiItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class CrawlingController {

//    KeywordController keywordController = new KeywordController();

    @RequestMapping(value = "/")
    public String getNews(Model model) {
//        System.out.println("getNews");
        ArrayList<IngiItem> ingiItemList = NaverCrawling.request();

//        for (IngiItem ingiItem :ingiItemList) {
//            // isCompany의 결과가 int값(0이면 false, 1이면 true)으로 반환
//            if(keywordController.isCompany(ingiItem.getCompany()) == 0){
//                keywordController.saveCompany(ingiItem.getCompany());
//            } else if (keywordController.isCompany(ingiItem.getCompany()) == 1){
//                if(keywordController.findKeywordByCompany(ingiItem.getCompany()).isEmpty()){
//                    ingiItem.setKeyword("Enter the Keywords(double click)");
//                } else {
//                    ingiItem.setKeyword(keywordController.findKeywordByCompany(ingiItem.getCompany()));
//                }
//            }
////            if(keywordController.findKeywordByCompany(ingiItem.getCompany()).isEmpty()){
////                ingiItem.setKeyword("Enter the Keywords(double click)");
////            } else {
////                ingiItem.setKeyword(keywordController.findKeywordByCompany(ingiItem.getCompany()));
////            }
//        }

        model.addAttribute("ingiItemList", ingiItemList);

        return "index";
    }
}
