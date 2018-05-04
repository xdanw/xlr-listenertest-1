package local.xebiatest.listenertest;

import com.xebialabs.xlrelease.domain.events.ActivityLogEvent;
import com.xebialabs.xlrelease.events.AsyncSubscribe;
import com.xebialabs.xlrelease.events.XLReleaseEventListener;

import java.io.file;
import java.io;

// This class will write all events to a local file,
// which can be useful for debugging purposes.

public class ListenerTest implements XLReleaseEventListener {

  @AsyncSubscribe
  public void onEvent(ActivityLogEvent event) throws java.io.IOException {

    FileWriter logwriter = new FileWriter("XLRActivityLog.txt", true);
    // logfile.createNewFile();

    logwriter.write("Event: " + event.activityType() + ", Message: " + event.message() + "\r\n");

    logwriter.flush(); logwriter.close();

  }

}
