package org.intelliguru;

public class PlusOne08 {

    public int[] plusOne(int[] digits){
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int[digits.length+1];
        newNumber[0] =1;
        return newNumber;
    }

    public static void main(String[] args) {
        PlusOne08 plusOne = new PlusOne08();
        int[] digitss = {1,2,9};
        int[] result = plusOne.plusOne(digitss);
                         }
}
