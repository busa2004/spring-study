package com.douzone.mysite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.config.web.FileUploadConfig;
import com.douzone.config.web.MVCConfig;
import com.douzone.config.web.MessagesConfig;
import com.douzone.config.web.Securityconfig;

@Configuration
@ComponentScan(value= {"com.douzone.mysite.controller","com.douzone.mysite.exception","com.douzone.mysite.aspect"})
@Import(value= {Securityconfig.class , MVCConfig.class, MessagesConfig.class,FileUploadConfig.class})
public class WebConfig {

}
