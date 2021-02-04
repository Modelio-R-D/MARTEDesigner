/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.associationend;

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
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwBattery_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c716a11a-7ba4-47f0-a6dd-65389de51db4")
public class HwBatteryAssociationEnd extends HwPowerSupplyAssociationEnd {
    @objid ("91473752-9bd6-4850-a1f8-bf9220c86635")
    public static final String STEREOTYPE_NAME = "HwBattery_AssociationEnd";

    @objid ("d9f1db67-8fe7-4fb1-a16f-387c6b129e86")
    public static final String HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE = "HwBattery_AssociationEnd_capacity";

    /**
     * Tells whether a {@link HwBatteryAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBattery_AssociationEnd >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6d7c58fd-8785-459e-b47a-a9865a192c03")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBattery_AssociationEnd >> then instantiate a {@link HwBatteryAssociationEnd} proxy.
     * 
     * @return a {@link HwBatteryAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("f2d16ac5-c5f1-4d54-8d45-97c281a19790")
    public static HwBatteryAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociationEnd.STEREOTYPE_NAME);
        return HwBatteryAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBattery_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBatteryAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("e1f2315a-c4d1-428a-9f9b-268a86631a38")
    public static HwBatteryAssociationEnd instantiate(final AssociationEnd obj) {
        return HwBatteryAssociationEnd.canInstantiate(obj) ? new HwBatteryAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBatteryAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBattery_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwBatteryAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9e982e6f-d123-4eb0-8975-080234344ecf")
    public static HwBatteryAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBatteryAssociationEnd.canInstantiate(obj))
        	return new HwBatteryAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBatteryAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ffc97bfc-5208-4160-b4ac-a8d25f21ff0f")
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
        HwBatteryAssociationEnd other = (HwBatteryAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("e95b16fe-36c3-47b6-8dc9-b117e588ce77")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d5de574-a18f-4fc0-bc83-c36a6b8ed535")
    public String getHwBattery_AssociationEnd_capacity() {
        return this.elt.getTagValue(HwBatteryAssociationEnd.MdaTypes.HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("099ca472-6661-4e3c-8f2c-98d906b44c63")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7e3a2c78-9b45-491a-9c29-83dc07c3565d")
    public void setHwBattery_AssociationEnd_capacity(final String value) {
        this.elt.putTagValue(HwBatteryAssociationEnd.MdaTypes.HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("a8ab925c-10c0-4bbc-9481-45657a85ecf0")
    protected HwBatteryAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("398448b7-0516-482d-bfbf-c47ec1763241")
    public static final class MdaTypes {
        @objid ("8fb512f8-74f2-472f-8adb-7874ec4958b0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("95ac1b45-cc99-47b0-9047-260705623af0")
        public static TagType HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("1a494513-87d1-4c55-9c28-083ac86fd0e3")
        private static Stereotype MDAASSOCDEP;

        @objid ("e67af8d6-20a6-464a-803b-86fcaaf56d4d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b88d1382-a390-4cf0-9b93-9283f491d72c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "563acf1b-c7b2-11df-ad39-001302895b2b");
            HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "563acf24-c7b2-11df-ad39-001302895b2b");
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
