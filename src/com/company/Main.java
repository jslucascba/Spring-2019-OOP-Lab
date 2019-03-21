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
        bigScreen.Power();

        //Display the state of the television
        System.out.println(bigScreen.ToString());

        //Prompt the user for input and store it in the station variable
        System.out.println("What channel do you want? ");
        station = keyboard.nextInt();

        //Change the channel on the television
        bigScreen.SetChannel(station);

        //Increase the volume of the television
        bigScreen.IncreaseVolume();

        //Display the current channel and volume
        System.out.println("Channel: " + bigScreen.GetChannel() + " Volume: " + bigScreen.GetVolume());

        System.out.println("Too loud!  Lowering the volume.");

        //Decrease the volume
        for(int x=0; x<6; x++)
        {
            bigScreen.DecreaseVolume();
        }

        //Display the current channel and volume
        System.out.println("Channel: " + bigScreen.GetChannel() + " Volume: " + bigScreen.GetVolume());

        //create blank line
        System.out.println();

        //HERE IS WHERE YOU DO TASK 5

       }
}
