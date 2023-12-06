package Project01;


import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


public class CharacterBattle {
    public static void main(String[] args) throws FileNotFoundException {
        int wintot1 = 0;
        int wintot2 = 0;
        int rndCount = 0;
        boolean plr1Win = false;
        boolean plr2Win = false;
        // Starting message
        JOptionPane.showMessageDialog(null,"Welcome to Character Battle!\nTo Begin hit OK!");
        rndCount = Integer.parseInt(JOptionPane.showInputDialog("Please enter an odd number of rounds you would like to play"));
        if(rndCount  % 2 == 0){
            JOptionPane.showMessageDialog(null,"That was an even number try again!");
            rndCount = Integer.parseInt(JOptionPane.showInputDialog("Please enter an odd number of rounds you would like to play"));
        }
        String plr1Nm = JOptionPane.showInputDialog("Player 1\nEnter your name!");
        String plr2Nm = JOptionPane.showInputDialog("Player 2\nEnter your name!");

        while(rndCount > 0) {
            charSetup(wintot1, wintot2, plr1Nm, plr2Nm, plr1Win, plr2Win);

            if (plr1Win == true) {
                wintot1++;
                plr1Win = false;
            } else {
                wintot2++;
            }
        }


        //String playAgainDec = JOptionPane.showInputDialog("Would you like to keep playing?\n yes or no");
        //while (playAgainDec.equals("yes")){
        //    charSetup(wintot1,wintot2,plr1Nm,plr2Nm,plr1Win,plr2Win);
        //    if (plr1Win == true){wintot1++; plr1Win = false;} else {wintot2++;}
        //    playAgainDec = JOptionPane.showInputDialog("Would you like to keep playing?\n yes or no");
        //}
        //if (playAgainDec.equals("no")) {
        //    endGame(wintot1,wintot2);
        //}


        // Deciding who gets to go first
        //if(plr1AtkSpd > plr2AtkSpd){
        //    plr1first = true;
        //} else if (plr1AtkSpd == plr2AtkSpd) {
        //    Random random = new Random();
        //    int rngNm = random.nextInt(1);
        //    if (rngNm == 1){
        //    }
        //}


        //while(plr1HP > 0 && plr2HP > 0){
        // Telling the players who get to go, and doing the round.
        //    if(plr1first == true){
        //        JOptionPane.showMessageDialog(null,plr1Nm+" and "+pkmNm1+ " turn!");
        //         plr2HP = plr2HP - plr1MP;
        //       JOptionPane.showMessageDialog(null,"Ouch!\n" + pkmNm2 + " hit points are now " + plr2HP);
        //        plr1first = false;


        //    }else{
        //       JOptionPane.showMessageDialog(null,plr2Nm+" and "+pkmNm2+ " turn!");
        //        plr1HP = plr1HP - plr2MP;
        //        JOptionPane.showMessageDialog(null,"Ouch!\n" + pkmNm1 + " hit points are now " + plr1HP);
        //        plr1first = true;
        //    }
        //}


        // Checking whos HP is at 0 and giving the point appropriately
        //if (plr1HP <= 0){
        //    wintot2++;
        //    JOptionPane.showMessageDialog(null,plr2Nm+" WON THIS ROUND!\n"+"Total Wins\n"+"==================\n"+"Player1:   " + wintot1 + "\n" + "Player2:   " + wintot2);
        //}
        //if (plr2HP <= 0){
        //    wintot1++;
        //    JOptionPane.showMessageDialog(null,plr1Nm+" WON THIS ROUND!\n"+"Total Wins\n"+"==================\n"+"Player1:   " + wintot1 + "\n" + "Player2:   " + wintot2);
        //}
    }


    public static boolean charSetup(int wintot1, int wintot2,String plr1Nm,String plr2Nm, boolean plr1Win, boolean plr2Win){

        boolean plr1first = false;
        // Player 1 set up
        String pkmNm1 = JOptionPane.showInputDialog(plr1Nm+"\n"+"Enter the name of your Pokemon!");
        double plr1HP = Double.parseDouble(JOptionPane.showInputDialog(plr1Nm+"\n"+"Enter the amount of hit points for the pokemon!"));
        String plr1AtkNm = JOptionPane.showInputDialog(plr1Nm+"\n"+"Enter the moves name!");
        double plr1MP = Double.parseDouble((JOptionPane.showInputDialog(plr1Nm+"\n"+"Enter the moves power!")));
        double plr1AtkSpd = Double.parseDouble(JOptionPane.showInputDialog(plr1Nm+"\n"+"Enter the moves attack speed!"));
        JOptionPane.showMessageDialog(null,"Player 1: "+plr1Nm+"\n"+"Pokemon name: "+pkmNm1+"\n"+"Hit Points: "+plr1HP+"\n"+"Move name: "+plr1AtkNm+"\n"+"Moves power: "+plr1MP+"\n"+"Attack speed: "+plr1AtkSpd);


        // Player 2 set up
        String pkmNm2 = JOptionPane.showInputDialog(plr2Nm+"\n"+"Enter the name of your Pokemon!");
        double plr2HP = Double.parseDouble(JOptionPane.showInputDialog(plr2Nm+"\n"+"Enter the amount of hit points for the pokemon!"));
        String plr2AtkNm = JOptionPane.showInputDialog(plr2Nm+"\n"+"Enter the moves name!");
        double plr2MP = Double.parseDouble((JOptionPane.showInputDialog(plr2Nm+"\n"+"Enter the moves power!")));
        double plr2AtkSpd = Double.parseDouble(JOptionPane.showInputDialog(plr2Nm+"\n"+"Enter the moves attack speed!"));
        JOptionPane.showMessageDialog(null,"Player 2: "+plr2Nm+"\n"+"Pokemon name: "+pkmNm2+"\n"+"Hit Points: "+plr2HP+"\n"+"Move name: "+plr2AtkNm+"\n"+"Moves power: "+plr2MP+"\n"+"Attack speed: "+plr2AtkSpd);


        // Deciding who gets to go first
        if(plr1AtkSpd > plr2AtkSpd){
            plr1first = true;
        } else if (plr1AtkSpd == plr2AtkSpd) {
            Random random = new Random();
            int rngNm = random.nextInt(1);
            if (rngNm == 1){
                plr1first = true;
            }
        }
        while(plr1HP > 0 && plr2HP > 0){
            // Telling the players who get to go, and doing the round.
            if(plr1first == true){
                JOptionPane.showMessageDialog(null,plr1Nm+" and "+pkmNm1+ " turn!");
                plr2HP = plr2HP - plr1MP;
                JOptionPane.showMessageDialog(null,"Ouch!\n" + pkmNm2 + " hit points are now " + plr2HP);
                plr1first = false;
            }else{
                JOptionPane.showMessageDialog(null,plr2Nm+" and "+pkmNm2+ " turn!");
                plr1HP = plr1HP - plr2MP;
                JOptionPane.showMessageDialog(null,"Ouch!\n" + pkmNm1 + " hit points are now " + plr1HP);
                plr1first = true;
            }
        }


        // Checking whos HP is at 0 and giving the point appropriately
        if (plr1HP <= 0){
            JOptionPane.showMessageDialog(null,plr2Nm+" WON THIS ROUND!");
        }
        if (plr2HP <= 0){
            plr1Win = true;
            JOptionPane.showMessageDialog(null,plr1Nm+" WON THIS ROUND!");
        }
        return plr1Win;
    }


    public static void endGame(int wintot1,int wintot2){
        if(wintot1 > wintot2){
            JOptionPane.showMessageDialog(null,"PLAYER 1 WINS!!!!!!\n"+ "Total Wins\n"+"==================\n"+"Player1:   " + wintot1 + "\n" + "Player2:   " + wintot2);
        }
        if (wintot2 > wintot1) {
            JOptionPane.showMessageDialog(null,"PLAYER 2 WINS!!!!!!\n"+ "Total Wins\n"+"==================\n"+"Player1:   " + wintot1 + "\n" + "Player2:   " + wintot2);
        }
        else {
            JOptionPane.showMessageDialog(null,"TIE!!!!!!\n"+ "Total Wins\n"+"==================\n"+"Player1:   " + wintot1 + "\n" + "Player2:   " + wintot2);}
    }

}

