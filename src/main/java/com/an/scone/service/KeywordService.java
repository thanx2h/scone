package com.an.scone.service;

import com.an.scone.vo.KeywordInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface KeywordService {
//    @Select("SELECT * FROM KeywordInfo")
    public KeywordInfo findKeyword();

//    @Select("SELECT EXISTS (select * from KeywordInfo where company=#{company}) as success;")
    public int isCompany(String company);

//    @Select("SELECT * FROM KeywordInfo WHERE company=#{company}")
    String findKeywordByCompany(String company);

//    @Insert("INSERT INTO keywordInfo VALUES (#{company})")
    void saveCompany(String company);

//    @Insert("INSERT INTO keywordInfo VALUES (#{keyword})")
    void saveKeyword(String keyword);

//    @Update("UPDATE keywordInfo SET keyword = #{keyword}")
    void update(String company, String keyword);
}
