/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_gqam.infrastructure.modelelement;

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
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << GaAcqStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("50a805d5-32bd-4c99-aa79-3ef7ff035188")
public class GaAcqStepModelElement extends GaStepModelElement {
    @objid ("f5481560-27c3-4cf4-8e10-ec0319ed867d")
    public static final String STEREOTYPE_NAME = "GaAcqStep_ModelElement";

    @objid ("369156a5-29bb-442d-b88a-71456c2043c5")
    public static final String GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE = "GaAcqStep_ModelElement_acqRes";

    @objid ("aafbb977-599b-4f06-aabf-bc1651bf6201")
    public static final String GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "GaAcqStep_ModelElement_resUnits";

    /**
     * Tells whether a {@link GaAcqStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8f609105-7497-4b9a-8b6a-12f0d09f25bc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaAcqStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> then instantiate a {@link GaAcqStepModelElement} proxy.
     * 
     * @return a {@link GaAcqStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("80eb6960-65ec-4beb-86f3-41e6422d467e")
    public static GaAcqStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaAcqStepModelElement.STEREOTYPE_NAME);
        return GaAcqStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaAcqStepModelElement} proxy from a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaAcqStepModelElement} proxy or <i>null</i>.
     */
    @objid ("8e98cb98-cc48-4a22-9879-f06d25e8e142")
    public static GaAcqStepModelElement instantiate(final ModelElement obj) {
        return GaAcqStepModelElement.canInstantiate(obj) ? new GaAcqStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaAcqStepModelElement} proxy from a {@link ModelElement} stereotyped << GaAcqStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaAcqStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("391ceb2d-76c9-4419-9367-3d85f4581c8a")
    public static GaAcqStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaAcqStepModelElement.canInstantiate(obj))
        	return new GaAcqStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaAcqStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("014d3324-0145-4acb-9ba3-e9f2ba0e6b47")
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
        GaAcqStepModelElement other = (GaAcqStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("f265c4a2-ae8f-4ba2-a5f3-51a325567baf")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'GaAcqStep_ModelElement_acqRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd19cb8c-83ed-493c-86f5-7330ee9e0844")
    public String getGaAcqStep_ModelElement_acqRes() {
        return this.elt.getTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaAcqStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e48ef2ac-214a-47d6-915f-df190c38e61c")
    public String getGaAcqStep_ModelElement_resUnits() {
        return this.elt.getTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    @objid ("c9c5f825-e3ce-4568-9f34-cc2af9de14d7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaAcqStep_ModelElement_acqRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("005d71d8-9ba5-43f7-8454-d4b361678751")
    public void setGaAcqStep_ModelElement_acqRes(final String value) {
        this.elt.putTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaAcqStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1dec93e2-a208-483f-aab2-31e18d437c54")
    public void setGaAcqStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(GaAcqStepModelElement.MdaTypes.GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    @objid ("9e3fdd3b-4b86-42d8-bf48-3cf967e4b25a")
    protected GaAcqStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("e559ea55-92fb-43df-a357-2e6c6240f5a4")
    public static final class MdaTypes {
        @objid ("69635d37-8da6-4819-91aa-1d18f6e628eb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1daafc06-fb17-4e53-ae70-57a92b54e0a5")
        public static TagType GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT;

        @objid ("dd173195-c465-4009-a3a3-99a971d892e9")
        public static TagType GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        @objid ("d50efa8f-5dbc-47e3-88b0-da66037e8f7a")
        private static Stereotype MDAASSOCDEP;

        @objid ("fa24e88d-f8d0-4d12-a60c-0b8f422da102")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("18e80d2e-bd7f-446f-8dc7-3762e88e9d01")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9416a01d-149e-11df-9d54-0014222a9f79");
            GAACQSTEP_MODELELEMENT_ACQRES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9416a01e-149e-11df-9d54-0014222a9f79");
            GAACQSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9416a01f-149e-11df-9d54-0014222a9f79");
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
