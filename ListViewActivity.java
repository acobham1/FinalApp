package alea.aleac.finalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import alea.aleac.finalapp.Fragments.Adapters.ListViewAdapter;

public class ListViewActivity extends AppCompatActivity{


    private ListView listView;
    private ArrayList<String> listResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listResult = new ArrayList<String>();
        inTheList();
        initial();

    }

    private void initial() {
        listView = (ListView) findViewById(R.id.list_view);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, listResult);
        listView.setAdapter(listViewAdapter);

        TextView tv = new TextView(this);
        tv.setText("& more....");
        tv.setTextSize(28);
        tv.setGravity(Gravity.CENTER);
        listView.addFooterView(tv);

        listView.setAdapter(listViewAdapter);
    }

    private void inTheList() {
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

    }
}
