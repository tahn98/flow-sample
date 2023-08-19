package com.example.flow_example.pager

internal sealed class ViewEvent

internal object LoadVideoDataEvent : ViewEvent()

internal sealed class PlayerLifecycleEvent : ViewEvent() {
    object Start : PlayerLifecycleEvent()
    data class Stop(val isChangingConfigurations: Boolean) : PlayerLifecycleEvent()
}

internal data class OnPageSettledEvent(val page: Int) : ViewEvent()

internal object PauseVideoEvent : ViewEvent()