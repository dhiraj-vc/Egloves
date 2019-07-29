package com.vibrantcube.eglobes;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.common.SignInButton;
import com.vibrantcube.eglobes.profile.SignInActivity;
import com.vibrantcube.eglobes.profile.SignUp;
import com.vibrantcube.eglobes.profile.firebase.FirebaseSignInActivity;

public class ProfileFragment extends Fragment implements View.OnClickListener{

    private Activity mActivity;
    private Button signEmailPhone;
    private TextView signUp;
    private SignInButton signInBtnFirebase;
    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);


        mActivity = getActivity();


        /*--------Select Id---------*/
        signEmailPhone = view.findViewById(R.id.signEmailPhone);
        signUp = view.findViewById(R.id.signUp);
        signInBtnFirebase  =  view.findViewById(R.id.signInBtnFirebase);



        /*---Click Button-----*/
        signEmailPhone.setOnClickListener(this);
        signUp.setOnClickListener(this);
        signInBtnFirebase.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.signEmailPhone:
                    startActivity(new Intent(mActivity, SignInActivity.class));
                break;

            case R.id.signUp:
                startActivity(new Intent(mActivity, SignUp.class));
                break;

            case R.id.signInBtnFirebase:
                startActivity(new Intent(mActivity, FirebaseSignInActivity.class));
                break;
        }

    }
}
