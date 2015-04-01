package demo.cli.console.fakes;

import demo.cli.console.Output;

public class FakeOutput implements Output {
    StringBuffer stringBuffer = new StringBuffer();

    public void output(String text) {
        stringBuffer.append(text);
    }

    public String getOutput(){
        return stringBuffer.toString();
    }
}
