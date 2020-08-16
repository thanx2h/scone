package com.an.scone.vo;

public class IngiItem {
    private String rank;
    private String company;
    private String searchRate;
    private String curValue;
    private String upDownValue;
    private String upDownRate;
    private String volume;
    private String startValue;
    private String highValue;
    private String lowValue;
    private String per;
    private String roe;
    private String keyword;

    public IngiItem() {
    }

    public IngiItem(String rank, String company, String searchRate, String curValue, String upDownValue, String upDownRate, String volume, String startValue, String highValue, String lowValue, String per, String roe, String keyword) {
        this.rank = rank;
        this.company = company;
        this.searchRate = searchRate;
        this.curValue = curValue;
        this.upDownValue = upDownValue;
        this.upDownRate = upDownRate;
        this.volume = volume;
        this.startValue = startValue;
        this.highValue = highValue;
        this.lowValue = lowValue;
        this.per = per;
        this.roe = roe;
        this.keyword = keyword;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSearchRate() {
        return searchRate;
    }

    public void setSearchRate(String searchRate) {
        this.searchRate = searchRate;
    }

    public String getCurValue() {
        return curValue;
    }

    public void setCurValue(String curValue) {
        this.curValue = curValue;
    }

    public String getUpDownValue() {
        return upDownValue;
    }

    public void setUpDownValue(String upDownValue) {
        this.upDownValue = upDownValue;
    }

    public String getUpDownRate() {
        return upDownRate;
    }

    public void setUpDownRate(String upDownRate) {
        this.upDownRate = upDownRate;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getStartValue() {
        return startValue;
    }

    public void setStartValue(String startValue) {
        this.startValue = startValue;
    }

    public String getHighValue() {
        return highValue;
    }

    public void setHighValue(String highValue) {
        this.highValue = highValue;
    }

    public String getLowValue() {
        return lowValue;
    }

    public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public String getRoe() {
        return roe;
    }

    public void setRoe(String roe) {
        this.roe = roe;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "IngiItem{" +
                "rank='" + rank + '\'' +
                ", company='" + company + '\'' +
                ", searchRate='" + searchRate + '\'' +
                ", curValue='" + curValue + '\'' +
                ", upDownValue='" + upDownValue + '\'' +
                ", upDownRate='" + upDownRate + '\'' +
                ", volume='" + volume + '\'' +
                ", startValue='" + startValue + '\'' +
                ", highValue='" + highValue + '\'' +
                ", lowValue='" + lowValue + '\'' +
                ", per='" + per + '\'' +
                ", roe='" + roe + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
