package com.itheima.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;


//使用formatter自定义日期转换器
public class DateFormatter implements Formatter<Date> {
	
	private String datePattern="yyyy-MM-dd HH:mm:ss";
	
	@Override
	public String print(Date date, Locale locale) {
		// TODO Auto-generated method stub
		return new SimpleDateFormat().format(date);
	}

	@Override
	public Date parse(String source, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat(datePattern);
		return simpleDateFormat.parse(source);
	}

}
