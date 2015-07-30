package www.xlab.com.main.SimpleDotComGame;

import java.util.ArrayList;

/**
 * Created by qqy on 15/7/22.
 */
public class SimpleDotCom {

//    int[] locationCells;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
//    int numOfHits = 0;

//    public String checkYourself(String stringGuess){
//
//        int guess=Integer.parseInt(stringGuess);
//        String result="miss";

//        for(int cell : locationCells){
//            if (guess==cell) {
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }

//        for(int i = 0 ; i < locationCells.length ; i++){
//            if (guess == locationCells[i]) {
//                locationCells[i] = -1;
//                result = "hit";
//                numOfHits++;
//                break;
//            }
//        }

//        if(numOfHits == locationCells.length){
//            result="kill";
//        }

    public String checkYourself(String userInput){
        String result="miss";

        int index = locationCells.indexOf(userInput);

//        locationCells.forEach(System.out::println);
//
//        System.out.println("index:"+index);
//        System.out.println("userInput:"+userInput);


        if(index >= 0){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                result="hit";
            }
        }

        System.out.println(result);

        return result;
    }

//    public void setLocationCells(int[] loc){
//        locationCells=loc;
//    }




}
