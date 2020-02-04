package pl.sda.MR.zadDom;

import java.util.Arrays;

public class RoboticTattooRemoval {
    public static void main(String[] args) {


        String[][] tattoo = {
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", "X", "X", " ", " ", " ", "X", "X", " ", " "},
                {" ", "X", " ", " ", "X", " ", "X", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", "X", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", "X", " ", " ", " ", " ", " ", " ", " ", "X", " "},
                {" ", " ", "X", " ", " ", " ", " ", " ", "X", " ", " "},
                {" ", " ", " ", "X", " ", " ", " ", "X", " ", " ", " "},
                {" ", " ", " ", " ", "X", " ", "X", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", "X", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}
        };
        robot(tattoo);


    }

    public static String[][] robot(String[][] skinScan) {

        for (int i = 0; i < skinScan.length; i++) {
            for (int j = 0; j < skinScan[i].length; j++) {
                if (skinScan[i][j].equals("X")) {
                    String healed = "*";
                    skinScan[i][j] = healed;
                    System.out.print(skinScan[i][j]);
                }
                else {

                    System.out.print(skinScan[i][j]);
                }

            }
            System.out.println();
        }

       return skinScan;
    }

}
