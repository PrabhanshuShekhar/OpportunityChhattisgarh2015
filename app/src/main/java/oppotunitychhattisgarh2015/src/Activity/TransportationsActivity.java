package oppotunitychhattisgarh2015.src.Activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class TransportationsActivity extends OpportunityActivity {
    AppController appController;
    TextView transportTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportations);
        super.setToolbar();
        initThings();
        initViews();
    }


    public void initThings() {
        transportTV = (TextView) findViewById(R.id.transportTV);
        appController = (AppController) getApplicationContext();
        transportTV.setTypeface(appController.getTypefaceOsLight());
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Opportunity\nChhattisgarh 2015", getResources().getDrawable(R.drawable.nasscom), null, null);
    }


}
