public class Main{
	public static void main(String[] args){
		
		int miles = 25, yards = 385;
		double kiloMeters;
		
		kiloMeters = (miles * 1.609) + (yards * (1.609 / 1760.0));
		
		System.out.println("Number of Kilometers : "+ kiloMeters);
	}
}
