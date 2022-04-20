package com.example.newicarrosexamplepf.models.buy


data class Deals(
    var name: String,
    var listPathImage: List<String>,
    var price: Float
)

fun getDeals(): List<Deals>{
    val list = mutableListOf<Deals>()
    list.add(Deals("Eclipse Cross", mutableListOf(
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/246873449_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/246873450_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/246873451_1.png"), 193174.0f))
    list.add(Deals("L200 Triton", mutableListOf(
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/245872577_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/245872579_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/245872580_1.png"), 264456.0f))
    list.add(Deals("C4 Cactus", mutableListOf(
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/226210258_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/226210256_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/226210257_1.png"), 99990.0f))
    list.add(Deals("Peugeot 208", mutableListOf(
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/234158442_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/234158443_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/234158444_1.png"), 74990.0f))
    list.add(Deals("L200 Triton", mutableListOf(
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/245872577_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/245872579_1.png",
        "https://img0.icarros.com/dbimg/imgadicionalanuncio/2/245872580_1.png"), 264456.0f))
    return list
}

data class Make(
    var name: String,
    var pathImage: String
)

fun getMakes(): List<Make>{
    val list = mutableListOf<Make>()
    list.add(Make("Chevrolet","https://img0.icarros.com/dbimg/imgmarca/1/5_18.png"))
    list.add(Make("Fiat","https://img0.icarros.com/dbimg/imgmarca/1/14_60.png"))
    list.add(Make("Volkswagen","https://img0.icarros.com/dbimg/imgmarca/1/36_10.png"))
    list.add(Make("Ford","https://img0.icarros.com/dbimg/imgmarca/1/15_8.png"))
    list.add(Make("Hyundai","https://img0.icarros.com/dbimg/imgmarca/1/17_9.png"))
    list.add(Make("Honda","https://img0.icarros.com/dbimg/imgmarca/1/16_8.png"))
    list.add(Make("Honda","https://img0.icarros.com/dbimg/imgmarca/1/16_8.png"))
    list.add(Make("Renault","https://img0.icarros.com/dbimg/imgmarca/1/31_9.png"))
    list.add(Make("Toyota","https://img0.icarros.com/dbimg/imgmarca/1/35_9.png"))
    list.add(Make("Nissan","https://img0.icarros.com/dbimg/imgmarca/1/28_11.png"))
    return list
}