
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TATARAO
 */
public class DemoClient {
    
    public static void main(String[] args) throws Exception {
        FileSystemResource res=new FileSystemResource("Democfg.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        
        Object obj= factory.getBean("db");
        
        Demo dobj=(Demo)obj;
        String result = dobj.genarateWishMessage("raja");
        System.out.println("Result is "+result);
    }
    
}
