package alea.aleac.finalapp.Fragments.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import alea.aleac.finalapp.R;
import alea.aleac.finalapp.util.UtilDensity;

/**
 * Created by aleac on 4/8/2017.
 */

public class ListViewAdapter extends BaseAdapter {


    private final LayoutInflater mInflater;
    private Context mContext;
    private final ArrayList<String> listResult;

    public ListViewAdapter(Context context, ArrayList<String> listResult) {
        mContext = context;
        this.listResult = listResult;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return listResult.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        TextView view=new TextView(mContext);
//        view.setText(String.valueOf(position))
//        return view;
//    }
        ViewHolder holder;
        if (convertView==null){
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.textView3 = (TextView)convertView.findViewById(R.id.list_view_tv3);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag(); //got an error @ first because get tag returns an object
        }

        holder.textView3.setText(String.valueOf(position));
            holder.textView3.setVisibility(View.VISIBLE);
//            holder.lp.setMargins(0,0, UtilDensity.dip2px(mContext,50),0);
//            holder.lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
//            holder.textView2.setLayoutParams(holder.lp);


//        View rowView = mInflater.inflate(R.layout.list_item, parent, false);
//        TextView textView = (TextView)rowView.findViewById(R.id.list_view_tv);
//        textView.setText(String.valueOf(position));
//        return rowView;
        return convertView;
    }
}
class ViewHolder{
    TextView textView3;
    RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
}