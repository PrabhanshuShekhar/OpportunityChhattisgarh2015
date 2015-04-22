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
import oppotunitychhattisgarh2015.src.Adapter.TeamAdapter;
import oppotunitychhattisgarh2015.src.Model.Event;
import oppotunitychhattisgarh2015.src.Model.Participant;
import oppotunitychhattisgarh2015.src.Model.Speaker;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

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
        teamMember1.setName("Shashank Pandey");
        teamMember1.setImageId(R.drawable.user_placeholder);
        teamMember1.setDesignation("Additional CEO");
        teamMember1.setDepartment("Overall Co-ordination");
        teamMember1.setPhoneNo("9479763740");
        teamMember1.setLink("aceo-chips@gov.in");

        Speaker teamMember2 = new Speaker();
        teamMember2.setName("Abhishek Agrawal");
        teamMember2.setImageId(R.drawable.user_placeholder);
        teamMember2.setDesignation("Consultant,F.M");
        teamMember2.setDepartment("Registration desk, Q & A");
        teamMember2.setPhoneNo("9669641122");
        teamMember2.setLink("Abhishek.a@semt.gov.in");

        Speaker teamMember3 = new Speaker();
        teamMember3.setName("Neelesh Soni");
        teamMember3.setImageId(R.drawable.user_placeholder);
        teamMember3.setDesignation("Consultant");
        teamMember3.setDepartment("Transportation & Hotel");
        teamMember3.setPhoneNo("7691967999");
        teamMember3.setLink("Neelesh.soni@semt.gov.in");

        Speaker teamMember4 = new Speaker();
        teamMember4.setName("Porshia Juneja");
        teamMember4.setImageId(R.drawable.user_placeholder);
        teamMember4.setDesignation("Consultant,C.M");
        teamMember4.setDepartment("Stage, Food (B.F & Lunch), overall co-ordination");
        teamMember4.setPhoneNo("9752544125");
        teamMember4.setLink("Porshia.jain@semt.gov.in");

        Speaker teamMember5 = new Speaker();
        teamMember5.setName("Sanjeev Sharma");
        teamMember5.setImageId(R.drawable.user_placeholder);
        teamMember5.setDesignation("Manager");
        teamMember5.setDepartment("Bags, Mementos, press conference, Media Bytes");
        teamMember5.setPhoneNo("9425213660");
        teamMember5.setLink("sonchire@gmail.com");

        List<Speaker> eventTeamMembers = new ArrayList<>();
        eventTeamMembers.add(teamMember1);
        eventTeamMembers.add(teamMember2);
        eventTeamMembers.add(teamMember3);
        eventTeamMembers.add(teamMember4);
        eventTeamMembers.add(teamMember5);
        adapter = (FacilitatorAdapter) new FacilitatorAdapter(this, R.layout.element_department_text_center, eventTeamMembers);
        teamLV.setAdapter(adapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Teams", getResources().getDrawable(R.drawable.nasscom_logo), null, null);
    }

}
