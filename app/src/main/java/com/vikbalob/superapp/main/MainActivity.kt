package com.vikbalob.superapp.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.vikbalob.superapp.main.screens.general.GeneralFragment
import com.vikbalob.superapp.R
import com.vikbalob.superapp.databinding.ActivityMainBinding
import com.vikbalob.superapp.main.screens.second.TextViewFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportFragmentManager.backStackEntryCount == 0) {
            openGeneralFragment()
        }
    }

    private fun openGeneralFragment() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<GeneralFragment>(R.id.fragment_container_view)
            addToBackStack(GeneralFragment.TAG)
        }
    }

    fun openTextViewScreen() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace<TextViewFragment>(R.id.fragment_container_view, TextViewFragment.TAG)
            addToBackStack(TextViewFragment.TAG)
        }
    }
}