import java.util.*;

class Start{
    public static void main(String[] data){
        Team[] list = { new Team("Bangkok", 1, 5, 4),
                        new Team("Pattaya", 2, 7, 3),
                        new Team("Chiang Mai", 4, 3, 1)
                       };
        //Arrays.sort(list, new SportComparator());
        Arrays.sort(list, (p,q) -> p.gold - q.gold);
        for (Team t : list) System.out.println(t);
        
    }
}

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
}