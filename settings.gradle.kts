plugins {
    id("org.gradle.toolchains.foojay-resolver-convention").version("0.10.0")
}

rootProject.name = "FastCrystals"

include(
    "core",
    "core_new",
    "shared",
    "v1_16",
    "v1_17",
    "v1_18",
    "v1_19",
    "v1_19_3",
    "v1_19_4",
    "v1_20",
    "v1_20_2",
    "v1_20_4",
)

