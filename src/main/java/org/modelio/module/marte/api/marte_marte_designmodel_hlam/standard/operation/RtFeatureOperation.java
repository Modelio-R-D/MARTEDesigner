/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.operation;

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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Operation} with << RtFeature_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtFeatureOperation {
    public static final String STEREOTYPE_NAME = "RtFeature_Operation";

    public static final String RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE = "RtFeature_Operation_specification";

    /**
     * The underlying {@link Operation} represented by this proxy, never null.
     */
    protected final Operation elt;

    /**
     * Tells whether a {@link RtFeatureOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Operation} stereotyped << RtFeature_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Operation) && ((Operation) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Operation} stereotyped << RtFeature_Operation >> then instantiate a {@link RtFeatureOperation} proxy.
     * 
     * @return a {@link RtFeatureOperation} proxy on the created {@link Operation}.
     */
    public static RtFeatureOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Operation");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureOperation.STEREOTYPE_NAME);
        return RtFeatureOperation.instantiate((Operation)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureOperation} proxy from a {@link Operation} stereotyped << RtFeature_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Operation
     * @return a {@link RtFeatureOperation} proxy or <i>null</i>.
     */
    public static RtFeatureOperation instantiate(final Operation obj) {
        return RtFeatureOperation.canInstantiate(obj) ? new RtFeatureOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureOperation} proxy from a {@link Operation} stereotyped << RtFeature_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Operation}
     * @return a {@link RtFeatureOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtFeatureOperation safeInstantiate(final Operation obj) throws IllegalArgumentException {
        if (RtFeatureOperation.canInstantiate(obj))
        	return new RtFeatureOperation(obj);
        else
        	throw new IllegalArgumentException("RtFeatureOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtFeatureOperation other = (RtFeatureOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Operation}. 
     * @return the Operation represented by this proxy, never null.
     */
    public Operation getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Operation_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getRtFeature_Operation_specificationNote() {
        return this.elt.getNoteContent(RtFeatureOperation.MdaTypes.RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Operation_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setRtFeature_Operation_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureOperation.MdaTypes.RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT, value);
    }

    protected RtFeatureOperation(final Operation elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static NoteType RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00c7d0e4-0ccf-11df-8525-001302895b2b");
            RTFEATURE_OPERATION_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "18a4d45f-9276-11e0-aeeb-0027103f347c");
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
