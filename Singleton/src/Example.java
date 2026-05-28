public class Example {
    public static void main(String[] args) {
         Samosa samosa= Samosa.getSamosa();
        System.out.println(samosa.hashCode());

        Samosa samosa2= Samosa.getSamosa();
        System.out.println(samosa2.hashCode());
    }
}


// constructor should be private in singleton