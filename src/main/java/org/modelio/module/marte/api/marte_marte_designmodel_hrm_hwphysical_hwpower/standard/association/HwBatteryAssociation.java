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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwBattery_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwBatteryAssociation extends HwPowerSupplyAssociation {
    public static final String STEREOTYPE_NAME = "HwBattery_Association";

    public static final String HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE = "HwBattery_Association_capacity";

    /**
     * Tells whether a {@link HwBatteryAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBattery_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBattery_Association >> then instantiate a {@link HwBatteryAssociation} proxy.
     * 
     * @return a {@link HwBatteryAssociation} proxy on the created {@link Association}.
     */
    public static HwBatteryAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociation.STEREOTYPE_NAME);
        return HwBatteryAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryAssociation} proxy from a {@link Association} stereotyped << HwBattery_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwBatteryAssociation} proxy or <i>null</i>.
     */
    public static HwBatteryAssociation instantiate(final Association obj) {
        return HwBatteryAssociation.canInstantiate(obj) ? new HwBatteryAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryAssociation} proxy from a {@link Association} stereotyped << HwBattery_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwBatteryAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwBatteryAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBatteryAssociation.canInstantiate(obj))
        	return new HwBatteryAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBatteryAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwBatteryAssociation other = (HwBatteryAssociation) obj;
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
     * Getter for string property 'HwBattery_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBattery_Association_capacity() {
        return this.elt.getTagValue(HwBatteryAssociation.MdaTypes.HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBattery_Association_capacity(final String value) {
        this.elt.putTagValue(HwBatteryAssociation.MdaTypes.HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    protected HwBatteryAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf1e-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563acf2a-c7b2-11df-ad39-001302895b2b");
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
