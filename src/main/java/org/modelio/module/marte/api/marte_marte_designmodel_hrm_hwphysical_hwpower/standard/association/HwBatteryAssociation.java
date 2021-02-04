/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwpower.standard.association;

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
@objid ("f64a7cdf-81ad-4754-b33f-3b3b7cac14cd")
public class HwBatteryAssociation extends HwPowerSupplyAssociation {
    @objid ("76bfb6a5-aa59-4669-b75b-57482890d219")
    public static final String STEREOTYPE_NAME = "HwBattery_Association";

    @objid ("f938e5db-3593-4728-9d64-9394c15b56b7")
    public static final String HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE = "HwBattery_Association_capacity";

    /**
     * Tells whether a {@link HwBatteryAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBattery_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a26faedd-de53-45e0-8dd3-e340e1700a7c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBattery_Association >> then instantiate a {@link HwBatteryAssociation} proxy.
     * 
     * @return a {@link HwBatteryAssociation} proxy on the created {@link Association}.
     */
    @objid ("ab9b6032-ae1d-47e6-b51a-dd8d09546724")
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
    @objid ("e3efb5df-d15d-42d8-9b5a-e36e2fe7be49")
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
    @objid ("ddc11f7f-4899-47c4-9fd2-8dc220d6802d")
    public static HwBatteryAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBatteryAssociation.canInstantiate(obj))
        	return new HwBatteryAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBatteryAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("df0c37a3-0567-41c2-a00e-9468cc6e5424")
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
    @objid ("c6224737-feef-46bf-87aa-2abddead930c")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e2b29a31-0d4f-453e-9ec6-48c2bb1704f8")
    public String getHwBattery_Association_capacity() {
        return this.elt.getTagValue(HwBatteryAssociation.MdaTypes.HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("5fdb74b8-1314-4bdf-bfd9-df16cad0a29c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2453e3b0-cd3d-4dd3-ae3b-71cc46310c3a")
    public void setHwBattery_Association_capacity(final String value) {
        this.elt.putTagValue(HwBatteryAssociation.MdaTypes.HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("a646e4bd-6fb8-4603-ae1a-3e0b29880aee")
    protected HwBatteryAssociation(final Association elt) {
        super(elt);
    }

    @objid ("9086dd1c-157e-4d9d-bc7e-09e61d26ae41")
    public static final class MdaTypes {
        @objid ("ae63efbc-9bfe-4ae2-ac16-63d180d91e60")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2ab784b5-ad94-4dac-ab12-964b9badf2d7")
        public static TagType HWBATTERY_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("af687596-3035-4610-8491-49a34b1d701f")
        private static Stereotype MDAASSOCDEP;

        @objid ("7551c8eb-dee8-452a-b731-3555ca4a8d3a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0abc616c-f374-4ba5-844f-0fd9e150ab1e")
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
