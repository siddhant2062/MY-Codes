import java.util.Scanner;
class student
{
Scanner sc=new Scanner(System.in);

int rollno=sc.nextInt();			
String name=sc.next();
String cls=sc.next();
int marks=sc.nextInt();
void output()
{
System.out.println("Roll no= "+rollno+"\nName= "+name+"\nClass= "+cls+"\nMarks are= "+marks+"\n");
}
void input() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int size=sc.nextInt();
	student s[]=new student[size];
	for(int i=0;i<size;i++) {
		System.out.println("enter student details");
		s[i]=new student();
		s[i].output();
	}
}
public static void main(String x[])
{

	input obj=new input();

}
}
