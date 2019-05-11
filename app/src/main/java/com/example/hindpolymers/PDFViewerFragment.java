package com.example.hindpolymers;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;



public class PDFViewerFragment extends Fragment {


    public PDFViewerFragment() {
        // Required empty public constructor
    }

    private static String FILENAME ;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_pdfviewer, container, false);


        PDFView pdfView = view.findViewById(R.id.pdfView);


            String s= null;

        Bundle b = this.getArguments();
        if (b != null) {

            s = b.getString("catKey");

            if (s.equalsIgnoreCase("ProdCat")) {
                FILENAME = "hp_Product_Catalogue.pdf";
            }else
             /*if (s1 != null && s1.equalsIgnoreCase("ProdBus")) {*/
                FILENAME = "hp_busbar_sleeve_catalogue.pdf";

        }

        pdfView.fromAsset(FILENAME)
        //pdfView.fromUri(uri)

                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(getContext()))
                .load();
        return view;


    }
    public void onResume() {
        super.onResume();
        // Set title
        getActivity().setTitle(getString(R.string.product_catalogue));
    }



}
