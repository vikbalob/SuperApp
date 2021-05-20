package com.vikbalob.superapp.main.screens.general

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.vikbalob.superapp.R
import com.vikbalob.superapp.base.view.BaseFragment

class GeneralFragment : BaseFragment(R.layout.general_fragment) {

    companion object {
        const val TAG = "GeneralFragmentTag"
    }

    private var generalPresenter = GeneralPresenter()

    private var generalFragmentBinding: GeneralFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = generalFragmentBinding.bind(view)
    }
}
