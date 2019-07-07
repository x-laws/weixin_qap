package org.weixinkaifa.qap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@SpringBootApplication
public class weixinkaifaApplication {
	
	@Bean
	public XmlMapper xmlMapper() {
		XmlMapper mapper  = new XmlMapper();
		return mapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(weixinkaifaApplication.class, args);
		
	}

}
