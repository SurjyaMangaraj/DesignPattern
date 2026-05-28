import java.io.Serial;
import java.io.Serializable;

public class Samosa implements Serializable,Cloneable {
    private static Samosa samosa;
    private Samosa(){
        if(samosa != null){
            throw new RuntimeException("You are trying to break singleton pattern.");
        }
    }

    // Lazy way to creating single object
    public static  Samosa getSamosa(){
        if(samosa==null){
            synchronized (Samosa.class){
                if(samosa==null) {
                    samosa = new Samosa();
                }
            }
        }

        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }
}

// 1. constructor should be private

// 2. object create with the help of method

// 3. create field to store object is private

//note :- this is not thread safty to get thread safe use keyword synchronized