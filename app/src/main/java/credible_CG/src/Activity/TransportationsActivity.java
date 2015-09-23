package credible_CG.src.Activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import credible_CG.src.Adapter.FacilitatorAdapter;
import credible_CG.src.Model.Speaker;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

public class TransportationsActivity extends OpportunityActivity {
    AppController appController;
    TextView transportTV;
    ListView transporterLV;


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
        transportTV.setTypeface(appController.getTypefaceOsRegular());
        transporterLV = (ListView)findViewById(R.id.transporterLV);
        Speaker teamMember1 = new Speaker();
        teamMember1.setName("Neelesh Soni");
        teamMember1.setImageId(R.drawable.user_placeholder);
        teamMember1.setDesignation("Consultant");
        teamMember1.setDepartment("Transportation & Hotel");
        teamMember1.setPhoneNo("7691967999");
        teamMember1.setLink("Neelesh.soni@semt.gov.in");
        List<Speaker> eventTeamMembers = new ArrayList<>();
        eventTeamMembers.add(teamMember1);
        transporterLV.setAdapter(new FacilitatorAdapter(this, R.layout.element_department_text_center, eventTeamMembers));

    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Transportation", getResources().getDrawable(R.drawable.mait), null, null);
    }


}
