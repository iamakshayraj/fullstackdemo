package assign2;

import java.util.Scanner;

public class emp2{
int salary,age;
String name,designation;

public emp2(String x,int y,int u,String p) {
// TODO Auto-generated method stub
salary=u;
name=x;
age=y;
designation=p;

}
void display()
{
System.out.println("name: " + name + "  age:" + age + "    Salary:"+ salary + "  Designation:" + designation);
}

void salary(int amoi)
{
salary=salary+amoi;
System.out.println("Employee name: " + name + "  age:" + age + "    Salary:"+ salary + "  Designation:" + designation);

}}


