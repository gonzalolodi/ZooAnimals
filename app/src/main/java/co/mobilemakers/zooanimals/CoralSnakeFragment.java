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
public class CoralSnakeFragment extends Fragment {
    Button mButtonCoralSnakeNext;
    Button mButtonCoralSnakeInfo;


    public CoralSnakeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_coral_snake, container, false);
        prepareButtons(view);
        return view;
    }

    private void prepareButtons(View view) {
        mButtonCoralSnakeNext= (Button) view.findViewById(R.id.button_coral_snake_next);
        mButtonCoralSnakeInfo= (Button) view.findViewById(R.id.button_coral_snake_description);
        mButtonCoralSnakeInfo.setOnClickListener((View.OnClickListener)getActivity());
        mButtonCoralSnakeNext.setOnClickListener((View.OnClickListener)getActivity());
    }


}
