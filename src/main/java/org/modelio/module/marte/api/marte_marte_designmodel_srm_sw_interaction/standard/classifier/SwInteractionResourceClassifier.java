/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_interaction.standard.classifier;

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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_srm_sw_resourcecore.standard.classifier.SwResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << SwInteractionResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("6274d7c8-f9bb-46f9-b064-6a0ed3030dd9")
public class SwInteractionResourceClassifier extends SwResourceClassifier {
    @objid ("ee7eec2c-1416-4d71-b3aa-1ffd3f185a5b")
    public static final String STEREOTYPE_NAME = "SwInteractionResource_Classifier";

    @objid ("8892ec71-4dd8-41c5-9a98-1c3545989181")
    public static final String SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE = "SwInteractionResource_Classifier_isIntraMemoryPartitionInteraction";

    @objid ("c1e16562-6de3-4b3d-935b-017fa92e7202")
    public static final String SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS_TAGTYPE = "SwInteractionResource_Classifier_waitingPolicyElements";

    @objid ("da0a8027-5d4c-4e0a-aeee-3c9119f6371a")
    public static final String SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY_TAGTYPE = "SwInteractionResource_Classifier_waitingQueueCapacity";

    @objid ("54077e15-3c89-4c89-9fcd-3c125953deaf")
    public static final String SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY_TAGTYPE = "SwInteractionResource_Classifier_waitingQueuePolicy";

    /**
     * Tells whether a {@link SwInteractionResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << SwInteractionResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("4ebe30ba-1c35-45b6-9605-09f05f68f0c6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << SwInteractionResource_Classifier >> then instantiate a {@link SwInteractionResourceClassifier} proxy.
     * 
     * @return a {@link SwInteractionResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("3d0b3002-4d6b-40b4-8708-12cf6ec45cfe")
    public static SwInteractionResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SwInteractionResourceClassifier.STEREOTYPE_NAME);
        return SwInteractionResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceClassifier} proxy from a {@link Classifier} stereotyped << SwInteractionResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link SwInteractionResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("01a6a4f6-c501-43c4-a0b6-c618489bb574")
    public static SwInteractionResourceClassifier instantiate(final Classifier obj) {
        return SwInteractionResourceClassifier.canInstantiate(obj) ? new SwInteractionResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SwInteractionResourceClassifier} proxy from a {@link Classifier} stereotyped << SwInteractionResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link SwInteractionResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b262740c-5f8c-4481-a10e-776a7e90b2ea")
    public static SwInteractionResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (SwInteractionResourceClassifier.canInstantiate(obj))
        	return new SwInteractionResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("SwInteractionResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3aea5d6c-d716-463e-8736-0550e15ce95e")
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
        SwInteractionResourceClassifier other = (SwInteractionResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("da547dfc-f32a-4d64-a99d-4ac062b5aba1")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'SwInteractionResource_Classifier_waitingPolicyElements'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("dde44c63-fd07-4c81-a358-1c3ff62028e4")
    public List<String> getSwInteractionResource_Classifier_waitingPolicyElements() {
        return this.elt.getTagValues(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Classifier_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2540dc15-ae8d-4dac-b586-6587cf84e7cb")
    public String getSwInteractionResource_Classifier_waitingQueueCapacity() {
        return this.elt.getTagValue(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SwInteractionResource_Classifier_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("22c3295a-0aa7-4563-94a5-add161ba2748")
    public String getSwInteractionResource_Classifier_waitingQueuePolicy() {
        return this.elt.getTagValue(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY_TAGTYPE_ELT);
    }

    @objid ("e9a19216-a26b-4b8e-9efa-738f3dc5ecb4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SwInteractionResource_Classifier_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3f9e0bd4-6cb3-4b8d-ac53-c63552cc522a")
    public boolean isSwInteractionResource_Classifier_isIntraMemoryPartitionInteraction() {
        return this.elt.isTagged(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SwInteractionResource_Classifier_isIntraMemoryPartitionInteraction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c569ae28-909f-4e92-9543-c31fdb4c1722")
    public void setSwInteractionResource_Classifier_isIntraMemoryPartitionInteraction(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT);
    }

    /**
     * Setter for List<String> property 'SwInteractionResource_Classifier_waitingPolicyElements'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6500d764-1116-4d4b-93ea-189eabe32fde")
    public void setSwInteractionResource_Classifier_waitingPolicyElements(final List<String> values) {
        this.elt.putTagValues(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'SwInteractionResource_Classifier_waitingQueueCapacity'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0021f536-b78f-4312-a167-f651090535e8")
    public void setSwInteractionResource_Classifier_waitingQueueCapacity(final String value) {
        this.elt.putTagValue(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SwInteractionResource_Classifier_waitingQueuePolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a9ff8f4-47ff-414a-a8ea-f2c0edf69e9c")
    public void setSwInteractionResource_Classifier_waitingQueuePolicy(final String value) {
        this.elt.putTagValue(SwInteractionResourceClassifier.MdaTypes.SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY_TAGTYPE_ELT, value);
    }

    @objid ("62df1dbf-aa27-4ea9-8f13-66e76def87f0")
    protected SwInteractionResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("1162056a-0e16-458b-9597-95bdcb7470b7")
    public static final class MdaTypes {
        @objid ("a4614954-0ee1-4317-9c72-b97a87f6560d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3bb7d1e1-69c4-4f20-9a91-5ca723c2d500")
        public static TagType SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT;

        @objid ("61e6b7fb-151e-478e-93f3-737c60d65023")
        public static TagType SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY_TAGTYPE_ELT;

        @objid ("97049b6e-39e8-410d-a2b3-0f3937f326fd")
        public static TagType SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY_TAGTYPE_ELT;

        @objid ("2c0ee20a-738d-49d6-a972-0ff7f9b46d91")
        public static TagType SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT;

        @objid ("42c0169c-ea2a-4b9e-96fa-f02885128582")
        private static Stereotype MDAASSOCDEP;

        @objid ("f70d78e9-9059-43d6-a378-bff3bb4e2536")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e9e6a441-c65f-4f5e-9a3f-e6c5dbbee1aa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fe24aa0e-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_CLASSIFIER_ISINTRAMEMORYPARTITIONINTERACTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe24aa0f-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUEPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe270c6b-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGQUEUECAPACITY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe270c6c-10d8-11df-81d9-0014222a9f79");
            SWINTERACTIONRESOURCE_CLASSIFIER_WAITINGPOLICYELEMENTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fe270c6d-10d8-11df-81d9-0014222a9f79");
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
