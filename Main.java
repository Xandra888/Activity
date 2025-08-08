import java.util.Random;

public class Main{
    public static void main (String[]args){
        Random random = new Random();

        String[] names = new String[10];
        
        names[0] = ("Tyrone");
        names[1] = ("Casey");
        names[2] = ("Xander");
        names[3] = ("Michael");
        names[4] = ("Edely");
        names[4] = ("Shannah");
        names[5] = ("Cielo");
        names[6] = ("Justine");
        names[7] = ("Angel");
        names[8] = ("JJ");
        names[9] = ("Violeta");


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        System.out.println("");


        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        int sum = 0;

            for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
       
        System.out.println("");

        int rows = 4;
        int cols = 3;

        int[][] array2D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = random.nextInt(100);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
        

        
    }
}