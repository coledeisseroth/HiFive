package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateProject extends AppCompatActivity {
    private Button[] removeProjectInterestButtons;
    private TextView[] projectInterestViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
        removeProjectInterestButtons = new Button[5];
        projectInterestViews = new TextView[5];
        removeProjectInterestButtons[0] = (Button)findViewById(R.id.remove_project_interest_button_0);
        removeProjectInterestButtons[1] = (Button)findViewById(R.id.remove_project_interest_button_1);
        removeProjectInterestButtons[2] = (Button)findViewById(R.id.remove_project_interest_button_2);
        removeProjectInterestButtons[3] = (Button)findViewById(R.id.remove_project_interest_button_3);
        removeProjectInterestButtons[4] = (Button)findViewById(R.id.remove_project_interest_button_4);
        projectInterestViews[0] = (TextView) findViewById(R.id.project_interest_0);
        projectInterestViews[1] = (TextView) findViewById(R.id.project_interest_1);
        projectInterestViews[2] = (TextView) findViewById(R.id.project_interest_2);
        projectInterestViews[3] = (TextView) findViewById(R.id.project_interest_3);
        projectInterestViews[4] = (TextView) findViewById(R.id.project_interest_4);
        syncProjectInfo();
        syncProjectInterests();
    }
    public void goToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        updateProjectInfo();
    }
    public void goToSetLocation(View view){
        updateProjectInfo();
        Intent intent = new Intent(this, SetLocation.class);
        startActivity(intent);
    }
    public void updateProjectInfo(){
        EditText titleInput = (EditText) findViewById(R.id.title_input);
        String title = titleInput.getText().toString();
        ((MyApplication) this.getApplication()).setProjectTitle(title);
        EditText descriptionInput = (EditText) findViewById(R.id.description_input);
        String description = descriptionInput.getText().toString();
        ((MyApplication) this.getApplication()).setProjectDescription(description);
    }
    public void syncProjectInfo(){
        EditText titleInput = (EditText) findViewById(R.id.title_input);
        String title = ((MyApplication) this.getApplication()).getProjectTitle();
        titleInput.setText(title);
        EditText descriptionInput = (EditText) findViewById(R.id.description_input);
        String description = ((MyApplication) this.getApplication()).getProjectDescription();
        descriptionInput.setText(description);
    }
    public void removeProjectInterest0(View view){removeProjectInterest(0);}
    public void removeProjectInterest1(View view){removeProjectInterest(1);}
    public void removeProjectInterest2(View view){removeProjectInterest(2);}
    public void removeProjectInterest3(View view){removeProjectInterest(3);}
    public void removeProjectInterest4(View view){removeProjectInterest(4);}

    public void addProjectInterest(View view) {
        if(numProjectInterests() > 4){return;}
        EditText editText = (EditText) findViewById(R.id.project_interest_input);
        String newProjectInterest = editText.getText().toString();
        if(newProjectInterest.length() < 1){return;}
        ((MyApplication) this.getApplication()).addProjectInterest(newProjectInterest);
        syncProjectInterests();
    }
    public void removeProjectInterest(int index){
        ((MyApplication) this.getApplication()).removeProjectInterest(index);
        syncProjectInterests();
    }
    public int numProjectInterests(){
        return ((MyApplication) this.getApplication()).getProjectInterests().size();
    }
    public String getProjectInterest(int index){
        return ((MyApplication) this.getApplication()).getProjectInterests().get(index);
    }
    public void syncProjectInterests(){
        for(int i = 0; i < projectInterestViews.length; i++){
            Button rib = removeProjectInterestButtons[i];
            TextView iv = projectInterestViews[i];
            if(i < numProjectInterests()){
                iv.setText(getProjectInterest(i));
                iv.setVisibility(View.VISIBLE);
                rib.setVisibility(View.VISIBLE);
            }
            else{
                iv.setVisibility(View.GONE);
                rib.setVisibility(View.GONE);
            }
        }
    }
}
