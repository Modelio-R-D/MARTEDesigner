/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link;

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
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.link.HwComponentLink;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwCoolingSupply_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c92413c8-922d-4ae0-bb0f-647eb81afd90")
public class HwCoolingSupplyLink extends HwComponentLink {
    @objid ("0fd5675e-a6e0-48ac-b8c9-6f985f9b44bc")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Link";

    @objid ("ce65f983-4100-4d5d-a337-8f6a01ef0700")
    public static final String HWCOOLINGSUPPLY_LINK_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Link_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwCoolingSupply_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0c76253e-bc42-49d6-b2a2-42749b3e546b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwCoolingSupply_Link >> then instantiate a {@link HwCoolingSupplyLink} proxy.
     * 
     * @return a {@link HwCoolingSupplyLink} proxy on the created {@link Link}.
     */
    @objid ("eccbb20e-7eaf-4541-8102-d77f858e54ec")
    public static HwCoolingSupplyLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyLink.STEREOTYPE_NAME);
        return HwCoolingSupplyLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyLink} proxy from a {@link Link} stereotyped << HwCoolingSupply_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwCoolingSupplyLink} proxy or <i>null</i>.
     */
    @objid ("d89e493a-6f9d-46e9-9f75-88da4eed04f9")
    public static HwCoolingSupplyLink instantiate(final Link obj) {
        return HwCoolingSupplyLink.canInstantiate(obj) ? new HwCoolingSupplyLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyLink} proxy from a {@link Link} stereotyped << HwCoolingSupply_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwCoolingSupplyLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0c2cfade-e7bf-4db0-aabd-434f76969a27")
    public static HwCoolingSupplyLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwCoolingSupplyLink.canInstantiate(obj))
        	return new HwCoolingSupplyLink(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7881f122-0d4c-40b2-9996-0f86635ee831")
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
        HwCoolingSupplyLink other = (HwCoolingSupplyLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("50f9bced-8220-4fe8-a6da-453ddac3fe58")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Link_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be7bad5e-5954-4354-a804-0761938940c0")
    public String getHwCoolingSupply_Link_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyLink.MdaTypes.HWCOOLINGSUPPLY_LINK_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("24a14b92-bec8-4262-b46c-0400a93e261b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Link_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f57e313c-c4e9-4a79-a18a-fc31e56eb608")
    public void setHwCoolingSupply_Link_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyLink.MdaTypes.HWCOOLINGSUPPLY_LINK_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("51c7600f-68fd-4e99-8c25-33a85629a24e")
    protected HwCoolingSupplyLink(final Link elt) {
        super(elt);
    }

    @objid ("986ecb74-a0f9-4efd-97b6-c2e5fea77128")
    public static final class MdaTypes {
        @objid ("b20a22bf-6e05-47cb-ad8a-05a6e3a77e86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32083b25-7edd-4a30-ad92-ad99d73dc254")
        public static TagType HWCOOLINGSUPPLY_LINK_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("96e4fa66-e610-42d2-8cd2-be7cb3324e85")
        private static Stereotype MDAASSOCDEP;

        @objid ("3469b491-f918-4214-bae5-1323c918ecc9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bf49756f-f2de-4dd4-bac3-e3a68a3e0a26")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01973ac7-0ccf-11df-8525-001302895b2b");
            HWCOOLINGSUPPLY_LINK_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01973ace-0ccf-11df-8525-001302895b2b");
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
