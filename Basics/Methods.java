public class Methods {

    static  int Cal(int x , int y ){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x*y)+x;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = Cal(a, b);
        System.out.print(c);
        
    }
}
