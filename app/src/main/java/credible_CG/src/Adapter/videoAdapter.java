package credible_CG.src.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import credible_CG.src.Model.File;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 4/21/15.
 */
public class videoAdapter extends ArrayAdapter {

    LayoutInflater inflater;
    private Context context;
    List<File> fileList;

    @Override
    public int getCount() {
        return fileList.size();
    }

    public videoAdapter(Context context, int resource, List<File> fileList) {
        super(context, resource, fileList);
        this.context = context;
        this.fileList = fileList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.video_item, parent,
                    false);

            viewHolder.fileName = (TextView) convertView
                    .findViewById(R.id.nameTV);
            viewHolder.Icon = (ImageView) convertView.findViewById(R.id.iconIV);
            // TODO : this typeface converts everything to capital
            viewHolder.fileName.setTypeface(((AppController) context.getApplicationContext()).getTypefaceOsRegular());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.fileName.setText(fileList.get(position).getName());
        viewHolder.Icon.setImageResource(fileList.get(position).getImageId());

        return convertView;
    }


    static class ViewHolder {
        protected TextView fileName;
        protected ImageView Icon;
    }

}
