package com.example.flow_example.pager


internal data class ViewState(
    val appPlayer: AppPlayer? = null,
    val attachPlayer: Boolean = false,
    val page: Int = 0,
    val showPlayer: Boolean = false,
    val videoData: List<VideoData>? = null,
)