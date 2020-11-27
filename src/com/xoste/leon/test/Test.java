package com.xoste.leon.test;

import com.xoste.leon.pojo.Airport;
import com.xoste.leon.service.impl.AirportServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author leon
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext  默认去classes文件夹根目录开始寻找
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("-----------------------------------------");
        AirportServiceImpl airportService = classPathXmlApplicationContext.getBean("airportService", AirportServiceImpl.class);
        List<Airport> airportList = airportService.show();
        System.out.println(airportList.toString());
    }
}
