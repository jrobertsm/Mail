package com.jrsm.android.mail;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jrsm.android.whatsappnumber.R;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    String mail;
    String acname;
    String actype;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AccountManager am = AccountManager.get(this);
        Account[] accounts = am.getAccounts();

        for (Account ac : accounts) {
            acname = ac.name;
             actype = ac.type;

            if(actype.equals("com.google")){
                mail = ac.name;
            }
            // Take your time to look at all available accounts
            //System.out.println("Accounts : " + acname + ", " + actype);
        }

        tv1.setText("Mail: " + mail);
    }
}
