package credible_CG.src.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import credible_CG.src.Adapter.SpeakerListAdapter;
import credible_CG.src.R;
import credible_CG.src.extra.AppController;

/**
 * Created by prabhanshu on 4/17/15.
 */
public class SpeakerFragment extends Fragment {

    AppController appController;
    SpeakerListAdapter adapter;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        appController = (AppController) activity.getApplicationContext();
        System.out.println(">>>>> in fragment speakers size:" + appController.getSelectedEvent().getSpeakers().size());
        adapter = (SpeakerListAdapter) new SpeakerListAdapter(activity.getApplicationContext(), R.layout.element_department_text_center, appController.getSelectedEvent().getSpeakers());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.speaker_fragment, container, false);
        TextView details = (TextView)view.findViewById(R.id.details);
        details.setTypeface(appController.getTypefaceOsLight());
        details.setText(appController.getSelectedEvent().getDetails());
        ListView speakersList = (ListView) view.findViewById(R.id.speakersLV);
        speakersList.setAdapter(adapter);

        return view;
    }
}
