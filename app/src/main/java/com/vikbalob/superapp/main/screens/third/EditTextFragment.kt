package com.vikbalob.superapp.main.screens.third

import android.os.Bundle
import android.view.View
import com.vikbalob.superapp.R
import com.vikbalob.superapp.base.view.BaseFragment
import com.vikbalob.superapp.databinding.EditTextFragmentBinding

class EditTextFragment : BaseFragment(R.layout.edit_text_fragment), EditTextContractInterface.View {

    companion object {
        const val TAG = "EditTextFragmentTag"
    }

    private var editTextPresenter = EditTextPresenter()

    private var editTextFragmentBinding: EditTextFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editTextFragmentBinding = EditTextFragmentBinding.bind(view)
        editTextPresenter.attach(this)

        editTextFragmentBinding?.editTextToolbar?.setNavigationOnClickListener {
           activity?.onBackPressed()
        }

    }
}