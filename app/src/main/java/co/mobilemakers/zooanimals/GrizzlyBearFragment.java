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
public class GrizzlyBearFragment extends Fragment {
    Button mButtonGrizzlyInfo;
    Button mButtonGrizzlyNext;


    public GrizzlyBearFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_grizzly_bear, container, false);
        prepareButtons(view);
        return view;
    }

    private void prepareButtons(View view) {
        mButtonGrizzlyInfo=(Button) view.findViewById(R.id.button_grizzly_bear_description);
        mButtonGrizzlyNext=(Button) view.findViewById(R.id.button_grizzly_bear_next);
        mButtonGrizzlyInfo.setOnClickListener((View.OnClickListener)getActivity());
        mButtonGrizzlyNext.setOnClickListener((View.OnClickListener)getActivity());
    }


}
