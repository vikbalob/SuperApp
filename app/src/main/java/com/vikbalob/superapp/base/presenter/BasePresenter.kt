package com.vikbalob.superapp.base.presenter

import com.vikbalob.superapp.base.view.BaseViewInterface

open class BasePresenter<V: BaseViewInterface> : BasePresenterInterface<V> {

    var view: V? = null

    override val isAttached: Boolean = view != null

    override fun attach(view :V) {
        this.view = view
    }

    override fun detach() {
        view = null
    }
}