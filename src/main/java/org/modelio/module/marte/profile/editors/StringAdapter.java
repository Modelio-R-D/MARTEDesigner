package org.modelio.module.marte.profile.editors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2ef98e2b-4536-4411-afe7-c0d8e977d3c6")
public class StringAdapter {
    @objid ("b29c302b-b785-489b-8f4a-ec051bc112de")
    private String value;

    @objid ("4777b8c7-84ef-4d6b-8b7b-1900497e2901")
    public StringAdapter(String value) {
        super();
        this.setValue(value);
    }

    @objid ("92f29e97-0d59-4b12-93ec-c9c7aa96e6a3")
    public void setValue(String value) {
        this.value = value;
    }

    @objid ("bc8db90d-70ad-45d1-aa75-e50b9751d264")
    public String getValue() {
        return this.value;
    }

}
