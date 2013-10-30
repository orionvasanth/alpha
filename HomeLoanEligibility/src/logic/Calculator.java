package logic;


public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double principal = 3500000d;
		double annual_roi = 11d;
		double monthly_roi = annual_roi / 12 / 100;
		int years = 15;
		
		System.out.println("EMI per month: " + emi(principal, monthly_roi, years * 12));

	}
	
	public static double emi(double principal, double monthly_roi, int months){
		double part = Math.pow((1 + monthly_roi), months);
		double emi = principal * monthly_roi * part / (part - 1);
		return emi;
	}

}
