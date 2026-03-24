public class T15 {
    static boolean f(int[] a, int i){
        if(i==a.length-1) return true;
        if(a[i] > a[i+1]) return false;
        return f(a,i+1);
    }

    public static void main(String[] args){
        int[] a = {1,2,4,7,9};
        System.out.println(f(a,0) ? "Sorted" : "Not sorted");
    }
}