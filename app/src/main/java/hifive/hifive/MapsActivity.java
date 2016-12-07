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
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_main);
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

        // Add a marker in Sydney and move the camera
        LatLng stanford = new LatLng(37.424, -122.165);
        mMap.addMarker(new MarkerOptions().position(stanford).title("Marker in Stanford"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stanford, 14));
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
    public void goToFindProject(View view){
        Intent intent = new Intent(this, FindProject.class);
        startActivity(intent);
    }
}
