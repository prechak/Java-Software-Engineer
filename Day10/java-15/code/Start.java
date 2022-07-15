import java.util.Scanner;

class Start{
    
        public static void main(String[] data){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Path: ");
            String path = input.nextLine();
            Robot robot = new Robot();
            int distance = robot.findManhattonDistance(path);
            System.out.println(distance);
        }
}

class Cashier{
    
}

class Robot{
    int findManhattonDistance(String path){
        char[] a = path.toCharArray();
        int x = 0; int y = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 'N') y++;
            if(a[i] == 'S') y--;
            if(a[i] == 'E') x++;
            if(a[i] == 'W') x--;
        } //how to handle error, K
        if(x < 0) x = -x;
        if(y < 0) y = -y;
        return x + y;
    }
    double findEuclideanDistance(String path){
        return 0.0;
    }
}

/*
There is a robot that can move one meter in any of four directions:
N, E, S, W for North, East, South, West respectively. Given an
instruction for the robot as a string, write a method to check whether
the robot stop at the starting point or not.

*/