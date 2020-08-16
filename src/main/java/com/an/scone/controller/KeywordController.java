//package com.an.scone.controller;
//
//import com.an.scone.service.KeywordService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class KeywordController {
//
//    private KeywordService keywordService;
//
//    @Autowired
//    KeywordController(
//            KeywordService keywordService
//    ) {
//        this.keywordService = keywordService;
//    }
//
//    public String getKeywordInfoByCompany(String company){
//        String keyword = keywordService.getKeywordInfoByCompany(company);
//        System.out.println("keyword : " + keyword);
//        return keywordService.getKeywordInfoByCompany(company);
//    }
//
//    public int isCompany(String company){
//        return keywordService.isCompany(company);
//    }
//
//    public void saveCompany(String company){
//        keywordService.setCompany(company);
//    }
//
//    public void saveKeyword(String company){
//        keywordService.setKeyword(company);
//    }
//
//    public void update(String company, String keyword){
//        keywordService.updateKeywordInfo(company, keyword);
//    }
//}
