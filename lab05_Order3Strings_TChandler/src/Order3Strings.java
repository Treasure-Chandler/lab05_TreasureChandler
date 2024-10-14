/*
 * Treasure Chandler
 * CS 16000-01 – 02/03, Fall Semester 2024
 * Lab 5
 * 
 */

import javax.swing.JDialog;         // needed for the JOptionPane class
import javax.swing.JOptionPane;     // needed for the JOptionPane class
import java.util.Scanner;           // needed for the Scanner class

public class Order3Strings {
    /**
     * 
     * @param args entered values
     */
    /*
     * this line is to suppress warnings for "unused" variables that are
     * actually used
     */
    // @SuppressWarnings("unused")
    public static void main(String[] args) {
        // variables declaration
        int answer, yesNo, nameCount = 0;
        String title, namesOrdered, names, name1, name2, name3;
        /*
         * due to the JOptionPane dialogue boxes sometimes appearing behind
         * all of your windows, you will need to declare a JDialog and
         * setAlwaysOnTop to true
         */
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);

        // problem 1:
        // prompts the user to compare 3 strings they will input in the future
        title = "3 Strings Comparison";
        answer = JOptionPane.showConfirmDialog(dialog, "Do you want to " +
                                              "compare strings?",
                                              title,
                                              JOptionPane.YES_NO_OPTION);

        // problems 2 and 3:

        if (answer == JOptionPane.YES_OPTION) {
            // problem 3:
            /*
             * otherwise, the real magic happens (first with having the user
             * input 3 names), and input validation
             */
            title = "Welcome to the name ordering!";
            names = JOptionPane.showInputDialog(dialog, "Enter 3 names with " +
                                                "spaces in between:", title,
                                                JOptionPane.QUESTION_MESSAGE);

            if (names == null) {
                // if the user clicked "Cancel", the program will end
                JOptionPane.showMessageDialog(dialog, "Action has been canceled!",
                                              "3 Strings Comparison",
                                               JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(dialog, "The program terminates!" +
                                              "\nEnd of this program.",
                                              title,
                                              JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
            // problem 4:
            if (names.contains("null")) {
                /*
                 * if the user typed the word "null" in the text box,
                 * the program will end
                 */
                JOptionPane.showMessageDialog(dialog, "This program will terminate" +
                                              " due to an invalid input.",
                                              "3 Strings Comparision,",
                                              JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            } else if (names.equals("")) {
                /*
                 * if the user clicked "OK" without typing anything,
                 * the program will end
                 */
                JOptionPane.showMessageDialog(dialog, "You clicked OK without " +
                                              "typing 3 names...",
                                              "3 Strings Comparision,",
                                              JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(dialog, "The program terminates!" +
                                              "\nEnd of this program.",
                                              title,
                                              JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }

            // problem 7:
            Scanner splitter = new Scanner(names);

            // problem 4/8:
            /*
             * names 1 through 3 would be saved in the splitter.next() method,
             * checking if the text for names 1 through 3 exist
             */
            if (splitter.hasNext()) {
                name1 = splitter.next();
                nameCount++;
            }

            if (splitter.hasNext()) {
                name2 = splitter.next();
                nameCount++;
            }

            if (splitter.hasNext()) {
                name3 = splitter.next();
                nameCount++;
            } 

            // problem 5:
            /*
             * strictly enforces the rule of only accepting 3 names;
             * attempting to add a fourth will end the program
             */
            if (splitter.hasNext()) {
                JOptionPane.showMessageDialog(dialog, "This program will terminate" +
                                              " due to an invalid input.",
                                              "3 Strings Comparision,",
                                              JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }

            // problem 8:
            namesOrdered = sortWords(name1, name2, name3);

        } else {
            /*
             * if the user clicks no, the program will simply end (with
             * a new dialog window to let them know about that)
             */
            JOptionPane.showMessageDialog(dialog, "The program terminates!" +
                                          "\nEnd of this program.",
                                          title,
                                          JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    } // end of main()

    // problem 9:
    /**
     * 
     * @param w1        name 1
     * @param w2        name 2
     * @param w3        name 3
     * @return
     */
    public static String sortWords(String w1, String w2, String w3) {
        if (w1.compareToIgnoreCase(w2) <= 0 && w1.compareToIgnoreCase(w3) <= 0) {

        } else {

        }
        return;
    } // end of sortWords()

} // end of Order3Strings