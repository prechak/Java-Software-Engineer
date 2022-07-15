
class Second{
    public static void main(String[] data){
        Station first = new Station();
        first.name = "Bang Sue"; first.area = 50000;
        Station second = new Station();
        second.name = "Bang Plad";
        
        first.next = second;    // link
        
        Station w = new Station();
        w.name = "Pin Klao";
        second.next = w;
        
        Station current = first;
        current.name = "Hello";
        
        System.out.println(first.name);
    }
    
}

class Station {
    String name;    // default value of String is null
    double area;    // default value of double is 0.0
    Station next;
}