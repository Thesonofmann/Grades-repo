import java.util.Arrays;
import java.util.Scanner;

public class ReportSheet {
    public static void main(String[] args){
        /*declare values, subjects(strings), grades
         * Accept scores for subjects
         * compare int with char assigned to integer of that value
         * display char
         * Repeat each process for each course and entire process for each student
         */
        // String english = "English", mathematics = "Mathematics", chemistry = "Chemistry", physics= "Physics", biology= "Biology", economics = "Economics";
        char a= 'A', b='B', c='C', d='D', e='E', f='F';
        String [] courses = {"English","Mathematics","Physics", "Chemistry", "Biology", "Economics"};
        Scanner scanner= new Scanner(System.in);
        char [] marks = new char[6];
        
        
        
        
        
        
 
        System.out.println("Enter the marks for ");

        System.out.println("English");
        int englishMark = scanner.nextInt();
        
        if (englishMark <0){
            System.out.println("INVALID INPUT");
        }
        else if (englishMark >=0 && englishMark<=29){
            marks[0] = e;  
        }
        else if (englishMark>=30 && englishMark<=44){
            marks[0] = d;
        } 
        else if (englishMark>=45 && englishMark<=59) {
            marks[0] = c;
        }
        else if (englishMark>=60 && englishMark<=74) {
            marks[0] = b;
        }
        else if (englishMark>=75 && englishMark <= 100){
            marks[0] = a;
        }
        else marks [0] = 1;
        System.out.println("INVALID ENTRY");

        System.out.println("Mathematics");
        int mathematicsMark = scanner.nextInt();

        if (mathematicsMark <0){
        System.out.println("INVALID INPUT");
        }
        else if (mathematicsMark >=0 && mathematicsMark<=29){
            marks[1] = e; 
        }
        else if (mathematicsMark>=30 && mathematicsMark<=44){
            marks[1] = d;
        } 
        else if (mathematicsMark>=45 && mathematicsMark<=59) {
            marks[1] = c;
        }
        else if (mathematicsMark>=60 && mathematicsMark<=74) {
            marks[1] = b;
        }
        else if (mathematicsMark>=75 && mathematicsMark <= 100){
            marks[1] = a;
        }
        else marks[1] = 1;
        System.out.println("INVALID ENTRY");

        System.out.println("Physics");
        int physicsMark = scanner.nextInt();

        if (physicsMark <0){
            System.out.println("INVALID INPUT");
            }
            else if (physicsMark >=0 && physicsMark<=29){
                marks[2] = e; 
            }
            else if (physicsMark>=30 && physicsMark<=44){
                marks[2] = d;
            } 
            else if (physicsMark>=45 && physicsMark<=59) {
                marks[2] = c;
            }
            else if (physicsMark>=60 && physicsMark<=74) {
                marks[2] = b;
            }
            else if (physicsMark>=75 && physicsMark <= 100){
                marks[2] = a;
            }
            else marks[2] = 1;
            System.out.println("INVALID ENTRY");

        System.out.println("Chemistry");
        int chemistryMark = scanner.nextInt();

        
        if (chemistryMark <0){
            System.out.println("INVALID INPUT");
            }
            else if (chemistryMark >=0 && chemistryMark<=29){
                marks[3] = e; 
            }
            else if (chemistryMark>=30 && chemistryMark<=44){
                marks[3] = d;
            } 
            else if (chemistryMark>=45 && chemistryMark<=59) {
                marks[3] = c;
            }
            else if (chemistryMark>=60 && chemistryMark<=74) {
                marks[3] = b;
            }
            else if (chemistryMark>=75 && chemistryMark <= 100){
                marks[3] = a;
            }
            else marks[3] = 1;
            System.out.println("INVALID ENTRY");



        System.out.println("Biology");
        int biologyMark = scanner.nextInt();

        if (biologyMark <0){
            System.out.println("INVALID INPUT");
            }
            else if (biologyMark >=0 && biologyMark<=29){
                marks[4] = e; 
            }
            else if (biologyMark>=30 && biologyMark<=44){
                marks[4] = d;
            } 
            else if (biologyMark>=45 && biologyMark<=59) {
                marks[4] = c;
            }
            else if (biologyMark>=60 && biologyMark<=74) {
                marks[4] = b;
            }
            else if (biologyMark>=75 && biologyMark <= 100){
                marks[4] = a;
            }
            else marks[4] = 1;
            System.out.println("INVALID ENTRY");


        System.out.println("Economics");
        int economicsMark = scanner.nextInt();
       
        if (economicsMark <0){
            System.out.println("INVALID INPUT");
            }
            else if (economicsMark >=0 && economicsMark<=29){
                marks[5] = e; 
            }
            else if (economicsMark>=30 && economicsMark<=44){
                marks[5] = d;
            } 
            else if (economicsMark>=45 && economicsMark<=59) {
                marks[5] = c;
            }
            else if (economicsMark>=60 && economicsMark<=74) {
                marks[5] = b;
            }
            else if (economicsMark>=75 && economicsMark <= 100){
                marks[5] = a;
            }
            else marks[5] = 1;
            System.out.println("INVALID ENTRY");

            int[] foo = {englishMark, mathematicsMark, physicsMark, chemistryMark, biologyMark, economicsMark};
            System.out.println("The Grade for "+ Arrays.toString(courses) +" are: "+ Arrays.toString(foo));
            System.out.println(Arrays.toString(marks));

        


    }
}
