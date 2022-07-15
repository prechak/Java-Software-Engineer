
class Second{
    public static void main(String[] data){
        Station s;
        s = new Station();
        
        Station t = new Station();
        
        System.out.println(s);
        System.out.println(t);
    }
    
}

class Station {
    String name;    // default value of String is null
    double area;    // default value of double is 0.0
}