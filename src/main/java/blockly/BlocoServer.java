package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class BlocoServer {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// BlocoServer
public static Var ObterUsuario() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ObterReservaUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var Reservas = Var.VAR_NULL;

   public Var call() throws Exception {
    if (Var.valueOf(Var.valueOf("Alunos").equals(cronapi.database.Operations.query(Var.valueOf("app.entity.Role"),Var.valueOf("select r.id from Role r where r.user.login = :userLogin"),Var.valueOf("userLogin",cronapi.util.Operations.getCurrentUserName())))).getObjectAsBoolean()) {
        Reservas = cronapi.database.Operations.query(Var.valueOf("app.entity.Reserva"),Var.valueOf("select r from Reserva r where r.user.login = :userLogin"),Var.valueOf("userLogin",cronapi.util.Operations.getCurrentUserName()));
    } else {
        Reservas = cronapi.database.Operations.query(Var.valueOf("app.entity.Reserva"),Var.valueOf("select r from Reserva r"));
    }
    return Reservas;
   }
 }.call();
}

}

