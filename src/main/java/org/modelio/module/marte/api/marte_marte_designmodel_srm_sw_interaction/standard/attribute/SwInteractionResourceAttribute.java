/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.attribute;

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
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.attribute.SwResourceAttribute;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << SwInteractionResource_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwInteractionResourceAttribute extends SwResourceAttribute {
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Attribute";

    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Attribute_isIntraMemoryPartitionInteraction";

    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Attribute_waitingPolicyElements";

    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Attribute_waitingQueueCapacity";

    public static final String SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Attribute_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << SwInteractionResource_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << SwInteractionResource_Attribute >> then instantiate a {@link SwInteractionResourceAttribute} proxy.
     * 
     * @return a {@link SwInteractionResourceAttribute} proxy on the created {@link Attribute}.
     */
    public static SwInteractionResourceAttribute create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceAttribute.STEREOTYPE_NAME);
        return SwInteractionResourceAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwInteractionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link SwInteractionResourceAttribute} proxy or <i>null</i>.
     */
    public static SwInteractionResourceAttribute instantiate(final Attribute obj) {
        return SwInteractionResourceAttribute.canInstantiate(obj) ? new SwInteractionResourceAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceAttribute} proxy from a {@link Attribute} stereotyped << SwInteractionResource_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link SwInteractionResourceAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwInteractionResourceAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (SwInteractionResourceAttribute.canInstantiate(obj))
        	return new SwInteractionResourceAttribute(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwInteractionResourceAttribute other = (SwInteractionResourceAttribute) obj;
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
     * Getter for List<String> property 'SwInteractionResource_Attribute_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwInteractionResource_Attribute_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Attribute_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_Attribute_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Attribute_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_Attribute_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Attribute_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwInteractionResource_Attribute_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Attribute_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Attribute_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Attribute_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Attribute_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Attribute_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Attribute_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Attribute_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Attribute_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceAttribute.MdaTypes.SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    protected SwInteractionResourceAttribute(final Attribute elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "020c0c76-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c7d-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c84-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c8b-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_ATTRIBUTE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020e6ec7-0ccf-11df-8525-001302895b2b");
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
