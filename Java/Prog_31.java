import java.util.Random;

public class Prog_31 {

    private static final int[] room = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] govt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] colleget = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Random random = new Random();

        int room1 = random.nextInt(room.length);
        int room2 = random.nextInt(room.length);

        int govt1 = govt[room1];
        int govt2 = govt[room2];
        int collegety1 = colleget[0];

        System.out.println("The two rooms are " + room[room1] + " and " + room[room2]);
        System.out.println("The corresponding government numbers are " + govt1 + " and " + govt2);
        System.out.println("The corresponding collegety number is " + collegety1);
        for(int i = 0; i <= room.length; i++){
            if(i == colleget.length){
                for(int j = 0; j <= room.length; j++){
                    System.out.println(i);
                }
            }
        }
    }
}