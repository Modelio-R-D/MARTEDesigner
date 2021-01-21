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
 * Proxy class to handle a {@link AssociationEnd} with << HwPowerSupply_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f071c8ee-4a4a-4086-948a-0b795fc0c8ed")
public class HwPowerSupplyAssociationEnd extends HwComponentAssociationEnd {
    @objid ("2efe709f-6f6f-46d7-8130-d7c3f2637d1c")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_AssociationEnd";

    @objid ("966671c1-0484-4629-88a4-f2a689f6c044")
    public static final String HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY_TAGTYPE = "HwPowerSupply_AssociationEnd_capacity";

    @objid ("33dea6ca-c35f-47d8-a264-6f35c5bc6d92")
    public static final String HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_AssociationEnd_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwPowerSupply_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("688e0cea-9351-4d63-9bc2-81a4ead1cb1f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwPowerSupply_AssociationEnd >> then instantiate a {@link HwPowerSupplyAssociationEnd} proxy.
     * 
     * @return a {@link HwPowerSupplyAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("40cdd587-9b49-4886-82fb-0d6fa5ece54e")
    public static HwPowerSupplyAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAssociationEnd.STEREOTYPE_NAME);
        return HwPowerSupplyAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwPowerSupply_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwPowerSupplyAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("5b2e0d68-e487-48d4-ab61-7821e5ef5f7b")
    public static HwPowerSupplyAssociationEnd instantiate(final AssociationEnd obj) {
        return HwPowerSupplyAssociationEnd.canInstantiate(obj) ? new HwPowerSupplyAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwPowerSupply_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwPowerSupplyAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1ca23349-ddec-4a48-a039-dc93f1013218")
    public static HwPowerSupplyAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwPowerSupplyAssociationEnd.canInstantiate(obj))
        	return new HwPowerSupplyAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("788e54fc-42f1-4463-b793-c1cc4b16b324")
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
        HwPowerSupplyAssociationEnd other = (HwPowerSupplyAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("6d18ef48-75f7-40d8-a5fc-6f177762ec12")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1d457aa-9d9b-4b75-b8a5-a27a4def2c77")
    public String getHwPowerSupply_AssociationEnd_capacity() {
        return this.elt.getTagValue(HwPowerSupplyAssociationEnd.MdaTypes.HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_AssociationEnd_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f1ed583e-ae3e-4c1a-99b6-c7ec4fe62181")
    public String getHwPowerSupply_AssociationEnd_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyAssociationEnd.MdaTypes.HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("f9230093-ca8c-4366-8149-44ea3ad598a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("68381518-ec54-4eff-8ab4-de5db33c359f")
    public void setHwPowerSupply_AssociationEnd_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyAssociationEnd.MdaTypes.HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_AssociationEnd_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("cbff7030-bff8-40e2-8ba8-a183b065fefa")
    public void setHwPowerSupply_AssociationEnd_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyAssociationEnd.MdaTypes.HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("83131936-cc38-4835-9116-2ed5c23b2251")
    protected HwPowerSupplyAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("bd40fb4a-1212-4db3-939c-ac8ce7498e4f")
    public static final class MdaTypes {
        @objid ("bb6cda3d-b2e4-42a4-bc05-f28628d765ab")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("542824e7-90be-4d7c-8017-4da463096f9c")
        public static TagType HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("b474118f-1f58-4fdc-9685-076454bea7fb")
        public static TagType HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("05b83e3a-bda1-4298-a272-a7e97be64eba")
        private static Stereotype MDAASSOCDEP;

        @objid ("6f340374-6324-4d28-9649-7f817a1a2b27")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ff0ba9a7-488d-45a1-b564-799b5fa83d64")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0192761f-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_ASSOCIATIONEND_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01927626-0ccf-11df-8525-001302895b2b");
            HWPOWERSUPPLY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0192762d-0ccf-11df-8525-001302895b2b");
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
