package com.android.tennislive.player;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.tennislive.R;

import java.util.List;

public class PlayerAdapter extends ArrayAdapter<Player> {

    private int resourceId;

    public PlayerAdapter(Context context, int resourceId, List<Player> objects) {
        super(context, resourceId, objects);
        this.resourceId = resourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Player player = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        ImageView imageView = view.findViewById(R.id.player_image);
        TextView textView = view.findViewById(R.id.player_name);
        imageView.setImageResource(player.getImageId());
        textView.setText(player.getName());
        return view;
    }

}
