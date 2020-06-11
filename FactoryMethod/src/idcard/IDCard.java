package idcard;

import framework.Product;

public class IDCard extends Product {
	private String owner;
	IDCard (String owner){
		System.out.println("making" + owner + "card");
		this.owner = owner;
	}
	@Override
	public void use() {
		System.out.println("using" + owner + "card");
	}
	public String getOwner(){
		return owner;
	}
}
