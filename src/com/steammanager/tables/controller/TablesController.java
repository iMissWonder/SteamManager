package com.steammanager.tables.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.steammanager.tables.pojo.Tables;
import com.steammanager.tables.service.TablesService;

// 告诉spring mvc这是一个控制器类
@Controller
public class TablesController {
	@Autowired
	TablesService tablesService;

	@RequestMapping("/tables")
	public ModelAndView listTables(){
		ModelAndView mav = new ModelAndView();
		List<Tables> tables = tablesService.list();
 
		// 放入转发参数
		mav.addObject("tables", tables);
		// 放入jsp路径
		mav.setViewName("tables");
		return mav;
	}

}
