package org.modelio.module.marte.profile.time.model;

import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class TimedElement {
    protected ModelElement element;

    public TimedElement() {
    }

    public TimedElement(ModelElement element) {
        this.element = element;
    }

    public ModelElement getElement() {
        return this.element;
    }

}
