package fr.inria.spirals.repairnator.serializer;

import fr.inria.spirals.repairnator.serializer.engines.SerializerEngine;

import java.util.Collections;
import java.util.List;

/**
 * Created by urli on 09/03/2017.
 */
public abstract class Serializer {

    private List<SerializerEngine> engines;
    private SerializerType type;

    public Serializer(List<SerializerEngine> engines, SerializerType type) {
        if (engines == null) {
            this.engines = Collections.EMPTY_LIST;
        } else {
            this.engines = engines;
        }
        this.type = type;
    }

    public List<SerializerEngine> getEngines() {
        return engines;
    }

    public SerializerType getType() {
        return type;
    }
}