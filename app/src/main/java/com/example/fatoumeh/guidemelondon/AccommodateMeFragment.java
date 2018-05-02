package com.example.fatoumeh.guidemelondon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class AccommodateMeFragment extends Fragment {

    public AccommodateMeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attractions> attractionInfo = new ArrayList<Attractions>();
        attractionInfo.add(new Attractions(R.string.shangrila, R.string.shangrila_address, R.string.expensive, R.string.allday, R.string.shangrila_phone, R.drawable.hotel));
        attractionInfo.add(new Attractions(R.string.generator, R.string.generator_address, R.string.cheap, R.string.allday, R.string.generator_phone, R.drawable.hometel));
        attractionInfo.add(new Attractions(R.string.zhotel, R.string.zhotel_address, R.string.mid_range, R.string.allday, R.string.zhotel_phone, R.drawable.hotel));
        attractionInfo.add(new Attractions(R.string.aloft, R.string.aloft_address, R.string.cheap, R.string.allday, R.string.aloft_phone, R.drawable.hometel));
        attractionInfo.add(new Attractions(R.string.browns, R.string.browns_address, R.string.mid_range, R.string.allday, R.string.browns_phone, R.drawable.hometel));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(getActivity(), R.layout.list_of_attractions, attractionInfo);
        ListView listView = rootView.findViewById(R.id.attractionsList);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
