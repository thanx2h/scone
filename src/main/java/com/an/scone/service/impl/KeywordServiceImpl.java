package com.an.scone.service.impl;

import com.an.scone.mapper.keyword.KeywordMapper;
import com.an.scone.service.KeywordService;
import com.an.scone.vo.KeywordInfo;
import org.springframework.beans.factory.annotation.Autowired;

public class KeywordServiceImpl implements KeywordService {

    private KeywordMapper keywordMapper;

    @Autowired
    KeywordServiceImpl(
        KeywordMapper keywordMapper
    ){
        this.keywordMapper = keywordMapper;
    }

    @Override
    public KeywordInfo findKeyword() {
        return keywordMapper.findKeyword();
    }

    @Override
    public int isCompany(String company) {
        return keywordMapper.isCompany(company);
    }

    @Override
    public String findKeywordByCompany(String company) {
        return keywordMapper.findKeywordByCompany(company);
    }

    @Override
    public void saveCompany(String company) {
        keywordMapper.saveCompany(company);
    }

    @Override
    public void saveKeyword(String keyword) {
        keywordMapper.saveKeyword(keyword);
    }

    @Override
    public void update(String company, String keyword) {
        keywordMapper.update(company,keyword);
    }
}
