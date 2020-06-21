package com.memento;

public class Main {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);
		Memento memento = gamer.createMemento();
		for (int i = 0; i < 100; i++) {
			System.out.println("==== "+i);
			System.out.println("current state:"+gamer);
			gamer.bet();

			System.out.println("you has "+ gamer.getMoney()+".");
			if (gamer.getMoney()>memento.getMoney()){
				System.out.println("The money held has increased a lot, so save the current state of the game.");
				memento = gamer.createMemento();
			}else if (gamer.getMoney()<memento.getMoney()/2){
				System.out.println("The money held has decreased a lot, so recovery the former state of the game");
				gamer.restoreMemento(memento);
			}
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e){

			}
			System.out.println("");
		}
	}
}
