
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// #2
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		
		// #3
		double costOfMilk = 3.99;
		double moneyInWallet =10;
		int thirstLevel = 3;
		
		// #4
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= 2*costOfMilk;
		
	}

}
