/*
 * MIT License
 *
 * Copyright (c) 2020 ultranity
 * Copyright (c) 2019 Perol_Notsfsssf
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE
 */

package com.perol.asdpl.pixivez.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.perol.asdpl.pixivez.R
import com.perol.asdpl.pixivez.dialog.FirstInfoDialog
import com.perol.asdpl.pixivez.dialog.SupportDialog
import com.perol.asdpl.pixivez.fragments.AboutXFragment
import com.perol.asdpl.pixivez.fragments.SettingFragment
import com.perol.asdpl.pixivez.fragments.ThanksFragment
import com.perol.asdpl.pixivez.networks.SharedPreferencesServices
import kotlinx.android.synthetic.main.activity_setting.*
import kotlinx.android.synthetic.main.content_setting.*
import java.util.*

class SettingActivity : RinkActivity() {
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                this.finish()
                return true
            }
            R.id.menu_question -> {
                FirstInfoDialog().show(supportFragmentManager, "Info")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_settings, menu)
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        setSupportActionBar(toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        tablayout_setting.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                viewpage_setting.currentItem = tab?.position ?: 0
            }
        })
        viewpage_setting.adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount() = 3

            override fun createFragment(position: Int): Fragment {
                return when (position) {
                    0 -> {
                        SettingFragment()
                    }
                    1 -> {
                        ThanksFragment()
                    }
                    else -> {
                        AboutXFragment()
                    }
                }
            }
        }
        viewpage_setting.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                tablayout_setting.getTabAt(position)?.select()
            }
        })
    }

    override fun onBackPressed() {
        val calendar = Calendar.getInstance()
        if ((calendar.get(Calendar.DAY_OF_YEAR)*100+calendar.get(Calendar.HOUR_OF_DAY)
                -SharedPreferencesServices.getInstance()
                    .getInt("lastsupport",calendar.get(Calendar.DAY_OF_YEAR)*100+calendar.get(Calendar.HOUR_OF_DAY) - 100)
             )>= 6*24) {
            SupportDialog().show(this.supportFragmentManager, "supportdialog")
        }
        else {
            SharedPreferencesServices.getInstance()
                .setInt("lastsupport",
                    SharedPreferencesServices.getInstance().getInt("lastsupport") - 12)
            super.onBackPressed()
        }
    }
}
