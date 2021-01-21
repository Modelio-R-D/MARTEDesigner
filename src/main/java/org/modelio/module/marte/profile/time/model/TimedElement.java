package org.modelio.module.marte.profile.time.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("8d330e8b-6550-4977-aea9-7f80c63c89d0")
public class TimedElement {
    @objid ("71bb7c7a-42a4-4654-9c92-e52e89d6de36")
    protected ModelElement element;

    @objid ("b439d717-3759-4c08-a473-6cdfa24801ca")
    public TimedElement() {
    }

    @objid ("a2747fd2-fd3c-47d5-9c9d-8dea89287917")
    public TimedElement(ModelElement element) {
        this.element = element;
    }

    @objid ("12e42d14-b713-4822-9aac-16ec5f9bbaa7")
    public ModelElement getElement() {
        return this.element;
    }

}
