package com.man.consumer.ctrl;

import com.man.common.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaoyaolei on 2019/10/1 14:32
 */
@RestController
public class DemoCtrl {

	private static final Logger logger = LoggerFactory.getLogger(DemoCtrl.class);

	@Reference(version = "1.0.0")
	private DemoService demoService;

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		logger.info("----------> consumer ---------->");
		return demoService.sayHello(name);
	}

}
