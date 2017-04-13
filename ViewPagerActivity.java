package alea.aleac.finalapp;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import alea.aleac.finalapp.Fragments.Adapters.ViewPagerAdapter;
import alea.aleac.finalapp.Fragments.firstFragment;
import alea.aleac.finalapp.Fragments.fourthFragment;
import alea.aleac.finalapp.Fragments.secondFragment;
import alea.aleac.finalapp.Fragments.thirdFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        initial();
    }

    private void initial() {
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        fragmentList.add(new firstFragment());
        fragmentList.add(new secondFragment());
        fragmentList.add(new thirdFragment());
//        fragmentList.add(new fourthFragment());
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
