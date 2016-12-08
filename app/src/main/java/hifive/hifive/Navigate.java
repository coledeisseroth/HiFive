package hifive.hifive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
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

public class Navigate extends AppCompatActivity implements OnMapReadyCallback {
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_nav);
        mapFragment.getMapAsync(this);
    }
    public void goToJoinProject(View view) {
        Intent intent = new Intent(this, JoinProject.class);
        startActivity(intent);
    }
    //@Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng stanford = new LatLng(37.424, -122.165);
        mMap.addMarker(new MarkerOptions().position(stanford).title("Marker in Stanford"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stanford, 14));
    }
    public void suspend(View view) {
        Intent intent = new Intent(this, ConfirmExit.class);
        startActivity(intent);
    }
}
