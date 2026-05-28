public class Samosa {
    private static Samosa samosa;
    private Samosa(){
    }

    public static  Samosa getSamosa(){
        if(samosa==null){
           samosa = new Samosa();
        }

        return samosa;
    }
}

// 1. constructor should be private

// 2. object create with the help of method

// 3. create field to store object is private