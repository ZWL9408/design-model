package com.factory;

import sun.java2d.StateTrackable;

public abstract class Factory {
	public static Factory getFactory(String classname){
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		}catch (ClassNotFoundException e){
			System.err.println("can't not find " + classname + " class");
		}catch (Exception e){
			e.printStackTrace();
		}
		return factory;
	}
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
