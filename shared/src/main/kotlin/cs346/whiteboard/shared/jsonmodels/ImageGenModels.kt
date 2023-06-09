/*
 * Copyright (c) 2023 Avesta Barzegar, York Wei, Mikail Rahman, Edward Wang
 */

package cs346.whiteboard.shared.jsonmodels

import kotlinx.serialization.Serializable

@Serializable
data class ImageGenerationRequest(val prompt: String)

@Serializable
data class ImageGenerationResponse(val prompt: String, val imageUrl: String)