class Start{
    public static void main(String[] data){
        Printer p = new Printer();
        p.start();  //start() will initialize CPU
                    // and call run() for you
        Worker w = new Worker();
        Thread t = new Thread(w);
        t.start();
        for(int i = 0; i < 1000; i++){
            System.out.print('A');
        }
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