import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.CvType;
import org.opencv.core.Scalar;
/**
*
*@autor Kevin Asmal
*/
public class Main {

static{System.loadlibrary(Core.NATIVE_LIBRARY_NAME);}

public static void main (String arg){
System.out.println("Welcon to OpenCV" + Core.VERSION);
Mat m = new Mat(5, 10, CvType.CV_8UC1, new Scalar(0));
System.out.println("OpenCV Mat: " + m);
Mat mr1 = m.row(1);
mr1.sectTo(new Scalar(1));
Mat mc5 = m.col(5);
mc5.setTo(new Scalar(5));
System.ouy.println("OpenCV Mat data:" + m.dum());
}
}