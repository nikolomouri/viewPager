package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.ViewPagerAdapterFragments
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager2: ViewPager2
    private lateinit var tabBar : TabLayout
    private lateinit var viewPagerAdapter :ViewPagerAdapterFragments
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    private fun init(){
        viewPager2=findViewById(R.id.viewPagerFrag)
        tabBar = findViewById(R.id.tabBar)
        viewPagerAdapter = ViewPagerAdapterFragments(this)
        viewPager2.adapter = viewPagerAdapter
        TabLayoutMediator(tabBar , viewPager2 ){tab , position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}