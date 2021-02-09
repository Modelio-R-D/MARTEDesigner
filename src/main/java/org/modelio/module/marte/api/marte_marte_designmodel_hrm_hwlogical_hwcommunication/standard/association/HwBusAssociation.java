/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
public class HwBusAssociation extends HwMediaAssociation {
    public static final String STEREOTYPE_NAME = "HwBus_Association";

    public static final String HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE = "HwBus_Association_adressWidth";

    public static final String HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE = "HwBus_Association_isSerial";

    public static final String HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE = "HwBus_Association_isSynchronous";

    public static final String HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE = "HwBus_Association_wordWidth";

    /**
     * Tells whether a {@link HwBusAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwBus_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwBus_Association >> then instantiate a {@link HwBusAssociation} proxy.
     * 
     * @return a {@link HwBusAssociation} proxy on the created {@link Association}.
     */
    public static HwBusAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwBusAssociation.STEREOTYPE_NAME);
        return HwBusAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwBusAssociation} proxy from a {@link Association} stereotyped << HwBus_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwBusAssociation} proxy or <i>null</i>.
     */
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
    public static HwBusAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwBusAssociation.canInstantiate(obj))
        	return new HwBusAssociation(obj);
        else
        	throw new IllegalArgumentException("HwBusAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for string property 'HwBus_Association_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_Association_adressWidth() {
        return this.elt.getTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwBus_Association_wordWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwBus_Association_wordWidth() {
        return this.elt.getTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'HwBus_Association_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_Association_isSerial() {
        return this.elt.isTagged(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'HwBus_Association_isSynchronous'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isHwBus_Association_isSynchronous() {
        return this.elt.isTagged(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'HwBus_Association_adressWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwBus_Association_adressWidth(final String value) {
        this.elt.putTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'HwBus_Association_isSerial'
     * <p>Property description:
     * <br/><i></i></p>
     */
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
    public void setHwBus_Association_wordWidth(final String value) {
        this.elt.putTagValue(HwBusAssociation.MdaTypes.HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE_ELT, value);
    }

    protected HwBusAssociation(final Association elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWBUS_ASSOCIATION_ADRESSWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_ASSOCIATION_WORDWIDTH_TAGTYPE_ELT;

        public static TagType HWBUS_ASSOCIATION_ISSYNCHRONOUS_TAGTYPE_ELT;

        public static TagType HWBUS_ASSOCIATION_ISSERIAL_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
