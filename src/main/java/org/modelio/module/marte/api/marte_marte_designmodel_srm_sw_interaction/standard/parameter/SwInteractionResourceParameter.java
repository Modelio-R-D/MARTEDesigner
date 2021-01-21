/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
@objid ("da180dbb-bf38-49e8-9e8a-55cb7965b0a1")
public class SwInteractionResourceParameter extends SwResourceParameter {
    @objid ("be5661c9-ff23-4a74-8801-47771b373ceb")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Parameter";

    @objid ("cc683b3a-0024-434f-9611-2cb99465af11")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction";

    @objid ("5056c36f-862f-448f-aedc-80b336419aca")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Parameter_waitingPolicyElements";

    @objid ("759a1469-1db1-49b7-9247-f1ca7ca34fe8")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Parameter_waitingQueueCapacity";

    @objid ("306b5ce8-17fb-4f45-9b1a-d6db67526e7c")
    public static final String SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Parameter_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << SwInteractionResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("bc4a2791-e664-4ffc-8db9-5b307543aed9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << SwInteractionResource_Parameter >> then instantiate a {@link SwInteractionResourceParameter} proxy.
     * 
     * @return a {@link SwInteractionResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("e4359f6d-2f23-4710-abc4-e021f440a5dd")
    public static SwInteractionResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceParameter.STEREOTYPE_NAME);
        return SwInteractionResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceParameter} proxy from a {@link Parameter} stereotyped << SwInteractionResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link SwInteractionResourceParameter} proxy or <i>null</i>.
     */
    @objid ("83172b66-96d0-4c16-8b46-eaf959014c51")
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
    @objid ("a2f75e2d-7380-4989-b812-726ee2839f57")
    public static SwInteractionResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (SwInteractionResourceParameter.canInstantiate(obj))
        	return new SwInteractionResourceParameter(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a5c86967-2889-41c4-aea1-5fc05ebee550")
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
    @objid ("669c60b3-b250-45ed-a7d3-02a1cad17328")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Parameter_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("560da939-48db-4603-b58b-b75012338768")
    public List<String> getSwInteractionResource_Parameter_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Parameter_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1f521613-6eee-470b-bae9-0b0bea7ef5d3")
    public String getSwInteractionResource_Parameter_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Parameter_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d7d8ab27-06c1-4dcd-98ee-1218df69a440")
    public String getSwInteractionResource_Parameter_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("101fbace-46e6-48c3-ac16-172aa108c04d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9c8b07cd-78b5-428e-a9ab-c48bb07d87ec")
    public boolean isSwInteractionResource_Parameter_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Parameter_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f2432e5-9e1f-4314-b72e-2c8952a5ea52")
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
    @objid ("b8af8870-a22f-4631-9c1e-69a1cad19739")
    public void setSwInteractionResource_Parameter_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Parameter_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ecbb0e92-8ee5-43d6-96c3-4f1a3e091e22")
    public void setSwInteractionResource_Parameter_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Parameter_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a18dc63d-383b-4b03-8452-19b07f327f26")
    public void setSwInteractionResource_Parameter_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceParameter.MdaTypes.SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("835392e8-c6da-4850-88da-5fbcdb30456f")
    protected SwInteractionResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("3f8d0d7a-6917-4919-ab2e-b2dd129b9924")
    public static final class MdaTypes {
        @objid ("d7aac73d-60d9-4e00-8739-75aa4bfb727d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ca5669b4-a8cb-4ba8-9d4b-f31f51e77f24")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("1ea5805b-1a16-4f90-97d6-9ac36ba5e62d")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("e7c261e6-1362-4d06-a28b-2b85db27d6ab")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("e48a3934-047e-4fee-a9dd-a04b846ed764")
        public static TagType SWINTERACTIONRESOURCE_PARAMETER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("eb8d15c4-5517-4da7-b92c-38a06d75a266")
        private static Stereotype MDAASSOCDEP;

        @objid ("472daeb6-6f7e-40d8-9ecc-f39b67010d94")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cb29566d-34af-4303-9cc6-7fdd8feaadfd")
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
