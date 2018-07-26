package cubex.mahesh.mvptest_july730am.view

import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import cubex.mahesh.mvptest_july730am.R

class MainActivity : AppCompatActivity(),IncExpViewAPI {
    override fun addResponse(msg: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun viewResponse(c: Cursor) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
