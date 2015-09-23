package credible_CG.src.Adapter;

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

import credible_CG.src.Model.Speaker;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 4/18/15.
 */
public class FacilitatorAdapter extends ArrayAdapter {

    LayoutInflater inflater;
    private Context context;
    List<Speaker> speakerList;

    @Override
    public int getCount() {
        System.out.println(">>>>> speakers size:" + speakerList.size());
        return speakerList.size();
    }

    public FacilitatorAdapter(Context context, int resource, List<Speaker> speakerList) {
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
            convertView = inflater.inflate(R.layout.facilitator_item, parent,
                    false);

            viewHolder.eventName = (TextView) convertView
                    .findViewById(R.id.nameTV);
            viewHolder.Icon = (ImageView) convertView.findViewById(R.id.iconIV);
            viewHolder.designation = (TextView) convertView.findViewById(R.id.designation);
            viewHolder.dept = (TextView) convertView.findViewById(R.id.dept);
            viewHolder.phoneNo = (TextView) convertView.findViewById(R.id.contactNo);
            viewHolder.email = (TextView) convertView.findViewById(R.id.email);
            if (speakerList.get(position).getImageId() != 0)
                viewHolder.Icon.setImageBitmap(getRoundedShape(BitmapFactory.decodeResource(context.getResources(), speakerList.get(position).getImageId())));
//                viewHolder.Icon.setImageResource(speakerList.get(position).getImageId());
            // TODO : this typeface converts everything to capital
            viewHolder.eventName.setTypeface(((AppController) context.getApplicationContext()).getTypefaceOsRegular());
            viewHolder.designation.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            viewHolder.dept.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
//            viewHolder.email.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            viewHolder.phoneNo.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.eventName.setText(speakerList.get(position).getName());
        viewHolder.designation.setText(speakerList.get(position).getDesignation());
        viewHolder.dept.setText(speakerList.get(position).getDepartment());
        viewHolder.email.setText(speakerList.get(position).getLink());
        viewHolder.phoneNo.setText(speakerList.get(position).getPhoneNo());


        return convertView;
    }


    static class ViewHolder {
        protected TextView eventName;
        protected ImageView Icon;
        protected TextView designation;
        protected TextView dept;
        protected TextView phoneNo;
        protected TextView email;
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

}
