package android.bignerdranch.com.photogallery;

import android.bignerdranch.com.photogallery.PhotoGalleryFragment;
import android.bignerdranch.com.photogallery.SingleFragmentActivity;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return PhotoGalleryFragment.newIntance();
    }
}