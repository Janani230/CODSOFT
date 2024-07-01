import java.util.*;
public class StudentGrade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the name of Student:");
        String name=sc.nextLine();
        int noOfSubjects=6;
        float marks[]=new float[noOfSubjects];
        System.err.println("Enter the marks of each subject");
        for(int i=0;i<noOfSubjects;i++){
            marks[i]=sc.nextFloat();
        }
        float sum=0;
        for(int i=0;i<noOfSubjects;i++){
            sum+=marks[i];
        }
        System.out.println("The sum of marks:"+sum);
        //Calculate average
        float avg=0;
        for(int i=0;i<noOfSubjects;i++){
           avg=sum/noOfSubjects;
        }
        System.out.println("The average mark is:"+avg);
        //Grade of Student
            if(avg>=95){
                System.out.println("Grade is:O");
            }
            else if(avg>=90 && avg<95){
            
                System.out.println("Grade is:A+");
            }
            else if(avg>=85 && avg<90){
                System.out.println("Grade is:A");
            }
            else if(avg>=80 && avg<85){
            System.out.println("Grade is:B+");
            }
            else if(avg>=70 && avg<80){
            System.out.println("Grade is:C");
            }
            else if(avg>=50 && avg<70){
            System.out.println("Grade is:D");
            }
            else{
            System.out.println("Grade is:F");
            }
            sc.close();
            
        }
}
        
        