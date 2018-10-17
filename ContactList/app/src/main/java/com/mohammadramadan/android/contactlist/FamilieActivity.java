package com.mohammadramadan.android.contactlist;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class FamilieActivity extends Activity{
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        //add items to the layout
        final ArrayList<items> item = new ArrayList<items>();
        item.add(new items("Meine Frau","Du hast keine",R.drawable.empty_contact));
        item.add(new items("Mutter","+495385789",R.drawable.empty_contact));
        item.add(new items("Vater","+495135468",R.drawable.empty_contact));
        item.add(new items ("Brudder" ,"+495138649",R.drawable.empty_contact));
        item.add(new items("Schwester","+495134562",R.drawable.empty_contact));



        ItemsAdapter adapter = new ItemsAdapter(this,item);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }


}