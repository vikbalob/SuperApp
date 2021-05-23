package com.vikbalob.superapp.main.screens.second

import com.vikbalob.superapp.base.presenter.BasePresenterInterface
import com.vikbalob.superapp.base.view.BaseViewInterface

interface TextViewContractInterface {

    interface View : BaseViewInterface {
        fun hideReadAllView()
        fun setMaxLines()
    }

    interface Presenter : BasePresenterInterface<View> {
        fun onReadAllButtonClick()
    }
}