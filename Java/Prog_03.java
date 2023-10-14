//Valid Triangle Or Not
public class Prog_03 {
 public static void main(String[] args){
     int a = 5, b = 5;
     int c = 10;
     if( a + b > c){
         System.out.println(c + " 'Valid");
     } else if (b + c > a) {
         System.out.println(c + " 'Triangle not valid'");
     }
     else if( c + a > b){
         System.out.println(c + " 'Triangle valid or not'");
     }
     else{
         System.out.println("Zero");
     }
 }
}