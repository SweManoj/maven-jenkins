package com.example.demo.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.example.demo.conf.DemoConfiguration;

@Component
public class DemoSchedular {

	@Autowired
	private DemoConfiguration conf;

	// private static final long[] fixedRate = { 1 };

	// @Scheduled(fixedRate = {fixedRate[1][1]})
	// @Scheduled(cron = "*/5 * * * * *")
	
	@Scheduled(cron = "${cronSchedule}")
	public void demoSchedular() {
		System.out.println("this is schedular...." + new Date()+"..."+conf.getAnbu()+".."+conf.getSathaSivam());
	}

}
