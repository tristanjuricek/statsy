import react.dom.*
import kotlin.browser.document
import online.tristanmumbles.statsy.common.TestStat

fun main() {
    val stat = TestStat("aName", 666.0)
    console.log("this is a test", stat)

    render(document.getElementById("root")) {
        h1 { +"MyTest" }
        table {
            thead {
                tr {
                    th { +"Name" }
                    th { +"Amount" }
                }
            }
            tbody {
                tr {
                    th { + stat.name }
                    th { + "${stat.amount}" }
                }
            }
        }
    }
}
