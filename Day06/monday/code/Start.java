import java.util.*;

class Start{
    public static void main(String[] z){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Binary String: ");
        String line = in.nextLine();
        char[] a = line.toCharArray();
        int i = 0;
        int count = 0;
        do {
            System.out.println(a[i]);
            i++;
        } while(i < a.length);
        
    }
}
