package com.an.scone.vo;

public class KeywordInfo {
    private String company;
    private String keyword;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "KeywordInfo{" +
                "company='" + company + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
