package br.com.satoruchannel.fakezap

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    val meusFragments = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return meusFragments[position]
    }

    override fun getCount(): Int {
        return meusFragments.size
    }

    fun adicionar(fragment: Fragment) {
        meusFragments.add(fragment)
    }
}