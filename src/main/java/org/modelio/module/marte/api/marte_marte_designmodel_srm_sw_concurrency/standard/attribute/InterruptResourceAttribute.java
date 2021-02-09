/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_concurrency.standard.attribute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << InterruptResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class InterruptResourceAttribute extends SwConcurrentResourceAttribute {
    public static final String STEREOTYPE_NAME = "InterruptResource_Attribute";

    public static final String INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE = "InterruptResource_Attribute_isMaskable";

    public static final String INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE = "InterruptResource_Attribute_kind";

    public static final String INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE = "InterruptResource_Attribute_maskElements";

    public static final String INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE = "InterruptResource_Attribute_routineConnectServices";

    public static final String INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE = "InterruptResource_Attribute_routineDisconnectServices";

    public static final String INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE = "InterruptResource_Attribute_vectorElements";

    /**
     * Tells whether a {@link InterruptResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << InterruptResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << InterruptResource_Attribute >> then instantiate a {@link InterruptResourceAttribute} proxy.
     * 
     * @return a {@link InterruptResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static InterruptResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, InterruptResourceAttribute.STEREOTYPE_NAME);
        return InterruptResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAttribute} proxy from a {@link Attribute} stereotyped << InterruptResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link InterruptResourceAttribute} proxy or <i>null</i>.
     */
    public static InterruptResourceAttribute instantiate(final Attribute obj) {
        return InterruptResourceAttribute.canInstantiate(obj) ? new InterruptResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link InterruptResourceAttribute} proxy from a {@link Attribute} stereotyped << InterruptResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link InterruptResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static InterruptResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (InterruptResourceAttribute.canInstantiate(obj))
        	return new InterruptResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("InterruptResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        InterruptResourceAttribute other = (InterruptResourceAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Getter for string property 'InterruptResource_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getInterruptResource_Attribute_kind() {
        return this.elt.getTagValue(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_maskElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Attribute_maskElements() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_routineConnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Attribute_routineConnectServices() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_routineDisconnectServices'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Attribute_routineDisconnectServices() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'InterruptResource_Attribute_vectorElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getInterruptResource_Attribute_vectorElements() {
        return this.elt.getTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'InterruptResource_Attribute_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isInterruptResource_Attribute_isMaskable() {
        return this.elt.isTagged(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'InterruptResource_Attribute_isMaskable'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Attribute_isMaskable(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'InterruptResource_Attribute_kind'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Attribute_kind(final String value) {
        this.elt.putTagValue(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_maskElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Attribute_maskElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_routineConnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Attribute_routineConnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_routineDisconnectServices'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Attribute_routineDisconnectServices(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'InterruptResource_Attribute_vectorElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setInterruptResource_Attribute_vectorElements(final List<String> values) {
        this.elt.putTagValues(InterruptResourceAttribute.MdaTypes.INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT, values);
    }

    protected InterruptResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT;

        public static TagType INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01c94b7e-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_KIND_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b85-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_ISMASKABLE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b8c-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_VECTORELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b93-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_MASKELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94b9a-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_ROUTINECONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01c94ba1-0ccf-11df-8525-001302895b2b");
            INTERRUPTRESOURCE_ATTRIBUTE_ROUTINEDISCONNECTSERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "01cbadd3-0ccf-11df-8525-001302895b2b");
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
