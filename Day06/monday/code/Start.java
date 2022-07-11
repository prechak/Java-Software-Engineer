import java.util.*;

class Start{
    public static void main(String[] z){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Binary String: ");
        String line = in.nextLine();
        line = line + '1';
        char[] a = line.toCharArray();
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == '0'){        //  เจอ 0 ก็นับต่อไป
                count++;
            }
            if(a[i] == '1'){        // เจอ 1 reset
                System.out.println(count);
                count = 0;          // เจอ 1 แล้ว reset
            }
        }
        //System.out.println(count);  // print last block
        
    }
}   // 00010010000 + 1 add Sentinel > 00010010000
    //    3  2    > last block not print should be 4
