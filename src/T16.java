public class T16 {
    static int f(int[] a, int l, int r, int t){
        if(l>r) return -1;
        int m = (l+r)/2;
        if(a[m]==t) return m;
        if(t < a[m]) return f(a,l,m-1,t);
        return f(a,m+1,r,t);
    }

    public static void main(String[] args){
        int[] a = {1,3,5,7,9,11};
        System.out.println(f(a,0,a.length-1,7));
    }
}