package de.app.todo.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Task extends ModelDbEntity {

    @Serial
    private static final long serialVersionUID = -7137379317620845123L;

    private String name;

    private String explanation;

    private boolean done;

}
