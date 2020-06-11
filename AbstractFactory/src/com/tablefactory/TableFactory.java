package com.tablefactory;

import com.factory.Factory;
import com.factory.Link;
import com.factory.Page;
import com.factory.Tray;

public class TableFactory extends Factory {
	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption,url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title,author);
	}
}
