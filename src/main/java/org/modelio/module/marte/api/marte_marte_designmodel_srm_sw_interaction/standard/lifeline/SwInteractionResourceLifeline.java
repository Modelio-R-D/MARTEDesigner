/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.lifeline.SwResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << SwInteractionResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwInteractionResourceLifeline extends SwResourceLifeline {
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Lifeline";

    public static final String SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction";

    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Lifeline_waitingPolicyElements";

    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Lifeline_waitingQueueCapacity";

    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Lifeline_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >> then instantiate a {@link SwInteractionResourceLifeline} proxy.
     * 
     * @return a {@link SwInteractionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    public static SwInteractionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLifeline.STEREOTYPE_NAME);
        return SwInteractionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwInteractionResourceLifeline} proxy or <i>null</i>.
     */
    public static SwInteractionResourceLifeline instantiate(final Lifeline obj) {
        return SwInteractionResourceLifeline.canInstantiate(obj) ? new SwInteractionResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link SwInteractionResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwInteractionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwInteractionResourceLifeline.canInstantiate(obj))
        	return new SwInteractionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwInteractionResourceLifeline other = (SwInteractionResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Lifeline_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwInteractionResource_Lifeline_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Lifeline_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_Lifeline_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Lifeline_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_Lifeline_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Lifeline_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Lifeline_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Lifeline_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Lifeline_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Lifeline_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Lifeline_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    protected SwInteractionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe080db2-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db3-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db4-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db5-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe080db6-10d8-11df-81d9-0014222a9f79");
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
