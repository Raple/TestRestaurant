/**
 * 
 */
package com.lyp.testRestaurantCore.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


/**
 *
 * @author lyp
 * @date 2016年8月25日下午2:20:07
 */
public class StatusUtil {
	private static StatusUtil instance;
	private final Map<String, String> messageDictionary;
	
	protected StatusUtil() {	
		messageDictionary=new HashMap<String, String>();
		
		try {
			Document doc=parse("status.xml");			
			Element root = doc.getRootElement();			
			Iterator it = root.elementIterator();
			while (it.hasNext()) {
			   Element element = (Element) it.next();
			
				   //未知属性名称情况下
			   /*Iterator attrIt = element.attributeIterator();
			   while (attrIt.hasNext()) {
			    Attribute a  = (Attribute) attrIt.next();
			    System.out.println(a.getValue());
			   }*/
			
			   //已知属性名称情况下
			   //System.out.println("id: " + element.attributeValue("id"));
			   
			   messageDictionary.put(element.attributeValue("code"), element.attributeValue("message"));
			}
		} catch (Exception e) {
			// TODO: handle exception
            e.printStackTrace();
		}
	}
	
	public static StatusUtil GetInstance()
    {
		if(instance==null)
           instance=new StatusUtil();
		return instance;
    }
	
	public String GetMessage(String statusCode)
    {
		//return messageDictionary.getOrDefault(statusCode, "");
		return messageDictionary.get(statusCode);
    }
	
	private Document parse(String fileName)  {

		Document document;
		try{
	        SAXReader reader = new SAXReader();
	//		ClassLoader classLoader = getClass().getClassLoader();  
	//	    File file = new File(classLoader.getResource(fileName).getFile());
			// 使用getResourceAsStream返回的是InputStream流对象 使用getResoruce返回是Java.net.url对象  
	        document = reader.read(StatusUtil.class.getClassLoader()  
	                .getResourceAsStream(fileName));  
		}
		catch(Exception e){

			// TODO: handle exception
            e.printStackTrace();
            document=null;
		}
        return document;
    }
}
