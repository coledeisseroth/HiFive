package hifive.hifive;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by karl on 11/15/16.
 */
public class MyApplication extends Application {
    private ArrayList<String> interests;
    public ArrayList<String> getInterests(){
        return interests;
    }
    public void addInterest(String newInterest){
        interests.add(newInterest);
    }
    public void removeInterest(int index){
        interests.remove(index);
    }
}
