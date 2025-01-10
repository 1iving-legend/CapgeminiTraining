import java.util.*;
public class CalculateGrade{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);


double Physics = sc.nextDouble();
double Chemistry = sc.nextDouble();
double Math = sc.nextDouble();

if(Physics>100 || Chemistry>100 || Math>100){
	System.out.println("Not a valid marks");
}
else{
	double sum = Physics + Chemistry + Math;

    double percent = (sum/3);
	

if(percent>=80){
System.out.println("Your Average marks is "+percent+" and your grade is A under Level 4, above agency-normalize standards");
}
else if(percent>=70 && percent<=79){
System.out.println("Your Average marks is "+percent+" and your grade is B under Level 3, at agency-normalize standards");
}
else if(percent>=60 && percent<=69){
System.out.println("Your Average marks is "+percent+" and your grade is C under Level 2, below,but approaching agency-normalize standards");
}
else if(percent>=50 && percent<=59){
System.out.println("Your Average marks is "+percent+" and your grade is D under Level 1, well below agency-normalize standards");
}
else if(percent>=40 && percent<=49){
System.out.println("Your Average marks is "+percent+" and your grade is E under Level 1-, too below agency-normalize standards");
}
else{
System.out.println("Your Average marks are "+percent+" and your grade is R under(Level 4, Remedial standards");
}
}
}
}