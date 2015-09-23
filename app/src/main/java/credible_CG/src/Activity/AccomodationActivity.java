package credible_CG.src.Activity;

import android.os.Bundle;
import android.widget.TextView;

import credible_CG.src.R;
import credible_CG.src.extra.AppController;

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
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Accomodation", getResources().getDrawable(R.drawable.mait), null, null);
    }

}
