package de.app.todo.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serial;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table
@Getter
public class Appointment extends ModelDbEntity {

    @Serial
    private static final long serialVersionUID = -618078978761844884L;

    private LocalDate date;

    private LocalTime time;

    private boolean important;
}
