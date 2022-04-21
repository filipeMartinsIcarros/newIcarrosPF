package com.example.newicarrosexamplepf.models.buy

data class Store(
    var pathImage: String,
    var name: String,
    var locationCity: String,
    var locationAddress: String,
    var isFavorite: Boolean
)

fun getListStore(): List<Store>{
    val list = mutableListOf<Store>()
    list.add(Store("http://img1.icarros.com/dbimg/imganunciante/5/795086_1.png","Toyota T line","São Pualo - Sp","Avenida Vereador José Diniz 3500", true))
    list.add(Store("http://img1.icarros.com/dbimg/imganunciante/5/997921_3.png","Navesa Renault T-63","Goiânia - G0","Av. T-63, nº1707, Qd. 587, Lote 24", true))
    list.add(Store("https://img1.icarros.com/dbimg/imganunciante/5/131102_2.png","ROBMAR AUTOMÓVEIS","Rio de Janeiro - RJ","Estrada Intendente Magalhães, 1185", true))
    list.add(Store("https://img1.icarros.com/dbimg/imganunciante/5/50_3.png","AB SAN DIEGO / NISSAN - BARRA","Rio de Janeiro - RJ","Av.  das Américas  7250", true))
    list.add(Store("https://img1.icarros.com/dbimg/imganunciante/5/1143379_1.png","B&B Multimarcas","São Paulo - SP","Avenida Engenheiro Caetano Álvares, 5006", true))
    list.add(Store("https://img1.icarros.com/dbimg/imganunciante/5/723365_1.png","B&G Motos e Veículos","São Paulo - SP","Av. Eng. Caetano Alvares, 5639", true))
    list.add(Store("https://img1.icarros.com/dbimg/imganunciante/5/348633_1.png","B J AUTOMÓVEIS","Santo André - SP","R. Ibiapava, 157", false))
    list.add(Store("https://img1.icarros.com/dbimg/imganunciante/5/2499364_1.png","L C A VEICULOS","Viamão - RS","Avenida Senador Salgado Filho 2200", false))
    return list
}

data class Price(
    var title: String,
    var value: String
)

fun getSearchPrice(): List<Price>{
    val list = mutableListOf<Price>()
    list.add(Price("Até","20"))
    list.add(Price("Até","30"))
    list.add(Price("Até","40"))
    list.add(Price("Até","60"))
    list.add(Price("Acima de","80+"))
    return list
}

data class Models(
    var nameBrand: String,
    var nameModel: String,
    var pathImage: String
)

fun getModels(): List<Models>{
    val list = mutableListOf<Models>()
    list.add(Models("Chevrolet","Onix","http://img1.icarros.com/dbimg/imgmodelo/4/2428_8.png"))
    list.add(Models("Volkswagen","Gol","http://img1.icarros.com/dbimg/imgmodelo/4/480_14.png"))
    list.add(Models("Hyundai","HB20","http://img1.icarros.com/dbimg/imgmodelo/4/2398_12.png"))
    list.add(Models("Toyota","Corolla","http://img1.icarros.com/dbimg/imgmodelo/4/468_16.png"))
    list.add(Models("Ford","New Fiesta Hatch","https://img0.icarros.com/dbimg/imgmodelo/2/2381_6"))
    list.add(Models("Toyota","Etios Sedan","https://img0.icarros.com/dbimg/imgmodelo/2/2418_3.png"))
    list.add(Models("Hyundai","HB20S","https://img0.icarros.com/dbimg/imgmodelo/2/2448_7.png"))
    list.add(Models("Chevrolet","Prisma","http://img1.icarros.com/dbimg/imgmodelo/4/902_12"))
    return list
}

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
    list.add(Make("Renault","https://img0.icarros.com/dbimg/imgmarca/1/31_9.png"))
    list.add(Make("Toyota","https://img0.icarros.com/dbimg/imgmarca/1/35_9.png"))
    list.add(Make("Nissan","https://img0.icarros.com/dbimg/imgmarca/1/28_11.png"))
    return list
}