public class T13 {
    static int f(int[] a, int i, int t){
        if(i==a.length) return 0;
        return (a[i]==t ? 1 : 0) + f(a,i+1,t);
    }

    public static void main(String[] args){
        int[] a = {1,2,3,2,2,5};
        System.out.println(f(a,0,2));
    }
}