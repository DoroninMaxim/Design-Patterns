package prototype.basic.src;

public class PrototypeObject implements Cloneable {
    private Integer intField;
    private String strField;

    public PrototypeObject(Integer intField, String strField) {
        this.intField = intField;
        this.strField = strField;
    }

    public Integer getIntField() {
        return intField;
    }

    public void setIntField(Integer intField) {
        this.intField = intField;
    }

    public String getStrField() {
        return strField;
    }

    public void setStrField(String strField) {
        this.strField = strField;
    }

    @Override
    public PrototypeObject clone(){
        return new PrototypeObject(this.intField, this.strField);
    }

    @Override
    public String toString() {
        return "PrototypeObject{" +
                "intField=" + intField +
                ", strField='" + strField + '\'' +
                '}';
    }
}
