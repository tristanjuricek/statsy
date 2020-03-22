rootProject.name = "statsy"

pluginManagement {
	val kotlinVersion = "1.3.70"

	repositories {
		mavenCentral()
		jcenter()
		gradlePluginPortal()
	}

	plugins {
		kotlin("jvm") version(kotlinVersion)
		kotlin("multiplatform") version(kotlinVersion)
		id("org.jetbrains.kotlin.js") version(kotlinVersion)
	}
}

include(
	"client",
	"common",
	"server"
)

