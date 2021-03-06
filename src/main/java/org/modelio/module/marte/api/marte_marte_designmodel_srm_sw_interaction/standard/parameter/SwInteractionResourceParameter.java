/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.parameter.SwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << SwInteractionResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class SwInteractionResourceParameter extends SwResourceParameter {
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Parameter";

    public static final String SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction";

    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Parameter_waitingPolicyElements";

    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Parameter_waitingQueueCapacity";

    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Parameter_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwInteractionResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwInteractionResource_Parameter >> then instantiate a {@link SwInteractionResourceParameter} proxy.
     * 
     * @return a {@link SwInteractionResourceParameter} proxy on the created {@link Parameter}.
     */
    public static SwInteractionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceParameter.STEREOTYPE_NAME);
        return SwInteractionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceParameter} proxy from a {@link Parameter} stereotyped << SwInteractionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwInteractionResourceParameter} proxy or <i>null</i>.
     */
    public static SwInteractionResourceParameter instantiate(final Parameter obj) {
        return SwInteractionResourceParameter.canInstantiate(obj) ? new SwInteractionResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceParameter} proxy from a {@link Parameter} stereotyped << SwInteractionResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link SwInteractionResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static SwInteractionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwInteractionResourceParameter.canInstantiate(obj))
        	return new SwInteractionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        SwInteractionResourceParameter other = (SwInteractionResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Parameter_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getSwInteractionResource_Parameter_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Parameter_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_Parameter_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Parameter_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getSwInteractionResource_Parameter_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isSwInteractionResource_Parameter_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Parameter_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Parameter_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Parameter_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Parameter_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Parameter_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Parameter_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setSwInteractionResource_Parameter_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    protected SwInteractionResourceParameter(final Parameter elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "020747ec-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c7a-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c81-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c88-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c8f-0ccf-11df-8525-001302895b2b");
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
