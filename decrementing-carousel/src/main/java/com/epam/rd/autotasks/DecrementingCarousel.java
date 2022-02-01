package com.epam.rd.autotasks;

public class DecrementingCarousel {
    protected int[] array;
    private boolean isRun;
    protected int index;
    public DecrementingCarousel(int capacity) {
        if(capacity<=0)
            throw new IllegalArgumentException();
        array = new int[capacity];
        isRun = false;
        index = 0;
    }

    public boolean addElement(int element){
        if(element<=0 || index >= array.length || isRun)
        {
            return false;
        }
        else
        {
            array[index++] = element;
            return  true;
        }
    }

    public CarouselRun run(){
       if(isRun)
           return  null;
        else
       {
           index = 0;
           isRun = true;
           return new CarouselRun(this);
       }

    }
}
