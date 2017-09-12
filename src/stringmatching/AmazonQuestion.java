package stringmatching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
class Found{
	boolean found;
	
	public boolean isFound() {
		return found;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	int pos;
}
public class AmazonQuestion {
	
	public static Found compare(List<String> str1,List<String> str2){
		Found found = new Found();
		found.setFound(false);
		found.setPos(0);
		for(int i=0;i<str2.size();i++)
		{ int counter=i;
		int j=0;
			for( j=0;j<str1.size();j++)
				{if(str1.get(j).equals(str2.get(counter)) || str1.get(j).equals("anything")){
					counter++;
				}
				else
					break;
				}
			if(j==str1.size())
				{found.setFound(true);
				found.setPos(i);
				return found;
				}
			
		}
		
		return found;
	}
	
	public static int checkWinner(List<List<String>> offers,List<String> shoppingCart){
		Found found;
		int pos=0;
		int winner=0;
		
		for( List<String> str: offers)
		{
			 found=compare(str, shoppingCart);
			if(found.isFound() && found.getPos() > pos)
				{pos=found.getPos();
				winner=1;
				}
			else{
				winner =0;
				break;
			}
			
				
			
			
		}
		return winner;
	}
	
public static void main(String[] args) {
		
		
		
		List <String> offer1 = Arrays.asList("apple", "apple");
		List <String> offer2 = Arrays.asList("banana", "anything", "banana");

		List <List<String>> offers = Arrays.asList(offer1, offer2);
		
		List <String> shopingCart = Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana");
		List <String> shopingCart1 = Arrays.asList("banana","orange","banana","apple","apple");
		List <String> shopingCart2 = Arrays.asList("apple","banana","apple","banana","orange","bannana");
		
		System.out.println(checkWinner(offers, shopingCart));
		System.out.println(checkWinner(offers, shopingCart1));
		System.out.println(checkWinner(offers, shopingCart2));
	}

}
