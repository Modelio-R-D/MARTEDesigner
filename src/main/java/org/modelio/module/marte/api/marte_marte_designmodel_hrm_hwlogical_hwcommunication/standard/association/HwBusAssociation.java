/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
 * Proxy class to handle a {@link Association} with << HwBus_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("b5e9fc9d-78a8-4d4f-b68a-75413de27c94")
public class HwBusAssociation extends HwMediaAssociation {
    @objid ("534a083a-f42a-4290-8a12-50b543481eba")
    public static final String STEREOTYPE_NAME = "HwBus_Association";

    @objid ("a281e171-c64e-40a7-a6d0-abf09582d70e")
    public static final String HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE = "HwBus_Association_adressWidth";

    @objid ("6242b632-c462-40ca-81a8-16731a357b5e")
    public static final String HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE = "HwBus_Association_isSerial";

    @objid ("7d320639-e578-43a7-b016-414dffabe8d0")
    public static final String HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE = "HwBus_Association_isSynchronous";

    @objid ("47b053ec-0d9b-4aae-8ef3-4c6d0bc1a33b")
    public static final String HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE = "HwBus_Association_wordWidth";

    /**
     * Tells whether a {@link HwBusAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBus_Association >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("58e2b1aa-6192-4e39-900e-b75d75b13e95")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBus_Association >> then instantiate a {@link HwBusAssociation} proxy.
     * 
     * @return a {@link HwBusAssociation} proxy on the created {@link Association}.
     */
    @objid ("cf7099a5-32da-4723-999c-c037021e9d52")
    public static HwBusAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociation.STEREOTYPE_NAME);
        return HwBusAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwBusAssociation} proxy from a {@link Association} stereotyped << HwBus_Association >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwBusAssociation} proxy or <i>null</i>.
     */
    @objid ("32577dac-9e5e-43ff-8f22-411d10c42396")
    public static HwBusAssociation instantiate(final Association obj) {
        return HwBusAssociation.canInstantiate(obj) ? new HwBusAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusAssociation} proxy from a {@link Association} stereotyped << HwBus_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwBusAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6429e879-e112-414a-ba5a-c016d5ebe814")
    public static HwBusAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBusAssociation.canInstantiate(obj))
        	return new HwBusAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBusAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4fbfef91-b5da-4722-a1d1-c26938c1178e")
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
        HwBusAssociation other = (HwBusAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("ac61716a-1e2a-4c73-9d51-598d43f0a080")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Association_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("41e95b3d-d675-4501-82f1-9dd99042ebd6")
    public String getHwBus_Association_adressWidth() {
        return this.elt.getTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Association_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dd08ca5c-ed04-46f9-b642-55e2d780082e")
    public String getHwBus_Association_wordWidth() {
        return this.elt.getTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("08903e0a-2b55-4d99-941b-8883b77baee3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Association_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1fe4874-da33-4954-8300-2a7583ac0117")
    public boolean isHwBus_Association_isSerial() {
        return this.elt.isTagged(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Association_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("92124e76-6826-4baf-ac8b-d678fd7e0b37")
    public boolean isHwBus_Association_isSynchronous() {
        return this.elt.isTagged(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Association_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("040c7b62-1f7b-4a3c-8deb-985ef75e3003")
    public void setHwBus_Association_adressWidth(final String value) {
        this.elt.putTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Association_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ba4cc2e-a375-4457-8ed3-0a5d67fe39cd")
    public void setHwBus_Association_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Association_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f56662b-7cb0-40e9-9fd0-c29a577eadaf")
    public void setHwBus_Association_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Association_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1c4de584-57bd-4905-b905-5c9854d95943")
    public void setHwBus_Association_wordWidth(final String value) {
        this.elt.putTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("75470dec-7dc6-47df-92bb-c7ba5391f40d")
    protected HwBusAssociation(final Association elt) {
        super(elt);
    }

    @objid ("7412a093-bf53-412a-9c3f-411fee87dc30")
    public static final class MdaTypes {
        @objid ("4b5112cb-804c-4d8b-b54a-b5affb9c2189")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1175876e-1126-40fb-a18c-4045fe6ca87b")
        public static TagType HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("1401621b-8da1-47b0-b420-9d5e25b54c5b")
        public static TagType HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE_ELT;

        @objid ("3c1c8f6e-d613-4f27-90b5-03e3789e5f6f")
        public static TagType HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("d38271e5-06d5-4359-820e-0071f905bb72")
        public static TagType HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE_ELT;

        @objid ("9a758f53-1be0-4e29-9752-f48b4df3356d")
        private static Stereotype MDAASSOCDEP;

        @objid ("38c0a70a-afd0-43e7-9b0f-6e2a2f076f06")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("51f59eb7-cdfc-4192-97ae-9bafb00401bf")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "851aef12-10ac-11df-81d9-0014222a9f79");
            HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851aef14-10ac-11df-81d9-0014222a9f79");
            HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851aef15-10ac-11df-81d9-0014222a9f79");
            HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a61d5891-1707-11df-b92a-0014222a9f79");
            HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a61d5892-1707-11df-b92a-0014222a9f79");
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
