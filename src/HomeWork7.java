import java.io.*;
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) throws IOException {
        //1
        //Java Bean :
        /*
            JavaBeans are Java classes that adhere to an extremely simple coding convention.

            Implement java.io.Serializable interface - save state object
            use a public empty argument constructor - to create an object
            And provide public getter and setter methods. To get and set the values of private variables (properties).
         */



        //2
        //Design patterns are not locked to any language!


        //3
        SingletonWrite singletonWrite = SingletonWrite.getName();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        singletonWrite.writeToLog(scan.next()+"\n");
        System.out.println("Enter your age");
        singletonWrite.writeToLog(scan.next()+"\n");
        System.out.println("Enter your Address");
        singletonWrite.writeToLog(scan.next()+"\n");
        System.out.println("Enter your phone number");
        singletonWrite.writeToLog(scan.next()+"\n");
//






        //4
        FactoryCar factoryCar = new FactoryCar();
        Drivable myFiat = factoryCar.getCar("Fiat");
        myFiat.drive();
        Drivable myBmw = factoryCar.getCar("BMW");
        myBmw.drive();
        Drivable myPorsche = factoryCar.getCar("Porsche");
        myPorsche.drive();


        //5
        //in folder homework7


        //6



        //7
        //Maven is a software project management tool.
        //The point was creating a standard way to build the projects, a clear
        //definition of what the project consisted of, an easy way to publish project


        //8
        //ThreadSingleton safeSingleton = (ThreadSingleton) ThreadSingleton.getInstance();



        //9
        //1--Object pool design pattern is essentially used in Web Container
        // of the server for creating thread pools and data source pools to process the requests
        //2--decorator pattern uses composition instead of inheritance to extend the functionality of
        // an object at runtime.
        //3--A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object.
        // Invoker object looks for the appropriate object which can handle this command and pass the command
        // to the corresponding object and that object executes the command".


        //10
        //1--https://clickup.com
        //2--https://www.jetbrains.com/youtrack

    }
}
