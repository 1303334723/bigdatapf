package com.behavioranalysis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PagesController {

    @RequestMapping(value = "/main-page", method = RequestMethod.GET)
    public String mainPage() {
        return "main-page";
    }

    @RequestMapping(value = "/advertisement", method = RequestMethod.GET)
    public String advertisement() {
        return "advertisement";
    }

    @RequestMapping(value = "/session-analysis", method = RequestMethod.GET)
    public String sessionAnalysis() {
        return "session-analysis";
    }

    @RequestMapping(value = "/page_convert_rate", method = RequestMethod.GET)
    public String pageConvertRate() {
        return "page-convert-rate";
    }

    @RequestMapping(value = "/hot-goods", method = RequestMethod.GET)
    public String hotGoods() {
        return "hot-goods";
    }
}
