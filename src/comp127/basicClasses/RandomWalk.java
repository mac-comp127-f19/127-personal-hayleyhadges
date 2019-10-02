package comp127.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int curVal;
    public int min;
    public int max;
    /**
     * Creates a new random walk starting with some initial value.
     * TODO: Adjust this constructor to take an initial value for the walk.
     */
    public RandomWalk(int curVal,int min, int max) {
        rng = new Random();
        this.curVal = curVal;
        this.min=min;
        this.max=max;
    }

    /**
     * TODO Complete me.
     * @return the current value for the random walk.
     */
    public int getValue() {
        return this.curVal;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * TODO: Complete me.
     * @return Updated value.
     */
    public int advanceValue() {


//        curVal = rng.nextBoolean() ? curVal++ : curVal--;
        if (rng.nextBoolean()){
            if(curVal == max){
                curVal--;
            }
            else{
                curVal ++;
            }
        }
        else{
            if(curVal == min) {
                curVal++;
            }else {
                curVal--;
            }
        }
        return curVal;
        }

    }


