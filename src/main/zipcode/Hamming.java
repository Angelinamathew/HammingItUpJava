package zipcode;

import java.util.Objects;

public class Hamming {
    String s;
    String s1;
    public Hamming(String s, String s1) {
        if (s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length");
        }
        this.s = s;
        this.s1 = s1;
    }

    public int getHammingDistance() {
        String[] sArray = s.split("");
        String[] s1Array = s1.split("");

        int hammingCounter = 0;

        for (int i=0; i<s1.length(); i++){
            if (!Objects.equals(sArray[i], s1Array[i])){
                hammingCounter++;
            }
        }
        return hammingCounter;
    }
}
