package com.mohammadramadan.android.contactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<items> {

    /**
     * {@link ItemsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
     * based on a data source, which is a list of {@link items} objects.
     */

    public ItemsAdapter  (Context context, ArrayList<items> item){
        super (context,0,item);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_view, parent, false);
        }

        items currentItems = getItem(position);

        TextView contactTextView = (TextView) listItemView.findViewById(R.id.contact_name);
        contactTextView.setText(currentItems.getContactName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.contact_number);
        numberTextView.setText(currentItems.getContactNumber());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentItems.hasImageResId());
        imageView.setVisibility(View.VISIBLE);

        return  listItemView;

    }
}
