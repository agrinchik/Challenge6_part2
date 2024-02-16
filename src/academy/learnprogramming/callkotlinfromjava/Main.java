package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Challenge;
import academy.learnprogramming.kotlincode.Employee;
import academy.learnprogramming.kotlincode.KotlinCodeKt;

public class Main {

    public static void main(String[] args) {

      // 2. Make this code compile by changing the code in Kotlin class only
//      KotlinStuff.sayHelloToJava("Student");
//
//      Employee employee = new Employee("John", "Smith", 2010);
//      employee.startYear = 2009;
//
//      Challenge.doMath(5, 4);
//
//      employee.takesDefault("arg1");

      // 3. Make this code compile by changing the code in Java class only
      KotlinCodeKt.sayHelloToJava("Student");

      Employee employee = new Employee("John", "Smith", 2010);
      employee.setStartYear(2009);

      Challenge.INSTANCE.doMath(5, 4);

      // 4. Employee takesDefault() method should throw exception if parm1 passed as null
      employee.takesDefault(null, "arg2");
    }
}
