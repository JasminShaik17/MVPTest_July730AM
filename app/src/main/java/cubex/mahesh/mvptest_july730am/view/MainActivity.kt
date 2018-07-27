package cubex.mahesh.mvptest_july730am.view

import android.database.Cursor
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleCursorAdapter
import android.widget.Toast
import cubex.mahesh.mvptest_july730am.R
import cubex.mahesh.mvptest_july730am.beans.IncExpBean
import cubex.mahesh.mvptest_july730am.model.IncExpModel
import cubex.mahesh.mvptest_july730am.presenter.IncExpPresenterAPI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),IncExpViewAPI {
    override fun addResponse(msg: String) {
        Toast.makeText(this,msg,
                Toast.LENGTH_LONG).show()
    }

    override fun viewResponse(c: Cursor) {

        var myadapter = SimpleCursorAdapter(this,
 R.layout.indiview,c,
                arrayOf("date_","money","desc_","type"),
 intArrayOf(R.id.date,R.id.money,R.id.desc,R.id.type),
                0)
    lview.adapter = myadapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener({
            var bean = IncExpBean(et1.text.toString(),
                    et2.text.toString().toInt(),et3.text.toString(),
                    sp1.selectedItem.toString())

            var api:IncExpPresenterAPI =
                    IncExpModel(this@MainActivity )

            api.addInput(bean)
        })
        view.setOnClickListener({
            var api:IncExpPresenterAPI =
                    IncExpModel(this@MainActivity )
            api.viewInput(sp1.selectedItem.toString())
        })
    }
}
