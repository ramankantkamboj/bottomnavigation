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

public class BuyBidFragment extends Fragment {

    public static BuyBidFragment newInstance() {

        return new BuyBidFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_buybid, container, false);
    }
}
