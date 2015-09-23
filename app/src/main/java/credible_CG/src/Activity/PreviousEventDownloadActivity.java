package credible_CG.src.Activity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 5/7/15.
 */
public class PreviousEventDownloadActivity extends OpportunityActivity {

    AppController appController;
    TextView eventNameTV , link;
    String downloadUrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_download);
        eventNameTV = (TextView)findViewById(R.id.eventName);
        link = (TextView)findViewById(R.id.link);
        downloadUrl = getIntent().getStringExtra("link");
        eventNameTV.setText(getIntent().getStringExtra("text"));
//        super.setToolbar();
//        initThings();
//        initViews();
    }

    private void initViews() {
        appController = (AppController) getApplicationContext();
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Opportunity\nChhattisgarh 2015", getResources().getDrawable(R.drawable.mait), null, null);
    }


    public void downloadApp(View view)
    {
        DownloadManager mManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
//        DownloadManager.Request mRqRequest = new DownloadManager.Request(
//                Uri.parse("https://s3-ap-southeast-1.amazonaws.com/opportunity-cg/app-release.apk"));
        DownloadManager.Request mRqRequest = new DownloadManager.Request(
                Uri.parse(downloadUrl));
//  mRqRequest.setDestinationUri(Uri.parse("give your local path"));
        long idDownLoad=mManager.enqueue(mRqRequest);
    }
}
