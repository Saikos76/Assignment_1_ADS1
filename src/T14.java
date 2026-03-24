public class T14 {
    static boolean f(int[] a, int i, int t){
        if(i==a.length) return false;
        if(a[i]==t) return true;
        return f(a,i+1,t);
    }

    public static void main(String[] args){
        int[] a = {4,7,1,9,3};
        System.out.println(f(a,0,9) ? "Found" : "Not Found");
    }
}