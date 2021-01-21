/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
    @objid ("564f298e-e7b8-475b-9e26-799070878c28")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_Association";

    @objid ("b0c17cf3-40d5-4d0d-8243-0b1693417eac")
    public static final String HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_Association_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwCoolingSupply_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9454314a-b926-4743-aceb-06c0fe22ddd9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwCoolingSupply_Association >> then instantiate a {@link HwCoolingSupplyAssociation} proxy.
     * 
     * @return a {@link HwCoolingSupplyAssociation} proxy on the created {@link Association}.
     */
    @objid ("0e32b973-b6e1-4f14-86aa-8dbca3324ba6")
    public static HwCoolingSupplyAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociation.STEREOTYPE_NAME);
        return HwCoolingSupplyAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAssociation} proxy from a {@link Association} stereotyped << HwCoolingSupply_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwCoolingSupplyAssociation} proxy or <i>null</i>.
     */
    @objid ("b5d1be87-712a-4f40-ae8a-ce90c6aad336")
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
    @objid ("19dbabbc-dbaa-43f0-a89b-39faef6c766c")
    public static HwCoolingSupplyAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwCoolingSupplyAssociation.canInstantiate(obj))
        	return new HwCoolingSupplyAssociation(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f98841ba-63bc-42d8-8685-f11bf290b4b0")
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
    @objid ("abf84722-364d-4c80-9a5e-945506f0f1e5")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_Association_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("969c4225-ee0a-4174-8431-63126898f1a3")
    public String getHwCoolingSupply_Association_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyAssociation.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("21e675bf-fab3-4f1e-9619-d0b15d6fd790")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_Association_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5d4095ca-33f5-44d5-a505-4cc491364534")
    public void setHwCoolingSupply_Association_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyAssociation.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("c03b42d1-eab0-490b-aaed-c8844726746b")
    protected HwCoolingSupplyAssociation(final Association elt) {
        super(elt);
    }

    @objid ("45458019-686a-4a0e-9ce3-5ac3ea352f31")
    public static final class MdaTypes {
        @objid ("328fe3f9-4814-49b8-8e6f-36f09806d495")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f6c7365-4d41-44fa-9d0b-36ec21a3d88e")
        public static TagType HWCOOLINGSUPPLY_ASSOCIATION_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("c2f82722-853e-4227-bfaa-fb150e7226d8")
        private static Stereotype MDAASSOCDEP;

        @objid ("a2ce1152-3211-42b3-8e85-e9078eb289a3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30112d90-f8e2-4aba-a1b2-d6898416e94e")
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
