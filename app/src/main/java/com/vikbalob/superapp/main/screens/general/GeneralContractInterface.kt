package com.vikbalob.superapp.main.screens.general

import com.vikbalob.superapp.base.presenter.BasePresenterInterface
import com.vikbalob.superapp.base.view.BaseViewInterface

interface GeneralContractInterface {

    interface View : BaseViewInterface {

    }

    interface Presenter : BasePresenterInterface<View> {
        fun onTextViewButtonClick()
    }
}