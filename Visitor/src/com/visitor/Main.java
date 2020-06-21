package com.visitor;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Making root entries");
			Diretory rootdir = new Diretory("root");
			Diretory bindir = new Diretory("bin");
			Diretory tmpdir = new Diretory("tmp");
			Diretory usrdir = new Diretory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			rootdir.accept(new ListVisitor());

			System.out.println("");
			System.out.println("Making user entries...");
			Diretory yuki = new Diretory("yuki");
			Diretory hanako = new Diretory("hanako");
			Diretory tomura = new Diretory("tomura");
			usrdir.add(yuki);
			usrdir.add(hanako);
			usrdir.add(tomura);
			yuki.add(new File("diary.html",100));
			yuki.add(new File("Composite.java",200));
			hanako.add(new File("memo.tex",300));
			tomura.add(new File("game.doc",400));
			tomura.add(new File("junk.mail",500));
			rootdir.accept(new ListVisitor());
		}catch (FileTreatmentException e){
			e.printStackTrace();
		}
	}
}
