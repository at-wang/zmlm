package com.example.zmlmreptile.reptile;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import us.codecraft.webmagic.processor.example.GithubRepoPageProcessor;

public class Processor implements PageProcessor {

    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(1000);

    @Override
    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
    public void process(Page page) {
        // 部分二：定义如何抽取页面信息，并保存下来
        for (int i = 0; i < 50; i++) {
            page.putField("img", page.getHtml().xpath("//div[@class=album-wrapper-card]/a/img").toString());
        }

        //for (int i = 0; i < 60; i++) {
        //    page.putField("img", page.getHtml().xpath("//*[@id=\"award\"]/main/div[1]/div[3]/div[2]/ul/li/div/div/a/img").toString());
        //    page.putField("span", page.getHtml().xpath("//*[@id=\"award\"]/main/div[1]/div[3]/div[2]/ul/li/div/a[1]/span/text()").toString());
        //}
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {

        Spider.create(new Processor())
                //从"https://github.com/code4craft"开始抓
                .addUrl("https://www.ximalaya.com/category/a3/")
                //开启5个线程抓取
                //.thread(5)
                .addPipeline(new CustomPipeline())
                //启动爬虫
                .run();
    }
}
