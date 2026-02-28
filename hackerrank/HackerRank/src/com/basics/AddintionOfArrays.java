package com.basics;

import java.util.HashMap;

public class AddintionOfArrays {

    public static void main(String[] args) {
        int[] a = {2,7,5,4,3,2};
        int[] result = calculateTarget(a,9);
        System.out.println(result[0]+","+result[1]);
    }

    private static int[] calculateTarget(int[] a, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            int complement = target-a[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else{
                map.put(a[i],i);
            }
        }
        return new int[]{};
    }
}
