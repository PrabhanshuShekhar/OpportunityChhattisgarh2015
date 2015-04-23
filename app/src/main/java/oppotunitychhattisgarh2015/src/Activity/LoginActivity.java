package oppotunitychhattisgarh2015.src.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import oppotunitychhattisgarh2015.src.R;
import oppotunitychhattisgarh2015.src.extra.AppController;


public class LoginActivity extends OpportunityActivity {


    AppController appController;

    TextView label_TV, forgotPasswordTV, logInTV, userLoginTV, logInDetailTV;
    static EditText username_ET, password_ET;
    Button login_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        super.setToolbar();
        initThings();
        findViews();
        initViews();
    }


    private void findViews() {
        username_ET = (EditText) findViewById(R.id.username_ET);
        password_ET = (EditText) findViewById(R.id.password_ET);
        login_B = (Button) findViewById(R.id.login_B);
//        forgotPasswordTV = (TextView)findViewById(R.id.forgotPasswordTV);
//        logInTV = (TextView)findViewById(R.id.loginTV);
        userLoginTV = (TextView) findViewById(R.id.userLoginTV);
        logInDetailTV = (TextView) findViewById(R.id.loginDetailTV);
    }

    private void setTypeface() {
//        label_TV.setTypeface(appController.getTypefaceAllBold());
        login_B.setTypeface(appController.getTypefaceAllBold());
//        logInTV.setTypeface(appController.getTypefaceAllBold());
        userLoginTV.setTypeface(appController.getTypefaceAllRegular());
//        forgotPasswordTV.setTypeface(appController.getTypefaceOsLight());
        logInDetailTV.setTypeface(appController.getTypefaceOsLight());
        username_ET.setTypeface(appController.getTypefaceOsLight());
        password_ET.setTypeface(appController.getTypefaceOsLight());
    }

    public void initThings() {
        appController = (AppController) getApplicationContext();

    }

    private void initViews() {
        setTypeface();
        super.initViews(getResources().getDrawable(R.drawable.logo_new), "Opportunity\nChhattisgarh 2015", getResources().getDrawable(R.drawable.nasscom_last), null, null);
    }

    public void onLogin(View v) {
        startActivity(new Intent(this, DashBoardActivity.class));
    }
}
