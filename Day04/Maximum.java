class Start{
	public static void main(String[] z){
	double[] data = { 8.5, 7.3, 9.1, 8.7 };
	//double[] data = 0;
	//if(data.length > 0){
	double best = data[0];	
		for(int i = 0; i < data.length; i++){
			if(data[i] > best){
				best = data[i];
			}
	
		}
	//}
	if(data.length == 0){
		System.out.println("The Maximum value is not found.");
	}
	System.out.println(best);
	
	}
}
