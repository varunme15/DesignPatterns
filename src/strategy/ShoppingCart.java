package strategy;

import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList<Item> items; 
	
	public ShoppingCart(){
		items = new ArrayList<Item>();
	}

	public void addItem(Item item){
		items.add(item);
	}
	
	public void removeItem(Item removeItem){
		items.remove(removeItem);
	}
	
	public double Calculate(){
		double sum = 0;
		for(Item item:items){
			sum += item.price;
		}
		return sum;
	}
	
	public boolean pay(PaymentType payType){
		double amout = Calculate();
		if(payType.pay(amout)){
			return true;
		}
		return false;
	}
}
