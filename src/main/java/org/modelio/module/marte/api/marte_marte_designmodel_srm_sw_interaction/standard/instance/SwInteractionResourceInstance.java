/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.instance.SwResourceInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SwInteractionResource_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("aff1a8f3-2554-4961-a253-0099ce966afb")
public class SwInteractionResourceInstance extends SwResourceInstance {
    @objid ("2ab11c8b-49a6-49a0-80c9-bbd849e12ebb")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Instance";

    @objid ("248dc970-826c-4d0e-b809-2ecbb1a88628")
    public static final String SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Instance_isIntraMemoryPartitionInteraction";

    @objid ("8b293abd-a420-499b-b24e-f6c59ebccfb8")
    public static final String SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Instance_waitingPolicyElements";

    @objid ("b4de5f42-4e11-474e-b9d3-164e354b232a")
    public static final String SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Instance_waitingQueueCapacity";

    @objid ("13322baf-03a2-44fa-b69a-ff3d0c0888af")
    public static final String SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Instance_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SwInteractionResource_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("85e2d55f-474f-4071-b941-f45cb2586f3f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SwInteractionResource_Instance >> then instantiate a {@link SwInteractionResourceInstance} proxy.
     * 
     * @return a {@link SwInteractionResourceInstance} proxy on the created {@link Instance}.
     */
    @objid ("02badbf1-8350-448a-8aa4-0040b9a30087")
    public static SwInteractionResourceInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceInstance.STEREOTYPE_NAME);
        return SwInteractionResourceInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceInstance} proxy from a {@link Instance} stereotyped << SwInteractionResource_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SwInteractionResourceInstance} proxy or <i>null</i>.
     */
    @objid ("964a9cdf-871a-4a52-a91d-0a3b9b954879")
    public static SwInteractionResourceInstance instantiate(final Instance obj) {
        return SwInteractionResourceInstance.canInstantiate(obj) ? new SwInteractionResourceInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceInstance} proxy from a {@link Instance} stereotyped << SwInteractionResource_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SwInteractionResourceInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d4710540-5838-4bf7-9819-4e1f060f3193")
    public static SwInteractionResourceInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SwInteractionResourceInstance.canInstantiate(obj))
        	return new SwInteractionResourceInstance(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f0915a9e-b1f1-422b-b9f5-54b92da0988f")
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
        SwInteractionResourceInstance other = (SwInteractionResourceInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("b50d3723-eb60-408c-9ccf-c428d9697a89")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Instance_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c563b2f7-2800-4bfe-a64b-f109a5ea37fd")
    public List<String> getSwInteractionResource_Instance_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Instance_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2ce89185-3242-4e56-ab70-6724a1559212")
    public String getSwInteractionResource_Instance_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Instance_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d84b41a-02b7-48c9-9161-a2e345a519d3")
    public String getSwInteractionResource_Instance_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("5c846fec-deac-40ae-84d8-705092651fc2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Instance_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("641d50a0-6e47-4705-b489-a48e1af12229")
    public boolean isSwInteractionResource_Instance_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Instance_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9bc66a25-ba5c-47ea-8353-2800e54f3535")
    public void setSwInteractionResource_Instance_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Instance_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("eedfaa04-6c29-4393-81d1-7ec3ba47a4c9")
    public void setSwInteractionResource_Instance_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Instance_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4a0ba7ef-30a3-469c-b9a9-058c5667f1a2")
    public void setSwInteractionResource_Instance_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Instance_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4b1a6fbd-bc49-4ce3-8783-351319150fe7")
    public void setSwInteractionResource_Instance_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceInstance.MdaTypes.SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("8f1f4a90-4bfc-42c6-96cd-d68d524d4b93")
    protected SwInteractionResourceInstance(final Instance elt) {
        super(elt);
    }

    @objid ("b90a93b9-5b29-4b8b-a12c-ad1e39058e91")
    public static final class MdaTypes {
        @objid ("e066b97b-ccde-40c9-bc02-68d2a5ea63be")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fbcbcbab-0a01-4bf0-971b-ee75279e17a5")
        public static TagType SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("1ca3ce73-2009-4f92-b116-353fd3699749")
        public static TagType SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("6b2e20e6-efe8-4326-a70a-b5665c567c8c")
        public static TagType SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("69b0300f-7af0-4565-acd8-8625f7b29b64")
        public static TagType SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("4ace0b28-1f54-4cbf-9f1a-5c2dedbe19ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("4e15f520-f9f8-4408-97d8-415369551f82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("264f974a-63f5-4ce8-be9a-8691ad6d8de9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "020c0c79-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_INSTANCE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c80-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c87-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_INSTANCE_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020c0c8e-0ccf-11df-8525-001302895b2b");
            SWINTERACTIONRESOURCE_INSTANCE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "020e6eca-0ccf-11df-8525-001302895b2b");
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
