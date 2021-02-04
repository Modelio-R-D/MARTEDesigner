/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link ModelElement} with << GaRelStep_ModelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("3d201e79-7d67-4f18-9b2b-836ce555b398")
public class GaRelStepModelElement extends GaStepModelElement {
    @objid ("a44537f1-17d9-484e-884e-845a57a1cd89")
    public static final String STEREOTYPE_NAME = "GaRelStep_ModelElement";

    @objid ("fbd5f790-cd5c-41de-99f3-827ca4148676")
    public static final String GARELSTEP_MODELELEMENT_RELRES_TAGTYPE = "GaRelStep_ModelElement_relRes";

    @objid ("32e13851-3e46-4c3e-84a0-160ed1e50c74")
    public static final String GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE = "GaRelStep_ModelElement_resUnits";

    /**
     * Tells whether a {@link GaRelStepModelElement proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << GaRelStep_ModelElement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7bdc9015-1f74-4c5b-a46a-d488fd04e4ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, GaRelStepModelElement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << GaRelStep_ModelElement >> then instantiate a {@link GaRelStepModelElement} proxy.
     * 
     * @return a {@link GaRelStepModelElement} proxy on the created {@link ModelElement}.
     */
    @objid ("6d46bbd8-da35-48a3-bd44-7f5139aac3d5")
    public static GaRelStepModelElement create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, GaRelStepModelElement.STEREOTYPE_NAME);
        return GaRelStepModelElement.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link GaRelStepModelElement} proxy from a {@link ModelElement} stereotyped << GaRelStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link GaRelStepModelElement} proxy or <i>null</i>.
     */
    @objid ("37960836-799d-4eb0-9ec1-ee1c94d4ccda")
    public static GaRelStepModelElement instantiate(final ModelElement obj) {
        return GaRelStepModelElement.canInstantiate(obj) ? new GaRelStepModelElement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link GaRelStepModelElement} proxy from a {@link ModelElement} stereotyped << GaRelStep_ModelElement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link GaRelStepModelElement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d73773bc-38c7-44ed-a0fa-de6c87ced0ad")
    public static GaRelStepModelElement safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (GaRelStepModelElement.canInstantiate(obj))
        	return new GaRelStepModelElement(obj);
        else
        	throw new IllegalArgumentException("GaRelStepModelElement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e3d5189d-ea83-4bbb-a361-43babf535de3")
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
        GaRelStepModelElement other = (GaRelStepModelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("660cf816-e3b0-484f-b390-35108bbecbc4")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'GaRelStep_ModelElement_relRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("55b26f8c-6390-423a-8d63-3ba824d165c5")
    public String getGaRelStep_ModelElement_relRes() {
        return this.elt.getTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'GaRelStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6bcedfcf-fd38-4555-bd4e-2e93894ac9f5")
    public String getGaRelStep_ModelElement_resUnits() {
        return this.elt.getTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT);
    }

    @objid ("1a4497e8-210b-44f0-a035-5f8f4e56ca4e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'GaRelStep_ModelElement_relRes'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("89310ca4-1db9-4c1c-8c81-db90a46ef7eb")
    public void setGaRelStep_ModelElement_relRes(final String value) {
        this.elt.putTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'GaRelStep_ModelElement_resUnits'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("db78e410-2fb1-48a1-9e69-9355ad2ab717")
    public void setGaRelStep_ModelElement_resUnits(final String value) {
        this.elt.putTagValue(GaRelStepModelElement.MdaTypes.GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT, value);
    }

    @objid ("f3885a4d-4fe7-4e05-8f33-a5ab9f2521fe")
    protected GaRelStepModelElement(final ModelElement elt) {
        super(elt);
    }

    @objid ("f3d38296-f2c7-4d06-b617-2068354509c8")
    public static final class MdaTypes {
        @objid ("36ce07aa-da0f-4a88-a2ce-c3e181740330")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c741ae9e-0490-4f5e-87e6-2af640318d07")
        public static TagType GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT;

        @objid ("eb70008c-6d10-4b8d-8d47-24694091d488")
        public static TagType GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT;

        @objid ("a6a136a9-accd-4558-8195-fd7615e37672")
        private static Stereotype MDAASSOCDEP;

        @objid ("356f7bb8-29da-4700-a7ce-87018553a7d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f74012b-6997-4b5f-aa76-b33a9051c569")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03550caa-0ccf-11df-8525-001302895b2b");
            GARELSTEP_MODELELEMENT_RELRES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c339e-0ccf-11df-8525-001302895b2b");
            GARELSTEP_MODELELEMENT_RESUNITS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "035c339f-0ccf-11df-8525-001302895b2b");
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
