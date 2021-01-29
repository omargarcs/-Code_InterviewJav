import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciseOutPutFormating {

    static final int TEXT_LENGHT = 15;
    static final int NUMBER_LENGHT = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <String> readLines = new ArrayList<>();
        StringBuilder strB1 = new StringBuilder();
        StringBuilder strB2 = new StringBuilder();
        StringBuilder strB3 = new StringBuilder();

        int spaces = 0;
        int zeros = 0;

        for (int x = 0; x<3; x++){
            readLines.add(scan.nextLine());
        }

        String [] line1 = readLines.get(0).split(" ");
        String [] line2 = readLines.get(1).split(" ");
        String [] line3 = readLines.get(2).split(" ");

        //LINE 1

        spaces = TEXT_LENGHT - line1[0].length();
        zeros = NUMBER_LENGHT - line1[1].length();

        strB1.append(line1[0]);

        for (int s = 0; s<spaces; s++){
            strB1.append(" ");
        }

        for (int z = 0; z<zeros; z++){
            strB1.append("0");
        }

        strB1.append(line1[1]);

        //LINE 2

        spaces = TEXT_LENGHT - line2[0].length();
        zeros = NUMBER_LENGHT - line2[1].length();

        strB2.append(line2[0]);

        for (int s = 0; s<spaces; s++){
            strB2.append(" ");
        }

        for (int z = 0; z<zeros; z++){
            strB2.append("0");
        }

        strB2.append(line2[1]);

        //LINE 3

        spaces = TEXT_LENGHT - line3[0].length();
        zeros = NUMBER_LENGHT - line3[1].length();

        strB3.append(line3[0]);

        for (int s = 0; s<spaces; s++){
            strB3.append(" ");
        }

        for (int z = 0; z<zeros; z++){
            strB3.append("0");
        }

        strB3.append(line3[1]);

        System.out.println("================================");
        System.out.println(strB1);
        System.out.println(strB2);
        System.out.println(strB3);
        System.out.println("================================");
    }
}
