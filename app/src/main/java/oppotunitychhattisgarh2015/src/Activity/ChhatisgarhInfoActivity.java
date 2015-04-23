package oppotunitychhattisgarh2015.src.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import oppotunitychhattisgarh2015.src.Adapter.videoAdapter;
import oppotunitychhattisgarh2015.src.Model.File;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class ChhatisgarhInfoActivity extends OpportunityActivity {
    ListView videoLV;

    TextView para1,para2;

    AppController appController;

    videoAdapter listAdapter;
    List<File> fileList;
    String[] fileNames = { "NRDA Make In India Video", "NRDA Video","Chhattisgarh Video Profile"};
    String[] url = {
            "https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/NRDA+MAKE+IN+INDIA+video.mp4",
            "https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Nrda+Video.m4v",
            "https://s3-ap-southeast-1.amazonaws.com/opportunity-chhattisgarh-2015/Chhattisgarh+Video+Profile.m4v"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chhatisgarh_info);
        super.setToolbar();
        initThings();
        initViews();
        videoLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nextIntent = new Intent(ChhatisgarhInfoActivity.this, VideoPlayerActivity.class);
                nextIntent.putExtra("videoFileName", url[position]);
                startActivity(nextIntent);
            }
        });

    }

    public void initThings() {
        appController = (AppController) getApplicationContext();
        fileList = new ArrayList<>();
        for (int i = 0; i < fileNames.length; i++) {
            File f = new File();
            f.setName(fileNames[i]);
            f.setImageId(R.drawable.video_icon);
            fileList.add(f);

        }


    }

    private void initViews() {
        listAdapter = (videoAdapter) new videoAdapter(this, R.layout.element_department_text_center, fileList);
        videoLV = (ListView) findViewById(R.id.videoLV);
        para1 = (TextView)findViewById(R.id.para1);
        para2 = (TextView)findViewById(R.id.para2);
        para1.setTypeface(appController.getTypefaceOsRegular());
        para2.setTypeface(appController.getTypefaceOsRegular());
        videoLV.setAdapter(listAdapter);
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Information", getResources().getDrawable(R.drawable.nasscomm_logo), null, null);
    }


}
