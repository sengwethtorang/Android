package com.example.java.layout;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Java on 6/11/2016.
 */
public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder>{
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public TextView location;
        public ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            location = (TextView) itemView.findViewById(R.id.location);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
    private List<Contact>  mContacts;

    public ContactsAdapter(List<Contact> contacts) {
        mContacts = contacts;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.row_layout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact contact = mContacts.get(position);

        // Set item views based on the data model
        TextView name = holder.name;
        name.setText(contact.getName());
        TextView location = holder.location;
        location.setText(contact.getLocation());
        ImageView image = holder.imageView;


    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}

