package hifive.hifive;

import android.content.Intent;
import android.app.Application;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import java.util.ArrayList;

public class Interests extends AppCompatActivity {
    private ArrayList<Button> interestButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);
    }

    public void goToProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void addInterest(View view) {
        EditText editText = (EditText) findViewById(R.id.interest_input);
        String newInterest = editText.getText().toString();
        ((MyApplication) this.getApplication()).addInterest(newInterest);
        Intent intent = new Intent(this, Interests.class);
        startActivity(intent);
        syncInterests(view);
    }
    public void syncInterests(View view){
        while(interestButtons.size() > 0){

        }
    }
}
