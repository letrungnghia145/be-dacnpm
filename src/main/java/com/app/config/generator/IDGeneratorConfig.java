package com.app.config.generator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.helper.id.IDGenerator;
import com.app.helper.id.Sequence;
import com.app.helper.id.UUIDGenerator;
import com.app.helper.id.UniqueIDGenerator;

@Configuration
public class IDGeneratorConfig {
	@Bean
	public IDGenerator getUUIDGenerator() {
		return new UUIDGenerator();
	}

	@Bean
	public IDGenerator getUserGenerator() {
		return new UniqueIDGenerator(9, Sequence.DIGIT_CHARACTERS);
	}

	@Bean
	public IDGenerator getPostGenerator() {
		return new UniqueIDGenerator(12, Sequence.ALL);
	}
}
