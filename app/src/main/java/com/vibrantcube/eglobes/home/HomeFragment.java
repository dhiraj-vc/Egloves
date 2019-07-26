package com.vibrantcube.eglobes.home;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vibrantcube.eglobes.R;
import com.vibrantcube.eglobes.profile.SignInActivity;


public class HomeFragment extends Fragment implements View.OnClickListener {

    CardView trendCardView;
    private Activity mActivity;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mActivity = getActivity();

        /*--------Select Id---------*/
        trendCardView = view.findViewById(R.id.trendCardView);


        trendCardView.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.trendCardView:
                startActivity(new Intent(mActivity, TrendActivity.class));
                break;
        }
    }
}
