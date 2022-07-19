
class Start{
    public static void main(String[] data){
        Engine e = new Engine();
        e.create("");
    }
}

class Engine {
    void create(String s){
        if(s.length() == 3){
            System.out.println(s);
            return;
        }
        create(s + "0");
        create(s + "1");
    }
    void show(int N){
        if(N==0) return;
        show(N-1);
        System.out.println(N);
    }
}