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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Link} with << HwBattery_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("2f5048a9-9d9e-4560-83b7-a6a395c26fa2")
public class HwBatteryLink extends HwPowerSupplyLink {
    @objid ("86b6bbb6-046f-4628-9853-49e20187397d")
    public static final String STEREOTYPE_NAME = "HwBattery_Link";

    @objid ("16b0162b-4809-4997-9d22-6b6865af521e")
    public static final String HWBATTERY_LINK_CAPACITY_TAGTYPE = "HwBattery_Link_capacity";

    /**
     * Tells whether a {@link HwBatteryLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwBattery_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("8dd0cb83-e39e-497b-9720-e6c70e5fd056")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwBattery_Link >> then instantiate a {@link HwBatteryLink} proxy.
     * 
     * @return a {@link HwBatteryLink} proxy on the created {@link Link}.
     */
    @objid ("4bdb5c4e-8b00-4764-bcc9-769a68012517")
    public static HwBatteryLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryLink.STEREOTYPE_NAME);
        return HwBatteryLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryLink} proxy from a {@link Link} stereotyped << HwBattery_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwBatteryLink} proxy or <i>null</i>.
     */
    @objid ("2a869022-16b9-48a2-b025-4b492d86bfc1")
    public static HwBatteryLink instantiate(final Link obj) {
        return HwBatteryLink.canInstantiate(obj) ? new HwBatteryLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryLink} proxy from a {@link Link} stereotyped << HwBattery_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwBatteryLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ff361936-05bf-433c-a1c1-df8384616bd5")
    public static HwBatteryLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwBatteryLink.canInstantiate(obj))
        	return new HwBatteryLink(obj);
        else
        	throw new IllegalArgumentException("HwBatteryLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("553d5f9e-c64d-4753-a6a0-1b03fa7f5aa6")
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
        HwBatteryLink other = (HwBatteryLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("c1375318-6ecc-47b3-b685-cc784943b7e4")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a4c7efd0-2ad2-46de-a167-3985c9309517")
    public String getHwBattery_Link_capacity() {
        return this.elt.getTagValue(HwBatteryLink.MdaTypes.HWBATTERY_LINK_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("c4319699-2c85-40d5-a1e1-f051fb65cddc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6e950dae-1cf4-4fbb-af32-307312783d9f")
    public void setHwBattery_Link_capacity(final String value) {
        this.elt.putTagValue(HwBatteryLink.MdaTypes.HWBATTERY_LINK_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("9434a496-e840-428c-ba4b-87e05ce38e53")
    protected HwBatteryLink(final Link elt) {
        super(elt);
    }

    @objid ("9031f538-434d-4ff1-8ab4-962f41f25201")
    public static final class MdaTypes {
        @objid ("b715156c-76d2-4823-bc16-b6dbaaf74343")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e849e3b2-c084-4130-9d8b-1907ac25b114")
        public static TagType HWBATTERY_LINK_CAPACITY_TAGTYPE_ELT;

        @objid ("a495170a-d14a-49bb-b72e-4d2da7013ba3")
        private static Stereotype MDAASSOCDEP;

        @objid ("0c105a5e-13b6-4679-a39c-f8c4ac9416cd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f9bc16eb-5a42-4f0b-89fc-df75ba910013")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf21-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_LINK_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563d3178-c7b2-11df-ad39-001302895b2b");
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
