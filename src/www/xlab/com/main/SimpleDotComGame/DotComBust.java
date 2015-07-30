package www.xlab.com.main.SimpleDotComGame;

import java.util.ArrayList;

/**
 * Created by qqy on 15/7/24.
 */
public class DotComBust {

    /**
     * 声明并初始化变量
     */
    private GameHelper helper=new GameHelper();
    private ArrayList<DotCom> dotComsList=new ArrayList<DotCom>();
    private int numberOfGuesses=0;

    private void setUpGame(){

        /**
         * 创建3个DotCom对象并指派名称并置入ArrayList
         */
        DotCom one=new DotCom();
        one.setName("Pets.com");
        DotCom two=new DotCom();
        two.setName("eToys.com");
        DotCom three=new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        /**
         * 列出简短的提示
         */
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (DotCom dotComToSet:dotComsList){//对List中的每个DotCom重复一次
            ArrayList<String> newLocation=helper.placeDotCom(3); //要求DotCom的位置
            dotComToSet.setLocaltionCells(newLocation);//调用这个Dotcom的setter方法来指派刚取得的位置
        }
    }

    private void startPlaying(){
        while (!dotComsList.isEmpty()){//判断Dotcom的List是否为空
            String userGuess=helper.getUserInput("Enter a guess:");//取得玩家输入
            checkUserGuess(userGuess); //调用checkUserGuess方法
        }
        finishGame();//调用finishGame方法
    }

    private void checkUserGuess(String userGuess) {
        numberOfGuesses++;//
        String result="miss";//先假设没有命中

        for (DotCom dotComToTest:dotComsList){//对list中所有的DotCom
            result=dotComToTest.checkYourself(userGuess);//
            if (result.equals("hit")){
                break;//
            }
            if (result.equals("kill")){
                dotComsList.remove(dotComToTest);//
                break;
            }
        }
        System.out.println(result);//
    }

    private void finishGame() {

        /**
         *列出所有玩家成绩
         */
        System.out.println("All Dot Coms are dead! Your stock is now worthless.");
        if (numberOfGuesses<=18){
            System.out.println("It only took you "+numberOfGuesses+" guesses.");
            System.out.println("You got out before your options sank.");
        }else{
            System.out.println("Took you long enough. "+numberOfGuesses+" guesses.");
            System.out.println("Fish are dancing with your option.");
        }
    }

    public static void main(String[] args){
        DotComBust game=new DotComBust();//
        game.setUpGame();//
        game.startPlaying();//要求游戏对象启动
    }
}
