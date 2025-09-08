class Student
{
String name;
int rollNo;
Student(String name,int rollNo)
{
this.name=name;
this.rollNo=rollNo;
}
void display()
{
System.out.println("name:"+this.name+"rollNo:"+this.rollNo);
}
}
public class test1
{
public static void main(String args[])
{
Student s1=new Student("vishwendra",557);
s1.display();
}
}
