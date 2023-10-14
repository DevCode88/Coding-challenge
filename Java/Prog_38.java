import java.util.ArrayList;

public class Prog_38 {
    public static void main(String[] args) {
        StringBuilder  a = new StringBuilder();
        a.append("Hello");
        a.append(" / ");
        a.append("Ravi Suthar");
        String b = a.toString();
        System.out.println(a);
//
        ArrayList<Integer>  ravi = new ArrayList<>();
        ravi.add(30);
        ravi.add(30);
        int c = ravi.get(0) + ravi.get(1);
        System.out.println(c);
        System.out.println(ravi);
        ravi.remove(0);
        ravi.add(12);
        System.out.println(ravi);



        ArrayList<Double> nav = new ArrayList<Double>();
        nav.add(12.44);
        nav.add(3.14);
        System.out.println(nav);
    }
}
