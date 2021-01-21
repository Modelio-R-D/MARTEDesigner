/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << HwBus_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("90e79718-0aed-4dbb-add3-200756b63408")
public class HwBusAttribute extends HwMediaAttribute {
    @objid ("bf0454fa-d2c1-4537-bab2-ae6dc11e96b4")
    public static final String STEREOTYPE_NAME = "HwBus_Attribute";

    @objid ("c3a45cb5-12a6-48f6-964d-a1e4d9a89199")
    public static final String HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE = "HwBus_Attribute_adressWidth";

    @objid ("5593f497-5a02-4a91-a390-336551003369")
    public static final String HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE = "HwBus_Attribute_isSerial";

    @objid ("9f03ce69-ff06-47c0-b34a-57919afb0076")
    public static final String HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE = "HwBus_Attribute_isSynchronous";

    @objid ("df7ecf2a-478d-4b0f-965b-52ae45237a4b")
    public static final String HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE = "HwBus_Attribute_wordWidth";

    /**
     * Tells whether a {@link HwBusAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << HwBus_Attribute >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0977d136-185b-4143-b10b-53f199994a84")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << HwBus_Attribute >> then instantiate a {@link HwBusAttribute} proxy.
     * 
     * @return a {@link HwBusAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("6a820d1d-2a40-43b7-9991-b527422a3d18")
    public static HwBusAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAttribute.STEREOTYPE_NAME);
        return HwBusAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link HwBusAttribute} proxy from a {@link Attribute} stereotyped << HwBus_Attribute >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link HwBusAttribute} proxy or <i>null</i>.
     */
    @objid ("86e94941-5ba6-4084-a7c4-c8939e7550b1")
    public static HwBusAttribute instantiate(final Attribute obj) {
        return HwBusAttribute.canInstantiate(obj) ? new HwBusAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwBusAttribute} proxy from a {@link Attribute} stereotyped << HwBus_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link HwBusAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9c72bcb2-c361-4870-ac50-6340d338d08c")
    public static HwBusAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (HwBusAttribute.canInstantiate(obj))
        	return new HwBusAttribute(obj);
        else
        	throw new IllegalArgumentException("HwBusAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9ffc62ba-29fd-4174-a567-3f0d4eef243d")
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
        HwBusAttribute other = (HwBusAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("1090c3a5-d774-43f8-b2c8-1f9c690fdcad")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Attribute_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2426c7ac-a414-4840-932a-0f267902c878")
    public String getHwBus_Attribute_adressWidth() {
        return this.elt.getTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Attribute_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5fb5c850-3f2f-4488-b9c4-fa38ed1f680b")
    public String getHwBus_Attribute_wordWidth() {
        return this.elt.getTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT);
    }

    @objid ("a8e409b2-8c3d-4a13-9429-780377ba01cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Attribute_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3a63fec9-9d87-4b96-a084-2410d874c70a")
    public boolean isHwBus_Attribute_isSerial() {
        return this.elt.isTagged(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("636c459a-1213-4b97-b1a4-f621a507e5d7")
    public boolean isHwBus_Attribute_isSynchronous() {
        return this.elt.isTagged(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Attribute_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("606b5dae-6559-4629-8cb7-877d98a5a8ad")
    public void setHwBus_Attribute_adressWidth(final String value) {
        this.elt.putTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Attribute_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("81ed31a8-b46b-462d-9a4d-af00f2bb3c51")
    public void setHwBus_Attribute_isSerial(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'HwBus_Attribute_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("07aac2d0-cd6f-46a9-a3a0-47a6a65ab30c")
    public void setHwBus_Attribute_isSynchronous(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Attribute_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8f0a8e4c-fc36-4ec6-8451-f446acc44c6e")
    public void setHwBus_Attribute_wordWidth(final String value) {
        this.elt.putTagValue(HwBusAttribute.MdaTypes.HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("56b3af61-1040-4fc9-8c8c-259f21afb671")
    protected HwBusAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("837702a8-4773-49fb-97d9-64c5dc0806b9")
    public static final class MdaTypes {
        @objid ("6bbca452-2423-4235-8617-9b70f3225ce6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9b3fae4d-4aeb-461b-b16d-ca806c152c09")
        public static TagType HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT;

        @objid ("d345417d-da77-4d1e-98b4-924ec65d1409")
        public static TagType HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT;

        @objid ("97c03e14-3826-4c64-ae33-353062713626")
        public static TagType HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT;

        @objid ("54754465-8fda-4f75-b232-2f73b67ee48e")
        public static TagType HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT;

        @objid ("a73eae68-6696-4cc4-b238-1547f24a5385")
        private static Stereotype MDAASSOCDEP;

        @objid ("f3f7af7e-bb0d-4df4-a6ab-88d9e1758336")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cdd86749-a9bd-4125-8667-ec048bde4ed6")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01167d7a-0ccf-11df-8525-001302895b2b");
            HWBUS_ATTRIBUTE_ADRESSWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d81-0ccf-11df-8525-001302895b2b");
            HWBUS_ATTRIBUTE_WORDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01167d88-0ccf-11df-8525-001302895b2b");
            HWBUS_ATTRIBUTE_ISSYNCHRONOUS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a9a75921-1707-11df-b92a-0014222a9f79");
            HWBUS_ATTRIBUTE_ISSERIAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a9a75922-1707-11df-b92a-0014222a9f79");
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
