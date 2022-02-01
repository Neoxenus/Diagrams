package com.epam.rd.autotasks;
import java.util.Arrays;
class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length == 0)
            return;
        int[] buffer = new int[array.length];
        System.arraycopy(array,     0,            buffer,1,array.length-1);
        System.arraycopy(array, array.length - 1, buffer, 0, 1);
        System.arraycopy(buffer, 0, array, 0 , array.length);
    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length == 0)
            return;
        int[] buffer = new int[array.length];
        System.arraycopy(array,0,                       buffer,shift,array.length-shift);
        System.arraycopy(array, array.length - shift, buffer, 0, shift);
        System.arraycopy(buffer, 0, array, 0 , array.length);
    }
}
