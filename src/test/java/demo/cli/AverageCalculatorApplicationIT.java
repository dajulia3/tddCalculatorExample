package demo.cli;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
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
    public void teardown(){
        System.setOut(System.out);
    }

    @Test
    public void testCalculatorApplication(){
        CoolAverageCalculatorApplication.main(new String[]{"4", "2"});
        assertThat(out.toString(), containsString("3"));
    }

}