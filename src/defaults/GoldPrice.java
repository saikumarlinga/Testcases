package defaults;

public class GoldPrice {

	public static void main(String[] args) {
		
		GoldPrice lin = new GoldPrice();
		int finalResult= lin.totalGoldPrice(10, 50);
System.out.println(finalResult);
	}
	public int totalGoldPrice(int oldGold, int newGold){
		 int goldPrice = 1000;
		int finalPrice = (goldPrice*oldGold)+(goldPrice*newGold);
		return finalPrice;
	}
}
