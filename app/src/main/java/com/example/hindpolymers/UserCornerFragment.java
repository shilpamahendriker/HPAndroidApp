package com.example.hindpolymers;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class UserCornerFragment extends Fragment {


    public UserCornerFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_user_corner, container, false);





        TextView textViewProdCat = view.findViewById(R.id.tv_productCat);
        textViewProdCat.setText(getString(R.string.product_catalogue));

        CardView cardview_prod_pdf = view.findViewById(R.id.cardview_prod);
        cardview_prod_pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("catKey", "ProdCat");

                Fragment fragment = new PDFViewerFragment();
                fragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_placeholder, fragment,getString(R.string.product_catalogue)).addToBackStack(null).commit();
            }
        });

        TextView textViewBbarCat = view.findViewById(R.id.tv_busbarCat);
        textViewBbarCat.setText(getString(R.string.busbar_catalogue));

        CardView cardview_busbar_pdf = view.findViewById(R.id.cardview_busbar);
        cardview_busbar_pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("catKey", "ProdBus");

                Fragment fragment = new PDFViewerFragment();
                fragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_placeholder, fragment,getString(R.string.product_catalogue)).addToBackStack(null).commit();
            }
        });



        return view;
    }


}
