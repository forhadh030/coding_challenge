package org.example;

public class Leetcode {
    public static void main(String[] args) {

        String s = "I am from Bangladesh";
        
        char[] split = s.toCharArray();
        int left = 0;
        int right = split.length - 1;
        char temp;
        while(left <= right) {
            if(split[left] == ' ') {
                left++;
            } else if(split[right] == ' ') {
                right--;
            } else {
                temp = split[left];
                split[left] = split[right];
                split[right] = temp;
                left++; right--;
            }
        }
        System.out.println(new String(split));
    }
}
