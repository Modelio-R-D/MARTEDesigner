/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("64c6b935-6c4b-45ee-a7d8-e3ad7e5be273")
public class SwInteractionResourceLifeline extends SwResourceLifeline {
    @objid ("97f2884a-a6fb-4709-9fbc-52f74e0f5538")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Lifeline";

    @objid ("7c084964-83a0-4ace-ad73-a7130f418933")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction";

    @objid ("e1afc5c5-ff97-452e-8a4f-6654a2da742d")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Lifeline_waitingPolicyElements";

    @objid ("e2c70958-3443-4627-8ddb-f6a589842ec1")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Lifeline_waitingQueueCapacity";

    @objid ("eac47e6d-0724-4fdf-a9ca-d28ee012765d")
    public static final String SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Lifeline_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e260a3c9-13c7-4910-9ba1-6d7b8e8c65b9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >> then instantiate a {@link SwInteractionResourceLifeline} proxy.
     * 
     * @return a {@link SwInteractionResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("2489b77a-3bc9-4862-b81c-a097f35462d0")
    public static SwInteractionResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceLifeline.STEREOTYPE_NAME);
        return SwInteractionResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceLifeline} proxy from a {@link Lifeline} stereotyped << SwInteractionResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link SwInteractionResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("d64b2222-e641-4137-ac9e-603e8feaa6ed")
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
    @objid ("6b941ab7-c94c-45a3-988a-4f89a30e4552")
    public static SwInteractionResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (SwInteractionResourceLifeline.canInstantiate(obj))
        	return new SwInteractionResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("91b833b8-afa1-4b88-94a7-b553475a3347")
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
    @objid ("a22a5a48-67db-4fea-82a8-b142d1e1293a")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Lifeline_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("e7eaf211-adb1-43d6-9a10-1c967af6e41a")
    public List<String> getSwInteractionResource_Lifeline_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Lifeline_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("dce87494-5d91-40f8-876b-f04b2170034a")
    public String getSwInteractionResource_Lifeline_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Lifeline_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("82c35e8a-8aa5-4f54-96c7-529369d972e0")
    public String getSwInteractionResource_Lifeline_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("2f155700-2a86-472b-9ad0-703cb10c45c9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("be663f74-b88c-4d8b-8188-46379ab1d372")
    public boolean isSwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Lifeline_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a462f63b-05a1-4895-b5ef-942d38abdf26")
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
    @objid ("da929af0-781f-4920-a022-07756cc5757d")
    public void setSwInteractionResource_Lifeline_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Lifeline_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4ee8b40d-7a83-4812-9018-5467b0f1bb0c")
    public void setSwInteractionResource_Lifeline_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Lifeline_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3be5f8d2-ab33-4d94-aa84-d8f7ef4a5105")
    public void setSwInteractionResource_Lifeline_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceLifeline.MdaTypes.SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("48814427-78da-427e-bf25-10e2779f9404")
    protected SwInteractionResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("53ad73c1-b939-47b5-9da0-a7f75679ea2f")
    public static final class MdaTypes {
        @objid ("9e7a156b-6a78-400c-a460-bddc0b667426")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5d3d10b8-e042-4b72-a5bf-9d61f62fb753")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("76498fc3-5e32-449a-bc4d-7c2636a6907a")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("3de1a37c-3465-4fb0-b9c5-8edc00ab655e")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("6c88ad05-a030-4a74-bfc7-84365c9ca647")
        public static TagType SWINTERACTIONRESOURCE_LIFELINE_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("6cff3fb1-d413-45e5-8638-f60cd8f7bc83")
        private static Stereotype MDAASSOCDEP;

        @objid ("9f91f435-1cb7-47a6-af2e-b61e5c1d3fd7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d320e73c-6206-4d1b-b473-a149f8431e17")
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
