import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm")
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
	implementation(project(":common"))

	// TODO: setup a spring boot project
}

tasks {
	withType<KotlinCompile> {
		kotlinOptions {
			jvmTarget = "1.8"
			freeCompilerArgs = listOf("-Xjsr305=strict")
		}
	}
	processResources {
		dependsOn(":client:browserWebpack")
		from(project(":client").projectDir.resolve("src/main/resources")) {
			into("static")
		}
		from(project(":client").buildDir.resolve("distributions/client.js"))  {
			into("static")
		}
	}
}
