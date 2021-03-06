package com.qure.eattogether2.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Comments(

    val comments_uid: String="",
    val comments_usernm: String="",
    val comments_userimage: String="",
    val comments_content: String="",
    val comments_timestamp: String="",
    val comments_replyTimeStamp: String="",
    val comments_likeCount: ArrayList<String> = arrayListOf(),
    val comments_postkey: String="",
    val comments_commentskey : String="",
    val comments_depth: Int=0
) : Parcelable
