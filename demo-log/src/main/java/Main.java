import com.alfred.sdk.Log;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author wuguang
 * @description
 * @date 2024/5/29 16:11
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Log> load = ServiceLoader.load(Log.class);
        for (Log log : load) {
            log.log("jdk");
        }
    }
}
