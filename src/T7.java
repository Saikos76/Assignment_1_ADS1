public class T7 {
    static int f(int n){
        if(n==0) return 0;
        return 1 + f(n/10);
    }

    public static void main(String[] args){
        System.out.println(f(5729));
    }
}