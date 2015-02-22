package oth.mastermind;

/**
 * Created by Fryta on 18.02.15.
 */

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    int[] settings=new int[3];

    int numberOfBests;
    public List<Result> bestResults=new ArrayList<Result>(0);

    DataBase(){

    }

    public void setSettings(int[] set) {
        for(int i=0; i<=3; i++)
            settings[i]=set[i];
    }

    public void setNumberOfBests(int _numberOfBests){
        numberOfBests=_numberOfBests;
    }

    public boolean checkResult(int _points){
        if(_points>bestResults.get(bestResults.size()-1).points)
            return true;
        else
            return false;
    }

    public boolean addBestResult(long _points, String _name, int _settings){
        int end=bestResults.size();
        for(int i=0; i<end; i++){
            if(bestResults.get(i).points<_points){
                Result result=new Result(_points, _name, _settings);
                bestResults.add(i, result);
                return true;
            }
        }
        return false;
    }

}

class Result{
    String name;
    long points;
    int settings;

    Result(long _points, String _name, int _settings){
        points=_points;
        name=_name;
        settings=_settings;
    }
}