package credible_CG.src.Activity;

import android.os.Bundle;

import credible_CG.src.R;
import credible_CG.src.extra.AppController;

public class ScheduleDetailActivity extends OpportunityActivity {

    AppController appController;
//    TabHost tHost;

    public void initThings() {
        appController = (AppController) getApplicationContext();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_detail);
        super.setToolbar();
//        tHost = (TabHost) findViewById(android.R.id.tabhost);
//        tHost.setup();
        initThings();
        initViews();


//        TabHost.OnTabChangeListener tabChangeListener = new TabHost.OnTabChangeListener() {
//
//            @Override
//            public void onTabChanged(String tabId) {
//                FragmentManager fm = getFragmentManager();
//                DetailsFragment detailsFragment = (DetailsFragment) fm.findFragmentByTag("details");
//                SpeakerFragment speakersFragment = (SpeakerFragment) fm.findFragmentByTag("speakers");
//                FragmentTransaction ft = fm.beginTransaction();
//
//                /** Detaches the androidfragment if exists */
//                if (detailsFragment != null)
//                    ft.detach(detailsFragment);
//
//                /** Detaches the applefragment if exists */
//                if (speakersFragment != null)
//                    ft.detach(speakersFragment);
//
//                /** If current tab is android */
//                if (tabId.equalsIgnoreCase("details")) {
//
//                    if (detailsFragment == null) {
//                        /** Create AndroidFragment and adding to fragmenttransaction */
//                        ft.add(R.id.realtabcontent, new DetailsFragment(), "details");
//                    } else {
//                        /** Bring to the front, if already exists in the fragmenttransaction */
//                        ft.attach(detailsFragment);
//                    }
//
//                } else {    /** If current tab is apple */
//                    if (speakersFragment == null) {
//                        /** Create AppleFragment and adding to fragmenttransaction */
//                        ft.add(R.id.realtabcontent, new SpeakerFragment(), "speakers");
//                    } else {
//                        /** Bring to the front, if already exists in the fragmenttransaction */
//                        ft.attach(speakersFragment);
//                    }
//                }
//                ft.commit();
//            }
//        };
//
//
//        tHost.setOnTabChangedListener(tabChangeListener);
//
//        /** Defining tab builder for Andriod tab */
//        TabHost.TabSpec tSpecAndroid = tHost.newTabSpec("details");
//        tSpecAndroid.setIndicator("Details", getResources().getDrawable(R.drawable.logo_new));
//        tSpecAndroid.setContent(new DummyTabContent(getBaseContext()));
//        tHost.addTab(tSpecAndroid);
//
//        /** Defining tab builder for Apple tab */
//        TabHost.TabSpec tSpecApple = tHost.newTabSpec("speakers");
//        tSpecApple.setIndicator("Speakers", getResources().getDrawable(R.drawable.logo_new));
//        tSpecApple.setContent(new DummyTabContent(getBaseContext()));
//        tHost.addTab(tSpecApple);


    }


    private void initViews() {
        super.initViews(getResources().getDrawable(R.drawable.logo_new), appController.getSelectedEvent().getName(), getResources().getDrawable(R.drawable.mait), null, null);
    }

}
