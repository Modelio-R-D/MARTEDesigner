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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.association.HwComponentAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwCoolingSupply_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("a4291de1-cb70-42cd-b4dc-a3bdbbdd1d28")
public class HwCoolingSupplyAssociation extends HwComponentAssociation {
    @objid ("ba53280b-2832-43ca-b4cc-33077c8d16fd")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Association";

    @objid ("1f92f7b1-2d34-4376-b409-47699e94d23b")
    public static final String HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Association_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwCoolingSupply_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("22d5e4be-0f69-4275-bced-227ca761be8a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwCoolingSupply_Association >> then instantiate a {@link HwCoolingSupplyAssociation} proxy.
     * 
     * @return a {@link HwCoolingSupplyAssociation} proxy on the created {@link Association}.
     */
    @objid ("9992bf66-09cd-4150-8aef-a68d39846733")
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
    @objid ("b46ac386-46df-4f76-96ab-413a2269e60c")
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
    @objid ("cf1c637c-1de8-4210-a29b-6806a8606645")
    public static HwCoolingSupplyAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwCoolingSupplyAssociation.canInstantiate(obj))
        	return new HwCoolingSupplyAssociation(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3ea3e7c8-1bb8-4801-9aa2-b57bd42ebb37")
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
    @objid ("832b5623-02d3-4bb4-b894-546fa81d5951")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Association_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b38864e7-f441-4159-842d-eac13e8b9d5a")
    public String getHwCoolingSupply_Association_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyAssociation.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("bcdf6f7b-73a3-4d76-b74d-4d9d739df4b0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Association_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d5d3364e-cf12-4a59-a78d-3e28d0e50018")
    public void setHwCoolingSupply_Association_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyAssociation.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("26882341-dae6-44aa-9d97-660250d6688f")
    protected HwCoolingSupplyAssociation(final Association elt) {
        super(elt);
    }

    @objid ("45458019-686a-4a0e-9ce3-5ac3ea352f31")
    public static final class MdaTypes {
        @objid ("1cf44475-9485-4e94-94f3-550a170dd31e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("46bae0e4-9bcf-4db0-a5d5-a234fd864b20")
        public static TagType HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("41dace4d-1157-45ad-8971-fa458de64541")
        private static Stereotype MDAASSOCDEP;

        @objid ("733694bf-3bdb-4ee5-ab98-10350f3da96d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f8fad450-e497-41bf-8a8a-48085af5bf56")
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
