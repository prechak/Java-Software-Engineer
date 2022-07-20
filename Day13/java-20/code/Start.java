class Start{
    public static void main(String[] data){
        Printer p = new Printer();
        p.start();  //start() will initialize CPU
                    // and call run() for you
        for(int i = 0; i < 1000; i++){
            System.out.print('A');
        }
    }
}

class Printer extends Thread {
    
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.print('P');
        }
    }
}