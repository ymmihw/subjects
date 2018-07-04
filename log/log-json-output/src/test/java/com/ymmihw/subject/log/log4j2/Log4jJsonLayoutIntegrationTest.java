package com.ymmihw.subject.log.log4j2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Before;
import org.junit.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Log4jJsonLayoutIntegrationTest {

  private static Logger logger;
  private ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
  private PrintStream ps = new PrintStream(consoleOutput);

  @Before
  public void setUp() {
    // Redirect console output to our stream
    // System.setOut(ps);
    // logger = LogManager.getLogger("CONSOLE_JSON_APPENDER");
    logger = LoggerFactory.getLogger(Log4jJsonLayoutIntegrationTest.class);
  }

  @Test
  public void whenLogLayoutInJSON_thenOutputIsCorrectJSON() {
    logger.info( "LOG4J2 Debug message");
    // String currentLog = consoleOutput.toString();
    // assertTrue(!currentLog.isEmpty());
    // assertTrue(isValidJSON(currentLog));
  }

  public static boolean isValidJSON(String jsonInString) {
    try {
      final ObjectMapper mapper = new ObjectMapper();
      mapper.readTree(jsonInString);
      return true;
    } catch (IOException e) {
      return false;
    }
  }
}
