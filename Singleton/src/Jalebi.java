public class Jalebi {

    // Eager way to creating singleton object
    private static Jalebi jalebi=new Jalebi();

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
