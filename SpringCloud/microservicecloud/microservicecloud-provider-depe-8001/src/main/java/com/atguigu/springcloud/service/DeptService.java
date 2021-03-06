package com.atguigu.springcloud.service;

import java.util.List;

import com.atguigu.springcloud.entities.Dept;

/**
 * 
 * @author June
 * @date 2020/10/13
 * @version V1.0
 */
public interface DeptService {
	
	public boolean addDept(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
