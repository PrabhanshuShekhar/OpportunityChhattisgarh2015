package oppotunitychhattisgarh2015.src.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import oppotunitychhattisgarh2015.src.Model.Event;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

/**
 * Created by prabhanshu on 4/20/15.
 */
public class TeamAdapter extends ArrayAdapter {

    LayoutInflater inflater;
    private Context context;
    List<Event> eventList;

    @Override
    public int getCount() {
        return eventList.size();
    }

    public TeamAdapter(Context context, int resource, List<Event> eventList) {
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
            convertView = inflater.inflate(R.layout.team_item, parent,
                    false);

            viewHolder.eventName = (TextView) convertView
                    .findViewById(R.id.nameTV);
            viewHolder.Icon = (ImageView) convertView.findViewById(R.id.iconIV);
            viewHolder.phone = (TextView) convertView.findViewById(R.id.phone);
            if (eventList.get(position).getImageID() != 0)
                viewHolder.Icon.setImageBitmap(getRoundedShape(BitmapFactory.decodeResource(context.getResources(), eventList.get(position).getImageID())));
            // TODO : this typeface converts everything to capital
            viewHolder.eventName.setTypeface(((AppController) context.getApplicationContext()).getTypefaceOsRegular());
            viewHolder.phone.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.eventName.setText(eventList.get(position).getName());
        viewHolder.phone.setText(eventList.get(position).getTime());

        return convertView;
    }

    private Bitmap getRoundedShape(Bitmap scaleBitmapImage) {
        int targetWidth = 150;
        int targetHeight = 150;
        Bitmap targetBitmap = Bitmap.createBitmap(targetWidth, targetHeight,
                Bitmap.Config.ARGB_8888);

        Canvas canvas = new Canvas(targetBitmap);
        Path path = new Path();
        path.addCircle(((float) targetWidth - 1) / 2,
                ((float) targetHeight - 1) / 2,
                (Math.min(((float) targetWidth), ((float) targetHeight)) / 2),
                Path.Direction.CCW);

        canvas.clipPath(path);
        Bitmap sourceBitmap = scaleBitmapImage;
        canvas.drawBitmap(sourceBitmap, new Rect(0, 0, sourceBitmap.getWidth(),
                sourceBitmap.getHeight()), new Rect(0, 0, targetWidth,
                targetHeight), null);
        return targetBitmap;
    }

    static class ViewHolder {
        protected TextView eventName;
        protected ImageView Icon;
        protected TextView phone;
    }

}
