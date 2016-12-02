package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class JoinProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_project);
        TextView projectTitle = (TextView) findViewById(R.id.project_title_jp);
        projectTitle.setText(((MyApplication)this.getApplication()).getActiveProjectTitle());
    }
    public void goToMain(View view){
        Intent intent = new Intent(this, ConfirmExit.class);
        startActivity(intent);
    }
    public void goToWaitForStart(View view){
        Intent intent = new Intent(this, WaitForStart.class);
        startActivity(intent);
    }
}
