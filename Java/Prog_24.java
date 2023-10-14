public class Prog_24 {
    public static void main(String args[]){
        int a , b;
        a = 10; b = 20;
        a = b - a;
        System.out.println(a); // 10
        b = b + a;
        System.out.println(b); // 30
        a = b - a;
        System.out.println(a); // 20
    }
}
