package com.yetanotherweatherapplication.angrylobster.yetanotherweatherapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mDataSource;
    private ListView mListView;
    private ArrayAdapter<String> mStringArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataSource = new ArrayList<String>();
        mListView = (ListView) findViewById(R.id.location_list);

        mDataSource.add("Singapore");
        mDataSource.add("Malaysia");

        mStringArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mDataSource);

        mListView.setAdapter(mStringArrayAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.button_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.add_location){
            Toast.makeText(this, "Adding!", Toast.LENGTH_SHORT).show();
            mDataSource.add("India");
            mStringArrayAdapter.notifyDataSetChanged();
        }

        return true;
    }

}
