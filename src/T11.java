public class T11 {
    static int f(int[] a, int i){
        if(i==a.length) return 0;
        return a[i] + f(a, i+1);
    }

    public static void main(String[] args){
        int[] a = {3,5,2,7};
        System.out.println(f(a,0));
    }
}