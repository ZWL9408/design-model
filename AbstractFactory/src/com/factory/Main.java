package com.factory;

public class Main {
	public static void main(String[] args) {
		if (args.length != 1){
			System.out.println("Ussage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example1: java Main listfactory.ListFactory");
			System.out.println("Example2: java Main tablefactory.TableFactory");
			System.exit(0);
		}
		Factory factory = Factory.getFactory(args[0]);
		Link people = factory.createLink("china daily","www.people.com.cn");
		Link  gmw = factory.createLink("sunshine daily","www.gmw.cn");

		Link us_yahoo = factory.createLink("Yahoo!","www.yahoo.com");
		Link jp_yahoo = factory.createLink("Yahoo!Japan","www.yahoo.co.jp");
		Link excite = factory.createLink("Excite","www.excite.com");
		Link google = factory.createLink("Google","www.goolge.com");

		Tray traynews = factory.createTray("B");
		traynews.add(people);
		traynews.add(gmw);

		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);

		Tray traysearch = factory.createTray("search engine");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);

		Page page = factory.createPage("LinkPage", "zhaoweile");
		page.add(traynews);
		page.add(traysearch);
		page.output();

	}
}
