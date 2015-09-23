package credible_CG.src.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import credible_CG.src.Model.Speaker;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 4/17/15.
 */
public class SpeakerListAdapter extends ArrayAdapter {

    LayoutInflater inflater;
    private Context context;
    List<Speaker> speakerList;

    @Override
    public int getCount() {
        System.out.println(">>>>> speakers size:" + speakerList.size());
        return speakerList.size();
    }

    public SpeakerListAdapter(Context context, int resource, List<Speaker> speakerList) {
        super(context, resource, speakerList);
        this.context = context;
        this.speakerList = speakerList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.speaker_item, parent,
                    false);

            viewHolder.eventName = (TextView) convertView
                    .findViewById(R.id.nameTV);
            viewHolder.Icon = (ImageView) convertView.findViewById(R.id.iconIV);
            viewHolder.designation = (TextView) convertView.findViewById(R.id.designation);
            viewHolder.dept = (TextView) convertView.findViewById(R.id.dept);
            viewHolder.linkedInLink = (TextView) convertView.findViewById(R.id.linkedIn);
            if (speakerList.get(position).getImageId() != 0)
                viewHolder.Icon.setImageResource(speakerList.get(position).getImageId());
            // TODO : this typeface converts everything to capital
            viewHolder.eventName.setTypeface(((AppController) context.getApplicationContext()).getTypefaceOsRegular());
            viewHolder.designation.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            viewHolder.dept.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            viewHolder.linkedInLink.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.eventName.setText(speakerList.get(position).getName());
        viewHolder.designation.setText(speakerList.get(position).getDesignation());
        viewHolder.dept.setText(speakerList.get(position).getDepartment());
        viewHolder.linkedInLink.setText(speakerList.get(position).getLink());


        return convertView;
    }


    static class ViewHolder {
        protected TextView eventName;
        protected ImageView Icon;
        protected TextView designation;
        protected TextView dept;
        protected TextView linkedInLink;
    }

}
