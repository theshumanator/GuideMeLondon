package com.example.fatoumeh.guidemelondon;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by fatoumeh on 27/02/2018.
 */

public class AttractionsAdapter extends ArrayAdapter<Attractions> {
    public AttractionsAdapter(Context context, int list_of_attractions, ArrayList<Attractions> attractionInfo) {
        super(context, 0, attractionInfo);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View attractionView = convertView;
        if (attractionView == null) {
            attractionView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_of_attractions, parent, false);
        }

        Attractions currentAttraction = getItem(position);

        TextView tvName = attractionView.findViewById(R.id.name_text_view);
        tvName.setText(currentAttraction.getName());

        TextView tvAddress = attractionView.findViewById(R.id.address_text_view);
        tvAddress.setText(currentAttraction.getAddress());

        TextView tvPhone = attractionView.findViewById(R.id.phone_text_view);
        tvPhone.setText(currentAttraction.getPhoneNumber());

        TextView tvOpeningHrs = attractionView.findViewById(R.id.opening_hrs_text_view);
        tvOpeningHrs.setText(currentAttraction.getOpeningHrs());

        TextView tvCost = attractionView.findViewById(R.id.cost_text_view);
        tvCost.setText(currentAttraction.getCost());

        ImageView imageView = attractionView.findViewById(R.id.attractionImgId);
        if (currentAttraction.hasImage()) {
            imageView.setImageResource(currentAttraction.getImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return attractionView;

    }
}
