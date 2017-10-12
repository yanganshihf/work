package com.how2java.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.pojo.SPJL;
import com.how2java.service.CategoryService;
import com.how2java.service.SPJLService;
import com.how2java.util.Page;

/**
 * 
 * 审批流程控制器
 *
 * @author 杨岸石 17749262827
 * @version 1.0, 2017年10月12日 上午11:36:53
 */
@Controller
@RequestMapping("")
public class SPJLController {
	@Autowired
	SPJLService spjlService;

	@RequestMapping("listSPJL")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
		List<SPJL> cs= spjlService.list();	
		// 获取总数
		int total = (int) new PageInfo<>(cs).getTotal();
		page.caculateLast(total);
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

}
