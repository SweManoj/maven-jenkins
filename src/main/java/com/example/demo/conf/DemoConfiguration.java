package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:.//family.yml")
@ConfigurationProperties(prefix = "family")
public class DemoConfiguration {

	@Value("${manojKumar}")
	private String manojKumar;

	@Value("${sathaSivam}")
	private String sathaSivam;

	@Value("${anbu}")
	private String anbu;

	public String getManojKumar() {
		return manojKumar;
	}

	public void setManojKumar(String manojKumar) {
		this.manojKumar = manojKumar;
	}

	public String getSathaSivam() {
		return sathaSivam;
	}

	public void setSathaSivam(String sathaSivam) {
		this.sathaSivam = sathaSivam;
	}

	public String getAnbu() {
		return anbu;
	}

	public void setAnbu(String anbu) {
		this.anbu = anbu;
	}

}
