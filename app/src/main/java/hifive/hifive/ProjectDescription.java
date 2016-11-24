package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProjectDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_description);
    }
    public void goToFindProject(View view){
        Intent intent = new Intent(this, FindProject.class);
        startActivity(intent);
    }
    public void goToJoinProject(View view){
        Intent intent = new Intent(this, JoinProject.class);
        startActivity(intent);
    }
}
