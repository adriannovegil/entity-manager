package eu.neclab.ngsildbroker.commons.datatypes;

import java.net.URI;

public class EntityInfo {

    private URI id;
    private String idPattern;
    private String type;

    public EntityInfo() {

    }

    public EntityInfo(URI id, String idPattern, String type) {
        super();
        this.id = id;
        this.idPattern = idPattern;
        this.type = type;
    }

    public URI getId() {
        return id;
    }

    public void setId(URI id) {
        this.id = id;
    }

    public String getIdPattern() {
        return idPattern;
    }

    public void setIdPattern(String idPattern) {
        this.idPattern = idPattern;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void finalize() throws Throwable {

    }

    @Override
    public String toString() {
        return "EntityInfo [id=" + id + ", idPattern=" + idPattern + ", type=" + type + "]";
    }

}
