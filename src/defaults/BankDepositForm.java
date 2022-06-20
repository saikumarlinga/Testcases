package defaults;

public class BankDepositForm {

	String bankName ="ICICI";
	String customerName = "sai";
	int accountNo =778899;
	int mobileNumber;
	double amount;
	public double calTotalAmount(double previousBalance ,double currentAmount){
		double currentBal = previousBalance + currentAmount;
		return currentBal;
	}
	public static void main(String[] args) {
		
		BankDepositForm bdf = new BankDepositForm();
		double Result = bdf.calTotalAmount(500,200);
		System.out.println( Result);
	}

}
