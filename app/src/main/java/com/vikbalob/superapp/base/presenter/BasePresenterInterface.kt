package com.vikbalob.superapp.base.presenter

import com.vikbalob.superapp.base.view.BaseViewInterface

interface BasePresenterInterface<V: BaseViewInterface> {

    val isAttached: Boolean

    fun attach(view: V)

    fun detach()

}