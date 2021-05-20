package com.vikbalob.superapp.main.screens.general

import android.os.Bundle
import android.view.View
import com.vikbalob.superapp.R
import com.vikbalob.superapp.base.view.BaseFragment
import com.vikbalob.superapp.databinding.GeneralFragmentBinding
import com.vikbalob.superapp.main.MainActivity

class GeneralFragment : BaseFragment(R.layout.general_fragment), GeneralContractInterface.View {

    companion object {
        const val TAG = "GeneralFragmentTag"
    }

    private var generalPresenter = GeneralPresenter()

    private var generalFragmentBinding: GeneralFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        generalFragmentBinding = GeneralFragmentBinding.bind(view)
        generalPresenter.attach(this)
        generalFragmentBinding?.textViewButton?.setOnClickListener {
            generalPresenter.onTextViewButtonClick()
        }
    }

    override fun openTextViewScreen() {
        (activity as? MainActivity)?.openTextViewScreen()
    }
}
