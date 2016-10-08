package mockitotest.times;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TimesTest {
	
	@Mock
	TestClass injectedClass;
	
	@Test
	public void testInjection(){
		when(injectedClass.sayHello()).thenReturn("Hello again");
		
		//test the call
	    injectedClass.sayHello();
	      
		verify(injectedClass, times(1)).sayHello();
		verify(injectedClass, atLeast(1)).sayHello();
		
	}

}
