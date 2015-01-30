package co.mobilemakers.zooanimals;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class WombatFragment extends Fragment {
    Button mButtonWombatDescription;
    Button mButtonWombatNext;


    public WombatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_grizzly_bear, container, false);
        prepareButtons(view);
        return view;
    }

    private void prepareButtons(View view) {
        mButtonWombatDescription= (Button) view.findViewById(R.id.button_wombat_description);
        mButtonWombatNext=(Button) view.findViewById(R.id.button_wombat_next);
        mButtonWombatDescription.setOnClickListener((View.OnClickListener)getActivity());
        mButtonWombatNext.setOnClickListener((View.OnClickListener)getActivity());
    }


}
