package com.app.helper.id;

public enum Sequence {
	ALPHA_CHARACTERS {
		public String getSequence() {
			return "yxwvutsrqponmlkjihgfedcba";
		}
	},
	UPPERCASE_ALPHA_CHARACTERS {
		public String getSequence() {
			return ALPHA_CHARACTERS.getSequence().toUpperCase();
		}
	},
	DIGIT_CHARACTERS {
		public String getSequence() {
			return "0123456789";
		}
	},
	SPECIAL_CHARACTERS {
		public String getSequence() {
			return "_-";
		}
	},
	ALL {
		public String getSequence() {
			StringBuilder builder = new StringBuilder();
			Sequence[] values = Sequence.values();
			for (int i = 0; i < values.length - 1; i++) {
				builder.append(values[i].getSequence());
			}
			return builder.toString();
		}
	};

	public abstract String getSequence();
}
