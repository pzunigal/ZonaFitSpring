package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity // Clase entidad JPA, mapea a una tabla en la base de datos
@Data // genera automaticamente getters, setters, toString, equals, hashCode y otros metodos utiles, Simplifica Codigo
@NoArgsConstructor // Genera un Constructor sin argumentos para la clase, Util para crear instancia de la entidad sin iniciar sus atributos
@AllArgsConstructor // Gen. const. con un argumento para cada campo de la clase, permite crear una instancia de la entidad iniciando todos los atributos al mismo tiempo
@ToString // Genera metodo toString() que devuelve una representación en cadena de la clase, mostrando todos los campos y sus valores
@EqualsAndHashCode // Genera metodos equals() y hashCode() para comparar objetos de esta clase por valor y no por referencia
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer membresia;
}
