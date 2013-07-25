package com.zhaiyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	
	/*
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 1、收集参数、验证参数
		// 2、绑定参数到命令对象
		// 3、将命令对象传入业务对象进行业务处理
		// 4、选择下一个页面
		ModelAndView mv = new ModelAndView();
		// 添加模型数据 可以是任意的POJO对象
		mv.addObject("message", "Hello World!你好，世界！");
		// 设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mv.setViewName("hello");
		return mv;
	}
	*/
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("hello", "message", "你好吗，世界？");
	}
	
	@RequestMapping("/fuck")
	public ModelAndView sayFuck(String message) {
		return new ModelAndView("hello", "message", message);
	}

}