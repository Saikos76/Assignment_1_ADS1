public class T12 {
    static int f(int[] a, int i){
        if(i==a.length-1) return a[i];
        int m = f(a, i+1);
        return a[i] > m ? a[i] : m;
    }

    public static void main(String[] args){
        int[] a = {4,9,1,7,3};
        System.out.println(f(a,0));
    }
}