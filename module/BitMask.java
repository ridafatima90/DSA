package module;

import java.util.Scanner;

public class BitMask {
    public static void main(String[] args) {
        //Get
//        int n = 8;
//        int pos =3;
//
//        int bitMask = 1 << pos;
//        if((bitMask & n) == 0) {
//            System.out.println("Bit was zero");
//        }else {
//            System.out.println("Bit was one");
//        }

        //set
//        int n= 5;
//        int pos = 3;
//        int bitMask = 1 << pos;
//
//        int number = bitMask | n;
//        System.out.println(number);

        //clear bit
//        int n = 5;
//        int pos =2;
//        int bitMask = 1 << pos;
//
//        int clearedNumber = ~(bitMask) & n;
//        System.out.println(clearedNumber);

        //update bit(For 1)
//        int n = 5;
//        int pos =2;
//        int bitMask = 1 << pos;
//
//        int updatedBit = bitMask | n;
//        System.out.println(updatedBit);

        //update bit(For 0)
//        int n = 5;
//        int pos =2;
//        int bitMask = 0 << pos;
//
//        int updatedBit = ~(bitMask) & n;
//        System.out.println(updatedBit);

        //update for both 0 and 1 operation
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        int n = 5;
        int pos =2;
        int bitMask = 1 << pos;

        if(oper == 0) {
            int updatedBit = ~(bitMask) & n;
            System.out.println(updatedBit);
        }
        if(oper ==1) {
            int updateBit = bitMask | n;
            System.out.println(updateBit);
        }

    }
}
