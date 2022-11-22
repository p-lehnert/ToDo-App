package de.app.todo.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serial;
import java.util.UUID;

/**
 * An abstract class for the database entities.
 */
@MappedSuperclass
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public abstract class ModelDbEntity implements ModelEntity {

    /**
     * A unique serial version identifier.
     */
    @Serial
    private static final long serialVersionUID = -1271310178950382572L;

    /**
     * The primary key for an entity.
     */
    @Id
    @GeneratedValue
    protected long id;

    /**
     * An identifier generated, as soon as the object is created.
     */
    @EqualsAndHashCode.Include
    @Column(nullable = false)
    protected String uuid = UUID.randomUUID().toString();
}
