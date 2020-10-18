package com.atguigu.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.atguigu.springcloud.entities.Dept;

/**
 * 
 * @author June
 * @date 2020/10/13
 * @version V1.0
 */
@Mapper
public interface DeptDao {
	
	  public boolean addDept(Dept dept);
	  
	  public Dept findById(Long id);
	 
	  public List<Dept> findAll();
	
}
