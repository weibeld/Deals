package org.latefire.deals.customer.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by phongnguyen on 3/20/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
  public ViewPagerAdapter(FragmentManager fm) {
    super(fm);
  }

  @Override
  public CharSequence getPageTitle(int position) {
    switch (position % 4) {
      case 0:
        return "Near by";
      case 1:
        return "Hot deals";
      case 2:
        return "Categorize";
    }
    return "";
  }

  @Override public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return ListNearByFragment.newInstance();
      case 1:
        return ListHotDealFragment.newInstance();
      case 2:
        return ListCategorizeDealFragment.newInstance();
      default:
        throw new IllegalArgumentException("Invalid fragment position");
    }
  }

  @Override public int getCount() {
    return 3;
  }
}
