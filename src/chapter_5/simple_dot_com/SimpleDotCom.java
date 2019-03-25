package chapter_5.simple_dot_com;

public class SimpleDotCom {

    private int[] locationCells;
    private int numOfHits = 0;

    public void setLocationCells (int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        } // out of Loop
        if(numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    } // close method
} // close class