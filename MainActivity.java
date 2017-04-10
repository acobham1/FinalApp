package alea.aleac.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


import alea.aleac.finalapp.R;

public class MainActivity extends BaseActivity {

//    @OnClick(R.id.trivia_bt)
//    public void toTrivia(){
//
//    }

    @OnClick(R.id.about_island_bt)
    public void toAboutIslandButton(View v){
        Toast.makeText(v.getContext(), "About the Islands", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(v.getContext(), ViewPagerActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.list_of_islands_bt)
    public void toIslandsButton(View v){
        Toast.makeText(v.getContext(), "List of Caribbean Islands", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(v.getContext(), ListViewActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.me_bt)
    public void toAnimator(){
        toActivity(AnimationActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
