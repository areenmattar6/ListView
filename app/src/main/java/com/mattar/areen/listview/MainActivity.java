package com.mattar.areen.listview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.mattar.areen.listview.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    ArrayList<Toy> toyList;
    ToyAdapter toyAdapter;
    Toy lastSelected;

    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            lastSelected = toyAdapter.getItem(position);
            Intent intent = new Intent(MainActivity.this, EditActivity.class);
            intent.putExtra("title", lastSelected.getTitle());
            intent.putExtra("sub", lastSelected.getSubTitle());
            intent.putExtra("price", String.valueOf(lastSelected.getPrice()));
            //intent.putExtra("bitmap", Helper.bitmapToByteArray(lastSelected.getBitmap()));
            startActivityForResult(intent, 0);
        }
    });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Bitmap pic0 = BitmapFactory.decodeResource(getResources(), R.drawable.coloseom);
      //  Bitmap pic1 = BitmapFactory.decodeResource(getResources(), R.drawable.dog);
       // Bitmap pic2 = BitmapFactory.decodeResource(getResources(), R.drawable.duck);


        Toy t1 = new Toy(50,"home","very good toy","pic0");
        Toy t2 = new Toy(70,"home","average  toy","pic1");
        Toy t3 = new Toy(90,"home","nice toy","pic2");


        //phase 2 - add to array list
        toyList = new ArrayList<Toy>();
        toyList.add(t1);toyList.add(t2);toyList.add(t3);

        //phase 3 - create adapter
        toyAdapter=new ToyAdapter(this,0,0,toyList);
        //phase 4 reference to listview
        lv=(ListView)findViewById(R.id.lv);
        lv.setAdapter(toyAdapter);


    }
}