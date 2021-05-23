package com.vikbalob.superapp.main.screens.second

import android.os.Bundle
import android.view.View
import com.vikbalob.superapp.R
import com.vikbalob.superapp.base.view.BaseFragment
import com.vikbalob.superapp.databinding.TextViewFragmentBinding


class TextViewFragment : BaseFragment(R.layout.text_view_fragment),
        TextViewContractInterface.View {

    companion object {
        const val TAG = "TextViewFragmentTag"
    }

    private var textViewPresenter = TextViewPresenter()

    private var textViewFragmentBinding: TextViewFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textViewFragmentBinding = TextViewFragmentBinding.bind(view)
        textViewPresenter.attach(this)
        textViewFragmentBinding?.textViewReadAll?.setOnClickListener {
            textViewPresenter.onReadAllButtonClick()
        }
        textViewFragmentBinding?.txtViewToolbar?.setNavigationOnClickListener {
            activity?.onBackPressed()
        }
    }

    override fun hideReadAllView() {
        textViewFragmentBinding?.textViewReadAll?.visibility = View.GONE
    }

    override fun setMaxLines() {
        textViewFragmentBinding?.textView?.maxLines = Int.MAX_VALUE
    }
}