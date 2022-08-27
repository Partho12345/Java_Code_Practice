import java.util.*;
public class homework01 {

    public static void main(String[] args) {
    	
        // Be very familiar with the bit-wise operators
        System.out.println("6&4 = " + (6&4));
        System.out.println("1|2 = "+ (1|2));
        System.out.println("8>>1 = "+ (8>>1));
        System.out.println("-16>>2 = "+ (-16>>>2));
        System.out.println("1<<10 = "+ (1<<10));
        System.out.println("~0 = "+ (~0));
        System.out.println("15^6 = "+ (15^6));

        // Know the constants denoting the maximum and minimum values for numeric types,
        System.out.println("Integer.MIN_VALUE= "+Integer.MIN_VALUE);
        System.out.println("Float.MAX_VALUE= "+Float.MAX_VALUE);
        System.out.println("Double.SIZE= "+Double.SIZE);
        System.out.println("Boolean.TRUE= "+Boolean.TRUE);
        
        // Know the box-types, especially the factories
        System.out.println("Double.valueOf(\"1.23\")= "+Double.valueOf("1.23"));
        System.out.println("Boolean.valueOf(true)= "+Boolean.valueOf(true));
        System.out.println("Integer.parseInt(\"42\")= "+Integer.parseInt("42"));
        System.out.println("Float.toString(-1.23)= "+Float.toString(-1.23f));
        
        // Prefer the box-type static methods for comparing values
        Double x = 1.23;
        System.out.println(Double.compare (x,1.23) == 0?"x is 1.23":"x is not 1.23");
        
        // The key methods in Math
        System.out.println("Math.abs(-34.5)= "+Math.abs(-34.5));
        System.out.println("Math.ceil(2.17)= "+Math.ceil(2.17));
        System.out.println("Math.floor(3.14)= "+Math.floor(3.14));
        System.out.println("Math.min(x,-4)= "+Math.min(x,-4));
        System.out.println("Math.max(3.14,x)= "+Math.max(3.14,x));
        System.out.println("Math.pow(2.71,3.14)= "+Math.pow(2.71,3.14));
        System.out.println("Math.sqrt(225)= "+Math.sqrt(225));
        
        // Understand the limits of auto boxing
        // Character[] C = new char[]{'a','b'};		// it won't compile due to type mismatch
        
        // Know how to interconvert integers, characters and strings
        System.out.println("Character.getNumericValue('4')= "+Character.getNumericValue('4'));
        System.out.println("String.valueOf(123)= "+String.valueOf(123));
        
        // The key methods in Random
        Random r = new Random();
        System.out.println("r.nextInt(16)= "+r.nextInt(16));
        System.out.println("r.nextInt()= "+r.nextInt());
        System.out.println("r.nextBoolean()= "+r.nextBoolean());
        System.out.println("r.nextDouble()= "+r.nextDouble());
    }
    
}