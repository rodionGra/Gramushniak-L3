package com.thirdlsnacdhomework

/**
 *  Rodion Gramushniak
 *
 * 2. Sort map <Int, String> in ascending key value.
 */

fun main() {
    //population is the key, variable is the city
    val mapOfCity: Map<Int, String> = mapOf(
            15_400_000 to "Karachi, Pakistan",
            14_967_000 to "Buenos Aires, Argentina",
            28_514_000 to "Delhi, India",
            25_582_000 to "Shanghai, China",
            14_838_000 to "Chongqing, China",
            21_581_000 to "Ciudad de Mexico (Mexico City), Mexico",
            19_281_000 to "Kinki M.M.A. (Osaka), Japan",
            20_076_000 to "Al-Quahirah (Cairo), Egypt",
            19_980_000 to "Mumbai (Bombay), India",
            14_751_000 to "Istanbul, Turkey",
            19_618_000 to "Beijing, China",
            21_650_000 to "São Paulo, Brazil",
            19_578_000 to "Dhaka, Bangladesh",
            37_468_000 to "Tokyo, Japan",
            18_819_000 to "New York, New York–Newark, New Jersey, United States"
    )

    val sortedCity = mapOfCity.toSortedMap()
    for (entry in sortedCity) {
        print("People: " + entry.key)
        println(" City: " + entry.value)
    }
}