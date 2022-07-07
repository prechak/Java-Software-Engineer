class C {
	public static void main(String[] data){
		if(data.length == 0){
			System.out.println("The maximum value is not found.");
		}
		if(data.length > 0){
			double m = Double.valueOf(data[0]);
			int i = 0;
			while( i < data.length) {
				try{
				double z = Double.valueOf(data[i]);
				if ( z > m ) {
					m = z;
				}
			} catch (Exception e){
				System.out.println("Invalid number " + data[i]);
				System.out.println(e);
			}
			i++;
		}
		System.out.println("The maximum value is " + m);
		}
	}
}
