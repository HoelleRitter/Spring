package com.text;

public class Solution {
     public static void main(String[] args){
         long n=4294967293l;
        reverseBits(n);
    }
//    11111111111111111111111111
public static int reverseBits(long n) {
    int[] temp =new int[32];
    int i =0;
    while(n>0){
        if(n%2==1){
            temp[i]=1;
            n/=2;
        }else{
            temp[i]=0;
            n/=2;
        }
        i++;
    }

    int ans =0;

    for(int j =31;j>=0;j--){

        ans+=Math.pow(2,31-j)*temp[j];

    }

    return ans;
}
}
