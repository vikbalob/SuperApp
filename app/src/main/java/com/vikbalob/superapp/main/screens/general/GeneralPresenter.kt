package com.vikbalob.superapp.main.screens.general

import com.vikbalob.superapp.base.presenter.BasePresenter

class GeneralPresenter : BasePresenter<GeneralContractInterface.View>(),
        GeneralContractInterface.Presenter {

    override fun onTextViewButtonClick() {
        view?.openTextViewScreen()
    }

    override fun onEditTextButtonClick() {
        view?.openEditTextScreen()
    }
}