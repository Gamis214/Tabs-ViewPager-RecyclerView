package gamis214.com.tabsexample;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.pager);
        TabLayout tabLayout = findViewById(R.id.tablayout);
        NestedScrollView scrollView = findViewById(R.id.scrollView);
        viewPager.setAdapter(new PagerAdapterCoupons(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }
}
