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
 * Proxy class to handle a {@link Link} with << HwPowerSupply_Link >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("151f0b0e-9ae2-47b8-8e8f-6ab7961cfbb0")
public class HwPowerSupplyLink extends HwComponentLink {
    @objid ("f07c3a37-347a-4053-a255-5ef1d684b640")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Link";

    @objid ("560c6681-4d97-407a-9171-903aec088a84")
    public static final String HWPOWERSUPPLY_LINK_CAPACITY_TAGTYPE = "HwPowerSupply_Link_capacity";

    @objid ("6451cf37-9dc9-47a1-a0c8-0f93b44d3112")
    public static final String HWPOWERSUPPLY_LINK_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Link_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyLink proxy} can be instantiated from a {@link MObject} checking it is a {@link Link} stereotyped << HwPowerSupply_Link >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("81b0b8c6-cf03-4d03-a236-fc288413ea57")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Link) && ((Link) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyLink.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Link} stereotyped << HwPowerSupply_Link >> then instantiate a {@link HwPowerSupplyLink} proxy.
     * 
     * @return a {@link HwPowerSupplyLink} proxy on the created {@link Link}.
     */
    @objid ("d83b03ec-97c3-4e51-8d87-a0ac1f3c9121")
    public static HwPowerSupplyLink create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Link");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyLink.STEREOTYPE_NAME);
        return HwPowerSupplyLink.instantiate((Link)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyLink} proxy from a {@link Link} stereotyped << HwPowerSupply_Link >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Link
     * @return a {@link HwPowerSupplyLink} proxy or <i>null</i>.
     */
    @objid ("87fa2428-a7d4-47fa-83d4-d667a45a7134")
    public static HwPowerSupplyLink instantiate(final Link obj) {
        return HwPowerSupplyLink.canInstantiate(obj) ? new HwPowerSupplyLink(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyLink} proxy from a {@link Link} stereotyped << HwPowerSupply_Link >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Link}
     * @return a {@link HwPowerSupplyLink} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("de202a87-1332-4656-b83d-5fc9437eb97f")
    public static HwPowerSupplyLink safeInstantiate(final Link obj) throws IllegalArgumentException {
        if (HwPowerSupplyLink.canInstantiate(obj))
        	return new HwPowerSupplyLink(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyLink: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7f138d1b-b945-4b6f-9d4d-32ac222f069c")
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
        HwPowerSupplyLink other = (HwPowerSupplyLink) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Link}. 
     * @return the Link represented by this proxy, never null.
     */
    @objid ("aee918df-78fa-4de0-be3e-bb707b3d0eb1")
    @Override
    public Link getElement() {
        return (Link)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f383ec66-3c01-4903-826a-996b21e88859")
    public String getHwPowerSupply_Link_capacity() {
        return this.elt.getTagValue(HwPowerSupplyLink.MdaTypes.HWPOWERSUPPLY_LINK_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Link_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5c88e70d-6836-4a7e-a637-d6ecf8fabd6a")
    public String getHwPowerSupply_Link_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyLink.MdaTypes.HWPOWERSUPPLY_LINK_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("2b249d74-8624-4dea-9152-dadfd47de9ae")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Link_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a0ea1b9-bcff-43cd-9bc1-99ca2568a487")
    public void setHwPowerSupply_Link_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyLink.MdaTypes.HWPOWERSUPPLY_LINK_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Link_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b35e1f08-cd95-4e6c-8be8-a3e85e79f95f")
    public void setHwPowerSupply_Link_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyLink.MdaTypes.HWPOWERSUPPLY_LINK_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("a8c2a485-303d-4475-a8b7-64867ed5407f")
    protected HwPowerSupplyLink(final Link elt) {
        super(elt);
    }

    @objid ("6e321b9f-c284-4a0d-91c5-4af9c36e0227")
    public static final class MdaTypes {
        @objid ("584add33-4094-4452-9ee8-7e966bd7150f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("687e3553-cbf9-4fa9-9ea0-63e7f15f9c72")
        public static TagType HWPOWERSUPPLY_LINK_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("476df28d-4b52-4fc7-b6a9-c28b43f791d3")
        public static TagType HWPOWERSUPPLY_LINK_CAPACITY_TAGTYPE_ELT;

        @objid ("2163eacd-9095-44d8-9e84-7eb8de032539")
        private static Stereotype MDAASSOCDEP;

        @objid ("e35e062d-8a45-4bb3-bf58-0b9bc08005c4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("190c232c-efd5-40e3-99e8-d31aaa8c9430")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01927623-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_LINK_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0192762a-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_LINK_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01927631-0ccf-11df-8525-001302895b2b");
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
