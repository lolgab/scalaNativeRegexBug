import scala.util.matching.Regex
import scala.util.matching.Regex.Match

object Main {
  def replaceAll(s: String, exp: String, f: String => String) = {
    new Regex(exp).replaceAllIn(s, (m: Match) => f(m.group(0).replace("\\", "\\\\")))
  }

  def main(args: Array[String]): Unit = {
    val res = replaceAll("<li><p>hello\ndear\nworld</p></li>", "<p>((.|\n)*)</p>", (s: String) => s.replace("\n", "<br/>"))
    println(res)
  }
}
