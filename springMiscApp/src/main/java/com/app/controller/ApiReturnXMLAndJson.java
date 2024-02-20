package com.app.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.WReport;

@RestController
@RequestMapping("/weather")
public class ApiReturnXMLAndJson {
	
	//This can provide both json and xml response. When giving request to service from client(postmant), 
	//1- mention Accept header as application/xml
	//2- add jackson format dependency
	
	@GetMapping(path = "/report"/*
								  , produces = {MediaType.APPLICATION_JSON_VALUE,
								  MediaType.APPLICATION_XML_VALUE}
								 */)
	public List<WReport> getWeatherReport() {
		WReport we = new WReport("Mumbai", "33 C");
		WReport we1 = new WReport("Bangalore", "28 C");
		
		List<WReport> list = Stream.of(we, we1).collect(Collectors.toList());
		
		return list;
	}

}
