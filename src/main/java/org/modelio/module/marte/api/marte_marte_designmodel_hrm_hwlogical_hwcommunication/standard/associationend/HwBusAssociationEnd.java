/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.associationend;

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
 * Proxy class to handle a {@link AssociationEnd} with << HwBus_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f83d19ea-df57-4b47-aa54-9c4226b5e9c5")
public class HwBusAssociationEnd extends HwMediaAssociationEnd {
    @objid ("7f84287d-c337-4690-87be-5d172b558bea")
    public static final String STEREOTYPE_NAME = "HwBus_AssociationEnd";

    @objid ("5c37945e-25c1-4251-ba79-2cffe6c2edfd")
    public static final String HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE = "HwBus_AssociationEnd_adressWidth";

    @objid ("279119fd-b098-459b-9236-005bb933f406")
    public static final String HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE = "HwBus_AssociationEnd_isSerial";

    @objid ("164bfc85-3b85-4e44-9624-1eabdebeb3ab")
    public static final String HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE = "HwBus_AssociationEnd_isSynchronous";

    @objid ("5004f5c8-da51-4f34-8530-71a7ce027586")
    public static final String HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE = "HwBus_AssociationEnd_wordWidth";

    /**
     * Tells whether a {@link HwBusAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5ad931d3-4d06-46de-967f-df2f04061e44")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >> then instantiate a {@link HwBusAssociationEnd} proxy.
     * 
     * @return a {@link HwBusAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("cb59b4a0-cd08-4499-acf9-e741b0fd5e45")
    public static HwBusAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociationEnd.STEREOTYPE_NAME);
        return HwBusAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwBusAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwBusAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("3f0477a1-3136-4e7a-b960-96438b1d78f6")
    public static HwBusAssociationEnd instantiate(final AssociationEnd obj) {
        return HwBusAssociationEnd.canInstantiate(obj) ? new HwBusAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwBus_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwBusAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9a443b00-f82e-4383-a65e-777bcb3ea859")
    public static HwBusAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwBusAssociationEnd.canInstantiate(obj))
        	return new HwBusAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwBusAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("43c0c198-7782-4fe4-8b42-673de35915f3")
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
        HwBusAssociationEnd other = (HwBusAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("5d2ae94b-4230-4c38-b60b-b413a5229c5c")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_AssociationEnd_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eb981411-0d41-4151-a6fe-4e8c032aeb44")
    public String getHwBus_AssociationEnd_adressWidth() {
        return this.elt.getTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_AssociationEnd_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fc04950b-dc5f-466f-a117-bf4e6dca0db0")
    public String getHwBus_AssociationEnd_wordWidth() {
        return this.elt.getTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("1f0d772e-356e-463f-893d-ca72c52fa2e6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_AssociationEnd_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c032d7ca-2979-46e3-97b5-7b45cfba23cc")
    public boolean isHwBus_AssociationEnd_isSerial() {
        return this.elt.isTagged(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("442cc01b-43ed-4b98-a97a-d528e0d49c9e")
    public boolean isHwBus_AssociationEnd_isSynchronous() {
        return this.elt.isTagged(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_AssociationEnd_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a0954dd3-285b-4d46-9e81-c1680f9a6325")
    public void setHwBus_AssociationEnd_adressWidth(final String value) {
        this.elt.putTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_AssociationEnd_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c818585-f422-45ea-a705-46968189a000")
    public void setHwBus_AssociationEnd_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_AssociationEnd_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2115200f-b9ca-4c2c-a900-875bdeec2049")
    public void setHwBus_AssociationEnd_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_AssociationEnd_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("e13a964f-247d-43da-8966-cf011d510d51")
    public void setHwBus_AssociationEnd_wordWidth(final String value) {
        this.elt.putTagValue(HwBusAssociationEnd.MdaTypes.HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("698b4d81-2b45-49d7-abb8-1b7d7c8cfcec")
    protected HwBusAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("eb3e3775-32af-42a4-b0a0-76806519beb0")
    public static final class MdaTypes {
        @objid ("1a22cdfc-4b8e-4666-8ffa-567600c8b44b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c92d2ead-042a-4a93-a34c-cec56bb99dc2")
        public static TagType HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("9af6e910-e518-4611-9842-180918810954")
        public static TagType HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT;

        @objid ("6ee2bf42-8ac1-43cb-bd94-83764089c244")
        public static TagType HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("568b67e4-39c2-4666-ae0c-2004bc4545fc")
        public static TagType HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT;

        @objid ("3fc3cc23-7b63-4084-905f-e079e5d9f99f")
        private static Stereotype MDAASSOCDEP;

        @objid ("043d58f3-2215-4c2e-a494-0eeba36f3706")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("368e2287-a4e2-4912-bf95-ee47e42e786c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01167d78-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d7f-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d86-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d8d-0ccf-11df-8525-001302895b2b");
            HWBUS_ASSOCIATIONEND_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d94-0ccf-11df-8525-001302895b2b");
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
