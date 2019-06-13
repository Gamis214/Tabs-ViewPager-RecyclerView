package gamis214.com.tabsexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapterCoupons extends FragmentPagerAdapter {

    public PagerAdapterCoupons(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FCouponVigentes.newInstance();
            case 1:
                return FCouponVigentes.newInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "A";
            case 1:
                return "B";
            default:
                return null;
        }
    }
}
