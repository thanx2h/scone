package com.an.scone.mapper.keyword;

import com.an.scone.vo.KeywordInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface KeywordMapper {
//    @Select("SELECT * FROM KeywordInfo")
    KeywordInfo getKeywordInfo();

//    @Select("SELECT EXISTS (select * from KeywordInfo where company=#{company}) as success;")
    int isCompany(String company);

//    @Select("SELECT * FROM KeywordInfo WHERE company=#{company}")
    String getKeywordInfoByCompany(String company);

//    @Insert("INSERT INTO keywordInfo VALUES (#{company})")
    void setCompany(String company, String keyword);

//    @Insert("INSERT INTO keywordInfo VALUES (#{keyword})")
    void setKeyword(String keyword);

//    @Update("UPDATE keywordInfo SET keyword = #{keyword}")
    void updateKeywordInfo(String company, String keyword);

//    @Delete("DELETE FROM keywordInfo WHERE company = #{company};")
//    void deleteByCompany(String company);
}
