import io.github.polentino.redacted.*

case class User(id: Int, name: String, @redacted password: String)

@main def hello(): Unit =
  val u = User(42, "windymelt", "foobar2000")
  println(u)
  println(u.id)
  println(u.name)
  println(u.password)
