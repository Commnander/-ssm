package com.itheima.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date> {
	
	private String datePattern="yyyy-MM-dd HH:mm:ss";
	//自定义日期转换器:字符串日期转换为Date类型
	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat(datePattern);
		try {
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException("无效的日期格式，请使用："+datePattern);
		}
	}

}
