package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner keyboard = new Scanner(System.in);
        //Variable to accept user input
        int station;


        //Declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);

        //Turn the power on
        bigScreen.power();

        //Display the state of the television
        System.out.println(bigScreen.toString());

        //Prompt the user for input and store it in the station variable
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();

        //Change the channel on the television
        bigScreen.setChannel(station);

        //Increase the volume of the television
        bigScreen.increaseVolume();

        //Display the current channel and volume
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());

        System.out.println("Too loud!  Lowering the volume.");

        //Decrease the volume
        for(int x=0; x<6; x++)
        {
            bigScreen.decreaseVolume();
        }

        //Display the current channel and volume
        System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());

        //create blank line
        System.out.println();



        //HERE IS WHERE YOU DO TASK 5


    }
}
