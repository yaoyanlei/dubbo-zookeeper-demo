package com.man.provider.service;

import com.man.common.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by yaoyaolei on 2019/10/1 14:23
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

	private static final Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

	@Value("${dubbo.application.name}")
	private String serviceName;

	@Override
	public String sayHello(String name) {
		logger.info("----------> provider ---------->");
		return String.format("[%s] : Hello, %s", serviceName, name);
	}

}
