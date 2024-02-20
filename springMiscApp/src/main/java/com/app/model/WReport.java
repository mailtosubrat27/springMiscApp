package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor

public class WReport {
	private String city;
	private String temp;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	@Override
	public String toString() {
		return "WReport [city=" + city + ", temp=" + temp + "]";
	}
	public WReport(String city, String temp) {
		super();
		this.city = city;
		this.temp = temp;
	}
}
