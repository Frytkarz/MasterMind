package oth.mastermind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Fryta on 16.02.15.
 */
public class Model {
    //int[] settings=new int[3];
    DataBase dataBase;

    int[] winBalls=new int[4];
    List<int[]> playerBalls=new ArrayList<int[]>(0);
    List<int[]> answerBalls=new ArrayList<int[]>(0);

    int steps;
    Date start;

    Model(){
        steps=0;
        dataBase=new DataBase();
    }

    public long[] pointCounter(){
        long[] out=new long[2];
        out[0]=dataBase.settings[2]*100+dataBase.settings[1]*10+dataBase.settings[0]; //pierwsza komórka zawiera typ trudnosci w ostaci liczby w systemie dwujokwym trzycyfrowej odpowiadającej ułożeniu w activity settings
        out[1]=0;
        if(dataBase.settings[0]==1) {
            long startms, stopms;
            startms = start.getTime();
            Date stop = new Date();
            stopms = stop.getTime();
            out[1]=(stopms-startms)/20000;
        }
        out[1]+=steps;
        return out;
    }

    public void setWinBalls() { //losowanie musi nastapić dopiero po pierwszym wprowadzeniu
        start= new Date();
        steps=0;
        Random generator = new Random();

        for(int i=0; i<4; i++) {
            winBalls[i] = generator.nextInt(8);
                if(dataBase.settings[2]==0){
                    for(int j=i-1; j>=0; j--){
                        if(winBalls[i]==winBalls[j])
                            i--;
                    }
                }
            }
    }

    public void addPlayerBalls(int ball0, int ball1, int ball2, int ball3){
        int[] balls=new int[4];
        balls[0]=ball0;
        balls[1]=ball1;
        balls[2]=ball2;
        balls[3]=ball3;
        playerBalls.add(balls);
        steps++;
    }

    public void resetPlayerBalls(){
        playerBalls.clear();
    }

    public int[] returnPlayerBalls(int position){
        int out[]=new int[4];
        if(steps>=position && position>=0)
            out=playerBalls.get(position);
        else
            out[0]=out[1]=out[2]=out[3]=0;
        return out;
    }

    public void checkBalls(){
        int out[]= new int[4];

        for(int i=0; i<4; i++) {
            if (playerBalls.get(steps-1)[i] == winBalls[i])
                out[i]=2;
            else if (playerBalls.get(steps-1)[i]== winBalls[0] || playerBalls.get(steps-1)[i]== winBalls[1] || playerBalls.get(steps-1)[i]== winBalls[2] || playerBalls.get(steps-1)[i]== winBalls[3])
                out[i]=1;
            else
                out[i]=0;
        }

        if(dataBase.settings[1]==1){ //mieszanie tablicy
            List<Integer> list = new ArrayList<>();
            for (int i=0; i<4; i++)
                list.add(out[i]);
            Collections.shuffle(list);
            for (int i = 0; i < list.size(); i++)
                out[i] = list.get(i);
        }
        answerBalls.add(out);
    }


}
