
class Start{
    public static void main(String[] data){
        Engine e = new Engine();
        e.create("");
    }
}
// In volley ball, there are three result: W, D, L
// write code to print all possible results
// from 4 mathes.
class Engine {
    void create(String s){
        if(s.length() == 3){
            System.out.println(s);
            return;
        }
        create(s + "W");
        create(s + "D");
        create(s + "L");
    }
    void show(int N){
        if(N==0) return;
        show(N-1);
        System.out.println(N);
    }
}