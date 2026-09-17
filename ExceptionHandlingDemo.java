//Custom Exception Class
class invalidAgeException extend Exception{
public
InvalidAgeException(String message){
super(message);
}
}
public class
ExceptionHandlingDemo{
//Method that throws a custom checked exception
public static void
validateAge(int age)throws InvalidAgeException{
If(age<18){
throw new
invalidAgeException("Access denied:You must be at least 18 Years old.");
}
}
public static void main(String[] args){
int[] userAges={21,25};
for(int age:userAges){
System.out.println("\nChecking age:"+age);
try{
//Code that might throw an exception
validateAge(age);
//Example of 
Built-in Unchecked Exception
(ArithmeticException)
if(age==21){
int result=10/0;//
Will trigger ArithmaticException
}
}catch
(InvalidAgeException e){
//Catch custom age exception
System.out.println("Custom Exception Caught:"+e.getMessage());
}catch
(ArithmeticException e){
   //Catch-all for any other unexpected exceptions
System.out.println("Runtime Exception Caught:Cannot divide by zero.");
}catch(Exception e){
//Catch-all for any other unexpected exceptions
System.out.println("General Exception Caught:"+
e.getMessage());
}finally{
//Always executes regardless of an exception
System.out.println("Cleanup:Age check processing completed.");
}
}
}
}

