package com.example.bank.controller;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String test(Model model) throws IOException {
		String WeatherURL = "https://weather.naver.com/today";
		Document doc = Jsoup.connect(WeatherURL).get();
		//HTML로 부터 데이터 가져오기
		Elements elem = doc.select(".weather_area .summary .weather");
		//원하는 태그 선택
		String[] str = elem.text().split(" ");
		//정보파싱
		model.addAttribute("weather",elem);
	
		System.out.println("갔는지 보는중"+elem);
		return "test";
	}
}
