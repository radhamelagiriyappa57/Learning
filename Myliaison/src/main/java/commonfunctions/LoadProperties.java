package commonfunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
/*
import org.json.JSONException;
import org.json.JSONObject;
*/
public class LoadProperties {
//	static JSONObject pdata = jsondata();
	
    public String getProperty(String property){
        Properties prop = new Properties();
        InputStream input = null;

        try {
     
            input = new FileInputStream("C:\\Users\\rmelagir\\eclipse-workspace\\Myliaison\\src\\test\\java\\test.properties");
     
         // load a properties file
            prop.load(input);
     
            // get the property value and print it out
            return prop.getProperty(property);
     
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
     
        }
        return property;
    }
    
/*    
public static JSONObject jsondata(){
        
	JSONObject pdata = new JSONObject();
    	
    	try {
    		JSONObject program = new JSONObject();
			program.put("prgName", "UnivOfAlbama"+Utilities.GenerateRandomNumber(3)+"");
			JSONObject staff = new JSONObject();
			staff.put("staffname","Sibu"+Utilities.GenerateRandomNumber(3)+"");
			staff.put("email", Utilities.GenerateRandomNumber(3)+Utilities.GenerateRandomString(2)+"@gmail.co.in");
			
			JSONObject ci = new JSONObject();
			ci.put("ciname","Tomas"+Utilities.GenerateRandomNumber(3)+"");
			ci.put("email", Utilities.GenerateRandomNumber(3)+Utilities.GenerateRandomString(2)+"@gmail.co.in");
			
			JSONObject site = new JSONObject();
			site.put("site","PhysicalTherapy"+Utilities.GenerateRandomNumber(3));
			
			JSONObject url = new JSONObject();
			url.put("login","https://cpi2.stg.amsapps.com/user_session/new");
			url.put("forgotpwd","https://cpi2.stg.amsapps.com/forgot_password/new");
			
			
			
			JSONObject student = new JSONObject();
			student.put("stuname","Reiko"+Utilities.GenerateRandomNumber(3)+"");
			student.put("email", Utilities.GenerateRandomNumber(3)+Utilities.GenerateRandomString(2)+"@gmail.co.in");
			
		//	JSONObject data = new JSONObject();
			pdata.put("program", program);
			pdata.put("staff", staff);
			pdata.put("ci", ci);
			pdata.put("student", student);
			pdata.put("site", site);	
			pdata.put("url", url);
		//	pdata.put("datasheet", data);
			
			
			//System.out.println(((JSONObject) 
			//	pdata.get("staff").get("staff");
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return pdata;
		
		

	
    }
    
  /* 
	public String getJsonData(JSONObject jobj, String key) {
		return this.getJSONObject(jobj).get(key);
	}
 */

}