package classes


data class SiteVisit (
        val path: String,
        val duration: Double,
        val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }