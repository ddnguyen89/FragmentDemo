package nguyen.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
        BottomPhotoFragment bottomPhotoFragment = (BottomPhotoFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFrag);
        bottomPhotoFragment.setMemeText(top, bottom);
    }
}
