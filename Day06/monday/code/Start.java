import java.util.*; // java.util.Scanner input = new java.util.Scanner(System.in);

class Start{
    public static void main(String[] z){
        Vote[] d = new Vote[3];
        d[0] = new Vote("Democrat", 82);
        d[1] = new Vote("Labor", 85);
        d[2] = new Vote("Liberty", 83);
        int total = 0;
        for(int i = 0; i < d.length; i++)
            total = total + d[i].point;            // ได้คะแนนรวมมาแล้ว
        for(int i = 0; i < d.length; i++){
            double percent = (double)d[i].point / total * 100 ;
        
        System.out.printf("%s %.2f\n", d[i].party, percent);
        }
    }
}

class Vote{
    String party;
    int point;
    Vote(String p, int s){
        party = p;
        point = s;
        
    }
}