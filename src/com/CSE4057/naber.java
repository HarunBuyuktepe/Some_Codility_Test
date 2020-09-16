package com.CSE4057;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class naber {
    public static void main(String []Args){
        int[] ae = new int[] {1,3,4,2,2,2,1,1,2};
        System.out.println(solution(ae));
        System.out.println(solutions(ae));



    }
    public static boolean solutions(int[] A) {

        int leftIndex = 1;
        int rightIndex = A.length - 2;
        int leftestSum, midSum, rightestSum;
        int[] sumArray = new int[A.length];


        sumArray[0] = A[0];
        for(int i = 1; i < A.length; i ++)
            sumArray[i] = sumArray[i-1] +  A[i];

        for (int c: sumArray
             ) {
            System.out.println(c);
        }

        while(leftIndex < rightIndex) {

            leftestSum = sumArray[leftIndex] - A[leftIndex];
            midSum = sumArray[rightIndex] - sumArray[leftIndex] - A[rightIndex];
            rightestSum = sumArray[A.length - 1] - sumArray[rightIndex];

            if(leftestSum == midSum && midSum == rightestSum)
                return true;

            if (leftestSum < rightestSum)
                leftIndex++;
            else if (leftestSum > rightestSum)
                rightIndex--;
            else{                   
                leftIndex++;
                rightIndex--;
            }
        }
        return false; 
    }


    public static boolean solution(int[] A) {
        // write your code in Java SE 8
        int e = 3;
        int sum = 0;
        // {1,3,4,2,2,2,1,1,2};
        for (int i = 0; i < A.length ; i++) {
            sum+=A[i];
        }
        System.out.println(sum);








        return true;
    }










    public static int solutionD(int[] A) {
        int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        while (i > 0) {
            if(A[i] != 0 && A[i] != 1)
                return -1;
            else if (A[i] == 1) {
                k = k + 1;
                if (k >= maximal) {
                    maximal = k;
                    result = i;
                }
            }
            else
                k = 0;
            i = i - 1;
        }
        if (A[i] == 1 && k + 1 >= maximal)
            result = 0;
        return result;
    }

    public static int solutionC(int N) {
        // write your code in Java SE 8

        int temp = N;
        temp++;
        boolean s = false;
        String result = Integer.toBinaryString(temp);
        while (!test(temp)){
            temp++;
        }

        return temp;
    }
    public static boolean test(int temp){

        String s = Integer.toBinaryString(temp);
        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i)=='1' && i+1 < s.length() && s.charAt(i+1) == '1' ){
//                System.out.println(s);
                return false;
            }
        }
//        System.out.println(s);
        return true;

    }



    public static int solutionA(String A, String B) {
        // write your code in Java SE 8
        java.util.List<Character> charsA = new ArrayList<>();
        java.util.List<Character> charsB = new ArrayList<>();

        for (char ch : A.toCharArray()) {
            System.out.println(ch);
            charsA.add(ch);
        }
        for (char ch : B.toCharArray()) {
            System.out.println(ch);
            charsB.add(ch);
        }

        for (int i = 0; i < charsA.size() ; i++) {
            if(charsB.contains(charsA.get(i))) {
                int indis = charsB.indexOf(charsA.get(i));
                charsB.remove(indis);
                charsA.remove(i);
                i=i-1;
            }

        }
        System.out.println(charsA);
        System.out.println(charsB);





        return (charsA.size()+charsB.size());
    }

}
