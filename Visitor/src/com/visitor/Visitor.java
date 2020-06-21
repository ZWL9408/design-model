package com.visitor;

import java.io.File;

public abstract class Visitor {
	public abstract void visit(File file);
	public abstract void visit(Diretory diretory);

}
