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
 * Proxy class to handle a {@link Association} with << HwPowerSupply_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("127781d2-1eae-4c61-8600-1a00e2ad4fc0")
public class HwPowerSupplyAssociation extends HwComponentAssociation {
    @objid ("11914535-eecd-4d7e-a1e7-e0a8b4598870")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Association";

    @objid ("8a166401-8ef8-4b6c-81a8-a0fb4850abb6")
    public static final String HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE = "HwPowerSupply_Association_capacity";

    @objid ("5b7d06f5-887c-4a8f-9485-bf75fe370e40")
    public static final String HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Association_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwPowerSupply_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("11587cad-2450-499a-8888-1a4f7da042d7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwPowerSupply_Association >> then instantiate a {@link HwPowerSupplyAssociation} proxy.
     * 
     * @return a {@link HwPowerSupplyAssociation} proxy on the created {@link Association}.
     */
    @objid ("ee40539c-0c39-4a6d-9b2d-e0a2ce05a50f")
    public static HwPowerSupplyAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAssociation.STEREOTYPE_NAME);
        return HwPowerSupplyAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAssociation} proxy from a {@link Association} stereotyped << HwPowerSupply_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwPowerSupplyAssociation} proxy or <i>null</i>.
     */
    @objid ("3f3f1220-7446-4847-97b4-6d5e2ead3a9b")
    public static HwPowerSupplyAssociation instantiate(final Association obj) {
        return HwPowerSupplyAssociation.canInstantiate(obj) ? new HwPowerSupplyAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAssociation} proxy from a {@link Association} stereotyped << HwPowerSupply_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwPowerSupplyAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("87f28dc2-c6c3-4ac6-a377-3cab42ed0e84")
    public static HwPowerSupplyAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwPowerSupplyAssociation.canInstantiate(obj))
        	return new HwPowerSupplyAssociation(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bc4ec62c-c6a5-42bb-ad7c-23cd5629293d")
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
        HwPowerSupplyAssociation other = (HwPowerSupplyAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("d63103df-00ea-48b2-8aef-f596478e9ce2")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fef12b91-4488-4586-8cd8-ca693aea8461")
    public String getHwPowerSupply_Association_capacity() {
        return this.elt.getTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Association_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("122d452a-4be1-4813-ad25-4ad010580b83")
    public String getHwPowerSupply_Association_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("50046f47-9c07-4c5a-83be-466e0ef68945")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1eb595b8-f7e3-4c8f-a95e-0a462525c63c")
    public void setHwPowerSupply_Association_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Association_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1703abd4-5403-4112-ba92-2f720d21eba7")
    public void setHwPowerSupply_Association_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("f7f3ba29-9e48-4a34-ac2d-e4b0da3839dd")
    protected HwPowerSupplyAssociation(final Association elt) {
        super(elt);
    }

    @objid ("ebfe0ad0-69ce-458a-af95-8c0b3290dd8d")
    public static final class MdaTypes {
        @objid ("5d76f95e-f4eb-40f2-931c-9be2d7f04a09")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("22cc3568-3272-4e57-9688-d2a9ee98a236")
        public static TagType HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("c12c2ade-3b2a-4e0e-88ba-d829930df2c7")
        public static TagType HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("89f05978-5fb0-474f-96c6-44c7b527c8da")
        private static Stereotype MDAASSOCDEP;

        @objid ("cb020b9b-8e2d-46ed-bc75-d43847fb2d7a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("caedd528-26a6-45cc-a05b-1426ead8f83a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c0e88747-10bd-11df-81d9-0014222a9f79");
            HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c0e88749-10bd-11df-81d9-0014222a9f79");
            HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c0e88748-10bd-11df-81d9-0014222a9f79");
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
