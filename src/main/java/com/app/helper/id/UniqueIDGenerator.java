package com.app.helper.id;

import java.util.Random;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UniqueIDGenerator implements IDGenerator {
	@NonNull
	private Integer length;
	@NonNull
	private Sequence sequence;
	private static final Random random = new Random();

	@Override
	public String generateID() {
		StringBuilder builder = new StringBuilder(length);
		for (int i = 0; i < builder.capacity(); i++) {
			String sequenceString = this.sequence.getSequence();
			int next = random.nextInt(sequenceString.length());
			builder.append(sequenceString.charAt(next));
		}
		return builder.toString();
	}
}
