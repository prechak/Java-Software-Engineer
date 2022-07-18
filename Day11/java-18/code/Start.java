
class Start{
    public static void main(String[] z){
        int[] a = { 8, 6, 5, 3, 7, 5, 4, 1 };
        int start = 2;
        int finish = 6;
        int left = start;
        int right = finish;
        while(left < right){
            int y = a[left];
            int x = a[right];
            a[right] = y;
            a[left] = x;
            left++;
            right--;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}