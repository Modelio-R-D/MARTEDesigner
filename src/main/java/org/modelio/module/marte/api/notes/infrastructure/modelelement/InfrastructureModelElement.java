/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.notes.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} metaclass.
 * <p>Description:
 * <br/><i>Infrastructure.ModelElement</i></p>
 */
public class InfrastructureModelElement {
    public static final String ASSIGN_NOTETYPE = "Assign";

    public static final String TIMEDOBSERVATION_NOTETYPE = "TimedObservation";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InfrastructureModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement}.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return (elt instanceof ModelElement);
    }

    /**
     * Tries to instantiate a {@link InfrastructureModelElement} proxy from a {@link ModelElement} checking its metaclass. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link InfrastructureModelElement} proxy or <i>null</i>.
     */
    public static InfrastructureModelElement instantiate(final ModelElement obj) {
        return InfrastructureModelElement.canInstantiate(obj) ? new InfrastructureModelElement(obj) : null;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        InfrastructureModelElement other = (InfrastructureModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for note 'Assign'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getAssignNote() {
        return this.elt.getNoteContent(InfrastructureModelElement.MdaTypes.ASSIGN_NOTETYPE_ELT);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'TimedObservation'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getTimedObservationNote() {
        return this.elt.getNoteContent(InfrastructureModelElement.MdaTypes.TIMEDOBSERVATION_NOTETYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'Assign'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setAssignNote(final String value) {
        this.elt.putNoteContent(InfrastructureModelElement.MdaTypes.ASSIGN_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'TimedObservation'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setTimedObservationNote(final String value) {
        this.elt.putNoteContent(InfrastructureModelElement.MdaTypes.TIMEDOBSERVATION_NOTETYPE_ELT, value);
    }

    protected InfrastructureModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static NoteType TIMEDOBSERVATION_NOTETYPE_ELT;

        public static NoteType ASSIGN_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            TIMEDOBSERVATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "de27ab36-3e4a-11df-87c6-001302895b2b");
            ASSIGN_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "00adf56a-3e4b-11df-87c6-001302895b2b");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
