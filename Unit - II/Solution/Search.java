/*
Question
*********
Sukuna campus is having problem with student information. 
Every time someone wish to see the particular student record it has to be done manually.
The campus decided to automate this task, hiring some developers. 
However, feeling competent about students, ICT department suggested to give problem to student. 
In view of the suggestion from ICT department, campus now decided to give this task to ICT students. 
Now write a program to solve this problem.    
 
Note: Students record are stored based on roll number. 
 
Hint: https://en.wikipedia.org/wiki/Linear_search 
 
 
*/
public class Search {
    public static void main(String args[]){
        int rollNumber []= {1,2,3,4,33,22,12,10,223};

        int rollnumbertoFind = 33;
        int notFound = 0;
        for (int i = 0; i < rollNumber.length; i++) {
            if (rollNumber[i] == rollnumbertoFind){
                notFound = 0;
                System.out.println("Match found "+rollNumber[i]+" at position "+(i+1));
                break;

            }
            notFound = 1;
        }
        if(notFound == 1){
            System.out.println("Sorry not found");
        }


    }

}
