package org.weixinkaifa.qap.dumain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;






@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class InMessage implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "ToUserName")
	@JsonProperty("ToUserName")
	private String toUserName;

	@XmlElement(name = "FromUserName")
	@JsonProperty("FromUserName")
	private String fromUserName;

	@XmlElement(name = "CreateTime")
	@JsonProperty("CreateTime")
	private long createTime;

	@XmlElement(name = "MsgType")
	@JsonProperty("MsgType")
	private String msgType;

	@XmlElement(name = "MsgId")
	@JsonProperty("MsgId")
	private Long msgId;

}
