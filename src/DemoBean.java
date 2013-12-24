
import java.util.Calendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TATARAO
 */
public class DemoBean implements Demo {
    String msg;
    
    public void setMsg(String msg)
    {
        this.msg=msg;
    }
    
    public String genarateWishMessage(String uname)
    {
        Calendar cal=Calendar.getInstance(); 
        int h=cal.get(Calendar.HOUR_OF_DAY);
        if(h<12)
            return "Good Morning"+"  "+uname+" "+msg;
        else if(h<16)
                        return "Good Afternoon"+"  "+uname+" "+msg;
        else if(h<20)
                        return "Good evening"+"  "+uname+" "+msg;
        else
                        return "Good Night"+"  "+uname+" "+msg;
    }
    
}
