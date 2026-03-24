public class T6 {
    static int f(int n){
        if(n==0) return 0;
        return n%10 + f(n/10);
    }

    public static void main(String[] args){
        System.out.println(f(572));
    }
}