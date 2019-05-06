package com.example.hindpolymers;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;



public class ProductsFragment extends Fragment {

    RecyclerView recyclerView;
    List<ProductDataModel> productList;
    ProductDataModel productDataModel;

    public ProductsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_products, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(mGridLayoutManager);

        productList = new ArrayList<>();
        productDataModel = new ProductDataModel(getString(R.string.busbar), getString(R.string.busbar_desc),
                R.drawable.hp_busbar_shrink_sleeves);
        productList.add(productDataModel);
        productDataModel = new ProductDataModel(getString(R.string.capacitor), getString(R.string.capacitor_desc),
                R.drawable.hp_capacitor_shrink_sleeves);
        productList.add(productDataModel);
        productDataModel = new ProductDataModel(getString(R.string.gas_valve), getString(R.string.gas_valve_desc),
                R.drawable.hp_gas_valve_heat_shrink_sleeves);
        productList.add(productDataModel);
        productDataModel = new ProductDataModel(getString(R.string.handle_rod), getString(R.string.handle_rod_desc),
                R.drawable.hp_handle_rod_shrink_sleeves);
        productList.add(productDataModel);
        productDataModel = new ProductDataModel(getString(R.string.shrink_pouches), getString(R.string.shrink_pouches_desc),
                R.drawable.hp_heat_shrink_pouches);
        productList.add(productDataModel);
        productDataModel = new ProductDataModel(getString(R.string.shrink_rolls), getString(R.string.shrink_rolls_desc),
                R.drawable.hp_heat_shrink_rolls);
        productList.add(productDataModel);
        productDataModel = new ProductDataModel(getString(R.string.battery_sleeves), getString(R.string.battery_sleeves_desc),
                R.drawable.hp_battery_shrink_sleeves);
        productList.add(productDataModel);
        productDataModel = new ProductDataModel(getString(R.string.tamper_evident), getString(R.string.tamper_evident_desc),
                R.drawable.hp_tamper_evident_shrink_sleeves);
        productList.add(productDataModel);
        ProductGridViewAdapter adapter = new ProductGridViewAdapter(getContext(), productList);
        recyclerView.setAdapter(adapter);

        getActivity().setTitle(getString(R.string.home));
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle(getString(R.string.products));
        if(getView() == null){
            return;
        }

        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

                    builder.setMessage("Do you want to leave? ");
                    builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Log.v ("myLogs","YES pressed");
                            getActivity().finish();
                        }
                    });
                    builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Log.v ("myLogs","NO pressed");
                            Intent intent = new Intent(getContext(), MainActivity.class);
                            getActivity().startActivity(intent);
                        }
                    });
                    builder.show();
                    return true;
                }
                return false;
            }
        });
    }


}
