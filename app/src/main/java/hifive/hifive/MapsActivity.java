package hifive.hifive;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class MapsActivity extends FragmentActivity implements
        OnMarkerClickListener, OnMapReadyCallback{

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


    private GoogleMap mMap;
    private Marker event0;
    private Marker event1;
    private Marker event2;
    private Marker event3;
    private Marker event4;
    private Marker event5;
    private Marker event6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map_main);
        mapFragment.getMapAsync(this);
        TextView credits = (TextView)findViewById(R.id.credits_main);
        int nCredits = ((MyApplication)this.getApplication()).getCredits();
        credits.setText("Your credits: " + Integer.toString(nCredits));
        Button createProjectButton = (Button)findViewById(R.id.start_project_button_main);
        if(nCredits < 1){createProjectButton.setText("No credits");}
        else{createProjectButton.setText("Start a project");}
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    //@Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //mClusterManager = new ClusterManager<>(getActivity(), googleMap);

        // Add a marker in Sydney and move the camera
        LatLng stanford = new LatLng(37.424, -122.165);
        mMap.addMarker(new MarkerOptions().position(stanford).title("Marker in Stanford"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stanford, 16));

        event0 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4236, -122.1643))
                .title(projectTitle0)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        event1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.422, -122.1646))
                .title(projectTitle1)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        event2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4224, -122.1651))
                .title(projectTitle2)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        event3 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4233, -122.1656))
                .title(projectTitle3)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        event4 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4228, -122.168))
                .title(projectTitle4)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        event5 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4231, -122.1667))
                .title(projectTitle5)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        event6 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(37.4221, -122.1658))
                .title(projectTitle6)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));



        mMap.setOnMarkerClickListener(this);

        //Intent intent = new Intent(MapsActivity.this, FindProject.class);
        //startActivity(intent);
    }
    public boolean onMarkerClick(Marker marker) {
        //Log.i("GoogleMapActivity", "onMarkerClick");
        if (marker.equals(event0)) {
            ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle0);
            ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription0);
            goToProjectDescription();
        }else if (marker.equals(event1)) {
            ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle1);
            ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription1);
            goToProjectDescription();
        }else if (marker.equals(event2)) {
            ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle2);
            ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription2);
            goToProjectDescription();
        }else if (marker.equals(event3)) {
            ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle3);
            ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription3);
            goToProjectDescription();
        }else if (marker.equals(event4)) {
            ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle4);
            ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription4);
            goToProjectDescription();
        }else if (marker.equals(event5)) {
            ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle5);
            ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription5);
            goToProjectDescription();
        }else if (marker.equals(event6)) {
            ((MyApplication) this.getApplication()).setActiveProjectTitle(projectTitle6);
            ((MyApplication) this.getApplication()).setActiveProjectDescription(projectDescription6);
            goToProjectDescription();
        }
        return false;
    }
    //@Override
    /*protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView credits = (TextView)findViewById(R.id.credits_main);
        int nCredits = ((MyApplication)this.getApplication()).getCredits();
        credits.setText("Your credits: " + Integer.toString(nCredits));
        Button createProjectButton = (Button)findViewById(R.id.start_project_button_main);
        if(nCredits < 1){createProjectButton.setText("No credits");}
        else{createProjectButton.setText("Start a project");}
    }*/
    public void goToProfile(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
    public void goToCreateProject(View view){
        if(((MyApplication)this.getApplication()).getCredits() < 1){return;}
        Intent intent = new Intent(this, CreateProject.class);
        startActivity(intent);
    }

    public void goToProjectDescription(){
        Intent intent = new Intent(this, ProjectDescription.class);
        startActivity(intent);
    }

    public void goToFindProject(View view) {
        Intent intent = new Intent(this, FindProject.class);
        startActivity(intent);
    }
}
