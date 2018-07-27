package cubex.mahesh.mvptest_july730am.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import cubex.mahesh.mvptest_july730am.beans.IncExpBean
import cubex.mahesh.mvptest_july730am.presenter.IncExpPresenterAPI
import cubex.mahesh.mvptest_july730am.view.IncExpViewAPI
import cubex.mahesh.mvptest_july730am.view.MainActivity

class IncExpModel:IncExpPresenterAPI {
        var dBase:SQLiteDatabase? = null
        var api:IncExpViewAPI? = null
    constructor(api:IncExpViewAPI){
        this.api = api
      var mActivity = api as MainActivity
            dBase = mActivity.openOrCreateDatabase(
        "incexp", Context.MODE_PRIVATE,
                    null)
        dBase!!.execSQL("create table if not exists incexp(_id integer primary key autoincrement,date_ varchar(20),money number,desc_ varchar(500),type varchar(50))")
    }

    override fun addInput(bean: IncExpBean) {

            var cv = ContentValues( )
            cv.put("date_",bean.date);
            cv.put("money",bean.money)
            cv.put("desc_",bean.desc)
            cv.put("type",bean.type)

 var status =    dBase!!.insert("incexp",
         null,cv)
   if(status==-1.toLong()){
            api!!.addResponse("Insertion is Fail")
   }else{
       api!!.addResponse("Insertion is Success")
   }
    }

    override fun viewInput(type: String) {
      var c =   dBase!!.query("incexp",null,
              "type=?",
              arrayOf(type),null,null,null)
        api!!.viewResponse(c)
    }

}