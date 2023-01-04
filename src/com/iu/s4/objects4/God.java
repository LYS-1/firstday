package com.iu.s4.objects4;

public class God {
	
	private static final String My_name = " ";
	private String name;
	private static God god;
	
	private God() {
		//this.name = "test";
	}
	
	public static God getInstance() {
		
		if( God.god == null ) {
			God.god = new God();
		}
		
		return God.god;
	}
	
	
	public final String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
