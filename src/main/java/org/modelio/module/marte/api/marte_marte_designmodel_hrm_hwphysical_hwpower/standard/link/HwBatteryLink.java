/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.link;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwBatteryLink extends HwPowerSupplyLink {
    public static final String STEREOTYPE_NAME = "HwBattery_Link";

    public static final String HWBATTERY_LINK_CAPACITY_TAGTYPE = "HwBattery_Link_capacity";

    /**
     * Tells whether a {@link HwBatteryLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwBattery_Link >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwBattery_Link >> then instantiate a {@link HwBatteryLink} proxy.
     * 
     * @return a {@link HwBatteryLink} proxy on the created {@link Link}.
     */
    public static HwBatteryLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryLink.STEREOTYPE_NAME);
        return HwBatteryLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryLink} proxy from a {@link Link} stereotyped << HwBattery_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwBatteryLink} proxy or <i>null</i>.
     */
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
    public static HwBatteryLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwBatteryLink.canInstantiate(obj))
        	return new HwBatteryLink(obj);
        else
        	throw new IllegalArgumentException("HwBatteryLink: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBatteryLink other = (HwBatteryLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBattery_Link_capacity() {
        return this.elt.getTagValue(HwBatteryLink.MdaTypes.HWBATTERY_LINK_CAPACITY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBattery_Link_capacity(final String value) {
        this.elt.putTagValue(HwBatteryLink.MdaTypes.HWBATTERY_LINK_CAPACITY_TAGTYPE_ELT, value);
    }

    protected HwBatteryLink(final Link elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBATTERY_LINK_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
