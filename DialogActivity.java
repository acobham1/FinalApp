package alea.aleac.finalapp;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import android.app.Notification;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.widget.EditText;
import android.widget.RadioGroup;
import java.util.ArrayList;
import alea.aleac.finalapp.dialog.CustomDialog;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import alea.aleac.finalapp.R;


/**
 * Created by aleac on 2/13/2017.
 */



public class DialogActivity extends BaseActivity {

    static int choice = 0;
    private int checkedID;
    public final int DIALOG = 12345;

    Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            switch (msg.what){
                case DIALOG:
                    Bundle bundle = msg.getData();
                    String s = bundle.getString("msg");
                    toastShort("Dialog Message: " +s);
                    break;
                default:
            }

            super.handleMessage(msg);
        }
    };

    @BindView(R.id.rdg)
    RadioGroup radioGroup;
    @OnClick(R.id.dialog_ok)
    public void okClick(){
        switch (checkedID){
//            case R.id.rb1:
//                normalDialog();
//                break;
            case R.id.rb2:
                singleChoiceDialog3();
                break;
            case R.id.rb3:
                singleChoiceDialog();
                break;
            case R.id.rb4:
                singleChoiceDialog4();
                break;
//            case R.id.rb5:
//                waitingDialog();
//                break;
//            case R.id.rb6:
//                progressDialog();
//                break;
            case R.id.rb7:
                inputDialog();
                break;
            case R.id.rb8:
                singleChoiceDialog2();
                break;

            default:
        }
    }


    private void singleChoiceDialog2(){
        final String[] items = {"Bahamas", "British Virgin Islands", "Jamaica", "Barbados"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("What country does Rihanna represent?");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setSingleChoiceItems(items, choice, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                choice = which;
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (choice==0 || choice ==1 || choice == 2){
                    toastShort("Wrong! Try Again!");
                }else{
                    toastShort("Correct! Rihanna is from Barbados!");
                }
            }
        });
        builder.show();
    }


    //bt7
    private void inputDialog(){
        final EditText editText = new EditText(this);
        AlertDialog.Builder inputDialog = new AlertDialog.Builder(this);
        inputDialog.setTitle("What country's capital is Nassau?").setView(editText);
        inputDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(editText.getText().toString().equals("Bahamas") || editText.getText().toString().equals("bahamas")){
                    toastShort("Correct! Nassau is the capital of the Bahamas!!");
                }else{
                    toastShort("Wrong! Try Again!!");
                }
//                toastShort(editText.getText().toString());
            }
        });
        inputDialog.setNegativeButton("Cancel", null).show();
    }

    private void singleChoiceDialog3(){
        final String[] items = {"Let's get together and never fight!", "Let's get together and be all right!", "Let's move a mountain and play our part!", "Lets get together and whine, whine, whine!"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Finish these lyrics: 'One Love, One Heart'");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setSingleChoiceItems(items, choice, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                choice = which;
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (choice==0 || choice ==3 || choice == 2){
                    toastShort("Wrong! Try Again!");
                }else{
                    toastShort("Correct! ");
                }
            }
        });
        builder.show();
    }
    private void singleChoiceDialog4(){
        final String[] items = {"Barbadosians", "Barbadian", "Barbads", "Bajan"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("People from Barbados are called what?");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setSingleChoiceItems(items, choice, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                choice = which;
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (choice==0 || choice ==1 || choice == 2){
                    toastShort("Wrong! Try Again!");
                }else{
                    toastShort("Correct! ");
                }
            }
        });
        builder.show();
    }

    //bt3

    private void singleChoiceDialog(){
        final String[] items = {"Aruba", "Cayman Islands", "Jamaica", "Trinidad & Tobago"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Which country's capital is Kingston?");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setSingleChoiceItems(items, choice, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                choice = which;
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (choice==0 || choice ==1 || choice == 3){
                    toastShort("Wrong! Try Again!");
                }else{
                    toastShort("Correct!");
                }
            }
        });
        builder.show();
    }


    //bt1
//    private void normalDialog(){
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setIcon(R.mipmap.ic_launcher);
//        builder.setTitle("AlertTitle");
//        builder.setMessage("This is a normal Dialog");
//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                toastShort("You clicked Yes");
//            }
//        });
//
//        builder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                toastShort("You clicked Neutral");
//            }
//        });
//
//        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                toastShort("You clicked Cancel");
//            }
//        });
//
//        builder.show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId){
//                toastShort("You checked the RadioButton" +checkedId);
                checkedID = checkedId;
            }
        });
    }
}
