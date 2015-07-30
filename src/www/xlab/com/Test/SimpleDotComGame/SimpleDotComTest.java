package www.xlab.com.Test.SimpleDotComGame;

import org.junit.Test;
import www.xlab.com.main.SimpleDotComGame.SimpleDotCom;

import java.util.ArrayList;


/**
 * Created by qqy on 15/7/22.
 */
public class SimpleDotComTest {

    @Test
    public static void main(String[] args){

        SimpleDotCom dot=new SimpleDotCom();
//        int[] locations={2,3,4};
        ArrayList locations=new ArrayList<>();
        locations.add(2);
        locations.add(3);
        locations.add(4);
        dot.setLocationCells(locations);
        String userGuess="2";
        String result=dot.checkYourself(userGuess);

        String testResult="failed";

        if(result.equals("hit")){
            testResult="passed";
        }

        System.out.println(testResult);
    }
}