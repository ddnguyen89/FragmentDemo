package nguyen.fragmentdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopSectionFragment extends Fragment {

    //define widget variables
    private static EditText mTopET;
    private static EditText mBottomET;

    TopSectionListener activityCommander;

    public interface TopSectionListener {
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            activityCommander = (TopSectionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }

    public TopSectionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview =  inflater.inflate(R.layout.fragment_top_section, container, false);

        //get reference to the widget
        mTopET = (EditText) rootview.findViewById(R.id.topET);
        mBottomET = (EditText) rootview.findViewById(R.id.bottomET);
        final Button mMemifyButton = (Button) rootview.findViewById(R.id.memifyButton);

        //set the bottom listener
        mMemifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(v);
            }
        });

        return rootview;
    }

    public void buttonClick(View v) {
        activityCommander.createMeme(mTopET.getText().toString(), mBottomET.getText().toString());
    }
}
