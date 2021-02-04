/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.notes.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("3356a26b-eaa9-4ef6-b773-baa351aa2ce8")
public class InfrastructureModelElement {
    @objid ("75a21b16-6f31-44bc-b090-ec9871aa970b")
    public static final String ASSIGN_NOTETYPE = "Assign";

    @objid ("191e995c-24f5-4786-9995-abac68d1ba81")
    public static final String TIMEDOBSERVATION_NOTETYPE = "TimedObservation";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("8acd6d40-7e08-4645-be77-4e67f632ae8c")
    protected final ModelElement elt;

    /**
     * Tells whether a {@link InfrastructureModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement}.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e29645e5-6a0a-4182-8ad0-9b3eb7a3b0d5")
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
    @objid ("33afadc4-b6a5-45b7-ac9a-dcdf32546adf")
    public static InfrastructureModelElement instantiate(final ModelElement obj) {
        return InfrastructureModelElement.canInstantiate(obj) ? new InfrastructureModelElement(obj) : null;
    }

    @objid ("07e3f088-bd8b-4d44-8964-20393ee2c623")
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
    @objid ("20c5c240-1e78-4221-b9d9-95a63a13c514")
    public String getAssignNote() {
        return this.elt.getNoteContent(InfrastructureModelElement.MdaTypes.ASSIGN_NOTETYPE_ELT);
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("1b794198-388d-41c1-b175-beeb1d689d5b")
    public ModelElement getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'TimedObservation'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("fe8ec449-4e5f-4b16-b17d-0ffe615bef56")
    public String getTimedObservationNote() {
        return this.elt.getNoteContent(InfrastructureModelElement.MdaTypes.TIMEDOBSERVATION_NOTETYPE_ELT);
    }

    @objid ("c81e4e95-ebd8-4b5f-a0ac-7fce61fbf07e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'Assign'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("104c9617-e22d-4986-9832-600756f4d6db")
    public void setAssignNote(final String value) {
        this.elt.putNoteContent(InfrastructureModelElement.MdaTypes.ASSIGN_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'TimedObservation'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("db640372-c796-4d00-8c04-14423d0e2566")
    public void setTimedObservationNote(final String value) {
        this.elt.putNoteContent(InfrastructureModelElement.MdaTypes.TIMEDOBSERVATION_NOTETYPE_ELT, value);
    }

    @objid ("7fec1eb3-3f6e-4f1a-bc01-576a14a2a5c9")
    protected InfrastructureModelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("60745c35-b604-42e3-8ad8-8b326c00792a")
    public static final class MdaTypes {
        @objid ("662d3ff9-057b-48f5-98bc-03cbbc2a3c56")
        public static NoteType TIMEDOBSERVATION_NOTETYPE_ELT;

        @objid ("04cf7f7f-f779-4494-b450-78312e3ed748")
        public static NoteType ASSIGN_NOTETYPE_ELT;

        @objid ("3b048e09-ee82-42d8-b533-7cbc81582a32")
        private static Stereotype MDAASSOCDEP;

        @objid ("74e14721-6570-4ca2-b8f9-54857419b7d4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eccf1072-c684-411e-8dcb-6faf5503911e")
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
