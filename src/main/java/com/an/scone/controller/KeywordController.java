package com.an.scone.controller;

import com.an.scone.mapper.keyword.KeywordMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class KeywordController {


    private KeywordMapper keywordMapper;

    @Autowired
    KeywordController(
            KeywordMapper keywordMapper
    ) {
        this.keywordMapper = keywordMapper;
    }

//    public String findKeywordByCompany(String company){
//        String keyword = KeywordMapper.findKeywordByCompany(company);
//        System.out.println("keyword : " + keyword);
//        return KeywordMapper.findKeywordByCompany(company);
//    }
//
//    public int isCompany(String company){
//        return KeywordMapper.isCompany(company);
//    }
//
//    public void saveCompany(String company){
//        KeywordMapper.saveCompany(company);
//    }
//
//    public void saveKeyword(String company){
//        KeywordMapper.saveKeyword(company);
//    }
//
//    public void update(String company, String keyword){
//        KeywordMapper.update(company, keyword);
//    }
}
