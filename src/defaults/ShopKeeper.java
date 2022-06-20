package defaults;

public class ShopKeeper {

	public static void main(String[] args) {
	
	
		
		ShopKeeper bdf = new ShopKeeper();
	int	newResult= bdf.calTotalPrice(10, 50);
	System.out.println(newResult);
		
	}
	public int calTotalPrice(int numTea, int numSam){
		
		int teaPrice =10;
		int samPrice =20;
		
		int finalprice = (teaPrice*numTea) + (samPrice*numSam);
		
		return finalprice;
		
	}
	
}
