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
        participant1.setCompanyName("Paramatrix Technologies Pvt Ltd");
        participant1.setDesignation("Managing Director");
        participant1.setEmail("mukesh@paramatrix.co.in");
        participant1.setImageId(R.drawable.user_placeholder);


        Participant participant2 = new Participant();
        participant2.setName("Mr. Abhijit Majumdar");
        participant2.setCompanyName("Zensar Technologies Ltd");
        participant2.setDesignation("Associate Vice President & Head of Government Business");
        participant2.setEmail("a.majumdar@zensar.com");
        participant2.setImageId(R.drawable.user_placeholder);

        Participant participant3 = new Participant();
        participant3.setName("Mr. Puneet Handa");
        participant3.setCompanyName("Godrej Infotech Ltd.");
        participant3.setDesignation("Assistant General Manager");
        participant3.setEmail(" puneet@godrej.com");
        participant3.setImageId(R.drawable.user_placeholder);


        Participant participant4 = new Participant();
        participant4.setName("Mr. Punit Jain");
        participant4.setCompanyName("Nelito Systems Ltd");
        participant4.setDesignation("Chief Executive Officer");
        participant4.setEmail("punit.jain@nelito.com");
        participant4.setImageId(R.drawable.user_placeholder);


        Participant participant5 = new Participant();
        participant5.setName("Mr. Govind Chauhan");
        participant5.setCompanyName("ABM Knowledgeware Ltd");
        participant5.setDesignation("Vice President");
        participant5.setEmail("gsc@abmindia.com");
        participant5.setImageId(R.drawable.user_placeholder);


        Participant participant6 = new Participant();
        participant6.setName("Mr. Praveen Prakash");
        participant6.setCompanyName("Epicenter Technologies Pvt Ltd");
        participant6.setDesignation("Manager Operations");
        participant6.setEmail("praveen.prakash@Epicentertechnology.com");
        participant6.setImageId(R.drawable.user_placeholder);


        Participant participant7 = new Participant();
        participant7.setName("Mr. Shobhit K Varma");
        participant7.setCompanyName("aurionPro Solutions Ltd");
        participant7.setDesignation("Director – Sales , Government Solutions Group");
        participant7.setEmail("shobhit.varma@aurionpro.com");
        participant7.setImageId(R.drawable.user_placeholder);


        Participant participant8 = new Participant();
        participant8.setName("Mr. Munawar Bux");
        participant8.setCompanyName("Larsen & Toubro Infotech Ltd");
        participant8.setDesignation("Head – System Integration and IMS – Services Cluster");
        participant8.setEmail("Munawar.Bux@lntinfotech.com");
        participant8.setImageId(R.drawable.user_placeholder);


        Participant participant9 = new Participant();
        participant9.setName("Mr. V. Chandrashekhar");
        participant9.setCompanyName("Larsen & Toubro Infotech Ltd");
        participant9.setDesignation("Senior Vice President");
        participant9.setEmail("V.Chandrashekar@lntinfotech.com");
        participant9.setImageId(R.drawable.user_placeholder);


        Participant participant10 = new Participant();
        participant10.setName("Mr. Ravindra Shenai");
        participant10.setCompanyName("Highbar Technologies LTD");
        participant10.setDesignation("National  Manager – Sales (GOVT & PSU)");
        participant10.setEmail("Ravindra.Shenai@highbartechnologies.com");
        participant10.setImageId(R.drawable.user_placeholder);

        Participant participant11 = new Participant();
        participant11.setName("Mr. Ashok Maheshwari");
        participant11.setCompanyName("3i Infotech Ltd.");
        participant11.setDesignation("Head of Operation, BPO");
        participant11.setEmail("ashok.maheshwari@3i-infotechbpo.com");
        participant11.setImageId(R.drawable.user_placeholder);

        Participant participant12 = new Participant();
        participant12.setName("Mr. Jayajothi Rajaram");
        participant12.setCompanyName("Datavail Infotech Pvt.Ltd");
        participant12.setDesignation("Country Manager and Director, Technical");
        participant12.setEmail("Jaya.Rajaram@datavail.com");
        participant12.setImageId(R.drawable.user_placeholder);



        Participant participant13 = new Participant();
        participant13.setName("Mr. Ninad Sonawane");
        participant13.setCompanyName("Datavail Infotech Pvt.Ltd");
        participant13.setDesignation("Director- HR");
        participant13.setEmail("Ninad.Sonawane@datavail.com");
        participant13.setImageId(R.drawable.user_placeholder);



        Participant participant14 = new Participant();
        participant14.setName("Mr. Vinod Sood");
        participant14.setCompanyName("Hughes Systique Pvt Ltd");
        participant14.setDesignation("Managing Director");
        participant14.setEmail("vinod@hsc.com");
        participant14.setImageId(R.drawable.user_placeholder);


        Participant participant15 = new Participant();
        participant15.setName("Mr. Brahma Reddy Beeram");
        participant15.setCompanyName("Oakton Global Technology Services Centre (India) Pvt Ltd");
        participant15.setDesignation("Finance Controller");
        participant15.setEmail("brahma.beeram@oakton.com.au");
        participant15.setImageId(R.drawable.user_placeholder);


        Participant participant16 = new Participant();
        participant16.setName("Mr. Bharat Haladi");
        participant16.setCompanyName("TATA Business Support Services Ltd.");
        participant16.setDesignation("Vice President");
        participant16.setEmail("bharat.haladi@tata-bss.com");
        participant16.setImageId(R.drawable.user_placeholder);


        Participant participant17 = new Participant();
        participant17.setName("Mr. Amit Khan");
        participant17.setCompanyName("mjunction Services Ltd");
        participant17.setDesignation("Chief of Technology");
        participant17.setEmail("amit.khan@mjunction.in");
        participant17.setImageId(R.drawable.user_placeholder);


        Participant participant18 = new Participant();
        participant18.setName("Mr. Kaushal R. Vyas");
        participant18.setCompanyName("DEV IT");
        participant18.setDesignation("Head  Sales");
        participant18.setEmail("Kaushal.vyas@devitpl.com");
        participant18.setImageId(R.drawable.user_placeholder);


        Participant participant19 = new Participant();
        participant19.setName("Mr. Priyatam Dewangan");
        participant19.setCompanyName("Omnium Technologies Private Limited");
        participant19.setDesignation("Director");
        participant19.setEmail("priyatam@iomnium.com");
        participant19.setImageId(R.drawable.user_placeholder);

        Participant participant20 = new Participant();
        participant20.setName("Mr. Sriram Iyengar");
        participant20.setCompanyName("Nextenders (India) Private Limited");
        participant20.setDesignation("Chief Delivery Officer");
        participant20.setEmail("sriram.iyengar@nextenders.com");
        participant20.setImageId(R.drawable.user_placeholder);

        Participant participant21 = new Participant();
        participant21.setName("Mr. Rajesh Mathur");
        participant21.setCompanyName("NIIT GIS");
        participant21.setDesignation("Vice Chairman");
        participant21.setEmail("RAJESH.MATHUR@esriindia.com");
        participant21.setImageId(R.drawable.user_placeholder);


        Participant participant22 = new Participant();
        participant22.setName("Mr. Pranav Kumar Suresh");
        participant22.setCompanyName("Pranav Start up Village");
        participant22.setDesignation("CEO");
        participant22.setEmail("pranav@startupvillage.in");
        participant22.setImageId(R.drawable.user_placeholder);


        Participant participant23 = new Participant();
        participant23.setName("Mr. Sunil Chandiramani");
        participant23.setCompanyName("Nyaka Advisory");
        participant23.setDesignation("CEO");
        participant23.setEmail("sunil.chandiramani@nykaadvisory.com");
        participant23.setImageId(R.drawable.user_placeholder);


        Participant participant24 = new Participant();
        participant24.setName("Mr. Manish Gupta");
        participant24.setCompanyName("B K Group");
        participant24.setDesignation("Managing Director");
        participant24.setEmail("mgupta@bcbkltt.com");
        participant24.setImageId(R.drawable.user_placeholder);


        Participant participant25 = new Participant();
        participant25.setName("Mr. Ramesh Nair");
        participant25.setCompanyName("BALCO-VEDANTA");
        participant25.setDesignation("CEO");
        participant25.setEmail("ramesh.nair@vedanta.co.in");
        participant25.setImageId(R.drawable.user_placeholder);


        Participant participant26 = new Participant();
        participant26.setName("Mr. R Chandrashekhar");
        participant26.setCompanyName("NASSCOM");
        participant26.setDesignation("President");
        participant26.setEmail("rc@nasscom.in");
        participant26.setImageId(R.drawable.user_placeholder);


        Participant participant27 = new Participant();
        participant27.setName("Dr. Sandhya Chintala");
        participant27.setCompanyName("NASSCOM");
        participant27.setDesignation("Vice - President and Executive Director Sector Skill Council");
        participant27.setEmail("sandhya@nasscom.in");
        participant27.setImageId(R.drawable.user_placeholder);

        Participant participant28 = new Participant();
        participant28.setName("Mr. Rajiv Vaishnav");
        participant28.setCompanyName("NASSCOM");
        participant28.setDesignation("Vice - President");
        participant28.setEmail("Rajiv@nasscom.in");
        participant28.setImageId(R.drawable.user_placeholder);


        Participant participant29 = new Participant();
        participant29.setName("Dr. Chetan Samant");
        participant29.setCompanyName("NASSCOM");
        participant29.setDesignation("Deputy Director");
        participant29.setEmail("chetan@nasscom.in");
        participant29.setImageId(R.drawable.user_placeholder);


        Participant participant30 = new Participant();
        participant30.setName("Mr. Yudhsither Yadav");
        participant30.setCompanyName("NASSCOM");
        participant30.setDesignation("Deputy Manager");
        participant30.setEmail("Yudhisther@nasscom.in");
        participant30.setImageId(R.drawable.user_placeholder);


        Participant participant31 = new Participant();
        participant31.setName("Ms. Chetna Desai");
        participant31.setCompanyName("NASSCOM");
        participant31.setDesignation("Sr. Associate");
        participant31.setEmail("cdesai@nasscom.in");
        participant31.setImageId(R.drawable.user_placeholder);


        Participant participant32 = new Participant();
        participant32.setName("Mr. Santosh Raorane");
        participant32.setCompanyName("NASSCOM");
        participant32.setDesignation("Sr. Associate");
        participant32.setEmail("Santosh@nasscom.in");
        participant32.setImageId(R.drawable.user_placeholder);



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
//        participantList.add(participant33);
//        participantList.add(participant34);
//        participantList.add(participant35);
//        participantList.add(participant36);
//        participantList.add(participant37);
//        participantList.add(participant38);
//        participantList.add(participant39);
//        participantList.add(participant40);
//        participantList.add(participant41);
//        participantList.add(participant42);
//        participantList.add(participant43);






        participantAdapter = (ParticipantAdapter) new ParticipantAdapter(this, R.layout.element_department_text_center, participantList);
        participantsLV.setAdapter(participantAdapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Participants", getResources().getDrawable(R.drawable.nasscom_logo), null, null);
    }
}
