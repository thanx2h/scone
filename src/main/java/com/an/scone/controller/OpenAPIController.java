package com.an.scone.controller;

import com.an.scone.network.api.OpenAPI;
import com.an.scone.vo.NewsInfo;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OpenAPIController {
    @RequestMapping(value = "/searchOpenAPI")
    public String getNews(Model model){
        String responseJson = OpenAPI.request("삼성전자");
        Gson gson = new Gson();

        NewsInfo newsInfo = gson.fromJson(responseJson.toString(), NewsInfo.class);
        model.addAttribute("newsList", newsInfo);
        return "index";
    }
}
