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

import oppotunitychhattisgarh2015.src.Model.Participant;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

/**
 * Created by prabhanshu on 4/18/15.
 */
public class ParticipantAdapter extends ArrayAdapter {

    LayoutInflater inflater;
    private Context context;
    List<Participant> participantList;

    @Override
    public int getCount() {
        System.out.println(">>>>> speakers size:" + participantList.size());
        return participantList.size();
    }

    public ParticipantAdapter(Context context, int resource, List<Participant> participantList) {
        super(context, resource, participantList);
        this.context = context;
        this.participantList = participantList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.participant_item, parent,
                    false);

            viewHolder.name = (TextView) convertView
                    .findViewById(R.id.nameTV);
            viewHolder.Icon = (ImageView) convertView.findViewById(R.id.iconIV);
            viewHolder.companyName = (TextView) convertView.findViewById(R.id.companyName);
//            viewHolder.phone = (TextView)convertView.findViewById(R.id.phone);
            viewHolder.email = (TextView) convertView.findViewById(R.id.email);
            if (participantList.get(position).getImageId() != 0)
                viewHolder.Icon.setImageBitmap(getRoundedShape(BitmapFactory.decodeResource(context.getResources(), participantList.get(position).getImageId())));
            // TODO : this typeface converts everything to capital
            viewHolder.name.setTypeface(((AppController) context.getApplicationContext()).getTypefaceOsRegular());
            viewHolder.companyName.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
//            viewHolder.phone.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            viewHolder.email.setTypeface(((AppController) context.getApplicationContext()).getTypefaceAllRegular());
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.name.setText(participantList.get(position).getName());
        viewHolder.companyName.setText(participantList.get(position).getCompanyName());
//        viewHolder.phone.setText(participantList.get(position).getContactNo());
        viewHolder.email.setText(participantList.get(position).getEmail());


        return convertView;
    }


    static class ViewHolder {
        protected ImageView Icon;
        protected TextView companyName;
        //        protected  TextView phone;
        protected TextView email;
        protected TextView name;

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
