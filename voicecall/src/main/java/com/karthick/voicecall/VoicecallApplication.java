package com.karthick.voicecall;

import java.net.URI;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Call;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class VoicecallApplication implements ApplicationRunner {

	private final static String SID_ACCOUNT = "AC0500f4bb629f8e6e2cffaa7d2b7c938c";
	private final static String AUTH_ID = "22fe055aee3099ae39148295eab554c3";
	private final static String FROM_NUMBER="+918608035158";
	private final static String TO_NUMBER ="+918300939158";

	static {
		Twilio.init(SID_ACCOUNT, AUTH_ID);
	}

	public static void main(String[] args) {
		SpringApplication.run(VoicecallApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Call.creator(new PhoneNumber(TO_NUMBER), new PhoneNumber(FROM_NUMBER),
				new URI("http://demo.twilio.com/docs/voice.xml")).create();

	}
}
//mailkarthick1205@gmail.com
//8608035158 account in twilio