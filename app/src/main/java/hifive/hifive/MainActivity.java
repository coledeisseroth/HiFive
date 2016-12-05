package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView credits = (TextView)findViewById(R.id.credits_main);
        int nCredits = ((MyApplication)this.getApplication()).getCredits();
        credits.setText("Your credits: " + Integer.toString(nCredits));
        Button createProjectButton = (Button)findViewById(R.id.start_project_button_main);
        if(nCredits < 1){createProjectButton.setText("No credits");}
        else{createProjectButton.setText("Start a project");}
    }
    public void goToProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void goToCreateProject(View view){
        if(((MyApplication)this.getApplication()).getCredits() < 1){return;}
        Intent intent = new Intent(this, CreateProject.class);
        startActivity(intent);
    }
    public void goToFindProject(View view){
        Intent intent = new Intent(this, FindProject.class);
        startActivity(intent);
    }
}
