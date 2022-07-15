class Second{
    public static void main(String[] data){
        Champ first = new Champ(); 
        first.name = "Chelsea";
        first.year = 2015; 
        first.prize = 2000000;
        
        first.next = new Champ(); 
        first.next.name = "Mamchester City";
        first.next.year = 2016; 
        first.next.prize = 2500000;
        
        first.next.next = new Champ();
        first.next.next.name = "Liverpool";
        first.next.next.prize = 1800000;
        first.next.next.year = 2017;
        
        for(Champ c = first; c != null; c = c.next){
            System.out.println( c.name + " " + c.prize );
        }
              
    }
    
}
class Champ{
    String name;
    int year;
    double prize;
    Champ next;
}

//class Second{
//    public static void main(String[] data){
//        Station first = new Station();
//        first.name = "Bang Sue"; first.area = 50000;
//        Station second = new Station();
//        second.name = "Bang Plad";
//        
//        first.next = second;    // link
//        
//        Station w = new Station();
//        w.name = "Pin Klao";
//        second.next = w;
//        
//        Station current = first;
//        System.out.println( current.name );
//        System.out.println( current.next.name );
//        System.out.println( current.next.next.name );
//        System.out.println( current.next.next.next );   // null
//        
//        while(current != null){
//            System.out.println( current.name );
//            current = current.next;
//        }
//        
//        for(Station c = first; c != null; c = c.next){
//            System.out.println(c.name);
//        }
//    }
//    
//}
//
//class Station {
//    String name;    // default value of String is null
//    double area;    // default value of double is 0.0
//    Station next;
//}