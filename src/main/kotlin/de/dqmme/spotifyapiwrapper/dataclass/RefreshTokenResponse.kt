package de.dqmme.spotifyapiwrapper.dataclass

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RefreshTokenResponse(
    @SerialName("access_token") val accessToken: String,
    @SerialName("token_type") val tokenType: String,
    val scope: String,
    @SerialName("expires_in") val expiresIn: Int,
)
