public class T8 {
    static int f(int n, int rev){
        if(n==0) return rev;
        return f(n/10, rev*10 + n%10);
    }

    public static void main(String[] args){
        System.out.println(f(1234,0));
    }
}