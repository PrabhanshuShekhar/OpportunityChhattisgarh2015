package oppotunitychhattisgarh2015.src.extra;

/**
 * Created by prabhanshu on 4/17/15.
 */

import android.content.Context;
import android.view.View;
import android.widget.TabHost.TabContentFactory;

public class DummyTabContent implements TabContentFactory {
    private Context mContext;

    public DummyTabContent(Context context) {
        mContext = context;
    }

    @Override
    public View createTabContent(String tag) {
        View v = new View(mContext);
        return v;
    }
}
