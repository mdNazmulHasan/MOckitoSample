package springrainit.nazmul.mockitosample;

import static org.junit.Assert.*;

import android.content.Context;
import java.net.Authenticator;
import org.junit.*;
import org.mockito.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    protected Context mContext;
    @Mock
    Authenticator mockAuthenticator;
    
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}