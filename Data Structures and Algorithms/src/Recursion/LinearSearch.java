package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 5, 6, 7, 8 };
        System.out.println(search(arr, 4, 0));
        System.out.println(findIndex(arr, 4, 0));
//        findAllIndex(arr, 4, 0);
//        System.out.println(list);
//        ArrayList<Integer> ans = new ArrayList<>();
//        System.out.println(findAllIndex(arr, 4, 0, ans ));
        System.out.println(findAllIndex2(arr, 4, 0));
    }

    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr, target,index+1);
    }
    static int findIndex (int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex (int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);

    }

//    not creating list outside bt by adding it in as a parameter
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }

//    not creating list outside nor passing it as a parameter
    static ArrayList<Integer> findAllIndex2 (int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }
//        this will contain ans for tat function call only
        if (arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
