package tester

import classes.OS
import classes.SiteVisit


fun main(args: Array<String>) {
    val log = listOf(
            SiteVisit("/", 34.0, OS.WINDOWS),
            SiteVisit("/", 22.0, OS.MAC),
            SiteVisit("/login", 12.0, OS.WINDOWS),
            SiteVisit("/signup", 8.0, OS.IOS),
            SiteVisit("/", 16.3, OS.ANDROID)
    )

    val averageWindowsDuration = log
            .filter { it.os == OS.WINDOWS }
            .map(SiteVisit::duration)
            .average()

    val averageMobileDuration = log
            .filter { it.os in setOf(OS.IOS, OS.ANDROID) }
            .map(SiteVisit::duration)
            .average()

    println(averageWindowsDuration)
    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))
    println(averageMobileDuration)

    println(log.enhancedAverageDurationFor { it.os in setOf(OS.ANDROID, OS.IOS) })
    println(log.enhancedAverageDurationFor { it.os == OS.IOS && it.path == "/signup" })
}

fun List<SiteVisit>.averageDurationFor(os: OS) =
        filter { it.os == os }.map(SiteVisit::duration).average()

fun List<SiteVisit>.enhancedAverageDurationFor(predicate: (SiteVisit) -> Boolean) =
        filter(predicate).map(SiteVisit::duration).average()