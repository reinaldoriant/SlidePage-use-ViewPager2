package com.example.slidepage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(Fa:FragmentActivity,listener:(CharSequence)->Unit):FragmentStateAdapter(Fa) {
    private val dataFragments= mutableListOf(
        FragmentSlide.newInstance("0",listener),
        FragmentSlide.newInstance("1",listener),
        FragmentSlide.newInstance("2",listener),
        FragmentSlide.newInstance("3",listener)
    )
    override fun getItemCount(): Int =4

    override fun createFragment(position: Int): Fragment =dataFragments[position]
}