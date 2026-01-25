public class Overloading {
       static void change(int[] brr ){
        brr[0] = 8;
       }
       static void  change(){
         System.out.println("you want to changs  the number! ");
       }
    public static void main(String[] args) {
       int [] arr = {3,4,5,6,7};
         change(arr);
       System.out.println(arr[0]);

    }

}
