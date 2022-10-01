package com.gvvghost.firstkotlin.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import com.gvvghost.firstkotlin.api.ApiFactory.BASE_IMAGE_URL
import com.gvvghost.firstkotlin.utils.convertTimeStampToTime

@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @SerializedName("TYPE") @Expose val type: String?,
    @SerializedName("MARKET") @Expose val market: String?,
    @PrimaryKey @SerializedName("FROMSYMBOL") @Expose val fromsymbol: String,
    @SerializedName("TOSYMBOL") @Expose val tosymbol: String?,
    @SerializedName("FLAGS") @Expose val flags: String?,
    @SerializedName("PRICE") @Expose val price: String?,
    @SerializedName("LASTUPDATE") @Expose val lastupdate: Long?,
    @SerializedName("LASTVOLUME") @Expose val lastvolume: String?,
    @SerializedName("LASTVOLUMETO") @Expose val lastvolumeto: String?,
    @SerializedName("VOLUMEDAY") @Expose val volumeday: String?,
    @SerializedName("VOLUMEDAYTO") @Expose val volumedayto: String?,
    @SerializedName("VOLUME24HOUR") @Expose val volume24Hour: String?,
    @SerializedName("VOLUME24HOURTO") @Expose val volume24HourTo: String?,
    @SerializedName("OPENDAY") @Expose val openday: String?,
    @SerializedName("HIGHDAY") @Expose val highday: String?,
    @SerializedName("LOWDAY") @Expose val lowday: String?,
    @SerializedName("IMAGEURL") @Expose val imageUrl: String?,
){
    fun getFormattedTime(): String = convertTimeStampToTime(lastupdate)

    fun getFullImageUrl(): String = BASE_IMAGE_URL+imageUrl
}