package stringmatching;

import java.util.Arrays;
import java.util.List;

public class Fruit {
	
	
	private static int canStartMatching(List<List<String>> codeList, 
			List<String> shopingCart, int shopCnt, int offerCnt){
		boolean canStartMatching = false;
		offerCnt = 0;
		for (List<String> offer : codeList) {
				
			if(canStartMatching == true){
				break;
			}
			
			for (int i = shopCnt; i < shopingCart.size(); i++) {
				
				if (offer.size() > offerCnt) {

					if (shopingCart.get(i).equals(offer.get(0))) {
						canStartMatching = true;
						break;
					}
					shopCnt++;
					offerCnt++;
					
					if(shopingCart.size() == i -2){
						return 0;
					}
					
				} else {
					break;
				}
				
			}
		}
		return shopCnt;
	}
	
	public static int checkWinner(List<List<String>> codeList, List<String> shopingCart) {

		int shopCnt = 0;
		int offerCnt = 0;
		int indexOfOffer = 0;
		//List newList = null;
		for (List<String> offer : codeList) {
			
			shopCnt = canStartMatching(codeList, shopingCart, shopCnt, offerCnt);	
			
			offerCnt = 0;
			for (int i = shopCnt; i < shopingCart.size(); i++) {

				if (offer.size() > offerCnt) {

					if (!shopingCart.get(i).equals(offer.get(offerCnt))) {
						if (!offer.get(offerCnt).equals("anything")) {
							return 1;
						}
					}
					shopCnt++;
					offerCnt++;
				} else {
					break;
				}
			}
			codeList = codeList.subList(1, codeList.size());
		}

		return 0;
	}
	public static void main(String[] args) {
		
		
		
		List <String> offer1 = Arrays.asList("apple", "orange");
		List <String> offer2 = Arrays.asList("apple", "orange", "banana");

		List <List<String>> offers = Arrays.asList(offer1, offer2);
		
		List <String> shopingCart = Arrays.asList("orange", "apple", "orange", "tomato", "gobhi", "apple", "orange", "banana");
		
		System.out.println(checkWinner(offers, shopingCart));
	}

}
