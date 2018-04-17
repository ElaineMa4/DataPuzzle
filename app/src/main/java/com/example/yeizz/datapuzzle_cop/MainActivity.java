package com.example.yeizz.datapuzzle_cop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DBHelper db;
    private List<FileFragment> fileFragmentsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BtConnect = findViewById(R.id.BtConnect);

        db = new DBHelper(this);
        createFileFragment("FileA", "File1","File2","File3");
        fileFragmentsList.addAll(db.getAllFiles());


    }

    public void createFileFragment(String Origin, String FileOne, String FileTwo, String FileThree){
        long id = db.insertFileFragments(Origin,FileOne,FileTwo,FileThree);
        FileFragment n = db.getFile(id);
        if (n != null) {
            fileFragmentsList.add(0, n);
            //// refreshing the list
            //mAdapter.notifyDataSetChanged();

        }

    }
}
