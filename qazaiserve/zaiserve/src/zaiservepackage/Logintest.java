
package zaiservepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class Logintest {
	
	  
	public  WebDriver driver;
	  
	  
    @BeforeMethod
    public void setup(){

    	System.setProperty("webdriver.chrome.driver","C://Users//lenovo//Downloads//chromedriver_win32 (3)//chromedriver.exe");
        
       driver = new ChromeDriver();
      
      PageFactory.initElements(driver, Login.class);

      driver.get(" http://demo.zaigoshop.com/login");

     
      driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      
    }

    @Test(priority=1)

    public void test_one()
    
    //check with invalid user id and invalid password
    {
     Login.userName.sendKeys("name@nn.in");
       
     Login.password.sendKeys("pass");
    
     Login.login.click();
     
  String email_err=   Login.email_err.getText();
     
     if(email_err.equals("These credentials do not match our records."))
     {
    	 System.out.println("pass");
     }
     else
     {
    	 System.out.println("fail");
     }
    
 	    }

    
    @Test(priority=2)

    public void test_userid_password()
    {
    	//check with invalid user id and valid password
    	
    	 Login.userName.sendKeys("na@nh.in");
           
	     Login.password.sendKeys("LAra_1104");
	    
	     Login.login.click();
	     
	  String err_msg=   Login.email_err.getText();
	     
	     if(err_msg.equals("These credentials do not match our records."))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
    	
   
    
 	    }
    
    @Test(priority=3)

    public void test_three()
    {
    	//check with valid user id and invalid password
    	
   
    	 Login.userName.sendKeys("nishanth.k@zaigoinfotech.com");
           
	     Login.password.sendKeys("asdf");
	    
	     Login.login.click();
	     
	  String err_msg=   Login.email_err.getText();
	     
	     if(err_msg.equals("These credentials do not match our records."))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
    		    	
   
    
 	    }
    
    @Test(priority=4)

    public void test_four()
    {
    	//check with null user id and null password
    
    	
    	 Login.userName.sendKeys("");
    	 
	     Login.password.sendKeys("");
	    
	     Login.login.click();
	     
	  String err_msg=   Login.userName.getAttribute("validationMessage");
	     
	     if(err_msg.equals("Please fill out this field."))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
    		    
    
    	
   
    
 	    }
    
    
    @Test(priority=5)

    public void test_five()
    {
    	//check with null user id and valid password
    	
    	 Login.userName.sendKeys("");
           
	     Login.password.sendKeys("LAra_1104");
	    
	     Login.login.click();
	     
	     String err_msg=   Login.userName.getAttribute("validationMessage");
	     
	     if(err_msg.equals("lease fill out this field."))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
    		    
   
    
 	    }
    
    
    @Test(priority=6)

    public void test_six()
    {
    	//check with valid user id and null password
    	
    	Login.userName.sendKeys("nishanth.k@zaigoinfotech.com");
           
	     Login.password.sendKeys("");
	    
	     Login.login.click();
	     
	  String err_msg=   Login.password.getAttribute("validationMessage");
	     
	     if(err_msg.equals("lease fill out this field."))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
    		    
    	
   
    
 	    }
    
    @Test(priority=7)

    public void test_seven()
    {
    	//check with invalid email format and valid password
    	
    	Login.userName.sendKeys("zaigoinfotechcom");
           
	     Login.password.sendKeys("LAra_1104");
	    
	     Login.login.click();
	     
	  String err_msg=   Login.userName.getAttribute("validationMessage");
	  
	 // System.out.println(err_msg);
	     
	     if(err_msg.equals("Please include an '@' in the email address. 'zaigoinfotechcom' is missing an '@'."))
	     {
	    	 System.out.println("pass");
	     }
	     else
	     {
	    	 System.out.println("fail");
	     }
    		 
    	
   
    
 	    }
    
    @Test(priority=7)

    public void test_eighta()
    {
    	//check with user id field is present
    	
    	
    	String uid_pre=Login.userName.getTagName();
    	
    	
    	
    	 
    	 if(uid_pre.equals("input"))
    	 
    	 {
    		 
    		 System.out.println("pass");
    		 
    		}
    		else{
    			
    			 System.out.println("fail");
    		 
    		}
 
  
    
 	    }
    
    
    @Test(priority=8)
     
    
    public void test_eight()
    {
    	//check with password id field is present
    	
    	String pswd_pre=Login.password.getTagName();
    	
    	
    	
    	 
    	 if(pswd_pre.equals("input")){
    		 
    		 System.out.println("pass");
    		 
    		}
    		else{
    			
    			 System.out.println("fail");
    		 
    		}

   
    
 	    }
    
    @Test(priority=9)

    public void test_nine()
    {
    	//check with submit button is present
    	
    	String l_btn=Login.login.getTagName();
    	
    	
    	
    	 
    	 if(l_btn.equals("button")){
    		 
    		 System.out.println("pass");
    		 
    		}
    		else{
    			
    			 System.out.println("fail");
    		 
    		}

   
    
 	    }
   
    
 	    
    
    @Test(priority=10)

    public void test_ten()
    {
    	//check with user id fiedl placeholder
    	
     String uid_placeholder=Login.userName.getAttribute("placeholder");
     String ep="Email...";
     
     if(ep.equals(uid_placeholder))
     {
		  System.out.println("pass");
	  }
	  else
	  {
		  
		  System.out.println("fail");
		  
	  }
    	
   
    
 	    }
    
    @Test(priority=11)

    public void test_eleven()
    {
    	//check with password field placeholder
    	
    	String pswd_placeholder=Login.password.getAttribute("placeholder");
	     String pp="Password..";
	     
	     if(pp.equals(pswd_placeholder))
	     {
   		  System.out.println("pass");
   	  }
   	  else
   	  {
   		  
   		  System.out.println("fail");
   		  
   	  }
	    	
	   
    	
   
   }
    
    @Test(priority=12)

    public void test_tweleve()
    {
    	//check with submit button.
    	
   
    	
    	
    	
   
   }
    
    
    @Test(priority=13)

    public void test_thirteen()
    {
    	//check with submit button value
    	
 String btn_value=   Login.login.getText();
 

 
 if(btn_value.equals("LOGIN"))
 {
	 System.out.println("pass");
 }
 else
 {
	 System.out.println("fail");
 }
   
   }
    
    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
    
    

	}



