#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ejb;

import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import ${package}.util.TestUtil;

/**
 * Session Bean implementation class TestEJB
 */
@LocalBean
@Stateless(mappedName = "TestEJB")
public class TestEJB {

	private static Logger logger = Logger.getLogger(TestEJB.class.getName());
  
	/**
     * Default constructor. 
     */
    public TestEJB() {
    	logger.severe("Contructing test ejb");
    }

    public String sayHello(String name) {
    	logger.severe("Test metthod entering ..");
    	return "Hello " + TestUtil.uppercaseOfNames(name);
    }
    
}
