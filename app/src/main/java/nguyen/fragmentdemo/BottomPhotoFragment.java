package nguyen.fragmentdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BottomPhotoFragment extends Fragment {

    //define widget variables
    private static TextView mTopTV;
    private static TextView mBottomTV;

    public BottomPhotoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom_photo, container, false);

        //get reference to the widget
        mTopTV = (TextView) view.findViewById(R.id.topTV);
        mBottomTV = (TextView) view.findViewById(R.id.bottomTV);

        return view;
    }

    public void setMemeText(String top, String bottom) {
        mTopTV.setText(top);
        mBottomTV.setText(bottom);
    }
}
