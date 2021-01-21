/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.signal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("c1d4c35a-89d1-48f7-894f-26c7fc02ec9c")
public class RtFeatureSignal {
    @objid ("3fca795f-fb38-468c-992a-5a1cc66c53ac")
    public static final String STEREOTYPE_NAME = "RtFeature_Signal";

    @objid ("169edac2-05b2-41fe-b3ef-7eda808b7f96")
    public static final String RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE = "RtFeature_Signal_specification";

    /**
     * The underlying {@link Signal} represented by this proxy, never null.
     */
    @objid ("775acd43-42bc-4455-8f88-ce96ce976f08")
    protected final Signal elt;

    /**
     * Tells whether a {@link RtFeatureSignal proxy} can be instantiated from a {@link MObject} checking it is a {@link Signal} stereotyped << RtFeature_Signal >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4ab6bcd5-7604-46c5-bd9e-7cbb4a4a9bf1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Signal) && ((Signal) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSignal.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Signal} stereotyped << RtFeature_Signal >> then instantiate a {@link RtFeatureSignal} proxy.
     * 
     * @return a {@link RtFeatureSignal} proxy on the created {@link Signal}.
     */
    @objid ("169a4ead-add5-400a-a2c5-ea4eff9b89f6")
    public static RtFeatureSignal create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Signal");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtFeatureSignal.STEREOTYPE_NAME);
        return RtFeatureSignal.instantiate((Signal)e);
    }

    /**
     * Tries to instantiate a {@link RtFeatureSignal} proxy from a {@link Signal} stereotyped << RtFeature_Signal >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Signal
     * @return a {@link RtFeatureSignal} proxy or <i>null</i>.
     */
    @objid ("5060a62e-b95f-4a0f-b3c2-6682d3e1c00a")
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
    @objid ("184d4d01-dfad-4719-b190-c780248e5508")
    public static RtFeatureSignal safeInstantiate(final Signal obj) throws IllegalArgumentException {
        if (RtFeatureSignal.canInstantiate(obj))
        	return new RtFeatureSignal(obj);
        else
        	throw new IllegalArgumentException("RtFeatureSignal: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("720d2e5e-2c07-40a8-8b63-475ef92c0bd2")
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
    @objid ("098eeeb8-44ba-43e6-ab1c-b5f0388a84d6")
    public Signal getElement() {
        return this.elt;
    }

    /**
     * Getter for note 'RtFeature_Signal_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("b7bc1f72-a230-49db-ba31-df3acf652b3c")
    public String getRtFeature_Signal_specificationNote() {
        return this.elt.getNoteContent(RtFeatureSignal.MdaTypes.RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE_ELT);
    }

    @objid ("e1ceebaf-7eed-47fa-8977-10988465e940")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for note 'RtFeature_Signal_specification'
     * <p>Note description:
     * <br/><i></i></p>
     */
    @objid ("40c04ef1-6e4b-4eb5-8614-eba0c3e209bd")
    public void setRtFeature_Signal_specificationNote(final String value) {
        this.elt.putNoteContent(RtFeatureSignal.MdaTypes.RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE_ELT, value);
    }

    @objid ("07612e30-bdfe-4032-b59a-ea7fbd12890c")
    protected RtFeatureSignal(final Signal elt) {
        this.elt = elt;
    }

    @objid ("ef0d7523-372a-4640-baf0-dd7274385443")
    public static final class MdaTypes {
        @objid ("2c1bf13e-d185-4516-9cb0-12fd5f5d4806")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3a94f08-9198-4924-b124-4526a6ad7ecc")
        public static NoteType RTFEATURE_SIGNAL_SPECIFICATION_NOTETYPE_ELT;

        @objid ("545edf57-43f4-4ebc-85d2-7c473ae74129")
        private static Stereotype MDAASSOCDEP;

        @objid ("cdd56b85-29b1-43db-87fb-1ca720df4c6d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec44e8fa-ae77-4d54-9c6d-ed6d18528289")
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
