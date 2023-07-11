package com.codeusingjava.InfoManager;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@RefreshScope
@EnableDiscoveryClient
public class InfoManagerApplication {

	///@Autowired
	///@Lazy
	///private RestTemplate template;

	///@Value("${infoByAuthorities.infourl}")
	///private String geturl;

	///@GetMapping("/getcatagories")
	///public List<String> getCatagories() {
	///	List<String> catagory = template.getForObject(geturl, List.class);
	///	return catagory;
	///}

	public static void main(String[] args) {
		SpringApplication.run(InfoManagerApplication.class, args);
	}

	///@Bean
	///public RestTemplate template() {
	///	return new RestTemplate();
	///}

}
