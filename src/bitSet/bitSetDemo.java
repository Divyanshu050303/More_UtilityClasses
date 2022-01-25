package bitSet;
import java.util.BitSet;
public class bitSetDemo {
    // It is used for create a special type of array that holds bit values. This array can increase in size as needed .
    // This makes it similar to a vector of bits .The BitSet constructors are shown here:
    // BitSet()
    //BitSet(int size)
    public static void main(String[] args) {
        BitSet bitSet1=new BitSet(16);
        BitSet bitSet2=new BitSet(16);
        for(int i=0;i<16;i++){
            if(i%2==0) bitSet1.set(i);
            if(i%5!=0) bitSet2.set(i);

        }
        System.out.println("First BitSet is :");
        System.out.println(bitSet1);
        System.out.println("Second BitSet is :");
        System.out.println(bitSet2);
        bitSet2.and(bitSet1);
        System.out.println("After the BitSet1 AND BitSet2");
        System.out.println(bitSet2);
        bitSet2.or(bitSet1);

        System.out.println("After the BitSet1 OR BitSet2");
        System.out.println(bitSet2);

        bitSet2.xor(bitSet1);

        System.out.println("After the BitSet1 XOR BitSet2");
        System.out.println(bitSet2);
    }

}
