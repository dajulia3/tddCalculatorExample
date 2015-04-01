package demo.cli;

import demo.cli.console.fakes.FakeOutput;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorCliProgramRunnerTest {

    @Test
    public void testRun(){

        FakeOutput output = new FakeOutput();
        new CalculatorCliProgramRunner().run(output, new String[]{"6", "4", "2", "2"});

        assertThat(output.getOutput(), equalTo("7"));

    }
}