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
import oppotunitychhattisgarh2015.src.Model.Speaker;
import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;

public class FacilitatorsActivity extends OpportunityActivity {

    AppController appController;
    FacilitatorAdapter facilitatorAdapter;
    ListView facilitatorsLV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilitators);
        super.setToolbar();
        initThings();
        initViews();
    }


    public void initThings() {
        appController = (AppController) getApplicationContext();
        facilitatorsLV = (ListView) findViewById(R.id.facilitatorsLV);
        List<Speaker> speakers = new ArrayList<>();
        Speaker f1 = new Speaker();
        f1.setName("Abhijit Chakravarty");
        f1.setImageId(R.drawable.user_placeholder);
        f1.setDesignation("Sr. Consultant (Technology Mgt.)");
        f1.setDepartment("SeMT");
        f1.setPhoneNo("9669133455");
        f1.setLink("abhijit.c@semt.gov.in");

        Speaker f2 = new Speaker();
        f2.setName("Vivek Chandrakar");
        f2.setImageId(R.drawable.user_placeholder);
        f2.setDesignation("Manager (Projects)");
        f2.setDepartment("CHiPS");
        f2.setPhoneNo("9993303403");
        f2.setLink("chandraker.vivek@gmail.com");

        Speaker f3 = new Speaker();
        f3.setName("Anit Tiwari");
        f3.setImageId(R.drawable.user_placeholder);
        f3.setDesignation("Consultant (Technology Mgt.)");
        f3.setDepartment("SeMT");
        f3.setPhoneNo("8889960009");
        f3.setLink("anit.tiwari@semt.gov.in");

        Speaker f4 = new Speaker();
        f4.setName("Vijay Bhargava");
        f4.setImageId(R.drawable.user_placeholder);
        f4.setDesignation("Sr. Consultant (Finance Mgt.)");
        f4.setDepartment("SeMT");
        f4.setPhoneNo("8109100890");
        f4.setLink("vijay.bhargava@semt.gov.in");

        Speaker f5 = new Speaker();
        f5.setName("Paritosh Dongaonkar");
        f5.setImageId(R.drawable.user_placeholder);
        f5.setDesignation("Sr. Manager (CSC)");
        f5.setDepartment("CHiPS");
        f5.setPhoneNo("9926000300");
        f5.setLink("paritosh1979@gmail.com");

        Speaker f6 = new Speaker();
        f6.setName("Shailesh Soni");
        f6.setImageId(R.drawable.user_placeholder);
        f6.setDesignation("Sr. Manager (Projects)");
        f6.setDepartment("CHiPS");
        f6.setPhoneNo("9826331211");
        f6.setLink("shaileshsony@gmail.com");

        Speaker f7 = new Speaker();
        f7.setName("Rajeev Thakur");
        f7.setImageId(R.drawable.user_placeholder);
        f7.setDesignation("System Administrator");
        f7.setDepartment("CHiPS");
        f7.setPhoneNo("7869948498");
        f7.setLink("rajeevthakur.mca@gmail.com");

        Speaker f8 = new Speaker();
        f8.setName("Praneesh K Dixit");
        f8.setImageId(R.drawable.user_placeholder);
        f8.setDesignation("Jr. Database Expert (Comp. Team)");
        f8.setDepartment("CHiPS");
        f8.setPhoneNo("7697576773");
        f8.setLink("pranesh.dixit@gmail.com");

        Speaker f9 = new Speaker();
        f9.setName("Nalin Janardhan");
        f9.setImageId(R.drawable.user_placeholder);
        f9.setDesignation("Asstt Manager(GIS),");
        f9.setDepartment("CHiPS");
        f9.setPhoneNo("9755637837");
        f9.setLink("janardan.nalin01@gmail.com");

        Speaker f10 = new Speaker();
        f10.setName("Smrity Verma");
        f10.setImageId(R.drawable.user_placeholder);
        f10.setDesignation("Manager");
        f10.setDepartment("");
        f10.setPhoneNo("8966055566");
        f10.setLink("smrity.verma@gmail.com");

        Speaker f11 = new Speaker();
        f11.setName("Medha Singh");
        f11.setImageId(R.drawable.user_placeholder);
        f11.setDesignation("Manager (BT)");
        f11.setDepartment("CHiPS");
        f11.setPhoneNo("9406202248");
        f11.setLink("medha.singh@rediffmail.com");

        Speaker f12 = new Speaker();
        f12.setName("Nupur /Karuna");
        f12.setImageId(R.drawable.user_placeholder);
        f12.setDesignation("Asstt. Manager(GIS)");
        f12.setDepartment("CHiPS");
        f12.setPhoneNo("9685071712");
        f12.setLink("nupursurendran@yahoo.com");


        speakers.add(f1);
        speakers.add(f2);
        speakers.add(f3);
        speakers.add(f4);
        speakers.add(f5);
        speakers.add(f6);
        speakers.add(f7);
        speakers.add(f8);
        speakers.add(f9);
        speakers.add(f10);
        speakers.add(f11);
        speakers.add(f12);
        facilitatorAdapter = (FacilitatorAdapter) new FacilitatorAdapter(this, R.layout.element_department_text_center, speakers);
        facilitatorsLV.setAdapter(facilitatorAdapter);
    }

    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Facilitator", getResources().getDrawable(R.drawable.nasscom_last), null, null);
    }

}
