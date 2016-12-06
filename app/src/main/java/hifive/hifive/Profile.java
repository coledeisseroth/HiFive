package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView credits = (TextView)findViewById(R.id.credits_p);
        String nCredits = Integer.toString(((MyApplication)this.getApplication()).getCredits());
        credits.setText("Your credits: " + nCredits);
    }

    public void goToMain(View view) {
        finish();
    }
    public void goToInterests(View view) {
        Intent intent = new Intent(this, Interests.class);
        startActivity(intent);
    }
}
