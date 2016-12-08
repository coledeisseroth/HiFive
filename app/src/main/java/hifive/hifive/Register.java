package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
    }
    public void goToInterests(View view){
        String username = ((EditText)findViewById(R.id.etName)).getText().toString();
        if(username.length() < 1){username = "Nigel Thornberry";}
        ((MyApplication)this.getApplication()).setUsername(username);
        Intent btSigninIntent = new Intent(this, Interests.class);
        this.startActivity(btSigninIntent);
    }
}
