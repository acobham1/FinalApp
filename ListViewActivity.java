package alea.aleac.finalapp;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import alea.aleac.finalapp.Fragments.Adapters.ListViewAdapter;


import alea.aleac.finalapp.R;
import butterknife.BindView;
import butterknife.ButterKnife;


public class ListViewActivity extends AppCompatActivity {
private final ArrayList<String> listResult = new ArrayList<String>();

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listResult.add("Aruba");
        listResult.add("Anguilla");
        listResult.add("Antigua & Barbuda");
        listResult.add("Bahamas");
        listResult.add("Barbados");
        listResult.add("Bermuda");
        listResult.add("British Virgin Islands");
        listResult.add("Cayman Islands");
        listResult.add("Cuba");
        listResult.add("Dominica");
        listResult.add("Dominican Republic");
        listResult.add("Grenada");
        listResult.add("Guyana");
        listResult.add("Haiti");
        listResult.add("Jamaica");
        listResult.add("Puerto Rico");
        listResult.add("St. Kitts & Nevis");
        listResult.add("St. Lucia");
        listResult.add("St. Martin");
        listResult.add("St. Vincent");
        listResult.add("Trinidad and Tobago");
        listResult.add("U.S. Virgin Islands");

        ListViewAdapter listViewAdapter = new ListViewAdapter(this, listResult);

        ListView listView = (ListView) findViewById(R.id.list_view);

        TextView tv = new TextView(this);
        tv.setText("& more...");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);

        listView.setAdapter(listViewAdapter);

    }
}