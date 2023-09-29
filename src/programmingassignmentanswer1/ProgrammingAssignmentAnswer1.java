/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programmingassignmentanswer1;
/*
REFERENCES
https://youtu.be/pTAda7qU4LY?si=ZuISm6ebuvQ3qDan
https://youtu.be/AuGZWs9P7Og?si=Cq_WhxgISrFoKX9X
https://youtu.be/r1L_71N-5rs?si=XeKROwpAGu1GwyDP
https://youtu.be/K1DPBpljXog?si=3Ed09GinKYy12tyv
*/
import java.util.Scanner;

/**
 *
 * @author ST10287087
 */
public class ProgrammingAssignmentAnswer1 {
    /**
     * @ST10287087
     */
   private static Scanner kb = new Scanner(System.in);
    Student student = new Student();
    public static void main(String[] args) {
        firstMenu();
    }//end main
    //introduces the use to the program and gives them a choice of what they wanted to be done
    
    public static void firstMenu()
    {
        int userInputOne;
        System.out.println("\nSTUDENT MANAGMENT MATERIAL");
        System.out.println("***********************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        userInputOne = kb.nextInt();
        switch(userInputOne)//switch case so that they can chose an outcome
        {
            case 1: System.out.println("Please select one of the following menu items:"
                    + "\n1. Capture a new student"
                    + "\n2. Search for a student"
                    + "\n3. Delete a student"
                    + "\n4. Print a student report"
                    + "\n5. Exit Application");
            int userInputTwo;
            userInputTwo = kb.nextInt();
            switch(userInputTwo)
            {
                case 1: Student.SaveStudent();firstMenu();break; //method to save students information into the program      
                case 2: Student.SearchStudent();firstMenu();break;//method that allows a user to search a student in the program
                case 3: Student.DeleteStudent();firstMenu();break;//method that allows a user to remove a student from a program
                case 4: Student.StudentReport();firstMenu();break;//methods thats prints all a students informatio
                case 5: Student.ExitStudentApplication();break;//method thats exists the apllication
            }
            default: System.out.println("Thats not an option!"); firstMenu();break;//re prompts the user if they did not give a valid entry
        }//end switch
    }//end first menu
    
}//end class
