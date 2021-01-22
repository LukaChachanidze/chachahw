package com.example.newapp



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recycler)

        val urlList = ArrayList<Images>()


        urlList.add(Images("https://bstatic.com/xdata/images/xphoto/1182x887/82877075.jpg?k=db9e00135b7b8f038aad88a7676235667ca249a5eed997a499677812fa332833&o=?size=S"))
        urlList.add(Images("https://scar-europe.org/images/FOREST/forest.jpg"))
        urlList.add(Images("https://www.theleaflet.in/wp-content/uploads/2020/06/Forest-1.jpg"))
        urlList.add(Images("https://lh3.googleusercontent.com/proxy/LQ0-_cQSyGLT4AM0PG0shy4CrGSAur_vD6_K-_6ynx1LsxssdqZnmjG2hhLpAJze8T4qole9B8gya-Pl7wXgJPy4R60fc5BIdh-qGy5ev9rgVdc5JJAE7UNh2vZi7TRZT4FNdG-6KK2_7WAOLHiiTr5ZWEuKOmQl8cnbvT9JUTo"))
        urlList.add(Images("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvA_KOxBbM_lTYD2eZshZE8TgUQiB9c7PZiA&usqp=CAU"))




        val adapter = imageAdapter(urlList, this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter

    }
}