import org.scalatra.LifeCycle
import javax.servlet.ServletContext

class Scalatra extends LifeCycle {
	override def init(context: ServletContext) {
		context mount (new HelloWorldApp, "/")
	}
}