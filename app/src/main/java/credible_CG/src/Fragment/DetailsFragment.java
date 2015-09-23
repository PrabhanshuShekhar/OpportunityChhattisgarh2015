package credible_CG.src.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 4/17/15.
 */
public class DetailsFragment extends Fragment {

    AppController appController;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            appController = (AppController) activity.getApplicationContext();
        } catch (ClassCastException e) {
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.details, container, false);
        TextView details = (TextView) view.findViewById(R.id.details);
        details.setText(appController.getSelectedEvent().getDetails().toString());
        return view;
    }
}
