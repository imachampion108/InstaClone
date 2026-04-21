package com.example.libimgur.models

data class GalleryResponse(
    val `data`: List<Data> = listOf(),
    val status: Int = 0,
    val success: Boolean = false
) {
    data class Data(
        val account_id: Int = 0,
        val account_url: String = "",
        val ad_config: AdConfig = AdConfig(),
        val ad_type: Int = 0,
        val ad_url: String = "",
        val comment_count: Int = 0,
        val cover: String = "",
        val cover_height: Int = 0,
        val cover_width: Int = 0,
        val datetime: Int = 0,
        val description: Any? = null,
        val downs: Int = 0,
        val favorite: Boolean = false,
        val favorite_count: Int = 0,
        val id: String = "",
        val images: List<Image> = listOf(),
        val images_count: Int = 0,
        val in_gallery: Boolean = false,
        val in_most_viral: Boolean = false,
        val include_album_ads: Boolean = false,
        val is_ad: Boolean = false,
        val is_album: Boolean = false,
        val layout: String = "",
        val link: String = "",
        val nsfw: Boolean = false,
        val points: Int = 0,
        val privacy: String = "",
        val score: Int = 0,
        val section: String = "",
        val tags: List<Tag> = listOf(),
        val title: String = "",
        val topic: Any? = null,
        val topic_id: Any? = null,
        val ups: Int = 0,
        val views: Int = 0,
        val vote: Any? = null
    ) {
        data class AdConfig(
            val highRiskFlags: List<Any?> = listOf(),
            val high_risk_flags: List<Any?> = listOf(),
            val nsfw_score: Double = 0.0,
            val safeFlags: List<String> = listOf(),
            val safe_flags: List<String> = listOf(),
            val showAdLevel: Int = 0,
            val show_ad_level: Int = 0,
            val show_ads: Boolean = false,
            val showsAds: Boolean = false,
            val unsafeFlags: List<String> = listOf(),
            val unsafe_flags: List<String> = listOf(),
            val wallUnsafeFlags: List<String> = listOf(),
            val wall_unsafe_flags: List<String> = listOf()
        )

        data class Image(
            val account_id: Any? = null,
            val account_url: Any? = null,
            val ad_type: Int = 0,
            val ad_url: String = "",
            val animated: Boolean = false,
            val bandwidth: Long = 0,
            val comment_count: Any? = null,
            val datetime: Int = 0,
            val description: String? = null,
            val downs: Any? = null,
            val edited: String = "",
            val favorite: Boolean = false,
            val favorite_count: Any? = null,
            val gifv: String? = null,
            val has_sound: Boolean = false,
            val height: Int = 0,
            val hls: String? = null,
            val id: String = "",
            val in_gallery: Boolean = false,
            val in_most_viral: Boolean = false,
            val is_ad: Boolean = false,
            val link: String = "",
            val mp4: String? = null,
            val mp4_size: Int? = null,
            val nsfw: Any? = null,
            val points: Any? = null,
            val processing: Processing? = null,
            val score: Any? = null,
            val section: Any? = null,
            val size: Int = 0,
            val tags: List<Any?> = listOf(),
            val title: Any? = null,
            val type: String = "",
            val ups: Any? = null,
            val views: Int = 0,
            val vote: Any? = null,
            val width: Int = 0
        ) {
            data class Processing(
                val status: String = ""
            )
        }


    }
}