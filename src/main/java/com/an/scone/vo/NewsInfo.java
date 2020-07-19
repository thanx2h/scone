package com.an.scone.vo;

import java.util.ArrayList;

public class NewsInfo {
    private String lastBuildDate;
    private String total;
    private String display;
    private  ArrayList<NewsItem> items;

    public NewsInfo(){}

    public NewsInfo(String lastBuildDate, String total, String display, ArrayList<NewsItem> items) {
        this.lastBuildDate = lastBuildDate;
        this.total = total;
        this.display = display;
        this.items = items;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public ArrayList<NewsItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<NewsItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "NewsInfo{" +
                "lastBuildDate='" + lastBuildDate + '\'' +
                ", total='" + total + '\'' +
                ", display='" + display + '\'' +
                ", items=" + items +
                '}';
    }
}