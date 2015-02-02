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
public class TortoiseFragment extends Fragment {
    Button mButtonTortoiseDescription;


    public TortoiseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_tortoise, container, false);
        prepareButtons(view);
        return view;
    }

    private void prepareButtons(View view) {
        mButtonTortoiseDescription=(Button) view.findViewById(R.id.button_tortoise_description);
        mButtonTortoiseDescription.setOnClickListener((View.OnClickListener) getActivity());
    }


}
