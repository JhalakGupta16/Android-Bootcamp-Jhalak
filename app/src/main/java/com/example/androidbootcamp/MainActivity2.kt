package com.example.androidbootcamp

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.FragmentActivity

/**
 * Loads [MainFragment].
 **/
class MainActivity2() : FragmentActivity(), Parcelable {

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


                .replace(R.id.main_browse_fragment, MainFragment())
                .commitNow()


}

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity2> {
        override fun createFromParcel(parcel: Parcel): MainActivity2 {
            return MainActivity2(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity2?> {
            return arrayOfNulls(size)
        }
    }