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
public class BrownBearFragment extends Fragment {
    Button mButtonBrownBearDescription;
    Button mButtonBrownBearNext;


    public BrownBearFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_brown_bear, container, false);
        prepareButtons(view);
        return view;
    }

    private void prepareButtons(View view) {
        mButtonBrownBearDescription= (Button) view.findViewById(R.id.button_brown_bear_description);
        mButtonBrownBearNext=(Button) view.findViewById(R.id.button_brown_bear_next);
        mButtonBrownBearDescription.setOnClickListener((View.OnClickListener)getActivity());
        mButtonBrownBearNext.setOnClickListener((View.OnClickListener)getActivity());

    }


}
