import java.util.*;
import javax.swing.text.Style;
class StudentGrade
{
    void grade(int a)
    {
        if(a>=90 && a<=100)
        {
            System.out.println("Grade Obtained A");
        }
        else if(a>=80 && a<90)
        {
            System.out.println("Grade  Obtained B");
        }
        else if (a >=70 &&  a<=80)
        {
            System.out.println("Grade  Obtained C");
        }
        else if(a>=65 && a <70 )
        {
            System.out.println("Grade  Obtained D");
        }
        else
        {
            System.out.println("Grade obtained E");
        }
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Subjects");
        int n =sc.nextInt();
        System.out.println("Enter the marks");
        int total=0;
        for(int i=1;i<=n;i++)
            {   
                System.out.println("Enter your Subject"+i+" Mark: ");
                int marks=sc.nextInt(); 
                total= total + marks;
            }
        System.out.println("Total Marks Obtained: "+total);
        int avg=total/n;
        System.out.println("Percentage:"+avg +"%");
        StudentGrade  s= new StudentGrade();
        s.grade(avg);
        

    }
}