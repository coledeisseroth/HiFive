package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WaitForStart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_for_start);
    }
    public void goToProjectInProgress(View view) {
        Intent intent = new Intent(this, ProjectInProgress.class);
        startActivity(intent);
    }
    public void goToMain(View view) {
        Intent intent = new Intent(this, ConfirmExit.class);
        startActivity(intent);
    }
}
