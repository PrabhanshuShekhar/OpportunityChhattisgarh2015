package oppotunitychhattisgarh2015.src.Activity;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import oppotunitychhattisgarh2015.src.Adapter.CustomListAdapter;
import oppotunitychhattisgarh2015.src.Model.Event;
import oppotunitychhattisgarh2015.src.Model.Speaker;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class SchedulesActivity extends OpportunityActivity {

    ListView schedulesLV;
    List<Event> eventList;
    AppController appController;
    CustomListAdapter listAdapter;

    public void findThings()
    {
        schedulesLV = (ListView)findViewById(R.id.schedulesLV);
    }

    public void initThings()
    {
        appController = (AppController) getApplicationContext();

        eventList = new ArrayList<>();

        List<Speaker> e1speakers = new ArrayList<Speaker>();
        Event e1 = new Event();
        e1.setName("Registration");
        e1.setTime("09:30 AM – 10:00 AM");
        e1.setDetails("Networking & Registration");
//        Speaker s1 = new Speaker();
//        s1.setLink("linked link");
//        s1.setName("Speaker1");
//        s1.setDesignation("Honble Speaker");
//        s1.setDepartment("Opportunity Chhattisgarh 2015");
//        s1.setImageId(R.drawable.user_placeholder);
//        e1speakers.add(s1);
//        Speaker s2 = new Speaker();
//        s2.setLink("linked link");
//        s2.setName("Speaker 2");
//        s2.setDesignation("Honble Speaker");
//        s2.setDepartment("Opportunity Chhattisgarh");
//        s2.setImageId(R.drawable.user_placeholder);
//        e1speakers.add(s2);
        e1.setSpeakers(e1speakers);



        List<Speaker> e2speakers = new ArrayList<>();
        Event e2 = new Event();
        e2.setName("Welcome & Inaugural Address");
        e2.setTime("10:00 AM – 11:00 AM");
        e2.setDetails("");
        Speaker s1e2 = new Speaker();
        s1e2.setLink("");
        s1e2.setName("Mr. Aman Kumar Singh");
        s1e2.setDesignation("Principal Secretary");
        s1e2.setDepartment("Electronics and IT Department");
        s1e2.setImageId(R.drawable.user_placeholder);
        Speaker s2e2 = new Speaker();
        s2e2.setLink("");
        s2e2.setName("Mr. Vivek Dhand");
        s2e2.setDesignation("Chief Secretary");
        s2e2.setDepartment("Government of Chhattisgarh");
        s2e2.setImageId(R.drawable.user_placeholder);
        Speaker s3e2 = new Speaker();
        s3e2.setLink("");
        s3e2.setName("Mr. R Chandrasekhar");
        s3e2.setDesignation("Chairman");
        s3e2.setDepartment("NASSCOM");
        s3e2.setImageId(R.drawable.user_placeholder);

       Speaker s4e2 = new Speaker();
        s4e2.setImageId(R.drawable.user_placeholder);
        s4e2.setLink("");
        s4e2.setName("Dr. Raman Singh");
        s4e2.setDesignation("Hon'ble Chief Minister");
        s4e2.setDepartment("Chhattisgarh");

        e2speakers.add(s1e2);
        e2speakers.add(s2e2);
        e2speakers.add(s3e2);
        e2speakers.add(s4e2);
        e2.setSpeakers(e2speakers);




        List<Speaker> e3speakers = new ArrayList<>();
        Event e3 = new Event();
        e3.setName("Signing of MOU and Launching of NASSCOM Career Guide");
        e3.setTime("11:00 AM – 11:15 AM");
        e3.setDetails("1. GoCG-NASSCOM MOU\n" +
                "2. GoCG-NASSCOM Skills MOU\n" +
                "3. NASSCOM Career Guide");
//        Speaker s1e3 = new Speaker();
//        s1e3.setLink("linkedIn Link");
//        s1e3.setName("Speaker1");
//        s1e3.setDesignation("Honble Speaker");
//        s1e3.setDepartment("Opportunity Chhattisgarh 2015");
//        s1e3.setImageId(R.drawable.user_placeholder);
//        Speaker s2e3 = new Speaker();
//        s2e3.setLink("linkedIn Link");
//        s2e3.setName("Speaker 2");
//        s2e3.setDesignation("Honble Speaker");
//        s2e3.setDepartment("Opportunity Chhattisgarh");
//        s2e3.setImageId(R.drawable.user_placeholder);
//        e3speakers.add(s1e3);
//        e3speakers.add(s2e3);
        e3.setSpeakers(e3speakers);


        List<Speaker> e4speakers = new ArrayList<>();
        Event e4 = new Event();
        e4.setName("Q&A");
        e4.setTime("11:15 AM – 11:30 AM");
        e4.setDetails("Discussion and Q&A");
//        Speaker s1e4 = new Speaker();
//        s1e4.setLink("linkedIn Link");
//        s1e4.setName("Speaker1");
//        s1e4.setDesignation("Honble Speaker");
//        s1e4.setDepartment("Opportunity Chhattisgarh 2015");
//        s1e4.setImageId(R.drawable.user_placeholder);
//        Speaker s2e4 = new Speaker();
//        s2e4.setLink("linkedIn Link");
//        s2e4.setName("Speaker 2");
//        s2e4.setDesignation("Honble Speaker");
//        s2e4.setDepartment("Opportunity Chhattisgarh");
//        s2e4.setImageId(R.drawable.user_placeholder);
//        e4speakers.add(s1e4);
//        e4speakers.add(s2e4);
        e4.setSpeakers(e4speakers);

        List<Speaker> e5speakers = new ArrayList<>();
        Event e5 = new Event();

        e5.setName("Tea Break");
        e5.setTime("11:30 AM – 12:00 " +
                "NOON");
        e5.setDetails("Tea Break");
//        Speaker s1e5 = new Speaker();
//        s1e5.setLink("linkedIn Link");
//        s1e5.setName("Speaker1");
//        s1e5.setDesignation("Honble Speaker");
//        s1e5.setDepartment("Opportunity Chhattisgarh 2015");
//        s1e5.setImageId(R.drawable.user_placeholder);
//        Speaker s2e5 = new Speaker();
//        s2e5.setLink("linkedIn Link");
//        s2e5.setName("Speaker 2");
//        s2e5.setDesignation("Honble Speaker");
//        s2e5.setDepartment("Opportunity Chhattisgarh");
//        s2e5.setImageId(R.drawable.user_placeholder);
//        e5speakers.add(s1e5);
//        e5speakers.add(s2e5);
        e5.setSpeakers(e5speakers);

        List<Speaker> e6speakers = new ArrayList<>();
        Event e6 = new Event();
        e6.setName("Introductory Session Chhattisgarh offerings, potential and Government Initiatives to develop the IT/BPM sector");
        e6.setTime("12:00 NOON – 12:30 PM");
        e6.setDetails("1. Presentation on Naya Raipur Development Authority (NRDA) \n2. State IT Scenario presentation by Chhattisgarh Infotech\n" +
                "& Biotech Promotion Society (CHiPS)");
//        Speaker s1e6 = new Speaker();
//        s1e6.setLink("linkedIn Link");
//        s1e6.setName("Speaker1");
//        s1e6.setDesignation("Honble Speaker");
//        s1e6.setDepartment("Opportunity Chhattisgarh 2015");
//        s1e6.setImageId(R.drawable.user_placeholder);
//        Speaker s2e6 = new Speaker();
//        s2e6.setLink("linkedIn Link");
//        s2e6.setName("Speaker 2");
//        s2e6.setDesignation("Honble Speaker");
//        s2e6.setDepartment("Opportunity Chhattisgarh");
//        s2e6.setImageId(R.drawable.user_placeholder);
//        e6speakers.add(s1e6);
//        e6speakers.add(s2e6);
        e6.setSpeakers(e6speakers);





        List<Speaker> e7speakers = new ArrayList<>();
        Event e7 = new Event();
        e7.setName("Building the new IT Ecosystem in Incubation Hub Roadmap");
        e7.setTime("12:30 PM – 12:45 PM");
        e7.setDetails("");

        Speaker s2e7 = new Speaker();
        s2e7.setName("Mr. Manav Subodh");
        s2e7.setDesignation("Senior Fellow");
        s2e7.setDepartment("at UC Berkeley");
        s2e7.setImageId(R.drawable.user_placeholder);

        e7speakers.add(s2e7);
        e7.setSpeakers(e7speakers);











//        List<Speaker> e7speakers = new ArrayList<>();
//        Event e7 = new Event();
//        e7.setName("Creating and nurturing talent for the IT industry in Chhattisgarh");
//        e7.setTime("12:30 PM – 12:45 PM");
//        e7.setDetails("");
//        Speaker s1e7 = new Speaker();
//        s1e7.setLink("");
//        s1e7.setName("Dr. Sandhya Chintala");
//        s1e7.setDesignation("ED");
//        s1e7.setDepartment("IT-ITeS Sector Skills Council, and VP, NASSCOM)");
//        s1e7.setImageId(R.drawable.user_placeholder);
////        Speaker s2e7 = new Speaker();
////        s2e7.setLink("linkedIn Link");
////        s2e7.setName("Speaker 2");
////        s2e7.setDesignation("Honble Speaker");
////        s2e7.setDepartment("Opportunity Chhattisgarh");
////        s2e7.setImageId(R.drawable.user_placeholder);
//        e7speakers.add(s1e7);
////        e7speakers.add(s2e7);
//        e7.setSpeakers(e7speakers);

        List<Speaker> e8speakers = new ArrayList<>();
        Event e8 = new Event();
        e8.setName("Q&A");
        e8.setTime("12:45 PM – 01:00 PM");
        e8.setDetails("Discussion and Q&A");
//        Speaker s1e8 = new Speaker();
//        s1e8.setLink("linkedIn Link");
//        s1e8.setName("Speaker1");
//        s1e8.setDesignation("Honble Speaker");
//        s1e8.setDepartment("Opportunity Chhattisgarh 2015");
//        s1e8.setImageId(R.drawable.user_placeholder);
//        Speaker s2e8 = new Speaker();
//        s2e8.setLink("linkedIn Link");
//        s2e8.setName("Speaker 2");
//        s2e8.setDesignation("Honble Speaker");
//        s2e8.setDepartment("Opportunity Chhattisgarh");
//        s2e8.setImageId(R.drawable.user_placeholder);
//        e8speakers.add(s1e8);
//        e8speakers.add(s2e8);
        e8.setSpeakers(e8speakers);

        List<Speaker> e9speakers = new ArrayList<>();
        Event e9 = new Event();
        e9.setName("Industry Leaders Speak – Doing Business in Chhattisgarh");
        e9.setTime("01:00 PM – 01:15 PM");
        e9.setDetails("Experience Sharing by Industry Leaders");
//        Speaker s1e9 = new Speaker();
//        s1e9.setLink("linkedIn Link");
//        s1e9.setName("Speaker1");
//        s1e9.setDesignation("Honble Speaker");
//        s1e9.setDepartment("Opportunity Chhattisgarh 2015");
//        s1e9.setImageId(R.drawable.user_placeholder);
//        Speaker s2e9 = new Speaker();
//        s2e9.setLink("linkedIn Link");
//        s2e9.setName("Speaker 2");
//        s2e9.setDesignation("Honble Speaker");
//        s2e9.setDepartment("Opportunity Chhattisgarh");
//        s2e9.setImageId(R.drawable.user_placeholder);
//        e9speakers.add(s1e9);
//        e9speakers.add(s2e9);
        e9.setSpeakers(e9speakers);

        List<Speaker> e10speakers = new ArrayList<>();
        Event e10 = new Event();
        e10.setName("Q&A");
        e10.setTime("01:15 PM – 01:45 PM");
        e10.setDetails("Discussion and Q&A");
//        Speaker s1e10 = new Speaker();
//        s1e10.setLink("linkedIn Link");
//        s1e10.setName("Speaker1");
//        s1e10.setDesignation("Honble Speaker");
//        s1e10.setDepartment("Opportunity Chhattisgarh 2015");
//        s1e10.setImageId(R.drawable.user_placeholder);
//        Speaker s2e10 = new Speaker();
//        s2e10.setLink("linkedIn Link");
//        s2e10.setName("Speaker 2");
//        s2e10.setDesignation("Honble Speaker");
//        s2e10.setDepartment("Opportunity Chhattisgarh");
//        s2e10.setImageId(R.drawable.user_placeholder);
//        e10speakers.add(s1e10);
//        e10speakers.add(s2e10);
        e10.setSpeakers(e10speakers);



        List<Speaker> e11speakers = new ArrayList<>();
        Event e11 = new Event();
        e11.setName("Networking Lunch");
        e11.setTime("01:45 PM – 02:30 PM");
        e11.setDetails("Networking Lunch");
        e11.setSpeakers(e11speakers);

        List<Speaker> e12speakers = new ArrayList<>();
        Event e12 = new Event();
        e12.setName("Tour of Naya Raipur");
        e12.setTime("02:30 PM – 04:15 PM");
        e12.setDetails("Tour of Naya Raipur followed by Airport drop");
        e12.setSpeakers(e12speakers);


        System.out.println(">>>>>> e1 speakers size:"+e1.getSpeakers().size());
        System.out.println(">>>>> e1speakers size:"+e1speakers.size());
        eventList.add(e1);
        eventList.add(e2);
        eventList.add(e3);
        eventList.add(e4);
        eventList.add(e5);
        eventList.add(e6);
        eventList.add(e7);
        eventList.add(e8);
        eventList.add(e9);
        eventList.add(e10);
        eventList.add(e11);
        eventList.add(e12);

      listAdapter = (CustomListAdapter) new CustomListAdapter(this,R.layout.element_department_text_center,eventList);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules);
        super.setToolbar();
        findThings();
        initThings();
        initViews();
        schedulesLV.setAdapter(listAdapter);
        schedulesLV.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appController.setSelectedEvent(eventList.get(position));
                System.out.println(">>>> while selecting event: speakers size:"+eventList.get(position).getSpeakers().size());
                Intent intent = new Intent(SchedulesActivity.this,ScheduleDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Schedule", getResources().getDrawable(R.drawable.nasscom_last),null,null);
    }


}
