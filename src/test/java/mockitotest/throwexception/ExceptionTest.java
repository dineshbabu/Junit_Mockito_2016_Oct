package mockitotest.throwexception;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ExceptionTest {
	
	@Mock
	TestClass testClass;
	
	@Test(expected = ArithmeticException.class)
	public void testThrow(){
		doThrow(new ArithmeticException()).
		when(testClass).divisionByZero();
		
		//test the call
	    testClass.divisionByZero();
	      
//		verify(testClass, times(1)).sayHello();
//		verify(testClass, atLeast(1)).sayHello();
		
	}

}
