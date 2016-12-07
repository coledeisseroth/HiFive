package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class SetLocation extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_sl);
        mapFragment.getMapAsync(this);
    }
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng stanford = new LatLng(37.424, -122.165);
        mMap.addMarker(new MarkerOptions().position(stanford).title("Marker in Stanford"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stanford, 14));
    }
    public void goToCreateProject(View view){
        Intent intent = new Intent(this, CreateProject.class);
        startActivity(intent);
    }
    public void goToWait(View view){
        ((MyApplication)this.getApplication()).removeCredit();
        Intent intent = new Intent(this, WaitForParticipants.class);
        startActivity(intent);
    }
}
