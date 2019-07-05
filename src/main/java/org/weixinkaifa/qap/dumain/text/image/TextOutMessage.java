package org.weixinkaifa.qap.dumain.text.image;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.weixinkaifa.qap.dumain.InMessage;

import com.fasterxml.jackson.annotation.JsonProperty;


@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class TextOutMessage extends InMessage {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "PicUrl")
	@JsonProperty("PicUrl")
	private String imageUrl;
	
	@XmlElement(name = "MediaId")
	@JsonProperty("MediaId")
	private String mediaId;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	} 

}
