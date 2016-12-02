package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProjectInProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_in_progress);
    }
    public void goToMain(View view){
        Intent intent = new Intent(this, ConfirmExit.class);
        startActivity(intent);
    }
    public void goToWaitForFinish(View view){
        Intent intent = new Intent(this, WaitForFinish.class);
        startActivity(intent);
    }
}
