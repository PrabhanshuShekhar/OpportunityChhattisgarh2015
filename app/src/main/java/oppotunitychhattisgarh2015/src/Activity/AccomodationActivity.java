package oppotunitychhattisgarh2015.src.Activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import oppotunitychhattisgarh2015.src.R;

public class AccomodationActivity extends OpportunityActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);
        super.setToolbar();
        initViews();
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Accomodations", getResources().getDrawable(R.drawable.nasscom), null, null);
    }

}
