package credible_CG.src.Activity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import credible_CG.src.Adapter.FacilitatorAdapter;
import credible_CG.src.Model.Speaker;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

public class TeamActivity extends OpportunityActivity {

    AppController appController;
    ListView teamLV;
//    TeamAdapter adapter;
    FacilitatorAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        super.setToolbar();
        initThings();
        initViews();
    }

    public void initThings() {
        appController = (AppController) getApplicationContext();
        teamLV = (ListView) findViewById(R.id.teamLV);
//        List<Event> teamList = new ArrayList<>();
//        Event event1 = new Event();
//        event1.setName("Jaspreet");
//        event1.setTime("+9109303048400");
//        event1.setImageID(R.drawable.user_placeholder);
//
//        Event event2 = new Event();
//        event2.setName("porshia");
//        event2.setTime("+9109752544125");
//        event2.setImageID(R.drawable.user_placeholder);
//
//        Event event3 = new Event();
//        event3.setName("Neelesh");
//        event3.setTime("+910769196799");
//        event3.setImageID(R.drawable.user_placeholder);
//
//        teamList.add(event1);
//        teamList.add(event2);
//        teamList.add(event3);

//        adapter = (TeamAdapter) new TeamAdapter(this, R.layout.element_department_text_center, teamList);
        Speaker teamMember1 = new Speaker();
        teamMember1.setName("Mr. Saurabh Kumar");
        teamMember1.setImageId(R.drawable.user_placeholder);
        teamMember1.setDesignation("CEO");
        teamMember1.setDepartment("Chhattisgarh InfoTech Promotion Society (CHiPS)");
        teamMember1.setPhoneNo("");
        teamMember1.setLink("ceochips@nic.in");

        Speaker teamMember2 = new Speaker();
        teamMember2.setName("Shashank Pandey");
        teamMember2.setImageId(R.drawable.user_placeholder);
        teamMember2.setDesignation("Additional CEO");
        teamMember2.setDepartment("Chhattisgarh InfoTech Promotion Society (CHiPS)");
        teamMember2.setPhoneNo("");
        teamMember2.setLink("ace-chips@gov.in");

        Speaker teamMember3 = new Speaker();
        teamMember3.setName("Praveen P Sambani");
        teamMember3.setImageId(R.drawable.user_placeholder);
        teamMember3.setDesignation("");
        teamMember3.setDepartment("");
        teamMember3.setPhoneNo("9111194111");
        teamMember3.setLink("praveen.sambani@in.ey.com");

        Speaker teamMember4 = new Speaker();
        teamMember4.setName("Neelesh Soni");
        teamMember4.setImageId(R.drawable.user_placeholder);
        teamMember4.setDesignation("");
        teamMember4.setDepartment("");
        teamMember4.setPhoneNo("7691967999");
        teamMember4.setLink("neelesh.soni@semt.gov.in");

//        Speaker teamMember5 = new Speaker();
//        teamMember5.setName("Sanjeev Sharma");
//        teamMember5.setImageId(R.drawable.user_placeholder);
//        teamMember5.setDesignation("Manager");
//        teamMember5.setDepartment("Bags, Mementos, press conference, Media Bytes");
//        teamMember5.setPhoneNo("9425213660");
//        teamMember5.setLink("sonchire@gmail.com");

        List<Speaker> eventTeamMembers = new ArrayList<>();
        eventTeamMembers.add(teamMember1);
        eventTeamMembers.add(teamMember2);
        eventTeamMembers.add(teamMember3);
        eventTeamMembers.add(teamMember4);
//        eventTeamMembers.add(teamMember5);
        adapter = (FacilitatorAdapter) new FacilitatorAdapter(this, R.layout.element_department_text_center, eventTeamMembers);
        teamLV.setAdapter(adapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Our Team", getResources().getDrawable(R.drawable.credible_cg), null, null);
    }

}
