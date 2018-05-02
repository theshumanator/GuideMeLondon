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
public class ShowMeFragment extends Fragment {

    public ShowMeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attractions> attractionInfo = new ArrayList<Attractions>();
        attractionInfo.add(new Attractions(R.string.big_ben, R.string.big_ben_address, R.string.cheap, R.string.big_ben_hrs,
                R.string.big_ben_phone, R.drawable.bigben));
        attractionInfo.add(new Attractions(R.string.tower_bridge, R.string.tower_bridge_address, R.string.free, R.string.allday,
                R.string.tower_bridge_phone, R.drawable.towerbridge));
        attractionInfo.add(new Attractions(R.string.buckingham_palace, R.string.buckingham_palace_address, R.string.cheap,
                R.string.wbuckingham_palace_hrs, R.string.buckingham_palace_phone, R.drawable.palace));
        attractionInfo.add(new Attractions(R.string.hyde_park, R.string.hyde_park_address, R.string.free, R.string.allday,
                R.string.hyde_park_phone, R.drawable.park));
        attractionInfo.add(new Attractions(R.string.greenwich_obs, R.string.greenwich_obs_address, R.string.free, R.string.allday,
                R.string.greenwich_obs_phone, R.drawable.greenwich));

        AttractionsAdapter itemsAdapter = new AttractionsAdapter(getActivity(), R.layout.list_of_attractions, attractionInfo);
        ListView listView = rootView.findViewById(R.id.attractionsList);
        listView.setAdapter(itemsAdapter);
        return rootView;
    }

}
