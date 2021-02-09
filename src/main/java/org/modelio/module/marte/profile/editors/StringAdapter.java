package org.modelio.module.marte.profile.editors;


public class StringAdapter {
    private String value;

    public StringAdapter(String value) {
        super();
        this.setValue(value);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
