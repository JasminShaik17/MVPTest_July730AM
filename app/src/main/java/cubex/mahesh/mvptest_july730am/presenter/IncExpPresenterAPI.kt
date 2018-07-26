package cubex.mahesh.mvptest_july730am.presenter

import cubex.mahesh.mvptest_july730am.beans.IncExpBean

interface IncExpPresenterAPI {
    fun addInput(bean:IncExpBean)
    fun viewInput(type:String)
}