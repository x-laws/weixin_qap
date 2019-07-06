package org.weixinkaifa.qap.dumain.text;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixinkaifa.qap.dumain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;


@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class TextInMessage extends InMessage {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Content")
	@JsonProperty("Content")
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
