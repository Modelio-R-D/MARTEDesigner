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
 * Proxy class to handle a {@link Association} with << HwPowerSupply_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("127781d2-1eae-4c61-8600-1a00e2ad4fc0")
public class HwPowerSupplyAssociation extends HwComponentAssociation {
    @objid ("5fc0c514-a9e3-4cde-8c50-cc4048951668")
    public static final String STEREOTYPE_NAME = "HwPowerSupply_Association";

    @objid ("cc038f61-11d9-4bc5-bd8a-8de875c38260")
    public static final String HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE = "HwPowerSupply_Association_capacity";

    @objid ("f15e0b8a-5b4b-40b4-8ab7-1185cf93c97b")
    public static final String HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE = "HwPowerSupply_Association_suppliedPower";

    /**
     * Tells whether a {@link HwPowerSupplyAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwPowerSupply_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("1d5265cc-30bb-4274-8d56-696be2dc2d69")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwPowerSupply_Association >> then instantiate a {@link HwPowerSupplyAssociation} proxy.
     * 
     * @return a {@link HwPowerSupplyAssociation} proxy on the created {@link Association}.
     */
    @objid ("8e5d307b-b5b7-48e6-90fc-89e17d8c195a")
    public static HwPowerSupplyAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwPowerSupplyAssociation.STEREOTYPE_NAME);
        return HwPowerSupplyAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwPowerSupplyAssociation} proxy from a {@link Association} stereotyped << HwPowerSupply_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwPowerSupplyAssociation} proxy or <i>null</i>.
     */
    @objid ("831c9fa8-4728-4b95-b6a7-15cdf4eac6bd")
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
    @objid ("42e8c01a-9c01-4898-8644-c75305457470")
    public static HwPowerSupplyAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwPowerSupplyAssociation.canInstantiate(obj))
        	return new HwPowerSupplyAssociation(obj);
        else
        	throw new IllegalArgumentException("HwPowerSupplyAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fcaf2e73-fde1-4944-b168-a7110787a87f")
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
    @objid ("150923a5-86e2-4432-9142-edb7201efe41")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwPowerSupply_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8122345f-ec55-41ae-bb2b-18ac67d999f6")
    public String getHwPowerSupply_Association_capacity() {
        return this.elt.getTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwPowerSupply_Association_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e28f7c0c-d719-43fa-a3c3-199923b0a7da")
    public String getHwPowerSupply_Association_suppliedPower() {
        return this.elt.getTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE_ELT);
    }

    @objid ("0739adeb-aa03-4357-b4e0-ff0775456ec9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwPowerSupply_Association_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d3b29d6-4911-4e91-a04d-a501a59e3d45")
    public void setHwPowerSupply_Association_capacity(final String value) {
        this.elt.putTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwPowerSupply_Association_suppliedPower'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bbea459-f8ab-48f7-a69f-e56ba5766be8")
    public void setHwPowerSupply_Association_suppliedPower(final String value) {
        this.elt.putTagValue(HwPowerSupplyAssociation.MdaTypes.HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE_ELT, value);
    }

    @objid ("e98311fa-c54d-4122-b8fb-53da2cb55b9b")
    protected HwPowerSupplyAssociation(final Association elt) {
        super(elt);
    }

    @objid ("ebfe0ad0-69ce-458a-af95-8c0b3290dd8d")
    public static final class MdaTypes {
        @objid ("be86ef71-9bad-456e-b0fc-6d13f37171b0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0022c1e9-e135-4bd3-a577-68dfa81113f6")
        public static TagType HWPOWERSUPPLY_ASSOCIATION_SUPPLIEDPOWER_TAGTYPE_ELT;

        @objid ("b3338dbf-550d-44e0-8faf-22e3503adf96")
        public static TagType HWPOWERSUPPLY_ASSOCIATION_CAPACITY_TAGTYPE_ELT;

        @objid ("3f820e49-0cdf-4f79-996a-5590f4a157f8")
        private static Stereotype MDAASSOCDEP;

        @objid ("51ee9324-14e6-410b-87da-3df2c43f84bc")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("410aeb42-2258-4433-9d5f-8dd3a3edb73b")
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
