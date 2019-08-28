package com.itheima.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date> {
	
	private String datePattern="yyyy-MM-dd HH:mm:ss";
	//�Զ�������ת����:�ַ�������ת��ΪDate����
	@Override
	public Date convert(String source) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat simpleDateFormat= new SimpleDateFormat(datePattern);
		try {
			return simpleDateFormat.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException("��Ч�����ڸ�ʽ����ʹ�ã�"+datePattern);
		}
	}

}
