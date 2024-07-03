package com.xisthebest.blogservice.runner;//package com.xisthebest.runner;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceRunner implements CommandLineRunner {


    @NacosValue(value = "${qqname}", autoRefreshed = true)
    private String qqname;

    @Override
    public void run(String... args) throws Exception {

        while (true) {

            System.out.println("blog runner qqname:" + qqname);

            Thread.sleep(1000);

        }
    }
}
