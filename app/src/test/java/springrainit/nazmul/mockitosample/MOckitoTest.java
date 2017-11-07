package springrainit.nazmul.mockitosample;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static springrainit.nazmul.mockitosample.Foo.HELLO_WORLD;

import org.junit.*;

/**
 * Created by nazmul on 11/3/2017.
 */

public class MOckitoTest {
    private Foo foo;

    @Before
    public void setupMock() {
        foo = mock(Foo.class);
        when(foo.greet()).thenReturn(HELLO_WORLD);
    }

    @Test
    public void fooGreets() {
        System.out.println("Foo greets: " + foo.greet());
        assertEquals(HELLO_WORLD, foo.greet());
    }




}
