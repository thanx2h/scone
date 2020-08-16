package com.an.scone.service.impl;

import com.an.scone.mapper.keyword.KeywordMapper;
import com.an.scone.service.KeywordService;
import com.an.scone.vo.KeywordInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeywordServiceImpl implements KeywordService {

    private KeywordMapper keywordMapper;

    @Autowired
    KeywordServiceImpl(
        KeywordMapper keywordMapper
    ){
        this.keywordMapper = keywordMapper;
    }

    @Override
    public KeywordInfo getKeywordInfo() {
        return keywordMapper.getKeywordInfo();
    }

    @Override
    public int isCompany(String company) {
        return keywordMapper.isCompany(company);
    }

    @Override
    public String getKeywordInfoByCompany(String company) {
        return keywordMapper.getKeywordInfoByCompany(company);
    }

    @Override
    public void setCompany(String company, String keyword) {
        keywordMapper.setCompany(company, keyword);
    }

    @Override
    public void setKeyword(String keyword) {
        keywordMapper.setKeyword(keyword);
    }

    @Override
    public void updateKeywordInfo(String company, String keyword) {
        keywordMapper.updateKeywordInfo(company,keyword);
    }
}
