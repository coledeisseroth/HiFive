package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Navigate extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);
    }
    public void goToJoinProject(View view) {
        Intent intent = new Intent(this, JoinProject.class);
        startActivity(intent);
    }
    public void suspend(View view) {
        Intent intent = new Intent(this, ConfirmExit.class);
        startActivity(intent);
    }
}
