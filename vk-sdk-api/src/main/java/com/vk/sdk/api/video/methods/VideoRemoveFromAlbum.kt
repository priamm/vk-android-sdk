/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2019 vk.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
*/
// *********************************************************************
// THIS FILE IS AUTO GENERATED!
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING.
// *********************************************************************
package com.vk.sdk.api.video.methods

import com.vk.sdk.api.ApiRequestBase
import com.vk.sdk.api.GsonHolder
import com.vk.sdk.api.base.dto.BaseOkResponseDto
import com.vk.sdk.api.base.responses.BaseOkResponse
import kotlin.Int
import kotlin.collections.List
import org.json.JSONObject

/**
 * @param ownerId  
 * @param videoId  minimum 0
 * @param targetId  
 * @param albumId  
 * @param albumIds  
 */
class VideoRemoveFromAlbum(
    private val ownerId: Int,
    private val videoId: Int,
    private val targetId: Int? = null,
    private val albumId: Int? = null,
    private val albumIds: List<Int>? = null
) : ApiRequestBase<BaseOkResponseDto>(methodName = "video.removeFromAlbum") {
    init {
        addParam("owner_id", ownerId)
        addParam("video_id", videoId)
        targetId?.let { value ->
            addParam("target_id", value)
        }
        albumId?.let { value ->
            addParam("album_id", value)
        }
        albumIds?.let { value ->
            addParam("album_ids", value)
        }
    }

    override fun parse(r: JSONObject): BaseOkResponseDto = GsonHolder.gson.fromJson(r.toString(),
            BaseOkResponse::class.java).response
}
