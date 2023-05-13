plugins {
    id("com.gradle.enterprise") version("3.13.2")
    id("com.gradle.common-custom-user-data-gradle-plugin") version("1.10")
}

gradleEnterprise {
    server = "https://ge.solutions-team.gradle.com"
    buildScan {
        publishAlways()
        capture {
            isTaskInputFiles = true
        }
        isUploadInBackground = System.getenv("CI") == null
    }
}

rootProject.name = "tests-redownload-deps"
