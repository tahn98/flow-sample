package com.example.flow_example.pager

import androidx.annotation.DrawableRes

internal sealed class ViewEffect

internal sealed class PageEffect : ViewEffect()

internal data class AnimationEffect(@DrawableRes val drawable: Int) : PageEffect()

internal object ResetAnimationsEffect : PageEffect()

internal data class PlayerErrorEffect(val throwable: Throwable) : ViewEffect()