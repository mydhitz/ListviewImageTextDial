package mydhitz.listviewimagetextdial;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dhitz on 28/11/2016.
 */
public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] listTelepon;


    public CustomListAdapter(Activity context,String[] itemname, Integer[] imgid, String[] listTelepon) {
        super(context, R.layout.mylist,itemname);
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.listTelepon=listTelepon;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylist, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extraTxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        extraTxt.setText("No Telepon : "+listTelepon[position]);
        return rowView;
    };
}
