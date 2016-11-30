package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ProjectDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_description);
        TextView title = (TextView) findViewById(R.id.project_title);
        title.setText(((MyApplication) this.getApplication()).getActiveProjectTitle());
        TextView description = (TextView) findViewById(R.id.project_description);
        description.setText(((MyApplication) this.getApplication()).getActiveProjectDescription());
    }
    public void goToFindProject(View view){
        Intent intent = new Intent(this, FindProject.class);
        startActivity(intent);
    }
    public void goToNavigate(View view){
        Intent intent = new Intent(this, Navigate.class);
        startActivity(intent);
    }
}
