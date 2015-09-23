package credible_CG.src.Activity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import credible_CG.src.Adapter.ParticipantAdapter;
import credible_CG.src.Model.Participant;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

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


//        Participant participant1 = new Participant();
//        participant1.setName("Mr. Mukesh Thumar");
//        participant1.setCompanyName("Paramatrix Technologies Pvt Ltd");
//        participant1.setDesignation("Managing Director");
//        participant1.setEmail("mukesh@paramatrix.co.in");
//        participant1.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant2 = new Participant();
//        participant2.setName("Mr. Abhijit Majumdar");
//        participant2.setCompanyName("Zensar Technologies Ltd");
//        participant2.setDesignation("Associate Vice President & Head of Government Business");
//        participant2.setEmail("a.majumdar@zensar.com");
//        participant2.setImageId(R.drawable.user_placeholder);
//
//        Participant participant3 = new Participant();
//        participant3.setName("Mr. Puneet Handa");
//        participant3.setCompanyName("Godrej Infotech Ltd.");
//        participant3.setDesignation("Assistant General Manager");
//        participant3.setEmail(" puneet@godrej.com");
//        participant3.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant4 = new Participant();
//        participant4.setName("Mr. Punit Jain");
//        participant4.setCompanyName("Nelito Systems Ltd");
//        participant4.setDesignation("Chief Executive Officer");
//        participant4.setEmail("punit.jain@nelito.com");
//        participant4.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant5 = new Participant();
//        participant5.setName("Mr. Govind Chauhan");
//        participant5.setCompanyName("ABM Knowledgeware Ltd");
//        participant5.setDesignation("Vice President");
//        participant5.setEmail("gsc@abmindia.com");
//        participant5.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant6 = new Participant();
//        participant6.setName("Mr. Praveen Prakash");
//        participant6.setCompanyName("Epicenter Technologies Pvt Ltd");
//        participant6.setDesignation("Manager Operations");
//        participant6.setEmail("praveen.prakash@Epicentertechnology.com");
//        participant6.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant7 = new Participant();
//        participant7.setName("Mr. Shobhit K Varma");
//        participant7.setCompanyName("aurionPro Solutions Ltd");
//        participant7.setDesignation("Director – Sales , Government Solutions Group");
//        participant7.setEmail("shobhit.varma@aurionpro.com");
//        participant7.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant8 = new Participant();
//        participant8.setName("Mr. Munawar Bux");
//        participant8.setCompanyName("Larsen & Toubro Infotech Ltd");
//        participant8.setDesignation("Head – System Integration and IMS – Services Cluster");
//        participant8.setEmail("Munawar.Bux@lntinfotech.com");
//        participant8.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant9 = new Participant();
//        participant9.setName("Mr. V. Chandrashekhar");
//        participant9.setCompanyName("Larsen & Toubro Infotech Ltd");
//        participant9.setDesignation("Senior Vice President");
//        participant9.setEmail("V.Chandrashekar@lntinfotech.com");
//        participant9.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant10 = new Participant();
//        participant10.setName("Mr. Ravindra Shenai");
//        participant10.setCompanyName("Highbar Technologies LTD");
//        participant10.setDesignation("National  Manager – Sales (GOVT & PSU)");
//        participant10.setEmail("Ravindra.Shenai@highbartechnologies.com");
//        participant10.setImageId(R.drawable.user_placeholder);
//
//        Participant participant11 = new Participant();
//        participant11.setName("Mr. Ashok Maheshwari");
//        participant11.setCompanyName("3i Infotech Ltd.");
//        participant11.setDesignation("Head of Operation, BPO");
//        participant11.setEmail("ashok.maheshwari@3i-infotechbpo.com");
//        participant11.setImageId(R.drawable.user_placeholder);
//
//        Participant participant12 = new Participant();
//        participant12.setName("Mr. Jayajothi Rajaram");
//        participant12.setCompanyName("Datavail Infotech Pvt.Ltd");
//        participant12.setDesignation("Country Manager and Director, Technical");
//        participant12.setEmail("Jaya.Rajaram@datavail.com");
//        participant12.setImageId(R.drawable.user_placeholder);
//
//
//
//        Participant participant13 = new Participant();
//        participant13.setName("Mr. Ninad Sonawane");
//        participant13.setCompanyName("Datavail Infotech Pvt.Ltd");
//        participant13.setDesignation("Director- HR");
//        participant13.setEmail("Ninad.Sonawane@datavail.com");
//        participant13.setImageId(R.drawable.user_placeholder);
//
//
//
//        Participant participant14 = new Participant();
//        participant14.setName("Mr. Vinod Sood");
//        participant14.setCompanyName("Hughes Systique Pvt Ltd");
//        participant14.setDesignation("Managing Director");
//        participant14.setEmail("vinod@hsc.com");
//        participant14.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant15 = new Participant();
//        participant15.setName("Mr. Brahma Reddy Beeram");
//        participant15.setCompanyName("Oakton Global Technology Services Centre (India) Pvt Ltd");
//        participant15.setDesignation("Finance Controller");
//        participant15.setEmail("brahma.beeram@oakton.com.au");
//        participant15.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant16 = new Participant();
//        participant16.setName("Mr. Bharat Haladi");
//        participant16.setCompanyName("TATA Business Support Services Ltd.");
//        participant16.setDesignation("Vice President");
//        participant16.setEmail("bharat.haladi@tata-bss.com");
//        participant16.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant17 = new Participant();
//        participant17.setName("Mr. Amit Khan");
//        participant17.setCompanyName("mjunction Services Ltd");
//        participant17.setDesignation("Chief of Technology");
//        participant17.setEmail("amit.khan@mjunction.in");
//        participant17.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant18 = new Participant();
//        participant18.setName("Mr. Kaushal R. Vyas");
//        participant18.setCompanyName("DEV IT");
//        participant18.setDesignation("Head  Sales");
//        participant18.setEmail("Kaushal.vyas@devitpl.com");
//        participant18.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant19 = new Participant();
//        participant19.setName("Mr. Priyatam Dewangan");
//        participant19.setCompanyName("Omnium Technologies Private Limited");
//        participant19.setDesignation("Director");
//        participant19.setEmail("priyatam@iomnium.com");
//        participant19.setImageId(R.drawable.user_placeholder);
//
//        Participant participant20 = new Participant();
//        participant20.setName("Mr. Sriram Iyengar");
//        participant20.setCompanyName("Nextenders (India) Private Limited");
//        participant20.setDesignation("Chief Delivery Officer");
//        participant20.setEmail("sriram.iyengar@nextenders.com");
//        participant20.setImageId(R.drawable.user_placeholder);
//
//        Participant participant21 = new Participant();
//        participant21.setName("Mr. Rajesh Mathur");
//        participant21.setCompanyName("NIIT GIS");
//        participant21.setDesignation("Vice Chairman");
//        participant21.setEmail("RAJESH.MATHUR@esriindia.com");
//        participant21.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant22 = new Participant();
//        participant22.setName("Mr. Pranav Kumar Suresh");
//        participant22.setCompanyName("Pranav Start up Village");
//        participant22.setDesignation("CEO");
//        participant22.setEmail("pranav@startupvillage.in");
//        participant22.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant23 = new Participant();
//        participant23.setName("Mr. Sunil Chandiramani");
//        participant23.setCompanyName("Nyaka Advisory");
//        participant23.setDesignation("CEO");
//        participant23.setEmail("sunil.chandiramani@nykaadvisory.com");
//        participant23.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant24 = new Participant();
//        participant24.setName("Mr. Manish Gupta");
//        participant24.setCompanyName("B K Group");
//        participant24.setDesignation("Managing Director");
//        participant24.setEmail("mgupta@bcbkltt.com");
//        participant24.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant25 = new Participant();
//        participant25.setName("Mr. Ramesh Nair");
//        participant25.setCompanyName("BALCO-VEDANTA");
//        participant25.setDesignation("CEO");
//        participant25.setEmail("ramesh.nair@vedanta.co.in");
//        participant25.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant26 = new Participant();
//        participant26.setName("Mr. R Chandrashekhar");
//        participant26.setCompanyName("NASSCOM");
//        participant26.setDesignation("President");
//        participant26.setEmail("rc@nasscom.in");
//        participant26.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant27 = new Participant();
//        participant27.setName("Dr. Sandhya Chintala");
//        participant27.setCompanyName("NASSCOM");
//        participant27.setDesignation("Vice - President and Executive Director Sector Skill Council");
//        participant27.setEmail("sandhya@nasscom.in");
//        participant27.setImageId(R.drawable.user_placeholder);
//
//        Participant participant28 = new Participant();
//        participant28.setName("Mr. Rajiv Vaishnav");
//        participant28.setCompanyName("NASSCOM");
//        participant28.setDesignation("Vice - President");
//        participant28.setEmail("Rajiv@nasscom.in");
//        participant28.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant29 = new Participant();
//        participant29.setName("Dr. Chetan Samant");
//        participant29.setCompanyName("NASSCOM");
//        participant29.setDesignation("Deputy Director");
//        participant29.setEmail("chetan@nasscom.in");
//        participant29.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant30 = new Participant();
//        participant30.setName("Mr. Yudhsither Yadav");
//        participant30.setCompanyName("NASSCOM");
//        participant30.setDesignation("Deputy Manager");
//        participant30.setEmail("Yudhisther@nasscom.in");
//        participant30.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant31 = new Participant();
//        participant31.setName("Ms. Chetna Desai");
//        participant31.setCompanyName("NASSCOM");
//        participant31.setDesignation("Sr. Associate");
//        participant31.setEmail("cdesai@nasscom.in");
//        participant31.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant32 = new Participant();
//        participant32.setName("Mr. Santosh Raorane");
//        participant32.setCompanyName("NASSCOM");
//        participant32.setDesignation("Sr. Associate");
//        participant32.setEmail("Santosh@nasscom.in");
//        participant32.setImageId(R.drawable.user_placeholder);
//
//        Participant participant33 = new Participant();
//        participant33.setName("Mr. Manish Parwani");
//        participant33.setCompanyName("THINKAGE SOLUTIONS");
//        participant33.setDesignation("DIRECTOR");
//        participant33.setEmail("MANISH@THINKAGESOLUTIONS.COM");
//        participant33.setImageId(R.drawable.user_placeholder);
//
//        Participant participant34 = new Participant();
//        participant34.setName("Mr. Harpreet Dhody");
//        participant34.setCompanyName("KONSOLE GROUP");
//        participant34.setDesignation("CEO");
//        participant34.setEmail("AMAN@KONSOLEGROUP.COM");
//        participant34.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant35 = new Participant();
//        participant35.setName("Mr. Manish Agrawal");
//        participant35.setCompanyName("TECHMENT TECHNOLOGY");
//        participant35.setDesignation("DIRECTOR");
//        participant35.setEmail("MANISH@TECHMENT.IN");
//        participant35.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant36 = new Participant();
//        participant36.setName("Mr. Avinash Agrawal");
//        participant36.setCompanyName("AROSYS");
//        participant36.setDesignation("CEO");
//        participant36.setEmail("AVINASHA@AROSYS.COM");
//        participant36.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant37 = new Participant();
//        participant37.setName("Mr. Praveen Kanda");
//        participant37.setCompanyName("XYMOB");
//        participant37.setDesignation("VP");
//        participant37.setEmail("PRAVEEN.KANDA@XYMOB.COM");
//        participant37.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant38 = new Participant();
//        participant38.setName("Mr. Saurabh Maun");
//        participant38.setCompanyName("DEVELOPERBOX");
//        participant38.setDesignation("COO");
//        participant38.setEmail("SAURABH@DBITINDIA.COM");
//        participant38.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant39 = new Participant();
//        participant39.setName("Mr. Priyatam D");
//        participant39.setCompanyName("OMNIUM TECHNOLOGIES PVT. LTD.");
//        participant39.setDesignation("DIRECTOR");
//        participant39.setEmail("PRIYATAM@IOMNIUM.COM");
//        participant39.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant40 = new Participant();
//        participant40.setName("Mr. Prakash Agrawal");
//        participant40.setCompanyName("ICAN INFOSOFT");
//        participant40.setDesignation("DIRECTOR ");
//        participant40.setEmail("UMESH@ICANINFOSOFT.COM");
//        participant40.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant41 = new Participant();
//        participant41.setName("Mr. Sourabh Agrawal");
//        participant41.setCompanyName("AMICUS TECHNOLOGY");
//        participant41.setDesignation("DIRECTOR FINANCE");
//        participant41.setEmail("SOURABH_AGRAWAL@AMICUSGLOBAL.COM");
//        participant41.setImageId(R.drawable.user_placeholder);
//
//        Participant participant42 = new Participant();
//        participant42.setName("Mr. Sumit Ghosh");
//        participant42.setCompanyName("GLOBUSSOFT");
//        participant42.setDesignation("CEO");
//        participant42.setEmail("SGHOSH606@GMAIL.COM");
//        participant42.setImageId(R.drawable.user_placeholder);
//
//        Participant participant43 = new Participant();
//        participant43.setName("Mr. Suryakant Pandey        ");
//        participant43.setCompanyName("GLOBAL LOGIC");
//        participant43.setDesignation("DIRECTOR             ");
//        participant43.setEmail("SKANTPANDEY@GMAIL.COM");
//        participant43.setImageId(R.drawable.user_placeholder);
//
//        Participant participant44 = new Participant();
//        participant44.setName("Mr. Dhiren Behera                       ");
//        participant44.setCompanyName("STPI BHILAI");
//        participant44.setDesignation("DIRECTOR                             ");
//        participant44.setEmail("DHIREN.BEHERA@STPI.IN");
//        participant44.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant45 = new Participant();
//        participant45.setName("Mr. Deepak Likhmania");
//        participant45.setCompanyName("WTERSIS CONSULTANCY");
//        participant45.setDesignation("G.M");
//        participant45.setEmail("DKLIKHMANIA@GMAIL.COM");
//        participant45.setImageId(R.drawable.user_placeholder);
//
//        Participant participant46 = new Participant();
//        participant46.setName("Mr. Gajendra Chandrawanshi");
//        participant46.setCompanyName("SOFTBIT SOLUTION");
//        participant46.setDesignation("DIRECTOR");
//        participant46.setEmail("GAJENDRA113@REDIFFMAIL.COM");
//        participant46.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant47 = new Participant();
//        participant47.setName("Mr. Pankaj Agrawal");
//        participant47.setCompanyName("NILAXSOFT");
//        participant47.setDesignation("DIRECTOR");
//        participant47.setEmail("PANKAJ@NILAXSOFT.COM");
//        participant47.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant48 = new Participant();
//        participant48.setName("Mr. Abhinav Bharadwaj");
//        participant48.setCompanyName("MPHASIS");
//        participant48.setDesignation("LOCATION HEAD");
//        participant48.setEmail("shaileshnirmalkar@mphasis.com");
//        participant48.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant49 = new Participant();
//        participant49.setName("Mr. Sudorna Das");
//        participant49.setCompanyName("IDEAS INC MGMT. PVT. LTD");
//        participant49.setDesignation("HR");
//        participant49.setEmail("HR@IIMPL.IN");
//        participant49.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant50 = new Participant();
//        participant50.setName("Mr. Rahul Bhandari                                             ");
//        participant50.setCompanyName("Univabs Solution pvt. Ltd.");
//        participant50.setDesignation("Director");
//        participant50.setEmail("rbhandari@univebs.com");
//        participant50.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant51 = new Participant();
//        participant51.setName("Mr. Swapnil Nadkar");
//        participant51.setCompanyName("Genesis Learning Initiatives");
//        participant51.setDesignation("Director");
//        participant51.setEmail("swapnil@genesislearning.in");
//        participant51.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant52 = new Participant();
//        participant52.setName("Mr. Vipul Kataria ");
//        participant52.setCompanyName("Virtual Clone");
//        participant52.setDesignation("Proprietor");
//        participant52.setEmail("vipul@virtualassistant99.com");
//        participant52.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant53 = new Participant();
//        participant53.setName("Mr. Roshan Agrawal ");
//        participant53.setCompanyName("Siddhast Intellectual property Innovations pvt. Ltd.");
//        participant53.setDesignation("Director");
//        participant53.setEmail("roshan@siddhast.com");
//        participant53.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant54 = new Participant();
//        participant54.setName("Mr. Manas Pattnaik ");
//        participant54.setCompanyName("M/s Anthem Global");
//        participant54.setDesignation("Director");
//        participant54.setEmail("cd.panda@anthemgt.com");
//        participant54.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant55 = new Participant();
//        participant55.setName("Mr. Pankaj Sarda");
//        participant55.setCompanyName("Sarda Solutions & Technologies Pvt. Ltd.");
//        participant55.setDesignation("Director");
//        participant55.setEmail("webtool@sstpl.co.in");
//        participant55.setImageId(R.drawable.user_placeholder);
//
//
//        Participant participant56 = new Participant();
//        participant56.setName("Representative from");
//        participant56.setCompanyName("Parichay Communication & Technologies Pvt. Ltd.");
//        participant56.setDesignation("");
//        participant56.setEmail("info@thepctpl.in");
//        participant56.setImageId(R.drawable.user_placeholder);
//
//        Participant participant57 = new Participant();
//        participant57.setName("Mr. Amit Rawat");
//        participant57.setCompanyName("AMICUS TECHNOLOGY");
//        participant57.setDesignation("Operations Head");
//        participant57.setEmail("AMIT_RAWAT@AMICUSGLOBAL.COM");
//        participant57.setImageId(R.drawable.user_placeholder);


        // new data for make in CG started on 06-05-15
        Participant participant1 = new Participant();
        participant1.setName("Ms. Debjani Ghosh");
        participant1.setCompanyName("Intel Technology");
        participant1.setDesignation("Managing Director");
        participant1.setEmail("debjani.ghosh@intel.com");
        participant1.setImageId(R.drawable.user_placeholder);


        Participant participant2 = new Participant();
        participant2.setName("Mr. Nitin Kunkolienkar");
        participant2.setCompanyName("Smartlink Network");
        participant2.setDesignation("Vice President");
        participant2.setEmail("nitin.kunkolienker@smartlink.co.in");
        participant2.setImageId(R.drawable.user_placeholder);



        Participant participant3 = new Participant();
        participant3.setName("Mr. Avinash Ramachandra");
        participant3.setCompanyName("Dell International");
        participant3.setDesignation("Director-Govt. Affairs");
        participant3.setEmail("avinash_ramachandra@dell.com");
        participant3.setImageId(R.drawable.user_placeholder);



        Participant participant4 = new Participant();
        participant4.setName("Mr. Ambrish Bakaya");
        participant4.setCompanyName("HP India");
        participant4.setDesignation("Director-Govt. Affairs");
        participant4.setEmail("ambrish.bakaya@hp.com");
        participant4.setImageId(R.drawable.user_placeholder);



        Participant participant5 = new Participant();
        participant5.setName("Mr. Vivek Vashistha");
        participant5.setCompanyName("IBM India");
        participant5.setDesignation("Country Leader –Govt. Affairs");
        participant5.setEmail("Vivek.Vasishtha@in.ibm.com");
        participant5.setImageId(R.drawable.user_placeholder);


        Participant participant6 = new Participant();
        participant6.setName("Mr. Bikas K. Singh");
        participant6.setCompanyName("Lenovo India");
        participant6.setDesignation("Head-Govt. Affairs");
        participant6.setEmail("bksingh@lenovo.com");
        participant6.setImageId(R.drawable.user_placeholder);


        Participant participant7 = new Participant();
        participant7.setName("Mr. Neeraj K Goyal");
        participant7.setCompanyName("Lenovo India");
        participant7.setDesignation("Enterprise Business Group");
        participant7.setEmail("ngoyal@lenovo.com");
        participant7.setImageId(R.drawable.user_placeholder);

        Participant participant8 = new Participant();
        participant8.setName("Mr. Rishi Chawla");
        participant8.setCompanyName("Samsung India");
        participant8.setDesignation("GM-Corp. Relations");
        participant8.setEmail("rishi.chawla@samsung.com");
        participant8.setImageId(R.drawable.user_placeholder);



        Participant participant9 = new Participant();
        participant9.setName("Pallav Agrawal");
        participant9.setCompanyName("Samsung India");
        participant9.setDesignation("Head – Technical Support");
        participant9.setEmail("p.agarwal2@samsung.com");
        participant9.setImageId(R.drawable.user_placeholder);



        Participant participant10 = new Participant();
        participant10.setName("Mr. Rohit Gupta");
        participant10.setCompanyName("TVS Electronics");
        participant10.setDesignation("Head-Corp. Sales");
        participant10.setEmail("rohit.gupta@tvs-e.in");
        participant10.setImageId(R.drawable.user_placeholder);


        Participant participant11 = new Participant();
        participant11.setName("Mr. Mitesh Lokwani");
        participant11.setCompanyName("HLBS Tech Pvt. Ltd");
        participant11.setDesignation("Managing Director");
        participant11.setEmail("mitesh@hlbstech.com");
        participant11.setImageId(R.drawable.user_placeholder);


        Participant participant12 = new Participant();
        participant12.setName("Mr. Manohar Nema");
        participant12.setCompanyName("HLBS Tech Pvt. Ltd");
        participant12.setDesignation("Vice President");
        participant12.setEmail("manu@hlbstech.com");
        participant12.setImageId(R.drawable.user_placeholder);


        Participant participant13 = new Participant();
        participant13.setName("Mr. Sivakumar N");
        participant13.setCompanyName("Toshiba India");
        participant13.setDesignation("Vice President-PC Business");
        participant13.setEmail("sivakumar.n@toshiba-india.com");
        participant13.setImageId(R.drawable.user_placeholder);


        Participant participant14 = new Participant();
        participant14.setName("Mr. Daleep Kaul");
        participant14.setCompanyName("Dalan Technologies");
        participant14.setDesignation("CEO");
        participant14.setEmail("daleep@dalan.co.in");
        participant14.setImageId(R.drawable.user_placeholder);


        Participant participant15 = new Participant();
        participant15.setName("Mr. Muthu Swamy S");
        participant15.setCompanyName("Deepbiz Technologies");
        participant15.setDesignation("Managing Director");
        participant15.setEmail("rms.reddy@deepbiz.net");
        participant15.setImageId(R.drawable.user_placeholder);


        Participant participant16 = new Participant();
        participant16.setName("Mr. Sudhir Zutshi");
        participant16.setCompanyName("UL India");
        participant16.setDesignation("Head- Govt. & Industry Affairs");
        participant16.setEmail("Sudhir.Zutshi@ul.com");
        participant16.setImageId(R.drawable.user_placeholder);


        Participant participant17 = new Participant();
        participant17.setName("Mr. T Sukumar");
        participant17.setCompanyName("Epson India");
        participant17.setDesignation("Vice President");
        participant17.setEmail("sukumar@eid.epson.co.in");
        participant17.setImageId(R.drawable.user_placeholder);


        Participant participant18 = new Participant();
        participant18.setName("Mr. Rajesh N Pande");
        participant18.setCompanyName("TSI Elecpower");
        participant18.setDesignation("Managing Director");
        participant18.setEmail("rajesh@tsielecpower.com");
        participant18.setImageId(R.drawable.user_placeholder);


        Participant participant19 = new Participant();
        participant19.setName("Mr. Nirmal Pusti");
        participant19.setCompanyName("D-Link India");
        participant19.setDesignation("Regional Head");
        participant19.setEmail("nirmal.pusti@in.dlink.com");
        participant19.setImageId(R.drawable.user_placeholder);


        Participant participant20 = new Participant();
        participant20.setName("Mr. Ankur Malhotra");
        participant20.setCompanyName("Accenture");
        participant20.setDesignation("VP-Govt. Relations");
        participant20.setEmail("an.malhotra@accenture.com");
        participant20.setImageId(R.drawable.user_placeholder);


        Participant participant21 = new Participant();
        participant21.setName("Mr. S Rajendran");
        participant21.setCompanyName("Acer India");
        participant21.setDesignation("Chief Marketing Officer");
        participant21.setEmail("s.rajendran@acer.com");
        participant21.setImageId(R.drawable.user_placeholder);


        Participant participant22 = new Participant();
        participant22.setName("Mr. Anwar Shirpurwala");
        participant22.setCompanyName("MAIT");
        participant22.setDesignation("Executive Director");
        participant22.setEmail("anwar@mait.com");
        participant22.setImageId(R.drawable.user_placeholder);


        Participant participant23 = new Participant();
        participant23.setName("Ms. Shagufta Kamran");
        participant23.setCompanyName("MAIT");
        participant23.setDesignation("Deputy Director");
        participant23.setEmail("shagufta@mait.com");
        participant23.setImageId(R.drawable.user_placeholder);


        Participant participant24 = new Participant();
        participant24.setName("Mr. Sanjay Singh");
        participant24.setCompanyName("MAIT");
        participant24.setDesignation("Deputy Director");
        participant24.setEmail("sanjay@mait.com");
        participant24.setImageId(R.drawable.user_placeholder);






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
//        participantList.add(participant24);
//        participantList.add(participant25);
//        participantList.add(participant26);
//        participantList.add(participant27);
//        participantList.add(participant28);
//        participantList.add(participant29);
//        participantList.add(participant30);
//        participantList.add(participant31);
//        participantList.add(participant32);
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
//        participantList.add(participant44);
//        participantList.add(participant45);
//        participantList.add(participant46);
//        participantList.add(participant47);
//        participantList.add(participant48);
//        participantList.add(participant49);
//        participantList.add(participant50);
//        participantList.add(participant51);
//        participantList.add(participant52);
//        participantList.add(participant53);
//        participantList.add(participant54);
//        participantList.add(participant55);
//        participantList.add(participant56);
//        participantList.add(participant57);






        participantAdapter = (ParticipantAdapter) new ParticipantAdapter(this, R.layout.element_department_text_center, participantList);
        participantsLV.setAdapter(participantAdapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Participants", getResources().getDrawable(R.drawable.mait), null, null);
    }
}
