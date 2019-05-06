package com.example.hindpolymers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SendMessageFragment extends Fragment {


    public SendMessageFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_send_message, container, false);

        


        final EditText nameEditText = view.findViewById(R.id.et_name);
        final EditText phonenoEditText = view.findViewById(R.id.et_phoneno);
        final EditText msgEditText = view.findViewById(R.id.et_message);


        final Button sendMsgButton = view.findViewById(R.id.btn_senMessage);

        sendMsgButton.setEnabled(false);


        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().trim().length()==0) {
                    sendMsgButton.setEnabled(false);
                    Toast.makeText(getActivity(), "Text can not be empty..",
                            Toast.LENGTH_SHORT).show();
                } else {
                    sendMsgButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        phonenoEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().trim().length()==0) {
                    sendMsgButton.setEnabled(false);
                    Toast.makeText(getActivity(), "Text can not be empty..",
                            Toast.LENGTH_SHORT).show();
                } else {
                    sendMsgButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        msgEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().trim().length()==0) {
                    sendMsgButton.setEnabled(false);
                    Toast.makeText(getActivity(), "Text can not be empty..",
                            Toast.LENGTH_SHORT).show();
                } else {
                    sendMsgButton.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        sendMsgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String textMsg = "Name: " + nameEditText.getText() ;
                    textMsg += "\n" + "Phone No: " + phonenoEditText.getText();
                    textMsg += "\n" + "Message: " + msgEditText.getText();
                    String toNumber = "918792808582"; // Replace with mobile phone number without +Sign or leading zeros, but with country code
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + toNumber + "&text=" + textMsg));
                    startActivity(intent);

                    Toast toast = Toast.makeText(getContext(), getString(R.string.thankyou_message), Toast.LENGTH_LONG);
                    toast.show();
                    nameEditText.setText("");
                    phonenoEditText.setText("");
                    msgEditText.setText("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });



        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        // Set title
        getActivity().setTitle("Send Message");
    }

}
