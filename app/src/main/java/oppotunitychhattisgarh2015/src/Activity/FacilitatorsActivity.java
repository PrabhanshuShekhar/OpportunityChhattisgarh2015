package oppotunitychhattisgarh2015.src.Activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import oppotunitychhattisgarh2015.src.Adapter.FacilitatorAdapter;
import oppotunitychhattisgarh2015.src.Adapter.ParticipantAdapter;
import oppotunitychhattisgarh2015.src.Model.Speaker;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class FacilitatorsActivity extends OpportunityActivity {

    AppController appController;
    FacilitatorAdapter facilitatorAdapter;
    ListView facilitatorsLV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilitators);
        super.setToolbar();
        initThings();
        initViews();
    }


    public void initThings() {
        appController = (AppController) getApplicationContext();
        facilitatorsLV = (ListView) findViewById(R.id.facilitatorsLV);
        List<Speaker> speakers = new ArrayList<>();
        Speaker s1 = new Speaker();
        s1.setName("Facilitator1");
        s1.setImageId(R.drawable.user_placeholder);
        s1.setDesignation("Secratory");
        s1.setDepartment("Networking & Registration");
        s1.setLink("facilitators1@xyz.com");
        s1.setPhoneNo("0901435547");

        Speaker s2 = new Speaker();
        s2.setName("Facilitators2");
        s2.setImageId(R.drawable.user_placeholder);
        s2.setDesignation("Junior Secratory");
        s2.setDepartment("Networking & Registration");
        s2.setLink("facilitators2@xyz.com");
        s2.setPhoneNo("0701623547");
        speakers.add(s1);
        speakers.add(s2);
        facilitatorAdapter = (FacilitatorAdapter) new FacilitatorAdapter(this, R.layout.element_department_text_center, speakers);
        facilitatorsLV.setAdapter(facilitatorAdapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Facilitators", getResources().getDrawable(R.drawable.nasscom), null, null);
    }

}
