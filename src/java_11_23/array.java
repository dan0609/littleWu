package java_11_23;

public class array {
    public static void main(String[] args){
        int[] intarray = new int[100];
        boolean[] boolarray = new boolean[100];
        int[] revseintarray = new int[intarray.length];

        for (int i = 0; i < 100 ; i++){
            intarray[i] = i;

        }
        for (int i = 0; i < intarray.length ; i++){
            revseintarray[i] = intarray[intarray.length - 1 - i];
            System.out.println(revseintarray[i]);
        }
    }

}


