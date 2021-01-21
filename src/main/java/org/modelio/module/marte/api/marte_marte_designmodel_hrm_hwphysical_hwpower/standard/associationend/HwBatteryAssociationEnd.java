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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwBattery_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c716a11a-7ba4-47f0-a6dd-65389de51db4")
public class HwBatteryAssociationEnd extends HwPowerSupplyAssociationEnd {
    @objid ("9639d898-e08e-4895-9627-02c831a795d0")
    public static final String STEREOTYPE_NAME = "HwBattery_AssociationEnd";

    @objid ("18f2bcbd-0f6b-4bc9-bffe-b10741492c44")
    public static final String HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE = "HwBattery_AssociationEnd_capacity";

    /**
     * Tells whether a {@link HwBatteryAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBattery_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("952886ff-4543-40f7-baf7-add72adeaca2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBattery_AssociationEnd >> then instantiate a {@link HwBatteryAssociationEnd} proxy.
     * 
     * @return a {@link HwBatteryAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("a714bdce-e0a5-4ebf-95ce-c4c94590d10d")
    public static HwBatteryAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBatteryAssociationEnd.STEREOTYPE_NAME);
        return HwBatteryAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBatteryAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBattery_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBatteryAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("4a5c92e0-75aa-4414-aed8-67f71ab062eb")
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
    @objid ("41e39006-5d8d-4e74-80d9-d8fb0d37b686")
    public static HwBatteryAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBatteryAssociationEnd.canInstantiate(obj))
        	return new HwBatteryAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBatteryAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3ce21751-de87-4f35-a2d9-50887ed380d5")
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
    @objid ("c9cb5879-ee1c-45e2-98e0-4fe5e1ab464e")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwBattery_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4fa3b424-110c-4035-9e3f-1b1afbb93b20")
    public String getHwBattery_AssociationEnd_capacity() {
        return this.elt.getTagValue(HwBatteryAssociationEnd.MdaTypes.HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT);
    }

    @objid ("1cbcedcf-83a5-4e59-b637-f7c3da75251b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwBattery_AssociationEnd_capacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6928c49d-69de-400a-822a-dc4ec07a84d7")
    public void setHwBattery_AssociationEnd_capacity(final String value) {
        this.elt.putTagValue(HwBatteryAssociationEnd.MdaTypes.HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT, value);
    }

    @objid ("74b1a784-9668-4f9a-b7b3-0aa432d2de09")
    protected HwBatteryAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("398448b7-0516-482d-bfbf-c47ec1763241")
    public static final class MdaTypes {
        @objid ("f5d31757-1f8c-4648-9d2a-a61ce5888407")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7a4ae79-53c7-499f-9d59-10dc091367d7")
        public static TagType HWBATTERY_ASSOCIATIONEND_CAPACITY_TAGTYPE_ELT;

        @objid ("75b24424-10f6-4b33-9cb9-9b8add241990")
        private static Stereotype MDAASSOCDEP;

        @objid ("78df6814-078a-4fbd-8da0-5bb140ce23a9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27955631-cc5f-4f3d-b004-8fbd82e41b65")
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
