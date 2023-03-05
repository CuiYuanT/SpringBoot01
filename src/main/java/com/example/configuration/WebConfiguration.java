package com.example.configuration;


import com.example.filter.MyFilter_01;
import com.example.view.MyServlet_01;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean myServlet_01 = new ServletRegistrationBean(new MyServlet_01(), "/MyServlet_01");
        return myServlet_01;
    }

    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean myFilter_01 = new FilterRegistrationBean();
        myFilter_01.setFilter(new MyFilter_01());



        return myFilter_01;

    }
}
