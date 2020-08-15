package com.an.scone.mapper.keyword;

import com.an.scone.vo.KeywordInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface KeywordMapper {
//    @Select("SELECT * FROM KeywordInfo")
    public KeywordInfo findKeyword();

//    @Select("SELECT EXISTS (select * from KeywordInfo where company=#{company}) as success;")
    public int isCompany(@Param("company") String company);

//    @Select("SELECT * FROM KeywordInfo WHERE company=#{company}")
    String findKeywordByCompany(@Param("company") String company);

//    @Insert("INSERT INTO keywordInfo VALUES (#{company})")
    void saveCompany(@Param("company") String company);

//    @Insert("INSERT INTO keywordInfo VALUES (#{keyword})")
    void saveKeyword(@Param("keyword") String keyword);

//    @Update("UPDATE keywordInfo SET keyword = #{keyword}")
    void update(@Param("company") String company, @Param("company") String keyword);

//    @Delete("DELETE FROM keywordInfo WHERE company = #{company};")
//    void deleteByCompany(String company);
}
