package com.mohammadramadan.android.contactlist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class ArbeitsActivity extends Activity{
        @Override
        protected void onCreate( Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list_view);


            //add items to the layout
            final ArrayList<items> item = new ArrayList<items>();
            item.add(new items("Der Chef","+495138659",R.drawable.empty_contact));
            item.add(new items("Mona","+495385789",R.drawable.empty_contact));
            item.add(new items("Patryk","+495138659",R.drawable.empty_contact));
            item.add(new items("Heidi" ,"+495138649",R.drawable.empty_contact));
            item.add(new items("F.Cena","+495134562",R.drawable.empty_contact));
            item.add(new items("Leo","+495138636",R.drawable.empty_contact));
            item.add(new items("sekretaerin","495385789",R.drawable.empty_contact));


            ItemsAdapter adapter = new ItemsAdapter(this,item);
            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);


        }


    }