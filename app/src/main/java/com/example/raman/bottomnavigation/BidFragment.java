package com.example.raman.bottomnavigation;

/**
 * Created by Raman on 3/13/2018.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class BidFragment extends Fragment {
    View view;
    ListView lstview;
    public static BidFragment newInstance() {

        return new BidFragment();
    }

    String[] web = {
            "Samsug Galaxy A8+",
            "boAt Stone 200",
    } ;
    Integer[] imageId = {
            R.drawable.samsung,
            R.drawable.boat,


    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_bid, container, false);
        lstview=(ListView) view.findViewById(R.id.list_item_bids);
        BidList bids=new BidList(getActivity(),web,imageId);
        lstview.setAdapter(bids);
        return view;
    }
}
