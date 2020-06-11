package com;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	public void construct(){
		builder.makeString("Greeting");;
		builder.makeString("from morning to afternoon");
		builder.makeItems(new String[]{
				"good morning",
				"goodd afternoon",
		});
		builder.makeString("evening");
		builder.makeItems(new String[]{
				"good evening",
				"good night",
				"bye",
		});
		builder.close();
	}
}
