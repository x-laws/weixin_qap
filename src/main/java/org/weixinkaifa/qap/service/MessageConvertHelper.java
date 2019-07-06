package org.weixinkaifa.qap.service;

import java.io.StringReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.bind.JAXB;

import org.weixinkaifa.qap.dumain.InMessage;
import org.weixinkaifa.qap.dumain.text.TextInMessage;

public class MessageConvertHelper {

	private static final Map<String, Class<? extends InMessage>> typeMap = new ConcurrentHashMap<>();

	static {
		typeMap.put("text", TextInMessage.class);
		typeMap.put("image", InMessage.class);
		
		typeMap.put("vioce", TextInMessage.class);
		typeMap.put("video", TextInMessage.class);
		typeMap.put("location", TextInMessage.class);
		typeMap.put("event", TextInMessage.class);
		typeMap.put("link", TextInMessage.class);
		typeMap.put("shortvideo", TextInMessage.class);
		
	}
	
	public static <T extends InMessage> T convert(String xml) {
		
		
		// 获取类型
				String type = xml.substring(xml.indexOf("<MsgType><![CDATA[") + 18);
				type = type.substring(0, type.indexOf("]"));

				Class<? extends InMessage> c = typeMap.get(type);
				
				
				@SuppressWarnings("unchecked")
				T msg = (T) JAXB.unmarshal(new StringReader(xml), c);
				return msg;
	}

 
}
