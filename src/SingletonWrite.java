import java.io.*;
import java.util.Scanner;

public class SingletonWrite {
    private static SingletonWrite name = null;
//    private static SingletonWrite age = null;
//    private static SingletonWrite address = null;
//    private static SingletonWrite phoneNumber = null;

    private static void name(){}
//    private static void age(){}
//    private static void address(){}
//    private static void phoneNumber(){}


    public static SingletonWrite getName() {
        if (name == null) {
            name = new SingletonWrite();
        }
        return name;
    }

//    public static SingletonWrite getAge() {
//        if (age == null) {
//            age = new SingletonWrite();
//        }
//        return age;
//    }
//
//    public static SingletonWrite getAddress() {
//        if (address == null) {
//            address = new SingletonWrite();
//        }
//        return address;
//    }
//
//    public static SingletonWrite getPhoneNumber() {
//        if (phoneNumber == null) {
//            phoneNumber = new SingletonWrite();
//        }
//        return phoneNumber;
//    }

    public void writeToLog(String name) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Alex\\IdeaProjects\\HomeWork7\\src\\log.txt"));
        writer.write(name+"\n");
        writer.close();
    }


}
