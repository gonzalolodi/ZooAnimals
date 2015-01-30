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
public class StartFragment extends Fragment {
    Button mButtonStart;


    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_start, container, false);
        prepareButton(view);
        return view;
    }

    private void prepareButton(View view) {
        mButtonStart= (Button) view.findViewById(R.id.button_start);
        mButtonStart.setOnClickListener((View.OnClickListener)getActivity());
    }
}
