package com.example.demo.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

//@Service
public class JsoupExample {
    private static String url = "https://danoshop.net/category?cate_no=0";

    @PostConstruct
    public void getKoreaCovidDatas() throws IOException {

        Document doc = Jsoup.connect(url).get();
        System.out.println(doc);

    }

}
