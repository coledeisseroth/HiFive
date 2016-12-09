package hifive.hifive;

import android.app.Application;
import android.content.Intent;

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
    private String projectTitle = "";
    public String getProjectTitle(){return projectTitle;}
    public void setProjectTitle(String newTitle){projectTitle = newTitle;}
    private String projectDescription = "";
    public String getProjectDescription(){return projectDescription;}
    public void setProjectDescription(String newDescription){projectDescription = newDescription;}
    private String activeProjectTitle = "";
    public String getActiveProjectTitle(){return activeProjectTitle;}
    public void setActiveProjectTitle(String newTitle){activeProjectTitle = newTitle;}
    private String activeProjectDescription = "";
    public String getActiveProjectDescription(){return activeProjectDescription;}
    public void setActiveProjectDescription(String newDescription){activeProjectDescription = newDescription;}
    private int credits = 1;
    public void addCredit(){credits++;}
    public int getCredits(){return credits;}
    public void removeCredit(){credits--;}
    private String username = "Nigel Thornberry";
    public void setUsername(String newName){username = newName;}
    public String getUsername(){return username;}
}
