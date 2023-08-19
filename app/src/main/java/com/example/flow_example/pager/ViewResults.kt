package com.example.flow_example.pager

import ai.metaverselabs.grammargpt.ui.onboarding.player.AppPlayer
import ai.metaverselabs.grammargpt.ui.onboarding.player.VideoData

internal sealed class ViewResult

internal object NoOpResult : ViewResult()

internal data class LoadVideoDataResult(
    val videoData: List<VideoData>,
    val currentMediaItemIndex: Int,
) : ViewResult()

internal data class CreatePlayerResult(val appPlayer: AppPlayer) : ViewResult()

internal object TearDownPlayerResult : ViewResult()

internal data class OnNewPageSettledResult(val page: Int) : ViewResult()

internal object OnPlayerRenderingResult : ViewResult()

internal data class AttachPlayerToViewResult(val doAttach: Boolean) : ViewResult()

internal data class PlayerErrorResult(val throwable: Throwable) : ViewResult()