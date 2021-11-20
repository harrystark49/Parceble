package com.example.parceble

import android.os.Parcel
import android.os.Parcelable

data class userinfo(var uname:String,var pass:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    )
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(uname)
        parcel.writeString(pass)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<userinfo> {
        override fun createFromParcel(parcel: Parcel): userinfo {
            return userinfo(parcel)
        }

        override fun newArray(size: Int): Array<userinfo?> {
            return arrayOfNulls(size)
        }
    }

}
