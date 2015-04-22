package oppotunitychhattisgarh2015.src.Activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import oppotunitychhattisgarh2015.src.Adapter.ParticipantAdapter;
import oppotunitychhattisgarh2015.src.Adapter.TeamAdapter;
import oppotunitychhattisgarh2015.src.Model.Event;
import oppotunitychhattisgarh2015.src.Model.Participant;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class TeamActivity extends OpportunityActivity {

    AppController appController;
    ListView teamLV;
    TeamAdapter adapter;

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
        List<Event> teamList = new ArrayList<>();
        Event event1 = new Event();
        event1.setName("Jaspreet");
        event1.setTime("+9109303048400");
        event1.setImageID(R.drawable.user_placeholder);

        Event event2 = new Event();
        event2.setName("porshia");
        event2.setTime("+9109752544125");
        event2.setImageID(R.drawable.user_placeholder);

        Event event3 = new Event();
        event3.setName("Neelesh");
        event3.setTime("+910769196799");
        event3.setImageID(R.drawable.user_placeholder);

        teamList.add(event1);
        teamList.add(event2);
        teamList.add(event3);

        adapter = (TeamAdapter) new TeamAdapter(this, R.layout.element_department_text_center, teamList);
        teamLV.setAdapter(adapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Teams", getResources().getDrawable(R.drawable.nasscom), null, null);
    }

}
