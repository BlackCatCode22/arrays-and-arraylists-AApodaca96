
public class Arrays_and_Loops {
    public static void main(String[] args) {
        // Welcome Statement
//        System.out.printf("\nHello and welcome to Angelo's Arrays & Loops Practice!\n\n");

        // Create an Array
//        int [] myNumbers = new int[8];

        // Fill the Array with Ints
//        myNumbers[0] = 1;
//        myNumbers[1] = 3;
//        myNumbers[2] = 5;
//        myNumbers[3] = 7;
//        myNumbers[4] = 9;
//        myNumbers[5] = 11;
//        myNumbers[6] = 13;
//        myNumbers[7] = 15;

        // Output One Element of the Array
//        System.out.println( "myNumbers[3] = " + myNumbers[3] );
//        System.out.println("\n");


        // For Loop
//        for (int i = 0; i < 8; i++) {
//            // Prints All Elements of the Array
//            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
//        }

        // Fill the Array with 5, 10, 15, ...
//        int myFiveContainer = 0;
//        for (int i = 0; i < myNumbers.length; i++) {
//            myNumbers[i] = myFiveContainer += 5;
//        }
//
//        System.out.println("\n This Array Should Be Fives: ");
//        System.out.println("myNumbers[" + "] is: " + myNumbers);



        // 2-D Array
        int [][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };

        // System.out.println(numberGrid[1][2]);


        // Inner & Outer (Nested) Loops
        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j]);
            }
            System.out.println();
        }


        // Create a 2-D Array
        int [][] myNumberGrid = new int[4][3];
        int myFiveContainer = 0; // Does not increment by 5 because earlier code is commented out and has errors

        // Fill the Array with a For Loop
        System.out.println("\n\n");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(myNumberGrid[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}