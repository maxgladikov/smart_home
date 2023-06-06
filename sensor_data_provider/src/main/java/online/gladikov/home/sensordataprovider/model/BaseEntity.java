package online.gladikov.home.sensordataprovider.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@ToString
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1465278981394723227L;
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is mandatory")
    @NotNull
    @Column(unique=true)
    private String name;
    @CreationTimestamp
	@Column(updatable=false,nullable = false)
	private LocalDateTime created;
}
