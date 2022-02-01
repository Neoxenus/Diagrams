package com.epam.rd.autotasks;

public class CarouselRun {
    private final DecrementingCarousel value;
    public CarouselRun(DecrementingCarousel startValue)
    {
        value = startValue;
    }

    public int next() {
        if(isFinished())
            return -1;
       while(value.array[value.index]<=0)
       {
           iteration();
       }
       int result = value.array[value.index];
       value.array[value.index]--;
       iteration();
       return result;
    }

    public boolean isFinished() {
        for(int i=0;i<value.array.length;++i) {
            if(value.array[i]>0)
                return false;
        }
        return  true;
    }
    private void iteration()
    {
        value.index++;
        value.index %= value.array.length;
    }

}
