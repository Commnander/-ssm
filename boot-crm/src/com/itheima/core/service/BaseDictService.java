package com.itheima.core.service;

import java.util.List;

import com.itheima.core.po.BaseDict;

//数据字典service接口
public interface BaseDictService {
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
}
