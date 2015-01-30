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
public class GeckoFragment extends Fragment {
    Button mButtonGeckoInfo;
    Button mButtonGeckoNext;


    public GeckoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_gecko, container, false);
        prepareButtons(view);
        return view;
    }

    private void prepareButtons(View view) {
        mButtonGeckoInfo=(Button) view.findViewById(R.id.button_gecko_description);
        mButtonGeckoNext=(Button) view.findViewById(R.id.button_gecko_next);
        mButtonGeckoInfo.setOnClickListener((View.OnClickListener)getActivity());
        mButtonGeckoNext.setOnClickListener((View.OnClickListener)getActivity());
    }


}
