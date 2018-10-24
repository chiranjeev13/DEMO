import java.io.*;
class movieMagic extends hello  //creation of class // inheritence of parent class to child class 
{
private int a ;private String title;private float rating;//encapsulation of variables and data
 void accept()throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter year,title,rating out of 5");
     a=Integer.parseInt(br.readLine());
     String title=br.readLine();
     rating=Float.parseFloat(br.readLine());
    }
    void display()
    {if(rating>=0.0 && rating<=2.0)
    System.out.println("flop");
    else if(rating>=2.1 && rating<=3.4)
    System.out.println("semi hit");
    else if(rating>=3.5 && rating<=4.5)
    System.out.println("hit");
    else if(rating>=4.6 && rating<=5)
    System.out.println("super hit");
}
   public static void main()throws IOException //polymorphism (capability of a method to do different things based on the object that it is acting upon.)
    {
        movieMagic obj= new movieMagic();
        obj.accept();
        obj.display();
    }
}

class hello 
{
 public static void main()throws IOException
{
InputStreamReader A = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(A);
int a;double c=0.0;String z; //inherited variable "a" from the "movieMagic" class.
System.out.println("enters hours rode");
a= Integer.parseInt(br.readLine());
z=br.readLine();
if(a<=3)
c=a*125;
else if(a>3&&a<=7)
c=(3*125)+(a-3)*110;
else if(a>7&&a<=15)
c=(3*125)+(4*110)+(a-3-4)*100;
else if(a>15)
c=(3*125)+(4*110)+(8*100)*(a-3-4-8)*75;
System.out.println("charges"+c+"thank you for riding with us"+z);
}
}               
