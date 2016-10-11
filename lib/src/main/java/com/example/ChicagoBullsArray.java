package com.example;
import java.util.*;


            public class ChicagoBullsArray {

                public static void main(String[] args)
                {
                    String ChicagoBullsPlayers[][] = new String[][]{
                            {"Bobby Portis", "1", "26.2", "2.0", "8.0", "25.0", "1.0", "3.0", "33.3", "1.0", "2.0", "50.0", "0.0", "9.0", "9.0", "3.0", "1.0", "1.0", "0.0", "2.0", "6.0", "-8.0"},
                            {"Cristiano Felicio", "1", "9.2", "2.0", "2.0", "100", "0.0", "0.0", "0.0", "0.0", "2.0", "0.0", "0.0", "0.0", "0.0", "0.0", "1.0", "1.0", "0.0", "2.0", "4.0", "11.0"},
                            {"Denzel Valentine", "1", "11.1", "2.0", "5.0", "40.0", "0.0", "2.0", "0.0", "0.0", "0.0", "0.0", "0.0", "1.0", "1.0", "2.0", "1.0", "0.0", "0.0", "1.0", "4.0", "-10.0"},
                            {"Doug McDermott", "1", "25.7", "5.0", "10.0", "50.0", "0.0", "3.0", "0.0", "3.0", "4.0", "75.0", "1.0", "4.0", "5.0", "1.0", "2.0", "1.0", "0.0", "4.0", "13.0", "-8.0"},
                            {"Dwayne Wade", "1", "11.7", "2.0", "3.0", "66.7", "2.0", "2.0", "100", "0.0", "2.0", "0.0", "0.0", "2.0", "2.0", "1.0", "2.0", "2.0", "0.0", "3.0", "6.0", "-2.0"},
                            {"Isaiah Canaan", "1", "15.5", "1.0", "5.0", "20.0", "0.0", "3.0", "0.0", "0.0", "0.0", "0.0", "0.0", "0.0", "0.0", "1.0", "0.0", "0.0", "0.0", "1.0", "2.0", "4.0"},
                            {"Jerian Grant", "1", "15.1", "3.0", "4.0", "75.0", "1.0", "1.0", "100", "0.0", "0.0", "0.0", "0.0", "0.0", "0.0", "2.0", "2.0", "0.0", "0.0", "2.0", "7.0", "-15.0"},
                            {"Jimmy Butler", "1", "15.1", "2.0", "5.0", "40.0", "1.0", "1.0", "100", "8.0", "9.0", "88.9", "1.0", "2.0", "3.0", "1.0", "0.0", "1.0", "1.0", "2.0", "13.0", "1.0"},
                            {"Nikola Mirotic", "1", "18.8", "1.0", "7.0", "14.3", "0.0", "3.0", "0.0", "0.0", "0.0", "0.0", "1.0", "2.0", "3.0", "1.0", "2.0", "1.0", "1.0", "1.0", "2.0", "-17.0"},
                            {"Rajon Rondo", "1", "23.7", "1.0", "2.0", "50.0", "0.0", "0.0", "0.0", "0.0", "0.0", "0.0", "1.0", "5.0", "6.0", "7.0", "5.0", "0.0", "0.0", "2.0", "2.0", "2.0"},
                            {"Robin Lopez", "1", "19.9", "4.0", "8.0", "50.0", "0.0", "0.0", "0.0", "0.0", "0.0", "0.0", "1.0", "2.0", "3.0", "1.0", "0.0", "1.0", "3.0", "3.0", "8.0", "4.0"},
                            {"Spencer Dinwiddie", "1", "9.2", "1.0", "1.0", "100", "0.0", "0.0", "0.0", "1.0", "1.0", "100", "0.0", "0.0", "0.0", "1.0", "2.0", "1.0", "0.0", "0.0", "3.0", "11.0"},
                            {"Taj Gibson", "1", "21.8", "5.0", "9.0", "55.6", "0.0", "0.0", "0.0", "1.0", "3.0", "33.3", "5.0", "7.0", "12.0", "1.0", "4.0", "0.0", "1.0", "2.0", "11.0", "6.0"},
                            {"Tony Snell", "1", "17.0", "4.0", "7.0", "57.1", "0.0", "1.0", "0.0", "2.0", "2.0", "100", "1.0", "3.0", "4.0", "0.0", "0.0", "0.0", "1.0", "1.0", "10.0", "11.0"}};

                    //for(int h = 0; h < ChicagoBullsPlayers.length;h++){
                    //  System.out.println(ChicagoBullsPlayers[h][20]);
                    //}

                    int j = 0;
                    double totalScore = 0;

                    for(int i = 0; i < ChicagoBullsPlayers.length; i++)
                    {
                        double score = Float.parseFloat(ChicagoBullsPlayers[i][20]);
                        j++;
                        totalScore += score;
                    }



                    double averageScore = (totalScore/j);

                    System.out.println("\nThe average scores for the Chicago Bulls is: " + averageScore + ".");


                    for (int k = 0; k < 14; k++)
                    {
                        for (int l = 0; l < 14; l++)
            {

                if (Double.parseDouble(ChicagoBullsPlayers[k][8]) > Double.parseDouble(ChicagoBullsPlayers[l][8]))
                {

                    String temp[] = ChicagoBullsPlayers[k];


                    ChicagoBullsPlayers[k] = ChicagoBullsPlayers[l];
                    ChicagoBullsPlayers[l] = temp;
                }
            }
        }

        System.out.println("\nThe top three point shooter percentages are:");

        for(int m = 0; m < 3; m++)
        {
            System.out.println(ChicagoBullsPlayers[m][0] + " with " + ChicagoBullsPlayers[m][8] + "%.");

        }

       System.out.println("\nBased on the stats between " + ChicagoBullsPlayers[2][0] + " and " + ChicagoBullsPlayers[11][0]);

       System.out.println(ChicagoBullsPlayers[2][0] + " has made " + ChicagoBullsPlayers[2][3] + "  out of " + ChicagoBullsPlayers[2][4] + " attempted, has made " + ChicagoBullsPlayers[2][6] + " three points shots out of " + ChicagoBullsPlayers[2][7] + " attempted.  He has attempted " + ChicagoBullsPlayers[2][9] + " out of " + ChicagoBullsPlayers[2][10] + " free throws. He has " + ChicagoBullsPlayers[2][14] + " rebounds " + ChicagoBullsPlayers[2][17] + " steals, " + ChicagoBullsPlayers[2][18] + " blocks and has scored " + ChicagoBullsPlayers[2][20] + " points.");
       System.out.println(ChicagoBullsPlayers[11][0] + " has made " + ChicagoBullsPlayers[11][3] + " out of " + ChicagoBullsPlayers[11][4] + " attempted, has made " + ChicagoBullsPlayers[11][6] + " three points shots out of " + ChicagoBullsPlayers[11][7] + " attempted.  He has attempted " + ChicagoBullsPlayers[11][9] + " out of " + ChicagoBullsPlayers[11][10] + " free throws. He has " + ChicagoBullsPlayers[11][14] + " rebounds " + ChicagoBullsPlayers[11][17] + " steals, " + ChicagoBullsPlayers[11][18] + " blocks and has scored " + ChicagoBullsPlayers[11][20] + " points.");
       System.out.println("Based on stats " + ChicagoBullsPlayers[2][0] + " is the better player.");
    }

}

