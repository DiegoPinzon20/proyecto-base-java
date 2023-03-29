package co.com.reliquias.software.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class ProfileModel {
    private final String nombre;
    private final String apellido;
    private final String fechaNacimiento;
    private final String pais;
    private final String genero;
}
