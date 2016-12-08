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
        TextView username = (TextView)findViewById(R.id.user_name_profile);
        username.setText(((MyApplication)this.getApplication()).getUsername());
    }


    public void goToMap(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void goToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToInterests(View view) {
        Intent intent = new Intent(this, Interests.class);
        startActivity(intent);
    }
}
