package com.how2java.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.CategoryMapper;
import com.how2java.mapper.SPJLMapper;
import com.how2java.pojo.Category;
import com.how2java.pojo.SPJL;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Autowired
	private SPJLMapper spjlMapper;
	
	@Test
	public void testAdd() {
		for (int i = 0; i < 13; i++) {
			Category category = new Category();
			category.setId(i);
			category.setName("新用户"+i);
			categoryMapper.add(category);
		}
	}
	
	/**
	 * @Description: TODO增加审批记录单
	 * 设定文件
	 * void 返回类型
	 */
	public void testAddSPJL() {		
		SPJL spjl = new SPJL();
		spjl.setLei_Xing("采伐");		
		spjl.setLin_Ye_Ju("方正");	
		spjl.setPi_Ci("2017/9");
		spjl.setPiZhun_WH("2017/9");
		spjl.setShen_He_Ren("张三");
		spjl.setShen_Pi_Dan("1");
		spjl.setShenHe_BGD("1");
		spjl.setShenQing_RQ("2017/9/30");
		spjl.setShenQing_WH("2017/9/30");
		spjl.setShou_Li_Ren("李四");
		spjl.setShouLi_RQ("2017/10/10");
		spjl.setShouLi_TZD("1");
		spjl.setSPJL_Id(123);
		spjl.setYaoJian_SHD("1");
		spjl.setZhuang_Tai("审核中");		
		spjlMapper.add(spjl);
		
	}
	

	@Test
	public void testList() {
		System.out.println(categoryMapper);
		List<Category> cs = categoryMapper.list();
		for (Category c : cs) {
			System.out.println(c.getName());
		}
	}

}
