package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Bloco2 {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Bloco2
public static Var userlogged() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

}

