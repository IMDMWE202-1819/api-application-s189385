package com.example.administrator.myapi
import android.os.Parcelable
import com.beust.klaxon.Converter
import com.beust.klaxon.JsonObject
import com.beust.klaxon.JsonValue
import kotlinx.android.parcel.Parcelize
import java.util.*


@Parcelize
data class Results(
    val list: List<Track>
) : Parcelable

@Parcelize
data class ArtistTracks(
    val data: List<Track>,
    val total: Int?,
    val next: String? = null,
    val prev: String? = null
) : Parcelable

@Parcelize
data class Track(

    val id: Int?,
    val readable: Boolean?,
    val title: String?,
    val title_short: String?,
    val title_version: String?,
    val unseen: Boolean?,
    val isrc: String?,
    val link: String?,
    val share: String?,
    val duration: Int?,
    val track_position: Int?,
    val disk_number: Int?,
    val rank: Int?,
    val release_date: String?,
    val explicit_lyrics: Boolean?,
    val preview: String?,
    val bpm: Float?,
    val gain: Float?,
    val available_countries: String?,
    val alternative: String?,
    val contributors: List<Contributor?>,
    val artist: TrackArtist,
    val album: album?,
    val type: String?
) : Parcelable

@Parcelize
data class TrackArtist(
    val id: String?,
    val name: String?,
    val tracklist: String?,
    val type: String?
) : Parcelable

@Parcelize
data class album(
    val id: String?,
    val title: String?,
    val cover: String,
    val cover_small: String,
    val cover_medium: String,
    val cover_big: String,
    val cover_xl: String,
    val tracklist: String?,
    val type: String


) : Parcelable


@Parcelize
data class Contributor(
    val id: Int?,
    val name: String?,
    val link: String?,
    val share: String?,
    val picture: String?,
    val picture_small:String?,
    val picture_medium: String?,
    val picture_big: String?,
    val picture_xl: String?,
    val radio: Boolean,
    val tracklist: String?,
    val type: String?,
    val role: String?
) : Parcelable

@Parcelize
data class Artist(

    val id: Int?,
    val name: String?,
    val title: String?,
    val link: String?,
    val share: String?,
    val picture: String,
    val picture_small: String,
    val picture_medium: String,
    val picture_big: String,
    val picture_xl: String,
    val nb_album: Int,
    val nb_fan: Int,
    val radio: Boolean,
    val tracklist: String

) : Parcelable

@Parcelize
data class ArtistSearch(
    val data: List<Artist>,
    val total: String?,
    val next: String? = null,
    val prev: String? = null
) : Parcelable

