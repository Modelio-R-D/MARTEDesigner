/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwphysical_hwlayout.standard.associationend.HwComponentAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwCoolingSupply_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ec95cefe-0ca1-4b83-8735-47c9d8c63d6e")
public class HwCoolingSupplyAssociationEnd extends HwComponentAssociationEnd {
    @objid ("acde3600-fe7f-450e-b55d-f3b7052e3a62")
    public static final String STEREOTYPE_NAME = "HwCoolingSupply_AssociationEnd";

    @objid ("dbfa6643-0a53-44e5-9869-204c78d8f6c8")
    public static final String HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE = "HwCoolingSupply_AssociationEnd_coolingPower";

    /**
     * Tells whether a {@link HwCoolingSupplyAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwCoolingSupply_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e6bd62a7-cd1e-4953-b8f0-25574e96a2cc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwCoolingSupply_AssociationEnd >> then instantiate a {@link HwCoolingSupplyAssociationEnd} proxy.
     * 
     * @return a {@link HwCoolingSupplyAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("d2785c1d-058c-44e5-8d87-8fe6da171366")
    public static HwCoolingSupplyAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCoolingSupplyAssociationEnd.STEREOTYPE_NAME);
        return HwCoolingSupplyAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwCoolingSupplyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwCoolingSupply_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwCoolingSupplyAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("5770e4c9-46ff-4429-ae4b-9c1d8f9f56e8")
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
    @objid ("e7a57052-0dc5-4b58-bfd7-6bf66f02d2a1")
    public static HwCoolingSupplyAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwCoolingSupplyAssociationEnd.canInstantiate(obj))
        	return new HwCoolingSupplyAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwCoolingSupplyAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e09677b0-8395-47f0-af40-581a8ad998cb")
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
    @objid ("6a5c9541-8cdd-4e1c-adbb-86ebfbc30b73")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwCoolingSupply_AssociationEnd_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("916de47b-2f22-481a-b3e5-f8491387aca3")
    public String getHwCoolingSupply_AssociationEnd_coolingPower() {
        return this.elt.getTagValue(HwCoolingSupplyAssociationEnd.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE_ELT);
    }

    @objid ("00fd5ce6-e8b8-415a-a444-f0089525a2fe")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwCoolingSupply_AssociationEnd_coolingPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("12b42293-3ecc-4bff-928e-62550a08383c")
    public void setHwCoolingSupply_AssociationEnd_coolingPower(final String value) {
        this.elt.putTagValue(HwCoolingSupplyAssociationEnd.MdaTypes.HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE_ELT, value);
    }

    @objid ("0fe9bf2b-94ae-4e0a-854f-ce2cc049cc26")
    protected HwCoolingSupplyAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("1dada9fd-f4fb-4d3e-949f-2acb5933ea77")
    public static final class MdaTypes {
        @objid ("43954413-f0c6-4453-92c8-0bae43f07b07")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("eebcb36d-3998-481c-b62e-2fdf9cae8753")
        public static TagType HWCOOLINGSUPPLY_ASSOCIATIONEND_COOLINGPOWER_TAGTYPE_ELT;

        @objid ("878f3d17-4026-4f66-a2de-12f0f4a2aa69")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a8f0cd3-3a75-4b0f-b657-b6e4b8a52023")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6ab6b6e6-06d2-4c2f-b7a9-4c1f985b1272")
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
