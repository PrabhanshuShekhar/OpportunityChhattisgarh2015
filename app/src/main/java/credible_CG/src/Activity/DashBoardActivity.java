package credible_CG.src.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;

import credible_CG.src.Adapter.CustomGridAdapter;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

public class DashBoardActivity extends OpportunityActivity {
    AppController appController;
    GridView menu_GV;
    LinearLayout appNameTV;
    CustomGridAdapter adapter;

//    String menuItems[] = {"Schedule", "Participants", "Facilitator", "Information", "Event Team", "Venue", "Transportation", "Documents" ,"Previous Event"};
String menuItems[] = {"Information", "Our Team", "Naya Raipur", "IT/ITeS", "Recent Event - NASSCOM", "Recent Event - MAIT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        super.setToolbar();
        initThings();
        initViews();
//        appNameTV.setRotation(270);
        menu_GV.setAdapter(adapter);
        menu_GV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
//                    case 0:
//                        startActivity(new Intent(DashBoardActivity.this, SchedulesActivity.class));
//                        break;
//                    case 1:
//                        startActivity(new Intent(DashBoardActivity.this, ParticipantsActivity.class));
//                        break;
//                    case 2:
//                        startActivity(new Intent(DashBoardActivity.this, FacilitatorsActivity.class));
//                        break;
//                    case 3:
//                        startActivity(new Intent(DashBoardActivity.this, ChhatisgarhInfoActivity.class));
//                        break;
//                    case 4:
//                        startActivity(new Intent(DashBoardActivity.this, TeamActivity.class));
//                        break;
//                    case 5:
//                        startActivity(new Intent(DashBoardActivity.this, AccomodationActivity.class));
//                        break;
//                    case 6:
//                        startActivity(new Intent(DashBoardActivity.this, TransportationsActivity.class));
//                        break;
//                    case 7:
//                        startActivity(new Intent(DashBoardActivity.this, DocumentsActivity.class));
//                        break;
//                    case 8:
//                        startActivity(new Intent(DashBoardActivity.this, PreviousEventDownloadActivity.class));
//                        break;


                    case 0:
                        startActivity(new Intent(DashBoardActivity.this, ChhatisgarhInfoActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(DashBoardActivity.this, TeamActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(DashBoardActivity.this, NayaRaipurActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(DashBoardActivity.this, DocumentsActivity.class));
                        break;
                    case 4:
                        Intent intent = new Intent(DashBoardActivity.this, PreviousEventDownloadActivity.class);
                        intent.putExtra("text","NASSCOM event was held on 24th April 2014 , For more details please download the mobile App for the event from the link below :");
                        intent.putExtra("link","https://s3-ap-southeast-1.amazonaws.com/opportunity-cg/app-release.apk");
                        startActivity(intent);
                        break;
                    case 5:
                        Intent intent1 = new Intent(DashBoardActivity.this, PreviousEventDownloadActivity.class);
                        intent1.putExtra("text","MAIT event was held on 08th May 2015 , For more details please download the mobile App for the event from the link below :");
                        intent1.putExtra("link","https://s3-ap-southeast-1.amazonaws.com/make-in-cg/Make-In-CG.apk");
                        startActivity(intent1);
                        break;
//                    case 6:
//                        startActivity(new Intent(DashBoardActivity.this, TransportationsActivity.class));
//                        break;
//                    case 7:
//                        startActivity(new Intent(DashBoardActivity.this, DocumentsActivity.class));
//                        break;
//                    case 8:
//                        startActivity(new Intent(DashBoardActivity.this, PreviousEventDownloadActivity.class));
//                        break;
                }

            }
        });
    }

    public void initThings() {
        appController = (AppController) getApplicationContext();
        menu_GV = (GridView) findViewById(R.id.menuGV);
//        appNameTV = (LinearLayout)findViewById(R.id.appNameTV);
        adapter = (CustomGridAdapter) new CustomGridAdapter(this, R.layout.element_department_text_center, menuItems, "Dashboard");

    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Opportunity\nChhattisgarh 2015", getResources().getDrawable(R.drawable.credible_cg), null, null);
    }

}
