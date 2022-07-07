class Start {
	public static void main(String[] data) {
		double[] score;
		score = new double[7];	// create an array for 7 slots
							// each slot is double, default value 0.0
							// new is address
		System.out.println(score);	// 0x1234567
		double average = 0;
		score[0] = 8.5;
		score[1] = 8.2;
		score[2] = 8.6;
		score[3] = 8.5;
		score[4] = 8.7;
		score[5] = 8.3;
		score[6] = 8.5;
		int i = 0;
		while ( i < score.length) {
			average = average + ( score[i] /  score.length );
			//System.out.println( average );
			i++;
		}
	System.out.println( average );
	}
}
