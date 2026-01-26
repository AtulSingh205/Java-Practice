public class Varagas{
    static int sum(int x ,int y ){
        return x+y;
    }
    static int sum(int x ,int y ,int z){
        return x+y+z;
    }
    public static void main(String[] args) {
        System.out.println(sum( 2,3));
        System.out.println(sum( 2,3,5));
    }
}

// public class Varagas {

//     static int sum(int ...arr){
//         int result = 0;
//         for (int i : arr) {
//             result += i;
//         }
//         return result;

//     }
//     public static void main(String[] args) {
//         System.out.println(" A sum of 2 and 3 is "+sum(2,3));
//         System.out.println(" A sum of 2,3 and 5 is "+sum(2,3,5));
//     }
// }
