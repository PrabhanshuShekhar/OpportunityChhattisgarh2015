package oppotunitychhattisgarh2015.src.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

/**
 * Created by prabhanshu on 4/16/15.
 */
public class CustomGridAdapter extends ArrayAdapter<String> {

    LayoutInflater inflater;
    private Context context;
    private String[] values;
    String previosActivityName;
    int[] images;

    public CustomGridAdapter(Context context, int resource, String[] objects, String from) {
        super(context, resource, objects);
        this.context = context;
        this.values = objects;
        this.previosActivityName = from;
        if (previosActivityName.equalsIgnoreCase("Dashboard")) {
            this.images = new int[]{R.drawable.schedule, R.drawable.participants_white, R.drawable.facilitator, R.drawable.information, R.drawable.event_team, R.drawable.accommodation, R.drawable.transportations, R.drawable.documents};
        }
//        else if (previosActivityName.equalsIgnoreCase("Informations"))
//        {
//           this.images  = new int[] {R.drawable.information,R.drawable.accommodation,R.drawable.transportation,R.drawable.participants};
//        }
    }


    static class ViewHolder {
        protected TextView title_TV;
        protected ImageView Icon;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if (convertView == null) {
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.grid_item, parent,
                    false);

            viewHolder.title_TV = (TextView) convertView
                    .findViewById(R.id.title_TV);
            viewHolder.Icon = (ImageView) convertView.findViewById(R.id.iconIV);
            viewHolder.Icon.setImageResource(images[position]);
            // TODO : this typeface converts everything to capital
            viewHolder.title_TV.setTypeface(((AppController) context.getApplicationContext()).getTypefaceOsRegular());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.title_TV.setText(values[position]);

        return convertView;
    }

    @Override
    public int getCount() {
        return values.length;
    }
}
