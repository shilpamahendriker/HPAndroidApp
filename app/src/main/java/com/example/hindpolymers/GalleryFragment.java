package com.example.hindpolymers;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;



public class GalleryFragment extends Fragment {

    RecyclerView recyclerView;
    public List<GalleryDataModel> imageList;
    GalleryDataModel galleryDataModel;


    public GalleryFragment() {
        // Required empty public constructor
    }

    String [] imageResIdStringArray;
    int [] imageResIdArray;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_products, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(mGridLayoutManager);

        imageResIdStringArray = getResources().getStringArray(R.array.gallery_images_array);

        imageList = new ArrayList<>();

        /*for (int anImageResIdArray : imageResIdArray) {
            galleryDataModel = new GalleryDataModel(anImageResIdArray);
            imageList.add(galleryDataModel);
        }*/

        /*for (int i = 0; i < imageResIdStringArray.length; i++){
            imageResIdArray[i] = Integer.parseInt(imageResIdStringArray[i]);
            Log.v("arraylist",  imageResIdStringArray[i]);
            //galleryDataModel = new GalleryDataModel(imageResIdStringArray[i]));
            imageList.add(galleryDataModel);
        }*/

        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_battery_cut_shrink_sleeve_2);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_battery_grade_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_battery_grade_shrink_sleeve_1);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_busbar_grade_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_busbar_grade_shrink_sleeve_1);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_busbar_grade_shrink_sleeve_2);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_capacitor_grade_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_capacitor_grade_shrink_sleeve_1);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_capacitor_grade_shrink_sleeve_2);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_cob_web_remover_handle_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_combo_pack_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_full_body_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_full_body_shrink_sleeve_1);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_gas_valve_shrink_sleeves);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_gas_valve_shrink_sleeves_1);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_gas_valve_shrink_sleeves_2);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_micro_fiber_mop_handle_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_mop_handle_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_multipack_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_plunger_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_profile_cut_shrink_pouch);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_profilecut_shrink_pouce_application);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_promotional_pack_shrink_sleeve);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_straight_cut_shrink_pouches);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_tamper_evident_head_band);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_tranperant_shrink_rolls);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_transculent_shrink_rolls);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_transperant_shrink_roll_application);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_twist_mop_handle_shrink_sleeves);
        imageList.add(galleryDataModel);
        galleryDataModel = new GalleryDataModel(R.drawable.gallery_hp_wiper_rod_shrink_sleeve);
        imageList.add(galleryDataModel);



        GalleryGridViewAdapter adapter = new GalleryGridViewAdapter(getContext(), imageList);
        recyclerView.setAdapter(adapter);



        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
        // Set title
        getActivity().setTitle(getString(R.string.gallery));
    }




}
