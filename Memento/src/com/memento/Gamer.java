package com.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
	private int money;
	private List fruits = new ArrayList();
	private Random random = new Random();
	private static String[] fruitsname = {
			"apple", "grape", "banana", "orange"
	};

	public Gamer(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	public void bet(){
		int dice = random.nextInt(6)+1;
		if (dice == 1 ){
			money += 100;
			System.out.println("Increase in money held.");
		}else if (dice == 2 ){
			money /= 2;
			System.out.println("Decrease in money held");
		}else if (dice == 6 ){
			String f = getFruit();
			System.out.println("");
		}
	}
	public Memento createMemento(){
		Memento m = new Memento(money);
		Iterator it = fruits.iterator();
		while (it.hasNext()){
			String f = (String)it.next();
			if (f.startsWith("good-eating")){
				m.addFruit(f);
			}
		}
		return  m;
	}
	public void restoreMemento(Memento memento){
		this.money = money;
		this.fruits = memento.getFruits();
	}

	@Override
	public String toString() {
		return "[money=" + money + ", fruits=" + fruits + "]";
	}
	private String getFruit(){
		String prefix = "";
		if (random.nextBoolean()){
			prefix = "good-eating";
		}
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}
}
