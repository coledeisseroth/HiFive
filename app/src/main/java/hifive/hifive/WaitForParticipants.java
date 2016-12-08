package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WaitForParticipants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_for_participants);
        TextView projectTitle = (TextView)findViewById(R.id.project_title_wfp);
        projectTitle.setText(((MyApplication)this.getApplication()).getActiveProjectTitle());
    }
    public void goToMain(View view){
        Intent intent = new Intent(this, ConfirmExit.class);
        startActivity(intent);
    }
    public void goToProjectInProgress(View view){
        Intent intent = new Intent(this, ProjectInProgress.class);
        startActivity(intent);
    }
}
