plugins {
	kotlin("multiplatform")
}

kotlin {
	jvm()
	js {
		browser()
	}

	sourceSets {
		val commonMain by getting {
			dependencies {
				implementation(kotlin("stdlib-common"))
			}
		}
		val commonTest by getting {
			dependencies {
				implementation(kotlin("test-common"))
				implementation(kotlin("test-annotations-common"))
			}
		}
	}

	// Default source set for JVM-specific sources and dependencies:
	jvm().compilations["main"].defaultSourceSet {
		dependencies {
			implementation(kotlin("stdlib-jdk8"))
		}
	}
	// JVM-specific tests and their dependencies:
	jvm().compilations["test"].defaultSourceSet {
		dependencies {
			implementation(kotlin("test-junit"))
		}
	}

	js().compilations["main"].defaultSourceSet  {
		dependencies {
			implementation(kotlin("stdlib-js"))
		}
	}
	js().compilations["test"].defaultSourceSet {
		dependencies {
//			implementation(kotlin("test-js"))
		}
	}
}