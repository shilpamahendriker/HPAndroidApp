package com.example.hindpolymers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class ContactUsFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_us, container, false);

        TextView addressTextView = view.findViewById(R.id.tv_address);
        addressTextView.setText(getString(R.string.address_text));

        ImageView mapimageView = view.findViewById(R.id.iv_mapview);
        mapimageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String geoUri = "https://www.google.com/maps/place/Hind+Polymers/@17.457298,78.4279463,17z/data=!3m1!4b1!4m5!3m4!1s0x3bcb90e2847c9ba9:0x9040e3fb551cdbf8!8m2!3d17.457298!4d78.430135";
                //String geoUri = "http://maps.google.co.in/maps?q=loc:" + 17.45725508400875 + "," + 78.4296494567397 + " (" + "Hind Polymers" + ")";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
                startActivity(intent);
            }

        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        // Set title
        getActivity().setTitle(getString(R.string.contact_us));
    }
}
