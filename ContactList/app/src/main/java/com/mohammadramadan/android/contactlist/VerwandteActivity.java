package com.mohammadramadan.android.contactlist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class VerwandteActivity extends Activity {
        @Override
        protected void onCreate( Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list_view);


            //add items to the layout
            final ArrayList<items> item = new ArrayList<items>();

            item.add(new items("Oma","+495138636",R.drawable.empty_contact));
            item.add(new items("Opa","495385789",R.drawable.empty_contact));
            item.add(new items("Onkel","+495138659",R.drawable.empty_contact));
            item.add(new items("Tante","+495385789",R.drawable.empty_contact));
            item.add(new items("H.Sadon","+495138659",R.drawable.empty_contact));
            item.add(new items("F.lipp" ,"+495138649",R.drawable.empty_contact));
            item.add(new items("Son von Maria","+495134562",R.drawable.empty_contact));


            ItemsAdapter adapter = new ItemsAdapter(this,item);
            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);


        }


    }