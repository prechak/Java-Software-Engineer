import java.util.*;

class Start{
    public static void main(String[] data){
        
//        int c = "Latte".compareTo("Mocha");
//        System.out.println(c);
        
        Player[] list = { new Player("David", 7),
                          new Player("Micheal", 10),
                          new Player("Frank", 8),
                          new Player("John", 2)
                        };
        Arrays.sort(list);
        for(Player p : list){
            System.out.println(p.name);
        }
    }
}

class Player implements Comparable{
    String name;
    int number;
    
    Player(String name, int number){
        this.name = name;
        this.number = number;
    }
    
    @Override
    public int compareTo(Object o){
        Player p = (Player)o;
//        if (this.number < p.number) return -1;
//        if (this.number > p.number) return +1;
//        return 0;
          return this.name.compareTo(p.name);
    }
}






/*import java.util.*;

class Start{
    public static void main(String[] data){
        Team[] list = { new Team("Bangkok", 1, 5, 4),
                        new Team("Pattaya", 2, 7, 3),
                        new Team("Chiang Mai", 4, 3, 1)
                       };
        Competitor[] all = {   new Competitor("A", 3,5,4),
                                new Competitor("B", 4,6,8)
                            };
        Arrays.sort(all, (u,v) -> v.gold() - u.gold());
        
        for(Competitor c : all) System.out.println(c);
        
        
        
    }
}

record Competitor(String name, int gold, int silver, int bronze){}

class SportComparator implements Comparator{
    @Override
    public int compare(Object x, Object y){
        Team u = (Team)x;
        Team v = (Team)y;
        return u.gold - v.gold;
    }
}

class Team {
    Team(String name, int gold, int silver, int bronze){
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
    String name;
    int gold, silver, bronze;
    
    @Override
    public String toString(){
        return name;
    }
}

class Worker implements Runnable{
    @Override public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.print('W');
        }
    }
}


class Printer extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.print('P');
        }
    }
}*/