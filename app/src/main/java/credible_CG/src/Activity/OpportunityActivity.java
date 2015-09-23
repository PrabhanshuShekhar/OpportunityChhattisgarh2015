package credible_CG.src.Activity;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import credible_CG.src.R;
import credible_CG.src.extra.AppController;

public class OpportunityActivity extends ActionBarActivity {

    AppController appController;

    TextView titleHeader_TV;
    ImageButton left_IB;
    ImageButton right_IB;
    Typeface bold;
    Toolbar toolbar;

    public void initThings() {
        appController = (AppController) getApplicationContext();
    }

    private void findViews() {

    }

    public void initViews(Drawable leftDrawable, String titleActionBar, Drawable rightDrawable, Integer width, Integer height) {

        if (titleActionBar != null) {
            titleHeader_TV.setText(titleActionBar);
            titleHeader_TV.setTypeface(bold);
        }
        if (leftDrawable == null) {
            left_IB.setVisibility(View.GONE);
        } else {
            left_IB.setImageDrawable(leftDrawable);

        }
        if (rightDrawable == null) {
            right_IB.setVisibility(View.GONE);
        } else {
            right_IB.setImageDrawable(rightDrawable);

        }
        if (width != null) {
            left_IB.getLayoutParams().width = width;
            right_IB.getLayoutParams().width = width;
            left_IB.getLayoutParams().height = height;
            right_IB.getLayoutParams().height = height;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        initThings();
        findViews();

    }

    public void onLeft(View view) {
        finish();
    }

    public void onRight(View view) {
    }

    public void setToolbar() {
        toolbar = (Toolbar) findViewById(R.id.actionBar_T);
        setSupportActionBar(toolbar);

        titleHeader_TV = (TextView) toolbar.findViewById(R.id.titleHeader_TV);
        left_IB = (ImageButton) toolbar.findViewById(R.id.left_IB);
        right_IB = (ImageButton) toolbar.findViewById(R.id.right_IB);
        bold = Typeface.createFromAsset(getAssets(), "font/AlegreyaSC-Bold.ttf");
    }
}
