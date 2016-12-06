package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);

        final Button btSignin = (Button) findViewById(R.id.btSignin);

        final TextView tvSignup = (TextView) findViewById(R.id.tvSignup);

        tvSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tvSigninIntent = new Intent(Login.this, Register.class);
                //Intent tvSigninIntent = new Intent(Login.this, MapsActivity.class);
                Login.this.startActivity(tvSigninIntent);
            }
        });

        btSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (etUsername.getText().toString().equals("CNL")) {
//                    if (etPassword.getText().toString().equals("cs147")) {
                        Intent btSigninIntent = new Intent(Login.this, MapsActivity.class);
                        Login.this.startActivity(btSigninIntent);
//                    } else {
//                        TextView tvPasswordHint = (TextView) findViewById(R.id.tvPasswordHint);
//                        tvPasswordHint.setText("Username and password don't match!");
//                    }
//                }else {
//                    TextView tvUsernameHint = (TextView) findViewById(R.id.tvUsernameHint);
//                    tvUsernameHint.setText("Invalid Username!");
//                }
            }
        });
    }
}
