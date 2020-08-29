package de.telran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("de.telran")
public class ApplicationConfig {

    @Bean
    public IntegerService getIntegerService() {
        System.out.println("Initializing integer service!");
        return new IntegerService();
    }

    @Bean
    public StringService getStringService() {
        System.out.println("Initializing string service!");
        return new StringService();
    }

    @Bean
    public Processor processor(StringService stringService, IntegerService integerService) {
        System.out.println("Initializing processor!");
        return new Processor(stringService, integerService);
    }

}
