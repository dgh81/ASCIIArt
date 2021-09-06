package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        System.out.println("Select 1-3 to show ASCII art");
        String ascii1;
        ascii1="               T~~\n" +
            "               |\n" +
            "              /\"\\\n" +
            "      T~~     |'| T~~\n" +
            "  T~~ |    T~ WWWW|\n" +
            "  |  /\"\\   |  |  |/\\T~~\n" +
            " /\"\\ WWW  /\"\\ |' |WW|\n" +
            "WWWWW/\\| /   \\|'/\\|/\"\\\n" +
            "|   /__\\/]WWW[\\/__\\WWWW\n" +
            "|\"  WWWW'|I_I|'WWWW'  |\n" +
            "|   |' |/  -  \\|' |'  |\n" +
            "|'  |  |LI=H=LI|' |   |\n" +
            "|   |' | |[_]| |  |'  |\n" +
            "|   |  |_|###|_|  |   |\n" +
            "'---'--'-/___\\-'--'---'";
        String ascii2;
        ascii2="   /\\                                                        /\\\n" +
                "  |  |                                                      |  |\n" +
                " /----\\                  Lord Dark's Keep                  /----\\\n" +
                "[______]             Where Brave Knights Tremble          [______]\n" +
                " |    |         _____                        _____         |    |\n" +
                " |[]  |        [     ]                      [     ]        |  []|\n" +
                " |    |       [_______][ ][ ][ ][][ ][ ][ ][_______]       |    |\n" +
                " |    [ ][ ][ ]|     |  ,----------------,  |     |[ ][ ][ ]    |\n" +
                " |             |     |/'    ____..____    '\\|     |             |\n" +
                "  \\  []        |     |    /'    ||    '\\    |     |        []  /\n" +
                "   |      []   |     |   |o     ||     o|   |     |  []       |\n" +
                "   |           |  _  |   |     _||_     |   |  _  |           |\n" +
                "   |   []      | (_) |   |    (_||_)    |   | (_) |       []  |\n" +
                "   |           |     |   |     (||)     |   |     |           |\n" +
                "   |           |     |   |      ||      |   |     |           |\n" +
                " /''           |     |   |o     ||     o|   |     |           ''\\\n" +
                "[_____________[_______]--'------''------'--[_______]_____________]";
        String ascii3;
        ascii3="                    |>>>                        |>>>\n" +
                "                    |                           |\n" +
                "                _  _|_  _                   _  _|_  _\n" +
                "               | |_| |_| |                 | |_| |_| |\n" +
                "               \\  .      /                 \\ .    .  /\n" +
                "                \\    ,  /                   \\    .  /\n" +
                "                 | .   |_   _   _   _   _   _| ,   |\n" +
                "                 |    .| |_| |_| |_| |_| |_| |  .  |\n" +
                "                 | ,   | .    .     .      . |    .|\n" +
                "                 |   . |  .     . .   .  ,   |.    |\n" +
                "     ___----_____| .   |.   ,  _______   .   |   , |---~_____\n" +
                "_---~            |     |  .   /+++++++\\    . | .   |         ~---_\n" +
                "                 |.    | .    |+++++++| .    |   . |              ~-_\n" +
                "              __ |   . |   ,  |+++++++|.  . _|__   |                 ~-_\n" +
                "     ____--`~    '--~~__ .    |++++ __|----~    ~`---,              ___^~-__\n" +
                "-~--~                   ~---__|,--~'                  ~~----_____-~'   `~----~\n" +
                "ART BY T.L.G.";
        for (int i = 0; i < 3; i++) {
            int userChoice = userInput.nextInt();
            System.out.println(userChoice);
            if (userChoice == 1) {
                System.out.println(ascii1);}
            else if (userChoice == 2) {
                System.out.println(ascii2);}
            else if (userChoice == 3) {
                System.out.println(ascii3);}
        }
    }
}
