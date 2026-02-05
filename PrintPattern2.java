import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = 0;

        do {
            System.out.print("Enter the size:");

            size = in.nextInt();
            in.nextLine();

            if (size < 1){
                System.out.println("too small!");
            }

            if (size > 5){
                System.out.println("too big!");
            }
    }   while (size < 1 || size > 5 );
        
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print(col + row -1);
                }
                System.out.println();
        } 
}
}