public class T10 {
    static boolean f(String s, int l, int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return f(s, l+1, r-1);
    }

    public static void main(String[] args){
        String s = "level";
        System.out.println(f(s,0,s.length()-1) ? "Palindrome" : "Not palindrome");
    }
}