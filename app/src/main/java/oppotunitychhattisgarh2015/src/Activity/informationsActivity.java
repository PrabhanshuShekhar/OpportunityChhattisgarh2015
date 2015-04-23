package oppotunitychhattisgarh2015.src.Activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import oppotunitychhattisgarh2015.src.Adapter.CustomGridAdapter;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class informationsActivity extends OpportunityActivity {

    AppController appController;
    GridView infomenuGV;
    LinearLayout appNameTV;
    CustomGridAdapter adapter;

    String menuItems[] = {"Info CG", "Accomodation", "Transportation", "Event Team"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informations);
        super.setToolbar();
        initThings();
        initViews();
//        appNameTV.setRotation(270);
        infomenuGV.setAdapter(adapter);
        infomenuGV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(informationsActivity.this, ChhatisgarhInfoActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(informationsActivity.this, AccomodationActivity.class));
                        break;
                    case 2:
                        System.out.println(">>>>>> Maps");
                        break;
                    case 3:
                        startActivity(new Intent(informationsActivity.this, TeamActivity.class));
                        break;
                    case 4:
                        System.out.println(">>>>>> Maps");
                        break;
                    case 5:
                        System.out.println(">>>>> Attractions");
                        break;
                }

            }
        });
    }


    public void initThings() {
        appController = (AppController) getApplicationContext();
        infomenuGV = (GridView) findViewById(R.id.infomenuGV);
//        appNameTV = (LinearLayout)findViewById(R.id.appNameTV);
        adapter = (CustomGridAdapter) new CustomGridAdapter(this, R.layout.element_department_text_center, menuItems, "Informations");
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Opportunity\nChhattisgarh 2015", getResources().getDrawable(R.drawable.nasscom_last), null, null);
    }


}
