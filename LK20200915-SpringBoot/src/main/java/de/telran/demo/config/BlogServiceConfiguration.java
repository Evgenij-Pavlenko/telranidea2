package de.telran.demo.config;

import de.telran.demo.BlogService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.management.MXBean;

@Configuration
public class BlogServiceConfiguration {

    @Bean
    public BlogService createBlogService;

}
