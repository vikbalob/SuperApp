package com.vikbalob.superapp.main.screens.second

import com.vikbalob.superapp.base.presenter.BasePresenter

class TextViewPresenter : BasePresenter<TextViewContractInterface.View>(),
        TextViewContractInterface.Presenter {

    override fun onReadAllButtonClick() {
        view?.setMaxLines()
        view?.hideReadAllView()
    }
}