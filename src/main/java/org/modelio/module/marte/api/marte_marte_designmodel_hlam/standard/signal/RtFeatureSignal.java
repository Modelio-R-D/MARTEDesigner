/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.signal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
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
 * Proxy class to handle a {@link Signal} with << RtFeature_Signal >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class RtFeatureSignal {
    public static final String STEREOTYPE_NAME = "RtFeature_Signal";

    public static final String RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE = "RtFeature_Signal_specification";

    /**
     * The underlying {@link Signal} represented by this proxy, never null.
     */
    protected final Signal elt;

    /**
     * Tells whether a {@link RtFeatureSignal proxy} can be instantiated from a {@link MObject} checking it is a {@link Signal} stereotyped << RtFeature_Signal >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Signal) && ((Signal) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSignal.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Signal} stereotyped << RtFeature_Signal >> then instantiate a {@link RtFeatureSignal} proxy.
     * 
     * @return a {@link RtFeatureSignal} proxy on the created {@link Signal}.
     */
    public static RtFeatureSignal create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Signal");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSignal.STEREOTYPE_NAME);
        return RtFeatureSignal.instantiate((Signal)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureSignal} proxy from a {@link Signal} stereotyped << RtFeature_Signal >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Signal
     * @return a {@link RtFeatureSignal} proxy or <i>null</i>.
     */
    public static RtFeatureSignal instantiate(final Signal obj) {
        return RtFeatureSignal.canInstantiate(obj) ? new RtFeatureSignal(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtFeatureSignal} proxy from a {@link Signal} stereotyped << RtFeature_Signal >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Signal}
     * @return a {@link RtFeatureSignal} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RtFeatureSignal safeInstantiate(final Signal obj) throws IllegalArgumentException {
        if (RtFeatureSignal.canInstantiate(obj))
        	return new RtFeatureSignal(obj);
        else
        	throw new IllegalArgumentException("RtFeatureSignal: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        RtFeatureSignal other = (RtFeatureSignal) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Signal}. 
     * @return the Signal represented by this proxy, never null.
     */
    public Signal getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Signal_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public String getRtFeature_Signal_specificationNote() {
        return this.elt.getNoteContent(RtFeatureSignal.MdaTypes.RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Signal_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    public void setRtFeature_Signal_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureSignal.MdaTypes.RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE_ELT, value);
    }

    protected RtFeatureSignal(final Signal elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static NoteType RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8008dee0-0ff8-11df-86fe-0014222a9f79");
            RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "1b96167a-9276-11e0-aeeb-0027103f347c");
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
