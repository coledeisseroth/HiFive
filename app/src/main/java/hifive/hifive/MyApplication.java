package hifive.hifive;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by karl on 11/15/16.
 */
public class MyApplication extends Application {
    private ArrayList<String> interests = new ArrayList<String>();
    public ArrayList<String> getInterests(){
        return interests;
    }
    public void addInterest(String newInterest){
        interests.add(newInterest);
    }
    public void removeInterest(int index){
        interests.remove(index);
    }
    private ArrayList<String> projectInterests = new ArrayList<String>();
    public ArrayList<String> getProjectInterests(){ return projectInterests;}
    public void addProjectInterest(String newInterest) {projectInterests.add(newInterest);}
    public void removeProjectInterest(int index) { projectInterests.remove(index);}
}
