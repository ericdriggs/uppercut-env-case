package examples;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExamplesTest {

    //Tests pass using Runner but not using plugin
    @Test
    void testParallel() {
        Results results = Runner.path("classpath:examples")
                .outputCucumberJson(true)
                .outputHtmlReport(true)
                .outputJunitXml(true)
                .parallel(35);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }

}
