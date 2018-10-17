package com.mohammadramadan.android.contactlist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FreundeActivity extends Activity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        //add items to the layout
        final ArrayList<items> item = new ArrayList<items>();
        item.add(new items("Soma","+495138659",R.drawable.empty_contact));
        item.add(new items("Leo","+495385789",R.drawable.empty_contact));
        item.add(new items("Mark","+495138659",R.drawable.empty_contact));
        item.add(new items ("Leen" ,"+495138649",R.drawable.empty_contact));
        item.add(new items("Flo","+495134562",R.drawable.empty_contact));
        item.add(new items("Leo","+495138636",R.drawable.empty_contact));
        item.add(new items("Trevor","495385789",R.drawable.empty_contact));


        ItemsAdapter adapter = new ItemsAdapter(this,item);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }


}