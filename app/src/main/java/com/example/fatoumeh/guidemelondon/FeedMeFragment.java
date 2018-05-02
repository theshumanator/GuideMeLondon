package com.example.fatoumeh.guidemelondon;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedMeFragment extends Fragment {

    public FeedMeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attractions> attractionInfo = new ArrayList<Attractions>();
        attractionInfo.add(new Attractions(R.string.whitecross_food_mkt, R.string.whitecross_food_mkt ,
                R.string.very_cheap_to_cheap, R.string.whitecross_food_mkt_hrs, R.string.whitecross_food_mkt_hrs, R.drawable.foodmarket));
        attractionInfo.add(new Attractions(R.string.alex_fish_bar, R.string.alex_fish_bar_address, R.string.cheap ,
                R.string.alex_fish_bar_hrs, R.string.alex_fish_bar_phone, R.drawable.fish));
        attractionInfo.add(new Attractions(R.string.borough_food_mkt, R.string.borough_food_mkt_address, R.string.cheap,
                R.string.borough_food_mkt_hrs, R.string.borough_food_mkt_phone, R.drawable.foodmarket));
        attractionInfo.add(new Attractions(R.string.stax, R.string.stax_address, R.string.cheap_to_mid_range, R.string.stax_hrs,
                R.string.stax_phone, R.drawable.stax));
        attractionInfo.add(new Attractions(R.string.camden_mkt, R.string.camden_mkt_address, R.string.very_cheap_to_cheap,
                R.string.camden_mkt_hrs, R.string.camden_food_mkt_phone, R.drawable.foodmarket));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(getActivity(), R.layout.list_of_attractions, attractionInfo);
        ListView listView = rootView.findViewById(R.id.attractionsList);
        listView.setAdapter(itemsAdapter);
        return rootView;

    }

}
