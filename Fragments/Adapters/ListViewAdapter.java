package alea.aleac.finalapp.Fragments.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import alea.aleac.finalapp.R;
import alea.aleac.finalapp.util.UtilDensity;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by aleac on 4/8/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private final LayoutInflater mInflater;
    private final ArrayList<String> listResult;

    @Override
    public int getCount() {

        return listResult.size();
    }
    public ListViewAdapter(Context context, ArrayList<String> listResult) {
        mContext = context;
        this.listResult = listResult;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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
            holder.textView2 = (TextView)convertView.findViewById(R.id.list_view_tv2);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag(); //got an error @ first because get tag returns an object
        }
        holder.textView2.setText(listResult.get(position));

        return convertView;
    }
}
class ViewHolder {

    TextView textView2;
}
