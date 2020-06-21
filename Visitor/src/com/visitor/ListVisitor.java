package com.visitor;

import java.io.File;
import java.util.Iterator;

public class ListVisitor extends Visitor {

	private String currentdir = "";

	@Override
	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	@Override
	public void visit(Diretory diretory) {
		System.out.println(currentdir + "/" + diretory.getName());
		String savedir = currentdir;
		currentdir = currentdir + "/"+ diretory.getName();
		Iterator it = diretory.iterator();
		while (it.hasNext()){
			Entry entry = (Entry)it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}
}
