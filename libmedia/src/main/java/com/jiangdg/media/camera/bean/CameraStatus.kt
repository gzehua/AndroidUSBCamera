package com.jiangdg.media.camera.bean

import androidx.annotation.Keep

/** Camera status
 *
 * @author Created by jiangdg on 2022/4/5
 */
@Keep
data class CameraStatus(val code: Int, val message: String? = null) {
    companion object {
        const val START = 1
        const val STOP = 2
        const val ERROR = -1
    }
}
