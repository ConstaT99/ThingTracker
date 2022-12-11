package com.example.thingtracker;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    BluetoothAdapter btadapter = BluetoothAdapter.getDefaultAdapter();
    int REQUEST_CODE = 1;
    Set<BluetoothDevice> paired_devices;
    String plist[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buzzOn = findViewById(R.id.button);
        Button buzzOff = findViewById(R.id.button2);
        Button bt = findViewById(R.id.button3);

//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.maps);
//        mapFragment.getMapAsync((OnMapReadyCallback) this);

        buzzOn.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Buzz On", Toast.LENGTH_SHORT)
                .show());

        buzzOff.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "Buzz Off", Toast.LENGTH_SHORT)
                .show());

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btadapter == null) {
                    Toast.makeText(getApplicationContext(), "No Bluetooth found", Toast.LENGTH_SHORT).show();
                } else {
                    if (!btadapter.isEnabled()) {
                        Intent i = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(i, REQUEST_CODE);
                    }else{
                        showList();
                    }
                }

            }
        });
    }

    public void showList(){
        paired_devices = btadapter.getBondedDevices();
        int count = paired_devices.size();
        plist = new String[count];
        int j = 0;
        for(BluetoothDevice device : paired_devices){
            plist[j] = device.getName().toString();
            j++;
        }
        Bundle bn = new Bundle();
        bn.putStringArray("pairs", plist);
        Intent in = new Intent("pair_filter");
        in.putExtras(bn);
        startActivity(in);
    }

    public void onActivityResult(int requestCode, int resultcode, Intent data) {
        super.onActivityResult(requestCode, resultcode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultcode == RESULT_OK) {
                Toast.makeText(getApplicationContext(), "Bluetooth Turn on", Toast.LENGTH_SHORT).show();
                showList();
            }
        }
    }

}