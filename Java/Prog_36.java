public class Prog_36 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 7, 8, 9, 10, 5, 3 };
//        4, 6,
        for( int i = 1; i <= arr.length; i++ ){
            for( int j = 0; j < arr.length; j++){
                if(arr[j] == i){
//                    System.out.println(i);
                    break;
                }
                if(j == 9){
                    System.out.println("Missing data : " + i);
                }
            }
        }
    }
}