package oppotunitychhattisgarh2015.src.Activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class AccomodationActivity extends OpportunityActivity {
    TextView accomodationTV;
    AppController appController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);
        super.setToolbar();
        initViews();
    }

    private void initViews() {
        appController = (AppController) getApplicationContext();
        accomodationTV = (TextView) findViewById(R.id.accomodationTV);
        accomodationTV.setTypeface(appController.getTypefaceOsRegular());
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Accomodation", getResources().getDrawable(R.drawable.nasscomm_logo), null, null);
    }

}
