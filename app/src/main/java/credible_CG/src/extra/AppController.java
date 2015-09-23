package credible_CG.src.extra;

import android.app.Application;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;

import credible_CG.src.Model.Event;

/**
 * Created by prabhanshu on 4/15/15.
 */
public class AppController extends Application {
    Typeface typefaceAllBold;
    Typeface typefaceAllRegular;
    Typeface typefaceOsLight;
    Typeface typefaceOsRegular;

    Event selectedEvent;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private static AppController mInstance;

//    Gson gson;


    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        initThings();
    }


    private void initThings() {
        typefaceAllBold = Typeface.createFromAsset(getAssets(), "font/AlegreyaSC-Bold.ttf");
        typefaceAllRegular = Typeface.createFromAsset(getAssets(), "font/AlegreyaSC-Regular.ttf");
        typefaceOsLight = Typeface.createFromAsset(getAssets(), "font/Oswald-Light.ttf");
        typefaceOsRegular = Typeface.createFromAsset(getAssets(), "font/Oswald-Regular.ttf");

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();
    }


    public void setTypefaceAllBold(Typeface typefaceAllBold) {
        this.typefaceAllBold = typefaceAllBold;
    }

    public Typeface getTypefaceAllBold() {
        return typefaceAllBold;
    }

    public Typeface getTypefaceAllRegular() {
        return typefaceAllRegular;
    }

    public void setTypefaceAllRegular(Typeface typefaceAllRegular) {
        this.typefaceAllRegular = typefaceAllRegular;
    }

    public Typeface getTypefaceOsLight() {
        return typefaceOsLight;
    }

    public void setTypefaceOsLight(Typeface typefaceOsLight) {
        this.typefaceOsLight = typefaceOsLight;
    }

    public Typeface getTypefaceOsRegular() {
        return typefaceOsRegular;
    }

    public void setTypefaceOsRegular(Typeface typefaceOsRegular) {
        this.typefaceOsRegular = typefaceOsRegular;
    }


    public Event getSelectedEvent() {
        return selectedEvent;
    }

    public void setSelectedEvent(Event selectedEvent) {
        this.selectedEvent = selectedEvent;
    }
}
