/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.lifeline.HwComponentLifeLine;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwCoolingSupply_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b813b3fe-6f6e-4dc4-b967-1e61564a5f39")
public class HwCoolingSupplyLifeline extends HwComponentLifeLine {
    @objid ("39c228c0-58a6-40fd-90b2-e8719f0fc55e")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Lifeline";

    @objid ("175c94b6-2236-40c6-8497-da5b80a8ce29")
    public static final String HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Lifeline_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("b8f704f1-e930-43a2-92ff-6d938f2c98f2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >> then instantiate a {@link HwCoolingSupplyLifeline} proxy.
     * 
     * @return a {@link HwCoolingSupplyLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("a0b812e1-8574-490f-9193-4913bcc13189")
    public static HwCoolingSupplyLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyLifeline.STEREOTYPE_NAME);
        return HwCoolingSupplyLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyLifeline} proxy from a {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwCoolingSupplyLifeline} proxy or <i>null</i>.
     */
    @objid ("03808185-76be-4251-86f0-ceb0eadf45bd")
    public static HwCoolingSupplyLifeline instantiate(final Lifeline obj) {
        return HwCoolingSupplyLifeline.canInstantiate(obj) ? new HwCoolingSupplyLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyLifeline} proxy from a {@link Lifeline} stereotyped << HwCoolingSupply_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwCoolingSupplyLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("502c29cf-7cb7-44b9-82fe-9b7bcf9d1da0")
    public static HwCoolingSupplyLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwCoolingSupplyLifeline.canInstantiate(obj))
        	return new HwCoolingSupplyLifeline(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7a0aec23-10ef-4cb4-bf4f-e062930ec3dc")
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
        HwCoolingSupplyLifeline other = (HwCoolingSupplyLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("b48416f3-d6f1-4ae6-a0b4-97aefa40d755")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Lifeline_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0d03171c-6940-4f2c-a081-0ba2b7055f8d")
    public String getHwCoolingSupply_Lifeline_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyLifeline.MdaTypes.HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("bf9d7f22-5a4a-46e9-8972-deecc67cc903")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Lifeline_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3fee6d98-8a51-4dd8-b7fe-c9b6ab33d95c")
    public void setHwCoolingSupply_Lifeline_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyLifeline.MdaTypes.HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("f7b05131-8c05-40d5-b40f-f8576c25a4fa")
    protected HwCoolingSupplyLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("16370288-53c8-4990-b14c-1554da9b2aa2")
    public static final class MdaTypes {
        @objid ("faa757da-462d-466c-9a27-283ef8c396b8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e71585a-baa2-41f6-8574-c743e6fcd0f2")
        public static TagType HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("31fbae46-01c7-42d2-aa6b-2cd7b5bcb834")
        private static Stereotype MDAASSOCDEP;

        @objid ("b13e2321-b66e-4c93-9624-7bb3f07f2b17")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a3d9a490-e46f-47d1-9a6f-92e755c06940")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f30d2627-10bd-11df-81d9-0014222a9f79");
            HWCOOLINGSUPPLY_LIFELINE_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f30d2628-10bd-11df-81d9-0014222a9f79");
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
