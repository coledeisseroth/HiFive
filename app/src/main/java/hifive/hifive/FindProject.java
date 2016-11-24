package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FindProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_project);
    }
    public void goToMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void goToProjectDescription0(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle("FOIL the government\'s brain-control conspiracy!");
        ((MyApplication) this.getApplication()).setActiveProjectDescription("They will never control MY mind. But others are still vulnerable, without protective aluminum headgear. Help me make more aluminum foil helmets, distribute them to the common folk, and FOIL the government's nefarious plans! Be sure to bring a scrub brush. We must keep our helmets clean to block out those satellite moon beams.");
        goToProjectDescription();
    }
    public void goToProjectDescription1(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle("Eskimo Hentai Addicts Meeting");
        ((MyApplication) this.getApplication()).setActiveProjectDescription("Eskimos are fine. Anime is alright. Porn is so-so. But eskimo hentai is wonderful! Come here and meet other people who love something that is quite simply terrific.");
        goToProjectDescription();
    }
    public void goToProjectDescription2(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle("Carpool to the furry convention");
        ((MyApplication) this.getApplication()).setActiveProjectDescription("Yiff! Yiff! I yiff, you yiff, we all yiff our way to the furry convention! I have a four-person sedan, but we might need somebody else with a car to get all of us there. If all goes well, we can all get there as a gang of furry friends. Bring your costume.");
        goToProjectDescription();
    }
    public void goToProjectDescription3(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle("Make my cat sing");
        ((MyApplication) this.getApplication()).setActiveProjectDescription("My cat refuses to sing Ain\'t Nothing but a Hound Dog unless accompanied by an instrumental back-up. But I don't know how to play an instrument. If you can play, and you like singing cats, please help!");
        goToProjectDescription();
    }
    public void goToProjectDescription4(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle("Snotty airline flight attendants wanted");
        ((MyApplication) this.getApplication()).setActiveProjectDescription("Despite our crappy pretzels, jam-packed seats, and careless baggage handling, our customers just don't feel awful enough. If you know how to act uppity and snobbish, and like to fly, we would like to offer you a job as a flight attendant.");
        goToProjectDescription();
    }
    public void goToProjectDescription5(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle("Summoning a demon");
        ((MyApplication) this.getApplication()).setActiveProjectDescription("THE MORTALS WILL PAY FOR THEIR CRIMES AGAINST OUR GREAT LORD MEPHISTOPHELES! JOIN US! DANCE IN THE MORTAL BLOOD AND INVOKE THE WRATH OF THE DARK ONE UPON THE UNSUSPECTING FOOLS THAT REFUSE TO PAY TRIBUTE.");
        goToProjectDescription();
    }
    public void goToProjectDescription6(View view){
        ((MyApplication) this.getApplication()).setActiveProjectTitle("Discreet brony-to-brony discussion");
        ((MyApplication) this.getApplication()).setActiveProjectDescription("Going to brony conventions is not enough. Nobody else is willing to talk about, you know, the REAL reason we all love My Little Pony. You know the one. Come join us so we can have a REAL talk about those sexy, sexy ponies.");
        goToProjectDescription();
    }


    public void goToProjectDescription(){
        Intent intent = new Intent(this, ProjectDescription.class);
        startActivity(intent);
    }
}
