package demo.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class AverageCalculatorApplicationIT {

    private ByteArrayOutputStream out;

    @Before
    public void setup(){
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void teardown() throws IOException {
        out.flush();
        out.close();
        System.setOut(System.out);
    }

    @Test
    public void testCalculatorApplication(){
        CoolAverageCalculatorApplicationMain.main(new String[]{"4", "2"});
        assertThat(out.toString(), containsString("3"));
    }

    @Test
    public void testCalculatorApplication_NoNumbers(){
        out = new ByteArrayOutputStream();
        CoolAverageCalculatorApplicationMain.main(new String[]{});
        assertThat(out.toString(), containsString(CoolAverageCalculatorApplicationMain.BAD_AVERAGE_INPUT_MESSAGE));
    }

}