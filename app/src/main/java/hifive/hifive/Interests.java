package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Interests extends AppCompatActivity {
    private Button[] removeInterestButtons;
    private TextView[] interestViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);
        removeInterestButtons = new Button[7];
        interestViews = new TextView[7];
        removeInterestButtons[0] = (Button)findViewById(R.id.remove_interest_0);
        removeInterestButtons[1] = (Button)findViewById(R.id.remove_interest_1);
        removeInterestButtons[2] = (Button)findViewById(R.id.remove_interest_2);
        removeInterestButtons[3] = (Button)findViewById(R.id.remove_interest_3);
        removeInterestButtons[4] = (Button)findViewById(R.id.remove_interest_4);
        removeInterestButtons[5] = (Button)findViewById(R.id.remove_interest_5);
        removeInterestButtons[6] = (Button)findViewById(R.id.remove_interest_6);
        interestViews[0] = (TextView) findViewById(R.id.interest_0);
        interestViews[1] = (TextView) findViewById(R.id.interest_1);
        interestViews[2] = (TextView) findViewById(R.id.interest_2);
        interestViews[3] = (TextView) findViewById(R.id.interest_3);
        interestViews[4] = (TextView) findViewById(R.id.interest_4);
        interestViews[5] = (TextView) findViewById(R.id.interest_5);
        interestViews[6] = (TextView) findViewById(R.id.interest_6);
        syncInterests();
    }

    public void goToProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void removeInterest0(View view){removeInterest(view, 0);}
    public void removeInterest1(View view){removeInterest(view, 1);}
    public void removeInterest2(View view){removeInterest(view, 2);}
    public void removeInterest3(View view){removeInterest(view, 3);}
    public void removeInterest4(View view){removeInterest(view, 4);}
    public void removeInterest5(View view){removeInterest(view, 5);}
    public void removeInterest6(View view){removeInterest(view, 6);}

    public void addInterest(View view) {
        if(numInterests() > 6){return;}
        EditText editText = (EditText) findViewById(R.id.interest_input);
        String newInterest = editText.getText().toString();
        if(newInterest.length() < 1){return;}
        ((MyApplication) this.getApplication()).addInterest(newInterest);
        syncInterests();
    }
    public void removeInterest(View view, int index){
        ((MyApplication) this.getApplication()).removeInterest(index);
        syncInterests();
    }
    public int numInterests(){
        return ((MyApplication) this.getApplication()).getInterests().size();
    }
    public String getInterest(int index){
        return ((MyApplication) this.getApplication()).getInterests().get(index);
    }
    public void syncInterests(){
        for(int i = 0; i < interestViews.length; i++){
            Button rib = removeInterestButtons[i];
            TextView iv = interestViews[i];
            if(i < numInterests()){
                iv.setText(getInterest(i));
                iv.setVisibility(View.VISIBLE);
                rib.setVisibility(View.VISIBLE);
            }
            else{
                iv.setVisibility(View.GONE);
                rib.setVisibility(View.GONE);
            }
        }
    }
}
