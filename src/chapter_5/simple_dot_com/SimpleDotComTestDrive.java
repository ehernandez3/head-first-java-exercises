package chapter_5.simple_dot_com;

public class SimpleDotComTestDrive {

//  METHOD String checkYourself(String userGuess)
//      GET the user guess as a String parameter
//      CONVERT the user guess to an Int
//      REPEAT with each of the location cells in the Int array
//          // COMPARE the user guess to the location cell
//          IF the user guess matches
//              INCREMENT the number of hits
//              // FIND OUT if it was the last location cell:
//              IF number of hits is 3.RETURN "Kill" as the result
//              ELSE it was not a kill, so RETURN "Hit"
//              END IF
//          ELSE the user guess did not match, so RETURN "Miss"
//          END IF
//      END REPEAT
//  END METHOD

//    Here's what we should test:
//            1. Instantiate a SlmpleDotCom object.
//            2. Assign It a location (an array of 3 ints, like {2,3.4}).
//            3. Create a String to represent a user guess ('2", '0', etc.).
//            4. Invoke the checkYourselfO method passing il the fake user guess.
//            5. Print out the result to see If It's correct ("passed" or "failed").

    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

    }
}
