package cubex.mahesh.mvptest_july730am.view

import android.database.Cursor

interface IncExpViewAPI {
    fun addResponse(msg:String)
    fun viewResponse(c:Cursor)
}