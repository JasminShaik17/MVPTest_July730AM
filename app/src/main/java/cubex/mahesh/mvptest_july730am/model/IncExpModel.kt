package cubex.mahesh.mvptest_july730am.model

import cubex.mahesh.mvptest_july730am.beans.IncExpBean
import cubex.mahesh.mvptest_july730am.presenter.IncExpPresenterAPI
import cubex.mahesh.mvptest_july730am.view.IncExpViewAPI

class IncExpModel:IncExpPresenterAPI {

    constructor(api:IncExpViewAPI){
        
    }

    override fun addInput(bean: IncExpBean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun viewInput(type: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}