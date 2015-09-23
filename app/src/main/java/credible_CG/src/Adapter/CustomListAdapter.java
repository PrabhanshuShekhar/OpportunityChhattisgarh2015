package credible_CG.src.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import credible_CG.src.Model.Event;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 4/17/15.
 */
public class CustomListAdapter extends ArrayAdapter {

    LayoutInflater inflater;
    private Context context;
    List<Event> eventList;

    @Override
    public int getCount() {
        return eventList.size();
    }

    public CustomListAdapter(Context context, int resource, List<Event> eventList) {
        super(context, resource, eventList);
        this.context = context;
        this.eventList = eventList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_item, parent,
                    false);

            viewHolder.eventName = (TextView) convertView
                    .findViewById(R.id.nameTV);
            viewHolder.Icon = (ImageView) convertView.findViewById(R.id.iconIV);
            viewHolder.time = (TextView) convertView.findViewById(R.id.timeTV);
            if (eventList.get(position).getImageID() != 0)
                viewHolder.Icon.setImageResource(eventList.get(position).getImageID());
            // TODO : this typeface converts everything to capital
            viewHolder.eventName.setTypeface(((AppController) context.getApplicationContext()).getTypefaceOsRegular());
            viewHolder.time.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.eventName.setText(eventList.get(position).getName());
        viewHolder.time.setText(eventList.get(position).getTime());

        return convertView;
    }


    static class ViewHolder {
        protected TextView eventName;
        protected ImageView Icon;
        protected TextView time;
    }

}
