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

        participant1.setName("Mr. Mukesh Thumar");
        participant1.setCompanyName("Parametrix Technologoies Pvt Ltd");
        participant1.setContactNo("+919619555666");
        participant1.setDesignation("");
        participant1.setEmail("mukesh@parametrix.co.in");
        participant1.setImageId(R.drawable.user_placeholder);

        Participant participant2 = new Participant();

        participant2.setName("Mr. Abhijit Majumdar");
        participant2.setCompanyName("Zensor Technologies Ltd.");
        participant2.setContactNo("+919545516626");
        participant2.setDesignation("");
        participant2.setEmail("mukesh@parametrix.co.in");
        participant2.setImageId(R.drawable.user_placeholder);

        Participant participant3 = new Participant();

        participant3.setName("Mr. Puneet Handa");
        participant3.setCompanyName("Godrej Infotech Ltd.");
        participant3.setDesignation("");
        participant3.setContactNo("+919899449241");
        participant3.setEmail("puneet@godrej.com");
        participant3.setImageId(R.drawable.user_placeholder);

        Participant participant4 = new Participant();

        participant4.setName("Mr. Punit Jain");
        participant4.setCompanyName("Nelito Systems Ltd.");
        participant4.setContactNo("+9190046780109241");
        participant4.setDesignation("");
        participant4.setEmail("");
        participant4.setImageId(R.drawable.user_placeholder);

        Participant participant5 = new Participant();

        participant5.setName("Mr. Govind Chauhan");
        participant5.setCompanyName("ABM Knowledgeware Ltd.");
        participant5.setContactNo("+919324647052");
        participant5.setDesignation("");
        participant5.setEmail("gsc@abmindia.com");
        participant5.setImageId(R.drawable.user_placeholder);

        Participant participant6 = new Participant();

        participant6.setName("Mr. Praveen Prakash");
        participant6.setCompanyName("Epicenter Technologies Pvt Ltd.");
        participant6.setContactNo("+919833133241");
        participant6.setEmail("");
        participant6.setDesignation("");
        participant6.setImageId(R.drawable.user_placeholder);

        Participant participant7 = new Participant();

        participant7.setName("Mr. Sobhit K Varma");
        participant7.setCompanyName("aurionPro Solutions Ltd.");
        participant7.setContactNo("+919594441699");
        participant7.setEmail("sobhit.verma@aurionpro.com");
        participant7.setDesignation("");
        participant7.setImageId(R.drawable.user_placeholder);

        Participant participant8 = new Participant();

        participant8.setName("Mr. Munawar Bux");
        participant8.setCompanyName("Larsen & Taubro infotech Ltd");
        participant8.setContactNo("+919820035351");
        participant8.setEmail("Munawar.Bux@Lntinfotech.com");
        participant8.setDesignation("");
        participant8.setImageId(R.drawable.user_placeholder);

        Participant participant9 = new Participant();

        participant9.setName("Mr. V Chandrashekhar");
        participant9.setCompanyName("Larsen & Taubro infotech Ltd");
        participant9.setContactNo("");
        participant9.setEmail("");
        participant9.setDesignation("");
        participant9.setImageId(R.drawable.user_placeholder);

        Participant participant10 = new Participant();

        participant10.setName("Mr. Ravindra Shenai");
        participant10.setCompanyName("HIGHBAR Technologies Ltd");
        participant10.setContactNo("+919324611518");
        participant10.setEmail("Ravindra.Shenai@highbartechnologies.com");
        participant10.setDesignation("");
        participant10.setImageId(R.drawable.user_placeholder);

        Participant participant11 = new Participant();

        participant11.setName("Mr. Ashok Maheshwari");
        participant11.setCompanyName("3i Infotech Ltd");
        participant11.setContactNo("+919372404481");
        participant11.setDesignation("");
        participant11.setEmail("ashok.maheshwari@3i-infotechbpo.com");
        participant11.setImageId(R.drawable.user_placeholder);

        Participant participant12 = new Participant();

        participant12.setName("Mr. Jayajothi Rajaram");
        participant12.setCompanyName("Datavail Infotech Pvt Ltd");
        participant12.setContactNo("+919833045292");
        participant12.setEmail("jaya.rajaram@datavail.com");
        participant12.setDesignation("");
        participant12.setImageId(R.drawable.user_placeholder);


        Participant participant13 = new Participant();

        participant13.setName("Mr. Ninad Sonawane ");
        participant13.setCompanyName("Datavail Infotech Pvt Ltd");
        participant13.setContactNo("+919987109261");
        participant13.setEmail("Ninad.Sonawane@datavail.com");
        participant13.setDesignation("");
        participant13.setImageId(R.drawable.user_placeholder);

        Participant participant14 = new Participant();

        participant14.setName("Dr. Jaijit Bhattacharya");
        participant14.setCompanyName("KPMG");
        participant14.setContactNo("+919818213076");
        participant14.setEmail("");
        participant14.setDesignation("");
        participant14.setImageId(R.drawable.user_placeholder);

        Participant participant15 = new Participant();

        participant15.setName("Mr. Vinod Sood");
        participant15.setCompanyName("Hughes Systique Pvt Ltd");
        participant15.setContactNo("+919811533033");
        participant15.setDesignation("");
        participant15.setEmail("vinod@hsc.com");
        participant15.setImageId(R.drawable.user_placeholder);

        Participant participant16 = new Participant();

        participant16.setName("Mr. Brahma Reddy Beeram");
        participant16.setCompanyName("Oakton Global Technology Services Center");
        participant16.setContactNo("+919000143577");
        participant16.setEmail("");
        participant16.setDesignation("");
        participant16.setImageId(R.drawable.user_placeholder);

        Participant participant17 = new Participant();

        participant17.setName("Mr. Bharat Haladi");
        participant17.setCompanyName("TATA Business Support Services Ltd.");
        participant17.setContactNo("+919561871274");
        participant17.setEmail("");
        participant17.setDesignation("");
        participant17.setImageId(R.drawable.user_placeholder);

        Participant participant18 = new Participant();

        participant18.setName("Mr. Amit Khan");
        participant18.setCompanyName("mjunction Services Ltd");
        participant18.setContactNo("+919163348073");
        participant18.setEmail("");
        participant18.setDesignation("");
        participant18.setImageId(R.drawable.user_placeholder);


        Participant participant19 = new Participant();
        participant19.setName("Mr. Manish Parwani");
        participant19.setImageId(R.drawable.user_placeholder);
        participant19.setDesignation("DIRECTOR");
        participant19.setCompanyName("THINKAGE SOLUTIONS");
        participant19.setEmail("MANISH@THINKAGESOLUTIONS.COM");

        Participant participant20 = new Participant();
        participant20.setName("Mr. Harpreet Dhody");
        participant20.setImageId(R.drawable.user_placeholder);
        participant20.setDesignation("CEO");
        participant20.setCompanyName("KONSOLE GROUP");
        participant20.setEmail("AMAN@KONSOLEGROUP.COM");

        Participant participant21 = new Participant();
        participant21.setName("Mr. Manish Agrawal");
        participant21.setImageId(R.drawable.user_placeholder);
        participant21.setDesignation("DIRECTOR");
        participant21.setCompanyName("TECHMENT TECHNOLOGY");
        participant21.setEmail("MANISH@TECHMENT.IN");

        Participant participant22 = new Participant();
        participant22.setName("Mr. Avinash Agrawal");
        participant22.setImageId(R.drawable.user_placeholder);
        participant22.setDesignation("CEO");
        participant22.setCompanyName("AROSYS");
        participant22.setEmail("AVINASHA@AROSYS.COM");

        Participant participant23 = new Participant();
        participant23.setName("Mr. Praveen Kanda");
        participant23.setImageId(R.drawable.user_placeholder);
        participant23.setDesignation("VP");
        participant23.setCompanyName("XYMOB");
        participant23.setEmail("PRAVEEN.KANDA@XYMOB.COM");

        Participant participant24 = new Participant();
        participant24.setName("Mr. Saurabh Maun");
        participant24.setImageId(R.drawable.user_placeholder);
        participant24.setDesignation("COO");
        participant24.setCompanyName("DEVELOPERBOX");
        participant24.setEmail("SAURABH@DBITINDIA.COM");

        Participant participant25 = new Participant();
        participant25.setName("Mr. Priyatam D");
        participant25.setImageId(R.drawable.user_placeholder);
        participant25.setDesignation("DIRECTOR");
        participant25.setCompanyName("OMNIUM TECHNOLOGIES PVT. LTD.");
        participant25.setEmail("PRIYATAM@IOMNIUM.COM");

        Participant participant26 = new Participant();
        participant26.setName("Mr. Prakash Agrawal");
        participant26.setImageId(R.drawable.user_placeholder);
        participant26.setDesignation("DIRECTOR");
        participant26.setCompanyName("ICAN INFOSOFT");
        participant26.setEmail("PRAKASH@ICANINFOSOFT.COM");

        Participant participant27 = new Participant();
        participant27.setName("Mr. Sourabh Agrawal");
        participant27.setImageId(R.drawable.user_placeholder);
        participant27.setDesignation("DIRECTOR FINANCE");
        participant27.setCompanyName("AMICUS TECHNOLOGY");
        participant27.setEmail("SOURABH_AGRAWAL@AMICUSGLOBAL.COM");

        Participant participant28 = new Participant();
        participant28.setName("Mr. Sumit Ghosh");
        participant28.setImageId(R.drawable.user_placeholder);
        participant28.setDesignation("CEO");
        participant28.setCompanyName("GLOBUSSOFT");
        participant28.setEmail("SGHOSH606@GMAIL.COM");

        Participant participant29 = new Participant();
        participant29.setName("Mr. Suryakant Pandey");
        participant29.setImageId(R.drawable.user_placeholder);
        participant29.setDesignation("DIRECTOR");
        participant29.setCompanyName("GLOBAL LOGIC");
        participant29.setEmail("SKANTPANDEY@GMAIL.COM");

        Participant participant30 = new Participant();
        participant30.setName("Mr. Dhiren Behera");
        participant30.setImageId(R.drawable.user_placeholder);
        participant30.setDesignation("DIRECTOR");
        participant30.setCompanyName("STPI BHILAI");
        participant30.setEmail("DHIREN.BEHERA@STPI.IN");

        Participant participant31 = new Participant();
        participant31.setName("Mr. Deepak Likhmania");
        participant31.setImageId(R.drawable.user_placeholder);
        participant31.setDesignation("G.M");
        participant31.setCompanyName("WTERSIS CONSULTANCY");
        participant31.setEmail("DKLIKHMANIA@GMAIL.COM");

        Participant participant32 = new Participant();
        participant32.setName("Mr. Gajendra Chandrawanshi");
        participant32.setImageId(R.drawable.user_placeholder);
        participant32.setDesignation("DIRECTOR");
        participant32.setCompanyName("SOFTBIT SOLUTION");
        participant32.setEmail("GAJENDRA113@REDIFFMAIL.COM");

        Participant participant33 = new Participant();
        participant33.setName("Mr. Pankaj Agrawal");
        participant33.setImageId(R.drawable.user_placeholder);
        participant33.setDesignation("DIRECTOR");
        participant33.setCompanyName("NILAXSOFT");
        participant33.setEmail("PANKAJ@NILAXSOFT.COM");

        Participant participant34 = new Participant();
        participant34.setName("Mr. Abhinav Bharadwaj");
        participant34.setImageId(R.drawable.user_placeholder);
        participant34.setDesignation("LOCATION HEAD");
        participant34.setCompanyName("MPHASIS");
        participant34.setEmail("abhinav.b@mphasis.com");

        Participant participant35 = new Participant();
        participant35.setName("Mr. Sudorna Das");
        participant35.setImageId(R.drawable.user_placeholder);
        participant35.setDesignation("HR");
        participant35.setCompanyName("IDEAS INC MGMT. PVT. LTD");
        participant35.setEmail("HR@IIMPL.IN");

        Participant participant36 = new Participant();
        participant36.setName("Mr. Rahul Bhandari");
        participant36.setImageId(R.drawable.user_placeholder);
        participant36.setDesignation("Director");
        participant36.setCompanyName("Univabs Solution pvt. Ltd.");
        participant36.setEmail("rbhandari@univebs.com");

        Participant participant37 = new Participant();
        participant37.setName("Mr. Swapnil Nadkar");
        participant37.setImageId(R.drawable.user_placeholder);
        participant37.setDesignation("Director");
        participant37.setCompanyName("Genesis Learning Initiatives");
        participant37.setEmail("swapnil@genesislearning.in");

        Participant participant38 = new Participant();
        participant38.setName("Mr. Vipul Kataria");
        participant38.setImageId(R.drawable.user_placeholder);
        participant38.setDesignation("Proprietor");
        participant38.setCompanyName("Virtual Clone");
        participant38.setEmail("vipul@virtualassistant99.com");

        Participant participant39 = new Participant();
        participant39.setName("Mr. Roshan Agrawal");
        participant39.setImageId(R.drawable.user_placeholder);
        participant39.setDesignation("Director");
        participant39.setCompanyName("Siddhast Intellectual property Innovations pvt. Ltd.");
        participant39.setEmail("roshan@siddhast.com");

        Participant participant40 = new Participant();
        participant40.setName("Mr. Manas Pattnaik");
        participant40.setImageId(R.drawable.user_placeholder);
        participant40.setDesignation("Director");
        participant40.setCompanyName("M/s Anthem Global");
        participant40.setEmail("cd.panda@anthemgt.com");

        Participant participant41 = new Participant();
        participant41.setName("Mr. Pankaj Sarda");
        participant41.setImageId(R.drawable.user_placeholder);
        participant41.setDesignation("Director");
        participant41.setCompanyName("Sarda Solutions Technologies Pvt. Ltd.");
        participant41.setEmail("webtool@sstpl.co.in");

        Participant participant42 = new Participant();
        participant42.setName("Mr. Sir");
        participant42.setImageId(R.drawable.user_placeholder);
        participant42.setDesignation("");
        participant42.setCompanyName("Parichay Communication Technologies Pvt. Ltd.");
        participant42.setEmail("info@thepctpl.in");

        Participant participant43 = new Participant();
        participant43.setName("Mr. Amit Rawat");
        participant43.setImageId(R.drawable.user_placeholder);
        participant43.setDesignation("Operations Head");
        participant43.setCompanyName("AMICUS TECHNOLOGY");
        participant43.setEmail("AMIT_RAWAT@AMICUSGLOBAL.COM");


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

        participantList.add(participant19);
        participantList.add(participant20);
        participantList.add(participant21);
        participantList.add(participant22);
        participantList.add(participant23);
        participantList.add(participant24);
        participantList.add(participant25);
        participantList.add(participant26);
        participantList.add(participant27);
        participantList.add(participant28);
        participantList.add(participant29);
        participantList.add(participant30);
        participantList.add(participant31);
        participantList.add(participant32);
        participantList.add(participant33);
        participantList.add(participant34);
        participantList.add(participant35);
        participantList.add(participant36);
        participantList.add(participant37);
        participantList.add(participant38);
        participantList.add(participant39);
        participantList.add(participant40);
        participantList.add(participant41);
        participantList.add(participant42);
        participantList.add(participant43);






        participantAdapter = (ParticipantAdapter) new ParticipantAdapter(this, R.layout.element_department_text_center, participantList);
        participantsLV.setAdapter(participantAdapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Participants", getResources().getDrawable(R.drawable.nasscom_logo), null, null);
    }
}
