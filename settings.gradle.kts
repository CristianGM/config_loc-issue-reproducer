plugins {
    id("com.gradle.enterprise") version "3.6.1"
}

rootProject.name = "config_loc-issue-reproducer"

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
