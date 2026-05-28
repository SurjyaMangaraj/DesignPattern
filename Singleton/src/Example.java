import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
         Samosa samosa= Samosa.getSamosa();
        System.out.println(samosa.hashCode());
//
//        Samosa samosa2= Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());
//
//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());

        /*
         * There are three ways to break singleton pattern
         *
         *  1. Reflection API to break singleton pattern
         * solution: 1. if object is there => throw exception from inside constructor.
         *           2. use enum
         *
         * 2. Deserialization
         * solution: implementing readResolve method
         *
         *
         * 3. cloning
         *
         *
         * */

//      1.  Reflection API to break singleton pattern START
//        Samosa s2=Samosa.getSamosa();
//        System.out.println(s2.hashCode());
//
//        Constructor<Samosa> declaredConstructors = Samosa.class.getDeclaredConstructor();
//        declaredConstructors.setAccessible(true);
//        Samosa s1= declaredConstructors.newInstance();
//        System.out.println(s1.hashCode());
//        Reflection API to break singleton pattern END


//        2. Deserialization method START
//        Samosa s3=Samosa.getSamosa();
//        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(s3);
//        System.out.println(s3.hashCode());
//        System.out.println("serialization done.");
//
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s4= (Samosa) ois.readObject();
//        System.out.println(s4.hashCode());
//        Deserialization method END

       Samosa s1=(Samosa) Samosa.getSamosa().clone();
        System.out.println(s1.hashCode());

    }


}


// constructor should be private in singleton