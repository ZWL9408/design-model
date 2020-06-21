package com.composite;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("Making root entries");
			Directory rootdir = new Directory("root");
			Directory binddir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			rootdir.add(binddir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			binddir.add(new File("vi", 10000));
			binddir.add(new File("latex", 20000));
			rootdir.printList();

			System.out.println("");
			System.out.println("Making user entries...");
			Directory yuki = new Directory("yoki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			usrdir.add(yuki);
			usrdir.add(hanako);
			usrdir.add(tomura);
			yuki.add(new File("diary.html", 100));
			yuki.add(new File("Composite.java", 200));
			hanako.add(new File("memo.tex", 300));
			tomura.add(new File("game.doc", 400));
			tomura.add(new File("jnk.mail", 500));
			rootdir.printList();
		}catch (FileTreatmentException e){
			e.printStackTrace();
		}
	}
}