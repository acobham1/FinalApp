package alea.aleac.finalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.support.v4.view.GestureDetectorCompat;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


import alea.aleac.finalapp.R;

public class MainActivity extends BaseActivity implements View.OnTouchListener{

    private GestureDetector mGestureDirector;

    @BindView(R.id.fl)
    FrameLayout fl;

    @OnClick(R.id.music_bt)
    public void toDiChunes(View v) {
        Toast.makeText(v.getContext(), "To Di Vybezzzz!!!", Toast.LENGTH_LONG).show();
        toActivity(MusicMainActivity.class);
    }

    @OnClick(R.id.trivia_bt)
    public void toTrivia(View v) {
        Toast.makeText(v.getContext(), "TRIVIA TIME!!!", Toast.LENGTH_LONG).show();
        toActivity(DialogActivity.class);
    }


    @OnClick(R.id.about_island_bt)
    public void toAboutIslandButton(View v) {
        Toast.makeText(v.getContext(), "About the Islands", Toast.LENGTH_LONG).show();
        toActivity(ViewPagerActivity.class);
    }

    @OnClick(R.id.list_of_islands_bt)
    public void toIslandsButton(View v) {
        Toast.makeText(v.getContext(), "List of Caribbean Islands", Toast.LENGTH_LONG).show();
        toActivity(ListViewActivity.class);
    }

    @OnClick(R.id.me_bt)
    public void toAnimator(View v) {
        Toast.makeText(v.getContext(), "Where Meh From???", Toast.LENGTH_LONG).show();
        toActivity(AnimatorActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mGestureDirector = new GestureDetector(this, new simpleGestureListener());
        fl.setOnTouchListener(this);


    }

    public boolean onTouch(View v, MotionEvent event){
        mGestureDirector.onTouchEvent(event);
        return true;
    }
    private class simpleGestureListener extends GestureDetector.SimpleOnGestureListener {
        public boolean onDoubleTap(MotionEvent e) {
            toastShort("You only need to tap once. Relax nuh!");
            return true;
        }
    }
}
