package com.example.mid_exam_saraaltelbani;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new fragment_second();
            case 2:
                return new fragment_third();
            default:
                return new fragment_first();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}