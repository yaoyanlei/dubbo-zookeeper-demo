package com.man.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProviderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderDemoApplication.class, args);

//		①：启动zookeeper服务，②：也可单独安装并启动zookeeper，注意安装的版本与引入版本
//		new SpringApplicationBuilder(ProviderDemoApplication.class)
//				.listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
//					Environment environment = event.getEnvironment();
//					int port = environment.getProperty("embedded.zookeeper.port", int.class);
//					new EmbeddedZooKeeper(port, false).start();
//				})
//				.run(args);
	}

}
