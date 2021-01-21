/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.associationend;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.associationend.HwResourceAssociationEnd;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link AssociationEnd} with << HwDevice_AssociationEnd >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b379ce74-b909-4d95-8f7d-56f7ac2beb4d")
public class HwDeviceAssociationEnd extends HwResourceAssociationEnd {
    @objid ("bd232416-fe3d-4d54-ad5e-629dc9e8417b")
    public static final String STEREOTYPE_NAME = "HwDevice_AssociationEnd";

    @objid ("72d874fd-d1b5-4534-908d-873161da348b")
    public static final String HWDEVICE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE = "HwDevice_AssociationEnd_mainScheduler";

    @objid ("d072a82e-6cfb-41b9-abd8-14d3241e78b5")
    public static final String HWDEVICE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE = "HwDevice_AssociationEnd_speedFactor";

    /**
     * Tells whether a {@link HwDeviceAssociationEnd proxy} can be instantiated from a {@link MObject} checking it is a {@link AssociationEnd} stereotyped << HwDevice_AssociationEnd >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("842dc289-147c-4e7b-b392-9e2eafef7b80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof AssociationEnd) && ((AssociationEnd) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAssociationEnd.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link AssociationEnd} stereotyped << HwDevice_AssociationEnd >> then instantiate a {@link HwDeviceAssociationEnd} proxy.
     * 
     * @return a {@link HwDeviceAssociationEnd} proxy on the created {@link AssociationEnd}.
     */
    @objid ("22d4e307-fce4-4436-8371-15daca4c98fd")
    public static HwDeviceAssociationEnd create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("AssociationEnd");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDeviceAssociationEnd.STEREOTYPE_NAME);
        return HwDeviceAssociationEnd.instantiate((AssociationEnd)e);
    }

    /**
     * Tries to instantiate a {@link HwDeviceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwDevice_AssociationEnd >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a AssociationEnd
     * @return a {@link HwDeviceAssociationEnd} proxy or <i>null</i>.
     */
    @objid ("6665edd9-56cb-4a93-96e9-d0b0d6bb47f9")
    public static HwDeviceAssociationEnd instantiate(final AssociationEnd obj) {
        return HwDeviceAssociationEnd.canInstantiate(obj) ? new HwDeviceAssociationEnd(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDeviceAssociationEnd} proxy from a {@link AssociationEnd} stereotyped << HwDevice_AssociationEnd >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link AssociationEnd}
     * @return a {@link HwDeviceAssociationEnd} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("aedf786c-a861-44d2-b699-5ee1b3f4446f")
    public static HwDeviceAssociationEnd safeInstantiate(final AssociationEnd obj) throws IllegalArgumentException {
        if (HwDeviceAssociationEnd.canInstantiate(obj))
        	return new HwDeviceAssociationEnd(obj);
        else
        	throw new IllegalArgumentException("HwDeviceAssociationEnd: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c328f774-4bf0-42a6-9d83-89d171ae0ce7")
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
        HwDeviceAssociationEnd other = (HwDeviceAssociationEnd) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link AssociationEnd}. 
     * @return the AssociationEnd represented by this proxy, never null.
     */
    @objid ("b45e01a8-bb5e-4311-b405-12af9e232185")
    @Override
    public AssociationEnd getElement() {
        return (AssociationEnd)super.getElement();
    }

    /**
     * Getter for string property 'HwDevice_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aa0f843e-2bdf-490e-bc85-bc827d196864")
    public String getHwDevice_AssociationEnd_mainScheduler() {
        return this.elt.getTagValue(HwDeviceAssociationEnd.MdaTypes.HWDEVICE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDevice_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0c01fb47-6808-433e-bd66-2bba67e8d9f5")
    public String getHwDevice_AssociationEnd_speedFactor() {
        return this.elt.getTagValue(HwDeviceAssociationEnd.MdaTypes.HWDEVICE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT);
    }

    @objid ("3b45e8bc-11e0-470b-aa8f-f102fcc5e382")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwDevice_AssociationEnd_mainScheduler'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c2d0861a-16bf-4452-bfab-17fc5b06646e")
    public void setHwDevice_AssociationEnd_mainScheduler(final String value) {
        this.elt.putTagValue(HwDeviceAssociationEnd.MdaTypes.HWDEVICE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDevice_AssociationEnd_speedFactor'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a2f580fe-a357-48ef-9b85-8762c14765bb")
    public void setHwDevice_AssociationEnd_speedFactor(final String value) {
        this.elt.putTagValue(HwDeviceAssociationEnd.MdaTypes.HWDEVICE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT, value);
    }

    @objid ("fd611fea-c81e-4613-bd6f-6113682174bb")
    protected HwDeviceAssociationEnd(final AssociationEnd elt) {
        super(elt);
    }

    @objid ("f9d39cf5-1471-41e7-8e11-2b73e30ec4e4")
    public static final class MdaTypes {
        @objid ("c9baa3d2-96b5-42f7-8da3-7e5b51aaca88")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cc6f8086-e66f-4b88-a77e-46c36dec8688")
        public static TagType HWDEVICE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT;

        @objid ("9a1c5d4a-8b67-4b07-a6eb-aa04a5acefcc")
        public static TagType HWDEVICE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT;

        @objid ("0a9455ca-4340-4078-a4e9-1331b01cefb5")
        private static Stereotype MDAASSOCDEP;

        @objid ("3f8b8164-8edc-429c-a059-09569bb65938")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1ee98aeb-1d71-4927-9808-7fced9c46589")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0130b6fd-0ccf-11df-8525-001302895b2b");
            HWDEVICE_ASSOCIATIONEND_SPEEDFACTOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e695867-92ab-11e0-a69d-0027103f347c");
            HWDEVICE_ASSOCIATIONEND_MAINSCHEDULER_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4e695868-92ab-11e0-a69d-0027103f347c");
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
