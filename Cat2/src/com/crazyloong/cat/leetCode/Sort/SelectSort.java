package com.crazyloong.cat.leetCode.Sort;


/**
 * ιζ©ζεΊ
 *
 */
public class SelectSort implements Sorter{


    @Override
    public void sort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
}
