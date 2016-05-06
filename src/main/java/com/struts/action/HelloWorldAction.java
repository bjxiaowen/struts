package com.struts.action;

/*import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.InterceptorRef;  
import org.apache.struts2.convention.annotation.InterceptorRefs;  
*/
import com.opensymphony.xwork2.ActionSupport;
//@Namespace("/test")
public class HelloWorldAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -970104584425313152L;

	public final static String MESSAGE = "Struts2 is up and running ...";  
    
    private String message;  
    
    /** 
     * @return the message 
     */  
    public String getMessage()  {  
        return message;  
    }  
  
    /** 
     * @param message the message to set 
     */  
    public void setMessage(String message)  {  
        this.message = message;  
    }  
  
    //@Action(value="/helloWorld", results={@Result(name="success",location="helloWorld.jsp")})
    public String helloWorld() throws Exception  {  
    	//org.objectweb.asm.ClassVisitor aa=new org.objectweb.asm.ClassVisitor();
    	 //net.sf.cglib.core.DebuggingClassWriter aa=new  net.sf.cglib.core.DebuggingClassWriter();
        setMessage(MESSAGE);  
        return SUCCESS;  
    }  
}
