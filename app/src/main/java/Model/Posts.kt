package Model

import com.google.gson.annotations.SerializedName

data class Posts (
    @SerializedName("sender")
    var Sender : String,

    @SerializedName("post")
    var Post : String,

    @SerializedName( "date")
    var Date : String,

    @SerializedName( "likes")
    var Likes : String,

    @SerializedName( "comments")
    var Comment : String,

    @SerializedName("first_comment")
    var Firstcomment : String,

    @SerializedName( "first_comment_sender")
    var Firstcommentsender : String
)