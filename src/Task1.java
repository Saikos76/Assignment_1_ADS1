public class Task1 {
    static void f(int n){
        if(n==0) return;
        f(n-1);
        System.out.print(n + ".");
    }

    public static void main(String[] args){
        f(5);
    }
}