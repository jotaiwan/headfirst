package chapter05;

/**
 * Created by jotaiwan on 5/03/2017.
 */
public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    public void setLocationCells(int[] locs) {
        this.locationCells = locs;
    }

}
