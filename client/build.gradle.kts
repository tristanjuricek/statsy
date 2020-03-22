plugins {
	id("org.jetbrains.kotlin.js")
}

dependencies {
	implementation(kotlin("stdlib-js"))
	implementation(project(":common"))

	val kotlinReactVersion = "16.13.0-pre.93-kotlin-1.3.70"
	implementation("org.jetbrains:kotlin-react:$kotlinReactVersion")
	implementation("org.jetbrains:kotlin-react-dom:$kotlinReactVersion")
	implementation(npm("react", "16.13.0"))
	implementation(npm("react-dom", "16.13.0"))

	implementation("org.jetbrains:kotlin-styled:1.0.0-pre.94-kotlin-1.3.70")
	implementation(npm("styled-components"))
	implementation(npm("inline-style-prefixer"))

	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-common:1.3.3")

}

kotlin.target.browser {
}