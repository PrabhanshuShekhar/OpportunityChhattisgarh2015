package oppotunitychhattisgarh2015.src.Activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import oppotunitychhattisgarh2015.src.Adapter.CustomGridAdapter;
import oppotunitychhattisgarh2015.src.Adapter.ParticipantAdapter;
import oppotunitychhattisgarh2015.src.Model.Participant;
import oppotunitychhattisgarh2015.src.Model.Speaker;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class ParticipantsActivity extends OpportunityActivity {

    AppController appController;
    ParticipantAdapter participantAdapter;
    ListView participantsLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_participants);
        super.setToolbar();
        initThings();
        initViews();
    }


    public void initThings() {
        appController = (AppController) getApplicationContext();
        participantsLV = (ListView) findViewById(R.id.participantLV);
        List<Participant> participantList = new ArrayList<>();
        Participant participant1 = new Participant();

        participant1.setName("Mr. Mukesh thumar");
        participant1.setCompanyName("Parametrix Technologoies Pvt Ltd");
        participant1.setContactNo("+919619555666");
        participant1.setEmail("mukesh@parametrix.co.in");
        participant1.setImageId(R.drawable.user_placeholder);

        Participant participant2 = new Participant();

        participant2.setName("Mr. Abhijit Majumdar");
        participant2.setCompanyName("Zensor Technologies Ltd.");
        participant2.setContactNo("+919545516626");
        participant2.setEmail("mukesh@parametrix.co.in");
        participant2.setImageId(R.drawable.user_placeholder);

        Participant participant3 = new Participant();

        participant3.setName("Mr. Puneet Handa");
        participant3.setCompanyName("Godrej Infotech Ltd.");
        participant3.setContactNo("+919899449241");
        participant3.setEmail("puneet@godrej.com");
        participant3.setImageId(R.drawable.user_placeholder);

        Participant participant4 = new Participant();

        participant4.setName("Mr. Punit Jain");
        participant4.setCompanyName("Nelito Systems Ltd.");
        participant4.setContactNo("+9190046780109241");
        participant4.setEmail("");
        participant4.setImageId(R.drawable.user_placeholder);

        Participant participant5 = new Participant();

        participant5.setName("Mr. Govind Chauhan");
        participant5.setCompanyName("ABM Knowledgeware Ltd.");
        participant5.setContactNo("+919324647052");
        participant5.setEmail("gsc@abmindia.com");
        participant5.setImageId(R.drawable.user_placeholder);

        Participant participant6 = new Participant();

        participant6.setName("Mr. Praveen Prakash");
        participant6.setCompanyName("Epicenter Technologies Pvt Ltd.");
        participant6.setContactNo("+919833133241");
        participant6.setEmail("");
        participant6.setImageId(R.drawable.user_placeholder);

        Participant participant7 = new Participant();

        participant7.setName("Mr. Sobhit K Varma");
        participant7.setCompanyName("aurionPro Solutions Ltd.");
        participant7.setContactNo("+919594441699");
        participant7.setEmail("sobhit.verma@aurionpro.com");
        participant7.setImageId(R.drawable.user_placeholder);

        Participant participant8 = new Participant();

        participant8.setName("Mr. Munawar Bux");
        participant8.setCompanyName("Larsen & Taubro infotech Ltd");
        participant8.setContactNo("+919820035351");
        participant8.setEmail("Munawar.Bux@Lntinfotech.com");
        participant8.setImageId(R.drawable.user_placeholder);

        Participant participant9 = new Participant();

        participant9.setName("Mr. V Chandrashekhar");
        participant9.setCompanyName("Larsen & Taubro infotech Ltd");
        participant9.setContactNo("");
        participant9.setEmail("");
        participant9.setImageId(R.drawable.user_placeholder);

        Participant participant10 = new Participant();

        participant10.setName("Mr. Ravindra Shenai");
        participant10.setCompanyName("HIGHBAR Technologies Ltd");
        participant10.setContactNo("+919324611518");
        participant10.setEmail("Ravindra.Shenai@highbartechnologies.com");
        participant10.setImageId(R.drawable.user_placeholder);

        Participant participant11 = new Participant();

        participant11.setName("Mr. Ashok Maheshwari");
        participant11.setCompanyName("3i Infotech Ltd");
        participant11.setContactNo("+919372404481");
        participant11.setEmail("ashok.maheshwari@3i-infotechbpo.com");
        participant11.setImageId(R.drawable.user_placeholder);

        Participant participant12 = new Participant();

        participant12.setName("Mr. Jayajothi Rajaram");
        participant12.setCompanyName("Datavail Infotech Pvt Ltd");
        participant12.setContactNo("+919833045292");
        participant12.setEmail("jaya.rajaram@datavail.com");
        participant12.setImageId(R.drawable.user_placeholder);


        Participant participant13 = new Participant();

        participant13.setName("Mr. Ninad Sonawane ");
        participant13.setCompanyName("Datavail Infotech Pvt Ltd");
        participant13.setContactNo("+919987109261");
        participant13.setEmail("Ninad.Sonawane@datavail.com");
        participant13.setImageId(R.drawable.user_placeholder);

        Participant participant14 = new Participant();

        participant14.setName("Dr. Jaijit Bhattacharya");
        participant14.setCompanyName("KPMG");
        participant14.setContactNo("+919818213076");
        participant14.setEmail("");
        participant14.setImageId(R.drawable.user_placeholder);

        Participant participant15 = new Participant();

        participant15.setName("Mr. Vinod Sood");
        participant15.setCompanyName("Hughes Systique Pvt Ltd");
        participant15.setContactNo("+919811533033");
        participant15.setEmail("vinod@hsc.com");
        participant15.setImageId(R.drawable.user_placeholder);

        Participant participant16 = new Participant();

        participant16.setName("Mr. Brahma Reddy Beeram");
        participant16.setCompanyName("Oakton Global Technology Services Center");
        participant16.setContactNo("+919000143577");
        participant16.setEmail("");
        participant16.setImageId(R.drawable.user_placeholder);

        Participant participant17 = new Participant();

        participant17.setName("Mr. Bharat Haladi");
        participant17.setCompanyName("TATA Business Support Services Ltd.");
        participant17.setContactNo("+919561871274");
        participant17.setEmail("");
        participant17.setImageId(R.drawable.user_placeholder);

        Participant participant18 = new Participant();

        participant18.setName("Mr. Amit Khan");
        participant18.setCompanyName("mjunction Services Ltd");
        participant18.setContactNo("+919163348073");
        participant18.setEmail("");
        participant18.setImageId(R.drawable.user_placeholder);


        participantList.add(participant1);
        participantList.add(participant2);
        participantList.add(participant3);
        participantList.add(participant4);
        participantList.add(participant5);
        participantList.add(participant6);
        participantList.add(participant7);
        participantList.add(participant8);
        participantList.add(participant9);
        participantList.add(participant10);
        participantList.add(participant11);
        participantList.add(participant12);
        participantList.add(participant13);
        participantList.add(participant14);
        participantList.add(participant15);
        participantList.add(participant16);
        participantList.add(participant17);
        participantList.add(participant18);


        participantAdapter = (ParticipantAdapter) new ParticipantAdapter(this, R.layout.element_department_text_center, participantList);
        participantsLV.setAdapter(participantAdapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Participants", getResources().getDrawable(R.drawable.nasscom), null, null);
    }
}
