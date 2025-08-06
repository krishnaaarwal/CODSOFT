import java.util.*;
public class Student_Grade_Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks (0-100):"); // Already told the user to input in provided range

        System.out.print("Physics:");
        float phy = sc.nextFloat();

        System.out.print("Chemistry:");
        float chem = sc.nextFloat();

        System.out.print("Mathematics:");
        float maths = sc.nextFloat();

        System.out.print("Computer Science:");
        float cs = sc.nextFloat();

        System.out.print("English:");
        float eng = sc.nextFloat();

        // Additional Subject , User can have it or not
        System.out.print("Additional Subject(Physical Ed. / Music / Hindi)(Fill 0 if no additional subject):");
        float add = sc.nextFloat();

        add= (add>0) ? add : 0;

        float totalMarks = phy+chem+maths+cs+eng+add;
        float maxMarks = (add > 0) ? 600 : 500;
        System.out.printf("Your Total marks is %.2f (out of %.0f) \n", totalMarks, maxMarks);

        float divisor = (add>0) ? 6 : 5;
        float percentage = totalMarks/divisor;
        System.out.printf("Your Percentage is %.2f%% \n",percentage);

        System.out.printf("Your Grade is %c (%.2f%%) \n",grade(percentage),percentage);

        remarks(grade(percentage));

        sc.close();
    }

    private static char grade(float percentage){
        if(percentage==100)
        return 'S';      //SPECIAL GRADE :)
        else if(90<= percentage && percentage<100)
        return 'A';
        else if(80<= percentage && percentage<90)
        return 'B';
        else if(70<= percentage && percentage<80)
        return 'C';
        else if(50<= percentage && percentage<70)
        return 'D';
        else if(33<= percentage && percentage<50)
        return 'E';
        else
        return 'F';
    }

    private static void remarks(char grade){
        switch (grade) {
            case 'S':
                System.out.println("Outstanding Performance! :) ");
                break;
            case 'A':
                System.out.println("Remarkable Performance! ;) ");
                break;
            case 'B':
                System.out.println("Good Performance :D ");
                break;
            case 'C':
                System.out.println("Acceptable Performance ^_~ ");
                break;
            case 'D':
                System.out.println("Average Performance, Put on some more efforts! ~_~ ");
                break;
            case 'E':
                System.out.println("Poor Performance, Just Passed :/ ");
                break;
            default:
                System.out.println("FAILED! , Better Luck Next time :( ");
                break;
        }
    }

}
