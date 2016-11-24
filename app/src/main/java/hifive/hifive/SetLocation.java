package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SetLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);
    }
    public void goToCreateProject(View view){
        Intent intent = new Intent(this, CreateProject.class);
        startActivity(intent);
    }
    public void goToWait(View view){
        Intent intent = new Intent(this, WaitForParticipants.class);
        startActivity(intent);
    }
}
