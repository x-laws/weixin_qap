package org.weixinkaifa.qap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qap/message/receiver")
public class MessageReceiverController {
	
private static final Logger LOG = LoggerFactory.getLogger(MessageReceiverController.class);
	
	/*
	 * @Autowired private XmlMapper xmlMapper;
	 * 
	 * @Autowired private RedisTemplate<String, ? extends InMessage>
	 * inMessageTemplate;
	 */
	@GetMapping
	public String echo(//
			@RequestParam("signature") String signature, //
			@RequestParam("timestamp") String timestamp, //
			@RequestParam("nonce") String nonce, //
			@RequestParam("echostr") String echostr//
	) {
		return echostr;
	}
}
