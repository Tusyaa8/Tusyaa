import java.util.*;
class Total
{
    Scanner sc = new Scanner(System.in);
    double value;
    String sub[] = {"English I","English II","Tamil","Hindi","Maths","Physics","Chemistry","Biology","History & Civis","Geography","VI Subject"};
    double avg;
    double[] marks = new double[sub.length];
    double sum;String name; int n = sub.length;
    void accept()
    {
        System.out.println("Enter Name of the Student");
        name = sc.nextLine();captial();
        System.out.println("Enter Subject Mark");
        System.out.println("Like 100 80 50 etc...");
        value= sc.nextDouble();value=100/value;
        System.out.println("!Type 0 for Not a Subject\n");
        System.out.println("Enter The Marks");
        for(int i =0;i<sub.length;i++)
        {
            System.out.print(sub[i]+"  ");
            marks[i] = sc.nextDouble();
            System.out.println();
        }
        arrange();
    }
    void arrange()
    {
        for(int i =0;i<n;i++)
        {
            if(marks[i]==0)
            {
                for(int j =i;j<n-1;j++)
                {
                    sub[j]=sub[j+1];
                    marks[j]=marks[j+1];
                }
                n--;
                i--;
            }
        }
    }
    void calculate()
    {
        for(int i =0;i<n;i++)
        {
            sum+=marks[i];
        }
        avg=sum/n;
        avg*=value;
        sum*=value;
        avg = Math.round(avg);
        sum = Math.round(sum);
    }
    void display()
    {
        System.out.println("Name of Student  "+ name);
        System.out.println("Out Of " +(n*100)+" You Got "+sum);
        System.out.println("Average  "+avg);group();
    }
    void captial()
    {
        name=name.trim();name=" "+ name;
        String wd="";
        for(int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);
            if(Character.isWhitespace(ch))
            {
                ch = Character.toUpperCase(name.charAt(++i));
                wd+=" "+ch;
            }
            else
            {
                ch = Character.toLowerCase(name.charAt(i));
                wd+=ch;
            }
        }
        name =wd;
    }
    void group()
    {
        if(avg>=75)
        {
            System.out.println("Very Good");
        }
        else if (avg>=50&&avg<75)
        {
            System.out.println("Average");
        }
        else
        {
            System.out.println("Unsatisfied");
        }
    }
    public static void main()
    {
        Total ob = new Total();
        ob.accept();
        System.out.println();
        ob.calculate();
        ob.display();
    }
}