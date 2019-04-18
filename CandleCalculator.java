public class CandleCalculator {

	public void calculateInput() {
	Kattio io = new Kattio(System.in);
		
		int ageDif = io.getInt();
		int RCandle = io.getInt();
		int TCandle = io.getInt();
		
		int totalCandel = RCandle + TCandle; 
		int countingInt = 0;
		int RCounting = 0;
		int RAge = 4;
		int TAge = 4 - ageDif;
		while (countingInt != totalCandel) {
			countingInt += RAge;
			RCounting += RAge;
			if(TAge >= 3) {
				countingInt += TAge;
				
			}
			RAge++;
			TAge++;
		}
		System.out.println(RCandle - RCounting);
		


	io.close();
	}
		
	


//Given the difference between the ages of Rita and Theo, the number of candles in Rita’s box, 
//and the number of candles in Theo’s box, find out how many candles Rita needs to remove from her 
//box such that it contains the right number of candles.
	
	
}
