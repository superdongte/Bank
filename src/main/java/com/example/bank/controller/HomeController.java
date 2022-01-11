package com.example.bank.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String test(Model model) throws IOException {
		String WeatherURL = "https://portal.kfb.or.kr/fingoods/cofix.php";
		Document doc = Jsoup.connect(WeatherURL).get();
		//HTML로 부터 데이터 가져오기
		Elements elem = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(1) > p.item");
		Elements elem2 = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(1) > p:nth-child(2)");
		Elements elem3 = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(1) > p.percent");
		Elements elem4 = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(1) > p:nth-child(4)");
		//원하는 태그 선택
		String[] str = elem.text().split(" ");
		//정보파싱
		String ntext = elem.text();
		String ntext2 = elem2.text();
		String ntext3 = elem3.text();
		String ntext4 = elem4.text();
		model.addAttribute("NewCofix1", ntext);
		model.addAttribute("NewCofix2",ntext2);
		model.addAttribute("NewCofix3",ntext3);
		model.addAttribute("NewCofix4",ntext4);
	
		Elements cofix = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(2) > p.item");
		Elements cofix2 = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(2) > p:nth-child(2)");
		Elements cofix3 = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(2) > p.percent");
		Elements cofix4 = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(2) > p:nth-child(4)");
		
		String text = cofix.text();
		String text2 = cofix2.text();
		String text3 = cofix3.text();
		String text4 = cofix4.text();
		
		model.addAttribute("Cofix1", text);
		model.addAttribute("Cofix2", text2);
		model.addAttribute("Cofix3", text3);
		model.addAttribute("Cofix4", text4);
		
		return "test";
	}
//	@GetMapping("/")
//	public String test(Model model) throws IOException {
//		String WeatherURL = "https://weather.naver.com/today";
//		Document doc = Jsoup.connect(WeatherURL).get();
//		//HTML로 부터 데이터 가져오기
//		Elements elem = doc.select(".weather_area .summary .weather");
//		//원하는 태그 선택
//		String[] str = elem.text().split(" ");
//		//정보파싱
//		model.addAttribute("weather",elem);
//	
//		System.out.println("갔는지 보는중"+elem);
//		return "test2";
//	}
//	@GetMapping("/")
//	public String test(Model model) throws IOException {
//		String WeatherURL = "https://portal.kfb.or.kr/fingoods/cofix.php";
//		Document doc = Jsoup.connect(WeatherURL).get();
//		//HTML로 부터 데이터 가져오기
//		Elements elem = doc.select("#Content > div.contentArea > div.cofix_new_2019_v2 > ul > li:nth-child(1)");
//		
//		for(Element li : elem) {
//			li.remove();
//		}
//		//원하는 태그 선택
//		String[] str = elem.text().split(" ");
//		//정보파싱
//		model.addAttribute("weather", elem);
//		
//		System.out.println("갔는지 보는중"+elem);
//		return "test";
//	}
}
