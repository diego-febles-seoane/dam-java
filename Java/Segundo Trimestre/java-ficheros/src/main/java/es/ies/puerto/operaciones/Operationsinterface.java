package es.ies.puerto.operaciones;

import java.io.File;
import java.util.Set;

import es.ies.puerto.Empleado;

public interface Operationsinterface {
public boolean create(String data, File file);
public boolean create (File file, Set<Empleado> empleados);

        

}
