package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FindProject extends AppCompatActivity {

    private String projectTitle0 = "FOIL the government's brain-control conspiracy!";
    private String projectTitle1 = "Eskimo Hentai Addicts Meeting";
    private String projectTitle2 = "Carpool to the furry convention";
    private String projectTitle3 = "Make my cat sing";
    private String projectTitle4 = "Snotty airline flight attendants wanted";
    private String projectTitle5 = "Summoning a demon";
    private String projectTitle6 = "Discreet brony-to-brony discussion";

    private String projectDescription0 = "They will never control MY mind. But others are still vulnerable, without protective aluminum headgear. Help me make more aluminum foil helmets, distribute them to the common folk, and FOIL the government's nefarious plans! Be sure to bring a scrub brush. We must keep our helmets clean to block out those satellite moon beams.";
    private String projectDescription1 = "Eskimos are fine. Anime is alright. Porn is so-so. But eskimo hentai is wonderful! Come here and meet other people who love something that is quite simply terrific.";
    private String projectDescription2 = "Yiff! Yiff! I yiff, you yiff, we all yiff our way to the furry convention! I have a four-person sedan, but we might need somebody else with a car to get all of us there. If all goes well, we can all get there as a gang of furry friends. Bring your costume.";
    private String projectDescription3 = "My cat refuses to sing Ain\'t Nothing but a Hound Dog unless accompanied by an instrumental back-up. But I don't know how to play an instrument. If you can play, and you like singing cats, please help!";
    private String projectDescription4 = "Despite our crappy pretzels, jam-packed seats, and careless baggage handling, our customers just don't feel awful enough. If you know how to act uppity and snobbish, and like to fly, we would like to offer you a job as a flight attendant.";
    private String projectDescription5 = "THE MORTALS WILL PAY FOR THEIR CRIMES AGAINST OUR GREAT LORD MEPHISTOPHELES! JOIN US! DANCE IN THE MORTAL BLOOD AND INVOKE THE WRATH OF THE DARK ONE UPON THE UNSUSPECTING FOOLS THAT REFUSE TO PAY TRIBUTE.";
    private String projectDescription6 = "Going to brony conventions is not enough. Nobody else is willing to talk about, you know, the REAL reason we all love My Little Pony. You know the one. Come join us so we can have a REAL talk about those sexy, sexy ponies.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_project);
        TextView title0 = (TextView) findViewById(R.id.project_title_0);
        title0.setText("(200m) " + projectTitle0);
        TextView title1 = (TextView) findViewById(R.id.project_title_1);
        title1.setText("(500m) " + projectTitle1);
        TextView title2 = (TextView) findViewById(R.id.project_title_2);
        title2.setText("(1km) " + projectTitle2);
        TextView title3 = (TextView) findViewById(R.id.project_title_3);
        title3.setText("(1.5km) " + projectTitle3);
        TextView title4 = (TextView) findViewById(R.id.project_title_4);
        title4.setText("(2km) " + projectTitle4);
        TextView title5 = (TextView) findViewById(R.id.project_title_5);
        title5.setText("(3km) " + projectTitle5);
        TextView title6 = (TextView) findViewById(R.id.project_title_6);
        title6.setText("(5km) " + projectTitle6);

    }
    public void goToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToProjectDescription0(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle0);
        ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription0);
        goToProjectDescription();
    }
    public void goToProjectDescription1(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle1);
        ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription1);
        goToProjectDescription();
    }
    public void goToProjectDescription2(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle2);
        ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription2);
        goToProjectDescription();
    }
    public void goToProjectDescription3(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle3);
        ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription3);
        goToProjectDescription();
    }
    public void goToProjectDescription4(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle4);
        ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription4);
        goToProjectDescription();
    }
    public void goToProjectDescription5(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle5);
        ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription5);
        goToProjectDescription();
    }
    public void goToProjectDescription6(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle6);
        ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription6);
        goToProjectDescription();
    }


    public void goToProjectDescription(){
        Intent intent = new Intent(this, ProjectDescription.class);
        startActivity(intent);
    }
}
