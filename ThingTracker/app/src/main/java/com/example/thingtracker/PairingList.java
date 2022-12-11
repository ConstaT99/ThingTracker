package com.example.thingtracker;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Locale;
import java.util.Set;

public class PairingList extends Activity {
    ListView listView;
    String[] pairs;
    ArrayAdapter<String> adapter;
    Set<BluetoothDevice> paired_devices;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parininglist_layout);

        listView = findViewById(R.id.listviewid);
        Bundle bn = getIntent().getExtras();
        pairs = bn.getStringArray("pairs");
        BluetoothAdapter btadapter = BluetoothAdapter.getDefaultAdapter();
        paired_devices = btadapter.getBondedDevices();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pairs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                String name = (String) a.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"Connecting " + name + " .....",Toast.LENGTH_SHORT).show();
                for( BluetoothDevice device : paired_devices){
                    if ( name.equals(device.getName())){
                        device.createBond();
                        Toast.makeText(getApplicationContext(),name + " Connected",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
