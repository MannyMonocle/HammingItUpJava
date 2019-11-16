public class Hamming {

    String dna1;
    String dna2;

    public Hamming(String s, String s1) {
        if(s.length() != s1.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        dna1 = s;
        dna2 = s1;
    }

    public int getHammingDistance() {
        Integer counter = 0;

        for(int i = 0; i < dna2.length(); i++){
            if(dna2.charAt(i) != dna1.charAt(i)){ counter++;}
        }

        return counter;
    }
}
