package kr.co.bullets.part3chapter6.model

data class FullAd(
//    @SerializedName("title")
    val title: String,
//    @SerializedName("imageUrl")
    val imageUrl: String,
//    @SerializedName("button")
    val button: String? = null,

    ) : ListItem {
    override val viewType: ViewType
        get() = ViewType.FULL_AD
}
