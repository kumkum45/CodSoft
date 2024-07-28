import java.util.*;
public class task2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of subjects: ");
        int n=sc.nextInt();
        float sum=0;
        float avg;
        float marks[]=new float[n];
        System.out.print("Enter marks obtained in "+n+" subjects:");
        for(int i=0;i<n;i++)
        {
             marks[i]=sc.nextInt();
             sum+=marks[i];
        }
        System.out.println("Total marks obtained are "+sum+" out of "+n*100);
        avg=sum/n;
        System.out.println("average percentage : "+avg);
        String grade="";
        if(avg>90)
        grade="A+";
        else if(avg>80)
        {
         grade="A";
        }
        else if(avg>70)
        {
            grade="B+";
        }
        else if(avg>60)
        {
            grade="B";
        }
        else if(avg>50)
        {
            grade="C+";
        }
        else if(avg>40)
        {
            grade="C";
        }
        else if(avg>30)
        {
            grade="D";
        }
        else{
            System.out.println("Failed");
        }
        System.out.println("Grade= "+grade);
    }
}
