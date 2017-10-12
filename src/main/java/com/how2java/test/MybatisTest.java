package com.how2java.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void testAdd() {
		for (int i = 0; i < 13; i++) {
			Category category = new Category();
			category.setId(i);
			category.setName("新用户"+i);
			categoryMapper.add(category);
		}
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
