package com.example.libimgur.models

data class GalleryTagsResponse(
    val `data`: Data = Data(),
    val status: Int = 0,
    val success: Boolean = false
) {
    data class Data(
        val featured: Any? = null,
        val galleries: List<Gallery> = listOf(),
        val tags: List<Tag> = listOf()
    ) {
        data class Gallery(
            val description: String = "",
            val id: Int = 0,
            val name: String = "",
            val topPost: TopPost = TopPost()
        ) {
            data class TopPost(
                val account_id: Int? = null,
                val account_url: String? = null,
                val ad_type: Int = 0,
                val ad_url: String = "",
                val animated: Boolean? = null,
                val bandwidth: Int? = null,
                val comment_count: Int = 0,
                val cover: String? = null,
                val cover_height: Int? = null,
                val cover_width: Int? = null,
                val datetime: Int = 0,
                val description: Any? = null,
                val downs: Int = 0,
                val edited: Int? = null,
                val favorite: Boolean? = null,
                val favorite_count: Int = 0,
                val has_sound: Boolean? = null,
                val height: Int? = null,
                val id: String = "",
                val images: List<Image>? = null,
                val images_count: Int? = null,
                val in_gallery: Boolean = false,
                val in_most_viral: Boolean = false,
                val include_album_ads: Boolean? = null,
                val is_ad: Boolean = false,
                val is_album: Boolean = false,
                val layout: String? = null,
                val link: String = "",
                val nsfw: Boolean = false,
                val points: Int = 0,
                val privacy: String? = null,
                val score: Int = 0,
                val section: String = "",
                val size: Int? = null,
                val tags: List<Tag> = listOf(),
                val title: String = "",
                val topic: Any? = null,
                val topic_id: Int? = null,
                val type: String? = null,
                val ups: Int = 0,
                val views: Int = 0,
                val vote: Any? = null,
                val width: Int? = null
            ) {
                data class Image(
                    val account_id: Any? = null,
                    val account_url: Any? = null,
                    val ad_type: Int = 0,
                    val ad_url: String = "",
                    val animated: Boolean = false,
                    val bandwidth: Long = 0,
                    val comment_count: Any? = null,
                    val datetime: Int = 0,
                    val description: String = "",
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

                data class Tag(
                    val accent: String = "",
                    val background_hash: String = "",
                    val background_is_animated: Boolean = false,
                    val description: String = "",
                    val description_annotations: DescriptionAnnotations? = null,
                    val display_name: String = "",
                    val followers: Int = 0,
                    val following: Boolean = false,
                    val is_promoted: Boolean = false,
                    val is_whitelisted: Boolean = false,
                    val logo_destination_url: Any? = null,
                    val logo_hash: Any? = null,
                    val name: String = "",
                    val thumbnail_hash: Any? = null,
                    val thumbnail_is_animated: Boolean = false,
                    val total_items: Int = 0
                ) {
                    class DescriptionAnnotations
                }
            }
        }

        data class Tag(
            val accent: String? = null,
            val background_hash: String = "",
            val background_is_animated: Boolean = false,
            val description: String = "",
            val display_name: String = "",
            val followers: Int = 0,
            val following: Boolean = false,
            val is_promoted: Boolean = false,
            val is_whitelisted: Boolean = false,
            val logo_destination_url: Any? = null,
            val logo_hash: Any? = null,
            val name: String = "",
            val thumbnail_hash: String? = null,
            val thumbnail_is_animated: Boolean = false,
            val total_items: Int = 0
        )
    }
}