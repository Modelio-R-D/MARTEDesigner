/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.association.HwComponentAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwCoolingSupply_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwCoolingSupplyAssociation extends HwComponentAssociation {
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Association";

    public static final String HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Association_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwCoolingSupply_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwCoolingSupply_Association >> then instantiate a {@link HwCoolingSupplyAssociation} proxy.
     * 
     * @return a {@link HwCoolingSupplyAssociation} proxy on the created {@link Association}.
     */
    public static HwCoolingSupplyAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociation.STEREOTYPE_NAME);
        return HwCoolingSupplyAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAssociation} proxy from a {@link Association} stereotyped << HwCoolingSupply_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwCoolingSupplyAssociation} proxy or <i>null</i>.
     */
    public static HwCoolingSupplyAssociation instantiate(final Association obj) {
        return HwCoolingSupplyAssociation.canInstantiate(obj) ? new HwCoolingSupplyAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAssociation} proxy from a {@link Association} stereotyped << HwCoolingSupply_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwCoolingSupplyAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwCoolingSupplyAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwCoolingSupplyAssociation.canInstantiate(obj))
        	return new HwCoolingSupplyAssociation(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwCoolingSupplyAssociation other = (HwCoolingSupplyAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Association_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwCoolingSupply_Association_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyAssociation.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Association_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwCoolingSupply_Association_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyAssociation.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    protected HwCoolingSupplyAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "f2f089d7-10bd-11df-81d9-0014222a9f79");
            HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f2f089d8-10bd-11df-81d9-0014222a9f79");
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
