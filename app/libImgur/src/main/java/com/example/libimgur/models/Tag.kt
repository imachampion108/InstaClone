package com.example.libimgur.models

class Tag {
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