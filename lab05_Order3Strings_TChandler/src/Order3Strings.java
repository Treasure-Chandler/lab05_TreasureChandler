/*
 * Treasure Chandler
 * CS 16000-01 – 02/03, Fall Semester 2024
 * Lab 5
 * 
 */

 import javax.swing.JDialog;         // needed for the JOptionPane class
 import javax.swing.JOptionPane;     // needed for the JOptionPane class
 
 public class Order3Strings {
     /**
      * 
      * @param args      entered values
      */
     /*
      * this line is to suppress warnings for "unused" variables that are
      * actually used
      */
     // @SuppressWarnings("unused")
     public static void main(String[] args) {
         // variables declaration
         int answer;
         String title, names;
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
         if (answer == JOptionPane.NO_OPTION) {
             /*
              * if the user clicks no, the program will simply end (with
              * a new dialog window to let them know about that)
              */
             JOptionPane.showMessageDialog(dialog, "The program terminates!" +
                                           "\nEnd of this program.",
                                           title,
                                           JOptionPane.WARNING_MESSAGE);
             System.exit(0);
         } else {
             // problem 3:
             /*
              * otherwise, the real magic happens (first with having the user
              * input 3 names)
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
             if (names.equals("null")) {
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
         }
         
     } // end of main()
     
 } // end of Order3Strings