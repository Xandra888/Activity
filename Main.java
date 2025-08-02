public class Main{
    public static void main (String[]args){
        
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


        for (int i = 0; i <names.length; i++) {
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
       
        
    }
}