import java.util.*;
import java.io.*;
import java.io.Console;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class PokemonShipings{
    public static String currentType;
    public static void main(String[] args) throws IOException, InterruptedException{
        String[] cmd = {"/bin/sh", "-c", "stty raw </dev/tty"};
        Runtime.getRuntime().exec(cmd).waitFor();
        Console console = System.console();
        Reader reader = console.reader();
        PokemonShipings.currentType = "";
        class RunnableT implements Runnable {
            private int Tempvar;
            public RunnableT(int Tempvar) {
                this.Tempvar = Tempvar;
            }
            public void run() {
                boolean printLoop = true;
                while(printLoop){
                    boolean prnt = true;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    while(prnt){
                        try {
                            System.out.println("###############################");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#     What is your name       #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#        Adventurer?          #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#        ▋                    #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("###############################");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("                               ");
                            System.out.print("\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"#        ▋");
                            System.out.print(PokemonShipings.currentType);
                            Thread.sleep(500);
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.print("\033[F"+ "#                             #\n");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#         ");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("###############################");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("                               ");
                            System.out.print("\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"#         ");
                            System.out.print(PokemonShipings.currentType);
                            Thread.sleep(500);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        } catch (Exception e){
                            System.out.println(e);
                        }
                    }
                }
            }
        }
        StringBuilder password = new StringBuilder();
        RunnableT runnableT = new RunnableT(10);
        Thread t = new Thread(runnableT);
        t.start();
        boolean UserEntering = true;
        while(UserEntering){
            password.append(reader.read());
            password.append(",");
            String intialAsciiChars = password.toString();
            String[] StrAsciiConvIn = intialAsciiChars.split(",");
            int[] intAsciiCovnSec = new int[StrAsciiConvIn.length];
            for(int k=0; k <StrAsciiConvIn.length; k++){
                try{
                    intAsciiCovnSec[k] = Integer.parseInt(StrAsciiConvIn[k]);
                } catch (Exception e){
                    System.out.print("There was an issue converting user's input from ASCII to char.");
                }
            }
            if(intAsciiCovnSec[intAsciiCovnSec.length-1] == 13){ // ASCII for Enter Hopefully Accepting Final Input
                UserEntering = false;
                t.stop();
            }
            if(UserEntering == true){
                char[] charAsciiConThr = new char[intAsciiCovnSec.length];
                for(int c=0; c<intAsciiCovnSec.length;c++){
                    int v = intAsciiCovnSec[c];
                    charAsciiConThr[c] = (char)v;
                }
                PokemonShipings.currentType = String.valueOf(charAsciiConThr);
            }
            if(intAsciiCovnSec.length >= 10 ){
                UserEntering = false;
                Thread.sleep(1000);
                t.stop();
            }
        }
        MainManTheCharacterStats m1 = new MainManTheCharacterStats();
        class RunnableT2 implements Runnable {
            private int Tempvar;
            public RunnableT2(int Tempvar) {
                this.Tempvar = Tempvar;
            }
            public void run() {
                boolean printLoop = true;
                while(printLoop){
                    boolean prntin = true;
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    while(prntin){
                        try {
                            //##########################################
                            //#                             #  Player: #
                            //#                             # Chattaraj#
                            //#                             ############
                            //#                             # Hp: 100  #
                            //#                             # Ar: ---  #
                            //#                             # Mn: 800  #
                            //#                             # Wy: 0%   #
                            //##########################################
                            //# Inventory:                             #
                            //# = Water Bottle(h5+, d5±, u1)           #
                            //# = Dragon Sword(h0, d30+, u10)          #
                            //# = Empty                                #
                            //##########################################
                            //Hp-Heath; Ar-Armour; Mn-Money; Wy-Journey
                            System.out.println("##########################################");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #  Player: #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #"+ m1.printDetails(0) +"#");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             ############");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.print("#                             #          #");
                            System.out.print("\033[F");
                            System.out.println("#                             # Hp: ");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#        ▋                    #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("###############################");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("                               ");
                            System.out.print("\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"#        ▋");
                            System.out.print(PokemonShipings.currentType);
                            Thread.sleep(500);
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.print("\033[F"+ "#                             #\n");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#         ");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("#                             #");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("###############################");
                            System.out.println("");
                            System.out.print("\033[F");
                            System.out.println("                               ");
                            System.out.print("\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"\033[F"+"#         ");
                            System.out.print(PokemonShipings.currentType);
                            Thread.sleep(500);
                            System.out.print("\033[H\033[2J");
                            System.out.flush();
                        } catch (Exception e){
                            System.out.println(e);
                        }
                    }
                }
            }
        }
        RunnableT2 runnableT2 = new RunnableT2(10);
        Thread t2 = new Thread(runnableT2);
        t2.start();
        cmd = new String[] {"/bin/sh", "-c", "stty sane </dev/tty"};
        Runtime.getRuntime().exec(cmd).waitFor();
    }
    
}

