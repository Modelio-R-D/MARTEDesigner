/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.associationend.HwComponentAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwCoolingSupply_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCoolingSupplyAssociationEnd extends HwComponentAssociationEnd {
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_AssociationEnd";

    public static final String HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_AssociationEnd_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwCoolingSupply_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwCoolingSupply_AssociationEnd >> then instantiate a {@link HwCoolingSupplyAssociationEnd} proxy.
     * 
     * @return a {@link HwCoolingSupplyAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    public static HwCoolingSupplyAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociationEnd.STEREOTYPE_NAME);
        return HwCoolingSupplyAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCoolingSupply_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwCoolingSupplyAssociationEnd} proxy or <i>null</i>.
     */
    public static HwCoolingSupplyAssociationEnd instantiate(final AssociationEnd obj) {
        return HwCoolingSupplyAssociationEnd.canInstantiate(obj) ? new HwCoolingSupplyAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCoolingSupply_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwCoolingSupplyAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCoolingSupplyAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwCoolingSupplyAssociationEnd.canInstantiate(obj))
        	return new HwCoolingSupplyAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCoolingSupplyAssociationEnd other = (HwCoolingSupplyAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_AssociationEnd_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCoolingSupply_AssociationEnd_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyAssociationEnd.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_AssociationEnd_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCoolingSupply_AssociationEnd_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyAssociationEnd.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    protected HwCoolingSupplyAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01973ac3-0ccf-11df-8525-001302895b2b");
            HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01973aca-0ccf-11df-8525-001302895b2b");
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
