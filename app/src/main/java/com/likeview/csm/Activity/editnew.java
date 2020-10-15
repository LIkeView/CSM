package com.likeview.csm.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.likeview.csm.ApiResponse.Model.ClientDetailsModel;
import com.likeview.csm.Fragment.NavAddCoustomerFragment;
import com.likeview.csm.R;

public class editnew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editnew);

        ClientDetailsModel clientDetailsModel = new ClientDetailsModel();
        int clientID=getIntent().getIntExtra( clientDetailsModel.getClientId(),0);
        String FirmName = getIntent().getStringExtra( "firm_name");
        String Visiting_card_front = getIntent().getStringExtra( "visiting_card_front");
        String Visiting_card_back = getIntent().getStringExtra( "visiting_card_back");
        String Profile_pic = getIntent().getStringExtra( "profile_pic");
        String PersionName = getIntent().getStringExtra( "personal_name");
        String Address1 = getIntent().getStringExtra( "address");
        String Whatsapp = getIntent().getStringExtra( "wp_no");
        String Mobile = getIntent().getStringExtra( "mobile_no");
        String Email = getIntent().getStringExtra( "email");
        String Website = getIntent().getStringExtra( "website");
        String Size = getIntent().getStringExtra( "req_size");
        String Qnty = getIntent().getStringExtra( "qty");
        String PaymentType = getIntent().getStringExtra( "payment_type");

        Bundle args = new Bundle();
        args.putString(clientDetailsModel.getClientId(), String.valueOf(clientID));
        args.putString( "firm_name", FirmName);
        args.putString( "visiting_card_front",Visiting_card_front);
        args.putString( "visiting_card_back",Visiting_card_back);
        args.putString( "profile_pic", Profile_pic);
        args.putString("personal_name", PersionName);
        args.putString( "address", Address1);
        args.putString( "wp_no", Whatsapp);
        args.putString( "mobile_no", Mobile);
        args.putString( "email",Email);
        args.putString( "website", Website);
        args.putString( "req_size", Size);
        args.putString( "qty", Qnty);
        args.putString( "payment_type", PaymentType);
        NavAddCoustomerFragment navAddCoustomerFragment = new NavAddCoustomerFragment();
        navAddCoustomerFragment.setArguments(args);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.Frame_layout, navAddCoustomerFragment);
        fragmentTransaction.commit();

    }
}