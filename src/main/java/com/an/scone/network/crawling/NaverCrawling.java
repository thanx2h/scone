package com.an.scone.network.crawling;

import com.an.scone.config.SconeConfig;
import com.an.scone.vo.IngiItem;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class NaverCrawling implements Crawling {

    public static int LIST_SIZE = 15;

    public static ArrayList<IngiItem> request(){
        Document doc = null;

        try {
            Connection.Response response = Jsoup.connect(SconeConfig.INGI_CRAWLING)
                    .method(Connection.Method.GET)
                    .execute();

            if (response.statusCode() == 200) {
                doc = response.parse();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element box_type_l= doc.select("div[class=box_type_l]").first();
        Element type_5 = box_type_l.select("table[class=type_5]").first();
        Elements ingiItemRawDatas = type_5.select("tr:has(td[class=no])");

        ArrayList<IngiItem> ingiItemLIst = new ArrayList<IngiItem>();

        for (int i = 0; i < LIST_SIZE; i++){
            IngiItem ingiItem = new IngiItem();

            Element ingiItemRawData = ingiItemRawDatas.get(i);

            Element rankData = ingiItemRawData.select("td[class=no]").first();
            ingiItem.setRank(rankData.text());
            ingiItemRawData.removeAttr("no");

            Elements itemDatas = ingiItemRawData.select("td");
            String[] itemDatasString = itemDatas.next().text().split(" ");

            ingiItem.setCompany(itemDatas.get(1).text());
            ingiItem.setSearchRate(itemDatas.get(2).text());
            ingiItem.setCurValue(itemDatas.get(3).text());
            ingiItem.setUpDownValue(itemDatas.get(4).text());
            ingiItem.setUpDownRate(itemDatas.get(5).text());
            ingiItem.setVolume(itemDatas.get(6).text());
            ingiItem.setStartValue(itemDatas.get(7).text());
            ingiItem.setHighValue(itemDatas.get(8).text());
            ingiItem.setLowValue(itemDatas.get(9).text());
            ingiItem.setPer(itemDatas.get(10).text());
            ingiItem.setRoe(itemDatas.get(11).text());
            ingiItem.setKeyword("");
            ingiItemLIst.add(ingiItem);
        }

//        for(Element ingiItemRawData : ingiItemRawDatas) {
////            System.out.println("ingiItemRawDatas : " + ingiItemRawData);
//
//            IngiItem ingiItem = new IngiItem();
//
//            Element rankData = ingiItemRawData.select("td[class=no]").first();
//            ingiItem.setRank(rankData.text());
//            ingiItemRawData.removeAttr("no");
//
//            Elements itemDatas = ingiItemRawData.select("td");
//            String[] itemDatasString = itemDatas.next().text().split(" ");
//
//            ingiItem.setCompany(itemDatasString[0]);
//            ingiItem.setSearchRate(itemDatasString[1]);
//            ingiItem.setCurValue(itemDatasString[2]);
//            ingiItem.setUpDownValue(itemDatasString[3]);
//            ingiItem.setUpDownRate(itemDatasString[4]);
//            ingiItem.setVolume(itemDatasString[5]);
//            ingiItem.setStartValue(itemDatasString[6]);
//            ingiItem.setHighValue(itemDatasString[7]);
//            ingiItem.setLowValue(itemDatasString[8]);
//            ingiItem.setPer(itemDatasString[9]);
//            ingiItem.setRoe(itemDatasString[10]);
//            ingiItem.setKeyword("");
//
//            ingiItemLIst.add(ingiItem);
//        }

//        System.out.println(ingiItemLIst.toString());

        return ingiItemLIst;
    }
}
