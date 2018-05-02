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
public class BuyMeFragment extends Fragment {


    public BuyMeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attractions> attractionInfo = new ArrayList<Attractions>();
        attractionInfo.add(new Attractions(R.string.oxfordst, R.string.oxfordst_address, R.string.cheap_to_mid_range, R.string.oxfordst_hrs, R.string.various_phone, R.drawable.clothes));
        attractionInfo.add(new Attractions(R.string.regentst, R.string.regentst_address, R.string.mid_range_to_expensive, R.string.regentst_hrs, R.string.various_phone, R.drawable.gem));
        attractionInfo.add(new Attractions(R.string.westfield, R.string.westfield_address, R.string.very_cheap_to_cheap, R.string.westfield_hrs, R.string.westfield_phone, R.drawable.clothes));
        attractionInfo.add(new Attractions(R.string.camden_mkt ,R.string.camden_mkt_address, R.string.cheap_to_mid_range, R.string.camden_mkt_hrs, R.string.various_phone, R.drawable.camden));
        attractionInfo.add(new Attractions(R.string.covent_garden, R.string.covent_garden_address, R.string.cheap_to_mid_range, R.string.covent_garden_hrs, R.string.various_phone, R.drawable.gem));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(getActivity(), R.layout.list_of_attractions, attractionInfo);
        ListView listView = rootView.findViewById(R.id.attractionsList);
        listView.setAdapter(itemsAdapter);
        return rootView;

    }

}
