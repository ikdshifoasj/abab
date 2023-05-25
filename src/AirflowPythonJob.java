import com. alibaba. fastjson. JSONArray;
import com. alibaba. fastjson. JSONObject;

import com. sun. xml. internal. bind. v2. runtime. reflect. Lister;

import java. io.*;
        import org. apache. log4j.Logger;
public class AirflowPythonJob {
    public static String readJsonFile(String fileName)

    public static void writeFile(String content, File fileName) throws Exception {

        Writer w = new FileWriter(fileName, append:false);

        w.write(content);
        w.close();
    }

    private static Logger logger = Logger.getLogger(AirflowPythmJob.class);
}
