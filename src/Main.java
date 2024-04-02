import java.lang.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.nextLine();

        int days = 1;
        long[] time = new long[number];


        for(int i = 0; i < number; i++){
            String line = scanner.nextLine();
            String[] parts = line.split(":");

            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            int seconds = Integer.parseInt(parts[2]);
            time[i] = hours * 3600 + minutes * 60 + seconds;
        }

        if(number != 0){
            for(int i = 1; i < number; i++){
                if (time[i] <= time[i-1]){
                    days++;
                }
            }
        }
        else{
            days = 0;
        }

        System.out.print(days);
    }
}